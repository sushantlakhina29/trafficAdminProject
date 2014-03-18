package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class admin1_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<script>\r\n");
      out.write("function f1(){\r\n");
      out.write("\r\n");
      out.write("\tif(isNaN(document.admin.pno.value))\r\n");
      out.write("\t{alert(\"Phone no should contain numerics only\");\r\n");
      out.write("\treturn false;\r\n");
      out.write("\t}\r\n");
      out.write("if(document.admin.bamt.value==0)\r\n");
      out.write("\t{ alert(\"Amount is Mandatory\");\r\n");
      out.write("\t\treturn false;}\r\n");
      out.write("if(isNaN(document.admin.bamt.value))\r\n");
      out.write("\t{alert(\"Amount should contain numerics only\");\r\n");
      out.write("\treturn false;\r\n");
      out.write("\t}\r\n");
      out.write("if(document.admin.pdd.value==0)\r\n");
      out.write("\t{ alert(\"Pay Due Date is Mandatory\");\r\n");
      out.write("\treturn false;\r\n");
      out.write("\t}\r\n");
      out.write("if(document.admin.pdd.value.length!=10||document.admin.pdd.value.charAt(2)!='/'||document.admin.pdd.value.charAt(5)!='/')\r\n");
      out.write("{\r\n");
      out.write("  alert(\"date should be in dd/mm/yyyy format\");\r\n");
      out.write("   return false;\r\n");
      out.write("}\r\n");
      out.write("var x=(document.admin.pdd.value.substring(0,2));\r\n");
      out.write("var y=(document.admin.pdd.value.substring(3,5));\r\n");
      out.write("var z=(document.admin.pdd.value.substring(6,document.admin.pdd.value.length));\r\n");
      out.write("if(x<0||x>31||y<0||y>12||z<1890)\r\n");
      out.write("{\r\n");
      out.write("alert(\"enter valid date\");\r\n");
      out.write(" return false;\r\n");
      out.write("}\r\n");
      out.write("switch(y)\r\n");
      out.write("{\r\n");
      out.write(" case \"04\": \r\n");
      out.write("case \"06\":\r\n");
      out.write(" case \"09\": \r\n");
      out.write("case \"11\":  \r\n");
      out.write("if(x==31)\r\n");
      out.write("{ \r\n");
      out.write("alert(\"enter valid day\");\r\n");
      out.write(" return false;\r\n");
      out.write("}\r\n");
      out.write("break;\r\n");
      out.write("case \"02\":\r\n");
      out.write("if((z%400!=0)&&(z%4!=0||z%100!=0)&&(x>28))\r\n");
      out.write("{\r\n");
      out.write(" \r\n");
      out.write("alert(\"its not a leap year \");\r\n");
      out.write(" return false;\r\n");
      out.write("\r\n");
      out.write("}\r\n");
      out.write("else\r\n");
      out.write("{\r\n");
      out.write("if(x>29)\r\n");
      out.write("{ \r\n");
      out.write("alert(\"enter valid day\");\r\n");
      out.write(" return false;\r\n");
      out.write("}\r\n");
      out.write("}\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("return true;\r\n");
      out.write("}\r\n");
      out.write("</script>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<body align=\"center\" bgcolor=\"pink\">\r\n");
      out.write("<pre>    <h2 align=\"center\">WELCOME TO ADMINISTRATOR</h2></pre>\r\n");
      out.write("\t<pre>\t\t\t\t\t\t\t\t\t\t\t<a href=\"Logout.jsp\">LOGOUT</a></pre>\r\n");
      out.write("<form name=\"admin\"  action=\"adminconn.jsp\" method=\"get\" onsubmit=\"return f1()\">\r\n");
      out.write("<input type=\"hidden\" name=\"ID\" value=\"SUBMIT\">\r\n");
      out.write("<p align=\"center\">\r\n");
      out.write("<pre>\r\n");
      out.write("\r\n");
      out.write("\t\t                <b align=\"center\"> <font color=\"red\">Invalid Phone No</font></b>\r\n");
      out.write("\r\n");
      out.write("                     Phone Number  <input type=\"text\" name=\"pno\">\r\n");
      out.write("\r\n");
      out.write("                     Bill Amount   <input type=\"text\" name=\"bamt\">        \r\n");
      out.write("\r\n");
      out.write("                     Pay Due Date  <input type=\"text\" name=\"pdd\" > dd/mm/yyyy\r\n");
      out.write("\t\t\t\t\t \r\n");
      out.write("\t\t\t\t\t<input type=\"submit\" name=\"submit\" value=\"SUBMIT\">\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t</pre>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t  \t\r\n");
      out.write("\r\n");
      out.write("                                                                                  \r\n");
      out.write("\r\n");
      out.write("</p>\r\n");
      out.write("</form>\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t");
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
