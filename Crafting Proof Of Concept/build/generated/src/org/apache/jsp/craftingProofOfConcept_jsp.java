package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class craftingProofOfConcept_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Crafting</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <p>Enter the weapon to be generated as a String in the following format.<br>MaterialName Level AbbreviationOfType WisdomOfMaker</p>\n");
      out.write("        <table>\n");
      out.write("            <tr>\n");
      out.write("                <td>OHS</td>\n");
      out.write("                <td>One Handed Sword</td>\n");
      out.write("            </tr>\n");
      out.write("            <tr>\n");
      out.write("                <td>THS</td>\n");
      out.write("                <td>Two Handed Sword</td>\n");
      out.write("            </tr>\n");
      out.write("            <tr>\n");
      out.write("                <td>OHCS</td>\n");
      out.write("                <td>One Handed Curved Sword</td>\n");
      out.write("            </tr>\n");
      out.write("            <tr>\n");
      out.write("                <td>THCS</td>\n");
      out.write("                <td>Two Handed Curved Sword</td>\n");
      out.write("            </tr>\n");
      out.write("            <tr>\n");
      out.write("                <td>OHD</td>\n");
      out.write("                <td>One Handed Dagger</td>\n");
      out.write("            </tr>\n");
      out.write("            <tr>\n");
      out.write("                <td>OHR</td>\n");
      out.write("                <td>One Handed Rapier</td>\n");
      out.write("            </tr>\n");
      out.write("            <tr>\n");
      out.write("                <td>OHT</td>\n");
      out.write("                <td>One Handed Trauma</td>\n");
      out.write("            </tr>\n");
      out.write("            <tr>\n");
      out.write("                <td>OHA</td>\n");
      out.write("                <td>One Handed Axe</td>\n");
      out.write("            </tr>\n");
      out.write("            <tr>\n");
      out.write("                <td>THBA</td>\n");
      out.write("                <td>Two Handed Battle Axe</td>\n");
      out.write("            </tr>\n");
      out.write("            <tr>\n");
      out.write("                <td>TW</td>\n");
      out.write("                <td>Throwing Weapons</td>\n");
      out.write("            </tr>\n");
      out.write("            <tr>\n");
      out.write("                <td>THAS</td>\n");
      out.write("                <td>Two Handed Assault Spear</td>\n");
      out.write("            </tr>        \n");
      out.write("        </table>\n");
      out.write("        <form method=\"post\" action=\"CraftResults.jsp\">\n");
      out.write("        <input type=\"text\" name=\"data\"></input><br>\n");
      out.write("        <input type=\"submit\"></input>\n");
      out.write("        </form>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
