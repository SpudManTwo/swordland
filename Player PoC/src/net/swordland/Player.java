/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package net.swordland;

import java.util.ArrayList;
import net.swordland.database.Skills;

/**
 * Describes a player entity.
 * @author Kazumi
 */
public class Player
{
    private int level;
    private int XP;
    private int[] attribute;
    private String name;
    private Inventory inventory;
    private int col;
    private ArrayList<Skill> skills;
    private Location location;
    
    private int currHP;
    private int maxHP;
    private int WLM;
    private int weight;
    
    /**
     * Creates a new player with all necessary parameters.
     * @param level the level of the player
     * @param XP the player's amount of XP
     * @param STR the player's strength
     * @param DEX the player's dexterity
     * @param CON the player's constitution
     * @param INT the player's intelligence
     * @param WIS the player's wisdom
     * @param inventory the player's state of the inventory
     * @param name the name of the player
     * @param col the amount of col in the player's pockets
     * @param skills the player's personal list of unlocked skills
     * @param location the player's location
     */
    public Player(
            int level, 
            int XP, 
            int STR, 
            int DEX, 
            int CON, 
            int INT, 
            int WIS, 
            Inventory inventory, 
            String name, 
            int col, 
            ArrayList<Skill> skills,
            Location location)
    {
        this.skills = new ArrayList<>();
        this.attribute  = new int[5];
        
        this.level = level;
        this.XP = XP;
        this.attribute[0] = STR;
        this.attribute[1] = DEX;
        this.attribute[2] = CON;
        this.attribute[3] = INT;
        this.attribute[4] = WIS;
        this.inventory = inventory;
        this.name = name;
        this.col = col;
        this.skills = skills;
        this.location = location;
        
        this.currHP = this.maxHP = 10*attribute[2]*this.level;
        this.WLM = 10*attribute[0]*this.level;
        for (Weapon w : this.inventory.getCurrentWeapon())
        {
            this.weight += w.getWeight();
        }
        this.weight += this.inventory.getCurrentArmor().getWeight();
        for (Item i : this.inventory.getCurrentItems())
        {
            this.weight += i.getWeight();
        }
        
    }
    
    public Player(String name)
    {
        this.skills = new ArrayList<>();
        this.attribute  = new int[5];
        
        this.level = 1;
        this.XP = 0;
        this.attribute[0] = 1;
        this.attribute[1] = 1;
        this.attribute[2] = 1;
        this.attribute[3] = 1;
        this.attribute[4] = 1;
        this.inventory = new Inventory();
        this.name = name;
        this.col = 100;
        this.skills = Skills.getStartingSkills();
        this.location = Location.ToBCentralPlaza();
        
        this.currHP = this.maxHP = 10*attribute[2]*this.level;
        this.WLM = 10*attribute[0]*this.level;
        this.inventory.getCurrentItems().stream().forEach((item) -> {
            this.weight += item.getWeight();
        });
    }
    
    /**
     * Get the value of col
     *
     * @return the value of col
     */
    public int getCol() {
        return col;
    }

    /**
     * Set the value of col
     *
     * @param col new value of col
     */
    public void setCol(int col) {
        this.col = col;
    }
    
    public void addCol(int col) {
        this.col += col;
    }
    
    public boolean deduceCol(int col) {
        if (this.col<col)
        {
            return false;
        }
        this.col -= col;
        return true;
    }

    public int getSTR() 
    {
        return attribute[0];
    }
    
    public int getDEX() 
    {
        return attribute[1];
    }
    
    public int getCON() 
    {
        return attribute[2];
    }
    
    public int getINT() 
    {
        return attribute[3];
    }
    
    public int getWIS() 
    {
        return attribute[4];
    }
    
    public void setSTR(int newSTR)
    {
        attribute[0] = newSTR;
    }
    
    public void setDEX(int newDEX)
    {
        attribute[1] = newDEX;
    }
    
    public void setCON(int newCON)
    {
        attribute[2] = newCON;
    }
    
    public void setINT(int newINT)
    {
        attribute[3] = newINT;
    }
    
    public void setWIS(int newWIS)
    {
        attribute[4] = newWIS;
    }
    
    public void addSTR(int amount)
    {
        attribute[0] += amount;
    }
    
    public void addDEX(int amount)
    {
        attribute[1] += amount;
    }
    
    public void addCON(int amount)
    {
        attribute[2] += amount;
    }
    
    public void addINT(int amount)
    {
        attribute[3] += amount;
    }
    
    public void addWIS(int amount)
    {
        attribute[4] += amount;
    }
    
    public String getName() {
        return name;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }
    
    public void addLevel()
    {
        this.level++;
    }
    
    public void addLevel(int amount)
    {
        for (int i=0; i<amount; i++)
        {
            this.level++;
        }
    }

    public ArrayList<Skill> getSkills() {
        return skills;
    }

    public void addSkills(ArrayList<Skill> skills) {
        this.skills.addAll(skills);
    }

    public void addSkills(Skill skill) {
        this.skills.add(skill);
    }

    public int getCurrHP() {
        return currHP;
    }

    public void setCurrHP(int currHP) {
        this.currHP = currHP;
    }

    public void remHP(int diffHP) {
        this.currHP -= diffHP;
        if (this.currHP <= 0)
        {
            Die();
        }
    }

    public void addHP(int diffHP) {
        this.currHP += diffHP;
        if (this.currHP > this.maxHP)
        {
            this.currHP = this.maxHP;
        }
    }

    public int getMaxHP() {
        return maxHP;
    }

    public int getWLM() {
        return WLM;
    }
    
    public void registerPlayerInventory()
    {
        this.inventory.setPlayer(this);
    }
    
    public void Die()
    {
        // THE END.
    }
}
