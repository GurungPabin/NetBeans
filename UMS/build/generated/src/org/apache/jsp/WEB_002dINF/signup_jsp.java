package org.apache.jsp.WEB_002dINF;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class signup_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("    </head>\n");
      out.write("    <center>\n");
      out.write("\t<h4>SignUp here</h4>\n");
      out.write("\n");
      out.write("\t<form method =\"get\" action=\"servletsign\" >\n");
      out.write("\t\t<table>\n");
      out.write("\n");
      out.write("            <tr>\n");
      out.write("\t\t\t<td>Full Name:</td>\n");
      out.write("\t\t\t<td>\n");
      out.write("\t\t\t\t<input type=\"text\" name=\"name\">\n");
      out.write("\t\t\t</td>\n");
      out.write("\t\t\t</tr>\n");
      out.write(" \n");
      out.write("            <tr>\n");
      out.write("\t\t\t<td>Gender:</td>\n");
      out.write("\t\t\t<td>\n");
      out.write("            <br><input type=\"radio\" value=\"Male\" name=\"gender\">Male</br>\n");
      out.write("            <br><input type=\"radio\" value=\"Female\" name=\"gender\">Female</br>\n");
      out.write("            <br><input type=\"radio\" value=\"Others\" name=\"gender\">Others</br>\n");
      out.write("            </td>\n");
      out.write("\t\t\t</tr>\n");
      out.write("\n");
      out.write("            <tr>\n");
      out.write("\t\t\t\t<td>Date Of Birth:</td>\n");
      out.write("\t\t\t\t<td>\n");
      out.write("\t\t\t\t\t<input type=\"Date\" name=\"dateOfBirth\">\n");
      out.write("\t\t\t\t</td>\n");
      out.write("\t\t\t</tr>\n");
      out.write("\n");
      out.write("\t\t\t<tr>\n");
      out.write("\t\t\t\t<td>Phone Number:</td>\n");
      out.write("\t\t\t\t<td>\n");
      out.write("\t\t\t\t\t<input type=\"Number\" name=\"number\">\n");
      out.write("\t\t\t\t</td>\n");
      out.write("\t\t\t</tr>\n");
      out.write("\n");
      out.write("\n");
      out.write("            <tr>\n");
      out.write("\t\t\t\t<td>Address</td>\n");
      out.write("\t\t\t\t<td>\n");
      out.write("\t\t\t\t\t<input type=\"Address\" name=\"address\">\n");
      out.write("\t\t\t\t</td>\n");
      out.write("\t\t\t</tr>\n");
      out.write("\n");
      out.write("\t\t\t<tr>\n");
      out.write("\t\t\t<td>Username:</td>\n");
      out.write("\t\t\t<td>\n");
      out.write("\t\t\t\t<input type=\"text\" name=\"username\">\n");
      out.write("\t\t\t</td>\n");
      out.write("\t\t\t</tr>\n");
      out.write("\n");
      out.write("\t\t\t<tr>\n");
      out.write("\t\t\t\t<td>Password:</td>\n");
      out.write("\t\t\t\t<td>\n");
      out.write("\t\t\t\t\t<input type=\"Password\" name=\"password\">\n");
      out.write("\t\t\t\t</td>\n");
      out.write("\t\t\t</tr>\n");
      out.write("\n");
      out.write("\t\t\t<tr>\n");
      out.write("\t\t\t\t<td>Email:</td>\n");
      out.write("\t\t\t\t<td>\n");
      out.write("\t\t\t\t\t<input type=\"Email\" name=\"email\">\n");
      out.write("\t\t\t\t</td>\n");
      out.write("\t\t\t</tr>\n");
      out.write("\n");
      out.write("            \n");
      out.write("\n");
      out.write("\t\t\t<td>\n");
      out.write("\t\t\t\t<input type=\"submit\" value=\"SignUp\" name=\"SignUp\" >\n");
      out.write("\t\t\t</td>\n");
      out.write("\t\t</table>\n");
      out.write("\n");
      out.write("\t</form>\n");
      out.write("\t\n");
      out.write("</center>\n");
      out.write("\n");
      out.write("</body>\n");
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
