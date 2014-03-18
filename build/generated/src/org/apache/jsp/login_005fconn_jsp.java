package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;
import chandu.dbConn4;

public final class login_005fconn_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

 
    ResultSet rs ;
    dbConn4 db ;
    String sConn;
    public void jspInit() {
        db = new dbConn4();
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
      out.write("<H3>Employee Details</H3>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");

    String sID = request.getParameter("ID");
        String uname =request.getParameter("uname");
		String pwd =request.getParameter("password");
        //String user=null; 
		 int t=0;
		
		
		 rs = db.getData();
		

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("       \r\n");
        
        while(rs.next()){

      out.write("      \r\n");
      out.write("        ");

		String x=rs.getString(1);
		String y=rs.getString(2);

      if(x.equals(uname)&&y.equals(pwd))
		{
      out.write("\r\n");
      out.write("\t\t");
      if (true) {
        _jspx_page_context.forward("bill.jsp");
        return;
      }
      out.write("\r\n");
      out.write("\t\t");

		  }
	  else{ t=1;
       
	  }
}

      out.write('\r');
      out.write('\n');
if(t==1)	{	
      out.write('\r');
      out.write('\n');
      if (true) {
        _jspx_page_context.forward("login1.jsp");
        return;
      }
      out.write('\r');
      out.write('\n');
}
      out.write("\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
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
