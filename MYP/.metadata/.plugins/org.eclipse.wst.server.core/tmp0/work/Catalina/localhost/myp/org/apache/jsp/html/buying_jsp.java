package org.apache.jsp.html;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class buying_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
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

      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Strict//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd\">\r\n");
      out.write("<html xmlns=\"http://www.w3.org/1999/xhtml\" xml:lang=\"en\" lang=\"en\">\r\n");
      out.write("<head>\r\n");
      out.write("\r\n");
      out.write("<title>Home - Home Page | IT - Free Website Template from Templates.com</title>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\" />\r\n");
      out.write("<meta name=\"description\" content=\"Place your description here\" />\r\n");
      out.write("<meta name=\"keywords\" content=\"put, your, keyword, here\" />\r\n");
      out.write("<meta name=\"author\" content=\"Templates.com - website templates provider\" />\r\n");
      out.write("<link rel=\"stylesheet\" href=\"css/style.css\" type=\"text/css\" media=\"screen\"/>\r\n");
      out.write("<link href='http://fonts.googleapis.com/css?family=Mrs+Sheppards&subset=latin,latin-ext' rel='stylesheet' type='text/css'>\r\n");
      out.write("<script src=\"js/cufon-yui.js\" type=\"text/javascript\"></script>\r\n");
      out.write("<script src=\"js/cufon-replace.js\" type=\"text/javascript\"></script>\r\n");
      out.write("<script src=\"js/Myriad_Pro_300.font.js\" type=\"text/javascript\"></script>\r\n");
      out.write("<!--[if lt IE 7]>\r\n");
      out.write("\t<script type=\"text/javascript\" src=\"js/ie_png.js\"></script>\r\n");
      out.write("\t<script type=\"text/javascript\">\r\n");
      out.write("\t\t ie_png.fix('.png, #header .row-2 ul li a, #content, .list li');\r\n");
      out.write("\t</script>\r\n");
      out.write("<![endif]-->\r\n");
      out.write("</head>\r\n");
      out.write("       \r\n");
      out.write("<body id=\"page1\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t<!-- HEADER -->\r\n");
      out.write("\t\t\t<div id=\"header\">\r\n");
      out.write("\t\t\t\t<div class=\"row-1\">\r\n");
      out.write("\t\t\t\t<table align=\"center\">\r\n");
      out.write("                <tr>\r\n");
      out.write("\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t<div class=\"fleft\">\r\n");
      out.write("                <img src=\"images/logo1.gif\" />            \r\n");
      out.write("                </div>\r\n");
      out.write("                </td>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t<td><h1>Aasov</h1>  </td>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("                </table> \r\n");
      out.write("                             \r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div id=\"wrapper\">\r\n");
      out.write("<div id=\"box\">\r\n");
      out.write("<h1>How To Build a Basic CSS Layout</h1>\r\n");
      out.write("<!-- <s:form action=\"addUserAction\" >\r\n");
      out.write("\t\t\t\t\t<h1>Not a member yet? Sign Up!</h1>\t\t\t\t\r\n");
      out.write("\t\t\t\t\t<s:label cssClass=\"grey\" name=\"firstName\" value=\"Firstname:\" />\r\n");
      out.write("\t\t\t\t\t<s:textfield cssClass=\"field\"  name=\"fname\"  value=\"\" size=\"23\" />\r\n");
      out.write("\t\t\t\t\t<s:label cssClass=\"grey\" name=\"email\" value=\"Email:\" />\r\n");
      out.write("\t\t\t\t\t<s:textfield cssClass=\"field\" type=\"text\" name=\"email\" id=\"email\" size=\"23\" />\r\n");
      out.write("\t\t\t\t\t<s:label name=\"abc\" value=\"A password will be e-mailed to you.\"/>\r\n");
      out.write("\t\t\t\t\t<s:submit  name=\"submit\" value=\"Register\" cssClass=\"bt_register\" />\r\n");
      out.write("\t\t\t\t</s:form>-->\r\n");
      out.write("</div>\r\n");
      out.write("</div>\r\n");
      out.write(" \t\t\t\t<s:form action=\"addUserAction\" >\r\n");
      out.write("  <s:textfield name=\"name\" label=\"Name\" value=\"\" size=\"20\" />\r\n");
      out.write("  <s:textarea name=\"address\" label=\"Address\" value=\"\" cols=\"50\" rows=\"5\" size=\"20\"/>\r\n");
      out.write("  <s:submit />\r\n");
      out.write("</s:form>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
