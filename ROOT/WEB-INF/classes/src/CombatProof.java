import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.TreeMap;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
@WebServlet("/Combat")
public class CombatProof extends HttpServlet {
	private static final long serialVersionUID = -3024114991181411480L;
	private static TreeMap<String,Combat> connected;
	public CombatProof() {
		connected = new TreeMap<String,Combat>();
	}
	public void init(ServletConfig config) throws ServletException {
	}
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html; charset=\"UTF-8\"");
		PrintWriter servletOut = response.getWriter();
		String sourceDirectory = getClass().getClassLoader().getResource(".").getPath();
	    sourceDirectory = sourceDirectory.substring(0,sourceDirectory.lastIndexOf('/',sourceDirectory.length()-2));
	    sourceDirectory += "/webapps/ROOT/";
	    sourceDirectory = sourceDirectory.replaceAll("%20"," ");
	    sourceDirectory = sourceDirectory.replaceAll("%25",".");
	    Cookie[] cookies = request.getCookies();
		Cookie sessionCookie = null;
		if (cookies!=null) {
			for (Cookie c:cookies)
				if (c!=null&&c.getName().equals("sessionID"))
					sessionCookie = c;
		}
        if (cookies==null||sessionCookie == null||connected.isEmpty()) {
        		File mainPage = new File(sourceDirectory+"CombatProof.html");
            
            	Scanner htmlReader = new Scanner(mainPage);
            	while (htmlReader.hasNextLine())
            		servletOut.println(htmlReader.nextLine());
            	servletOut.close();
            	htmlReader.close();
            	return;
        }
        Combat c = connected.get(sessionCookie.getValue());
        String update = "";
		if (!c.onGoing()) {
			if(c.playerWin())
				update = "Congrats, You won Dupolia";
			else
				update = "Dupolia was slain by the Canis Dirus";
				
		}
		else {
			update = c.getStatus();
		}
		servletOut.write("<html><head><title>Combat Proof of Concept</title></head><body><form method='post'><div> <label>Enter move <input type='text' name='move'/></label> <br/> <input type='submit' name='doit' value='move' /> </div></form>"); 
		servletOut.write("<p>"+update+"</p>");
		servletOut.write("</body></html>");
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String move = request.getParameter("move");
		Cookie[] cookies = request.getCookies();
		Cookie sessionCookie = null;
		if (move==null)
			return;
		if (cookies!=null) {
			for (Cookie c:cookies)
				if (c!=null&&c.getName().equals("sessionID"))
					sessionCookie = c;
		}
        if (cookies==null||sessionCookie == null||connected.isEmpty()) {
        	HttpSession session = request.getSession();
        	Player noob = new Player(990,15,15);
        	Mob m = new Mob(1000,1,100,50,200);	
        	Combat c = new Combat(noob,m);
        	connected.put(session.getId(),c);
        	sessionCookie = new Cookie("sessionID",session.getId());
        	response.addCookie(sessionCookie);
        }
        sessionCookie.getValue();
        Combat c = connected.get(sessionCookie.getValue());
		if(c.onGoing()) {
			c.doRound(move);
		}
		response.sendRedirect("Combat");
	}
	protected class Combat {
		private Player tester;
		private Mob sample;
		public Combat(Player p,Mob m) {
			tester = p;
			sample = m;
		}
		public boolean onGoing() {
			return sample.getHP()>0&&tester.getHP()>0;
		}
		public boolean playerWin() {
			return tester.getHP()>0&&sample.getHP()<=0;
		}
		public void doRound(String turn) {
			Skill used = tester.readySkill(turn);
			int damage = 0;
			damage = tester.useSkill(used);
			sample.takeDamage(used.getHits(),damage);
			if (turn.equalsIgnoreCase("Snake Bite"))
				sample.reduceArmor(2);
			if (sample.getHP()>0) {
				damage = sample.getAttack();
				tester.takeDamage(damage);
			}
		}
		public String getStatus() {
			return "Dupolia SAMPLE "+tester.getHP()+"</br>"+"Canis Dirus SAMPLE "+sample.getHP()+"";
		}
	}
	public class Player {
		private int HP;
		private int str;
		private int weaponAtkMod;
		private ArrayList<Skill> skills;
		public Player(int health, int strength,  int weaponAtk) {
			HP = health;
			str = strength;
			weaponAtkMod = weaponAtk;
			skills = new ArrayList<Skill>();
			Skill HO = new Skill(8,3.0,64,"Howling Octave");
			Skill LF = new Skill(1,0.5,8,"Lightning Fall");
			Skill SN = new Skill(2,3.0,8,"Sharp Nail");
			Skill RA = new Skill(1,3.0,8,"Radiant Arc");
			Skill SL = new Skill(1,1.0,8,"Sonic Leap");
			Skill HS = new Skill(4,1.0,8,"Horizontal Square");
			Skill VS = new Skill(4,1.0,8,"Vertical Square");
			Skill VA = new Skill(2,1.5,8,"Vertical Arc");
			Skill SB = new Skill(1,0,8,"Snake Bite");
			skills.add(HO);
			skills.add(LF);
			skills.add(SN);
			skills.add(RA);
			skills.add(SL);
			skills.add(HS);
			skills.add(VS);
			skills.add(VA);
			skills.add(SB);
		}
		public int getHP() {
			return HP;
		}
		public void takeDamage(int damage) {
			HP -= damage;
		}
		public int useSkill(Skill curr) {
			curr.use();
			double damage = str*curr.getHits()*curr.getnormalDamageMod()+weaponAtkMod*curr.getHits()*curr.getnormalDamageMod();
			for (int i=0;i<curr.getHits();i++) {
				damage += ((int)(Math.random()*10)+1)*curr.getnormalDamageMod();
			}
			return (int)(damage+0.5);
		}
		public Skill readySkill(String skill) {
			Skill curr = null;
			for(Skill s:skills) {
				if (s.name().equalsIgnoreCase(skill))
						curr = s;
				s.coolDown();
			}
			if (curr!=null&&!curr.canBeUsed())
				return null;
			return curr;
		}
	}
	public class Skill {
		private String name;
		private int numOfHits;
		private double normalDamageMod;
		private int coolDown;
		private int currCoolDown;
		public Skill(int hits,double mod,int cd,String skillName) {
			numOfHits = hits;
			normalDamageMod = mod;
			coolDown = cd;
			name = skillName;
			currCoolDown = 0;
		}
		public String name() {
			return name;
		}
		public int getHits() {
			return numOfHits;
		}
		public double getnormalDamageMod() {
			return normalDamageMod;
		}
		public boolean canBeUsed() {
			return !(currCoolDown>0);
		}
		public void use() {
			currCoolDown = coolDown;
		}
		public void coolDown() {
			if (currCoolDown!=0)
				currCoolDown--;
		}
	}
	public class Mob {
		private int HP;
		private int armor;
		private int numOfHitDie;
		private int magOfHitDie;
		private int atkMod;
		public Mob(int health, int numHD, int magHD, int atk,int arm) {
			HP = health;
			numOfHitDie = numHD;
			magOfHitDie = magHD;
			atkMod = atk;
			armor = arm;
		}
		public int getHP() {
			return HP;
		}
		public int getAttack() {
			int damage = atkMod;
			for (int i=0;i<numOfHitDie;i++) {
					damage += (int)(Math.random()*magOfHitDie)+1;
			}
			return damage;
		}
		public void takeDamage(int lengthOfCombo,int damage) {
			int mitigated = lengthOfCombo*armor;
			if (mitigated<damage)
				HP = HP - damage-lengthOfCombo*armor;
		}
		public void reduceArmor(int magnitude) {
			armor /= magnitude;
		}
		
	}
	
}
