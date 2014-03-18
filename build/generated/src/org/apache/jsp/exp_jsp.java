package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;
import chandu.dbConn;

public final class exp_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

 
    ResultSet rs ;
    dbConn db ;
    String sConn;
    public void jspInit() {
        db = new dbConn();
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
      out.write("<a href=\"signup.jsp\">Home</a>\r\n");

    String sID = request.getParameter("ID");
    if(sID.equals("INSERT")) {
       String sName = request.getParameter("uname");
       String pwd = request.getParameter("password");
       String confPwd = request.getParameter("confpassword");
	   String fname = request.getParameter("fname");
	   String lname = request.getParameter("lname");
	   String email = request.getParameter("email");
	  String pno = request.getParameter("pno");
	   String address = request.getParameter("address");
	   String state = request.getParameter("state");
	   int pin = (new Integer(request.getParameter("pin"))).intValue();
        String cno = request.getParameter("cno");
		
		String y="Data inserted successfully";
		int z=0;
		String sInsState = null;
       rs= db.getData();
while(rs.next()){
	if(rs.getString(1).equals(pno))
	{
		z=1;
		
        }

	}
	if(z!=1)
		{
		
      out.write('\r');
      out.write('\n');
      if (true) {
        _jspx_page_context.forward("signup1.jsp");
        return;
      }
      out.write('\r');
      out.write('\n');

		}
		else
		{
			if(sConn.equals("")) {
            sInsState = db.setData(sName, pwd, fname, lname, email, pno, address, state, pin, cno);
		
      out.write('\r');
      out.write('\n');
String x=sInsState;
      out.write("\r\n");
      out.write(" ");

    if(x.equals(y))
		{


      out.write('\r');
      out.write('\n');
      if (true) {
        _jspx_page_context.forward("success.jsp");
        return;
      }
      out.write('\r');
      out.write('\n');
}
    else
		{

      out.write('\r');
      out.write('\n');
      if (true) {
        _jspx_page_context.forward("signup1.jsp");
        return;
      }
      out.write('\r');
      out.write('\n');
}
	
			}
	}
	}
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
