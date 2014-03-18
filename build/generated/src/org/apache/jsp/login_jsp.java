package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.Vector _jspx_dependants;

  private org.apache.jasper.runtime.ResourceInjector _jspx_resourceInjector;

  public Object getDependants() {
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
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.apache.jasper.runtime.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("<html>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<script>\r\n");
      out.write("function checkForm()\r\n");
      out.write("{\r\n");
      out.write("\r\n");
      out.write("if((document.Login.uname.value.length==0))\r\n");
      out.write("{\r\n");
      out.write("alert(\"Please enter User name \");\r\n");
      out.write("return false;\r\n");
      out.write("}\r\n");
      out.write("if((document.Login.password.value.length==0))\r\n");
      out.write("{\r\n");
      out.write("alert(\"Please enter  password\");\r\n");
      out.write("return false;\r\n");
      out.write("}\r\n");
      out.write("/*if(!((document.Login.uname.value==\"wipro\")&&(document.Login.password.value==\"wipro\")))\r\n");
      out.write("\t{\r\n");
      out.write("\talert(\"enter correct  user id and password\");\r\n");
      out.write("\treturn false;\r\n");
      out.write("\t}\r\n");
      out.write("\telse\r\n");
      out.write("\t{\r\n");
      out.write("return true;\r\n");
      out.write("\t}*/\r\n");
      out.write("}\r\n");
      out.write("</script>\r\n");
      out.write("<body align=\"center\" bgcolor=\"#CCFFCC#CC9900#9999FF#9900CC#339966#000000#CC9900#CC99FF\" >\r\n");
      out.write("<h1 align=\"center\"><font color=\"\">TELEPHONE BILLING SYSTEM</font></h1>\r\n");
      out.write("<form name=\"Login\"  action=\"login_conn.jsp\" method=\"get\" onSubmit=\" return checkForm()\">\r\n");
      out.write("<input type=\"hidden\" name=\"ID\" value=\"SUBMIT\">\r\n");
      out.write("<p align=\"center\">\r\n");
      out.write("<pre>\r\n");
      out.write("<marquee><img src=\"1.bmp\">\t</marquee>\r\n");
      out.write("\t\t\t\tUser Name <input type=\"text\" name=\"uname\"><br><br>\t\t\t\t  \r\n");
      out.write("\t\t\t\tPassword  <input type=\"password\" name=\"password\">\t\t\t\t\r\n");
      out.write("\t\t\t\t\t   \r\n");
      out.write("\t\t\t\t\t\t<input type=\"submit\" name=\"submit\" value=\"SUBMIT\"  >\r\n");
      out.write("\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t    <a href=\"adminlog.jsp\">Admin Login</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t      <b>New user</b>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<a href=\"signup.jsp\">Sign up</a>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t  <b> New Connection</b>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t    <a href=\"New_connection.jsp\">Register Here</a>\r\n");
      out.write("\r\n");
      out.write("</pre>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t  \t\r\n");
      out.write("\r\n");
      out.write("                                                                                 \r\n");
      out.write("\r\n");
      out.write("</p>\r\n");
      out.write("</form>\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
