package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;
import chandu.dbConn3;

public final class bill_005fconn_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

 
    ResultSet rs ;
    dbConn3 db ;
    String sConn;
    public void jspInit() {
        db = new dbConn3();
        sConn = db.DBConnect();
        rs = null; 
    }

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
      out.write("<head>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<H3>Bill Details</H3>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<a href=\"login.jsp\">Home</a>\r\n");

    String sID = request.getParameter("ID");
        String pno = request.getParameter("pno");
         //out.println(pno);
		 rs = db.getData();
		

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("        <table border=\"1\">\r\n");
      out.write("        <tr>\r\n");
      out.write("            <th>Name</th>\r\n");
      out.write("            <th>Age</th>\r\n");
      out.write("\t\t\t    \r\n");
      out.write("\t\t</tr>\r\n");
        
        while(rs.next()){

      out.write("      \r\n");
      out.write("        ");

		String x=rs.getString(1);
      if(x==pno)
		{
		
      out.write("\r\n");
      out.write("\t\t<tr>\r\n");
      out.write("          \r\n");
      out.write("\t\t    <td>  ");
      out.print(rs.getString(2));
      out.write("</td>\r\n");
      out.write("            <td>\t");
      out.print(rs.getInt(3));
      out.write("</td>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t\r\n");
      out.write("            \r\n");
      out.write("        </tr>\r\n");
        
			}
		}

      out.write("\r\n");
      out.write("        </table>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
      out.write("\r\n");
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
