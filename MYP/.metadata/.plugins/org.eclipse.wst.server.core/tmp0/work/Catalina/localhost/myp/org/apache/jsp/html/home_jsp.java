package org.apache.jsp.html;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class home_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">\r\n");
      out.write("<html lang=\"en-US\" xmlns=\"http://www.w3.org/1999/xhtml\" dir=\"ltr\">\r\n");
      out.write("<head>\r\n");
      out.write("\t<title>CSS-Free-Templates</title>\r\n");
      out.write("\t<meta http-equiv=\"Content-type\" content=\"text/html; charset=utf-8\" />\r\n");
      out.write("\t<link rel=\"stylesheet\" href=\"css/styleforhome.css\" type=\"text/css\" media=\"all\" />\r\n");
      out.write("\t<!--[if IE 6]>\r\n");
      out.write("\t\t<link rel=\"stylesheet\" href=\"css/ie6.css\" type=\"text/css\" media=\"all\" />\r\n");
      out.write("\t<![endif]-->\r\n");
      out.write("\t<link rel=\"shortcut icon\" type=\"image/x-icon\" href=\"css/images/favicon.ico\" />\r\n");
      out.write("\t<script src=\"js/jquery-1.4.2.js\" type=\"text/javascript\"></script>\r\n");
      out.write("\t<script src=\"js/jquery.jcarousel.js\" type=\"text/javascript\"></script>\r\n");
      out.write("\t<script src=\"js/jquery.pngFix.js\" type=\"text/javascript\"></script>\r\n");
      out.write("\t<script src=\"js/js-fnc.js\" type=\"text/javascript\"></script>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\t\r\n");
      out.write("<!-- Shell -->\r\n");
      out.write("<div class=\"shell\">\r\n");
      out.write("\t\r\n");
      out.write("\t<!-- Header -->\r\n");
      out.write("\t<div id=\"header\">\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t<h1 id=\"logo\"><a href=\"#\" title=\"free website css template\">COMPANY NAME HERE<span>FREE WEBSITE TEMPLATE</span></a></h1>\r\n");
      out.write("\r\n");
      out.write("\t\t<div id=\"navigation\">\r\n");
      out.write("\t\t\t<ul>\r\n");
      out.write("\t\t\t    <li><a href=\"#\" class=\"active\" title=\"Home\"><span>Home</span></a></li>\r\n");
      out.write("\t\t\t    <li><a href=\"#\" title=\"About Us\"><span>About Us</span></a></li>\r\n");
      out.write("\t\t\t    <li><a href=\"#\" title=\"Services\"><span>Services</span></a></li>\r\n");
      out.write("\t\t\t    <li><a href=\"#\" title=\"Solutions\"><span>Solutions</span></a></li>\r\n");
      out.write("\t\t\t    <li><a href=\"#\" title=\"Support\"><span>Support</span></a></li>\r\n");
      out.write("\t\t\t    <li><a href=\"#\" title=\"Partners\"><span>Partners</span></a></li>\r\n");
      out.write("\t\t\t    <li><a href=\"#\" title=\"Contact\"><span>Contact</span></a></li>\r\n");
      out.write("\t\t\t</ul>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<!-- End Header -->\r\n");
      out.write("\t\r\n");
      out.write("\t<!-- Slider -->\r\n");
      out.write("\t<div id=\"slider\">\r\n");
      out.write("\t\t<a href=\"#\" id=\"prev\" class=\"notext\">prev</a>\r\n");
      out.write("\t\t<a href=\"#\" id=\"next\" class=\"notext\">next</a>\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t<div id=\"slider-content\">\r\n");
      out.write("\t\t\t<ul>\r\n");
      out.write("\t\t\t    <li>\r\n");
      out.write("\t\t\t    \t<div class=\"left-side\">\r\n");
      out.write("\t\t\t    \t\t<img src=\"css/images/mac-image.png\" alt=\"\" />\r\n");
      out.write("\t\t\t    \t</div>\r\n");
      out.write("\t\t\t    \t\r\n");
      out.write("\t\t\t    \t<div class=\"right-side\">\r\n");
      out.write("\t\t\t    \t\t<h2></h2>\r\n");
      out.write("\t\t\t    \t\t<p> <strong>d</strong> <a href=\"#\" title=\"\"></a>  <a href=\"#\" title=\"\"></a> </p>\r\n");
      out.write("\t\t\t    \t\t\r\n");
      out.write("\t\t\t    \t\t<a href=\"#\" class=\"get-started notext\"></a>\t\r\n");
      out.write("\t\t\t    \t</div>\r\n");
      out.write("\t\t\t    \t\r\n");
      out.write("\t\t\t    \t<div class=\"cl\">&nbsp;</div>\r\n");
      out.write("\t\t\t    </li>\r\n");
      out.write("\t\t\t    <li>\r\n");
      out.write("\t\t\t    \t<div class=\"left-side\">\r\n");
      out.write("\t\t\t    \t\t<img src=\"css/images/mac-image.png\" alt=\"\" />\r\n");
      out.write("\t\t\t    \t</div>\r\n");
      out.write("\t\t\t    \t\r\n");
      out.write("\t\t\t    \t<div class=\"right-side\">\r\n");
      out.write("\t\t\t    \t\t<h2></h2>\r\n");
      out.write("\t\t\t    \t\t<p><strong></strong> <a href=\"#\" title=\"\"></a>  <a href=\"#\" title=\"Free Website Templates\">Donec</a> felis eros, luctus at blandit ac.</p>\r\n");
      out.write("\t\t\t    \t\t\r\n");
      out.write("\t\t\t    \t\t<a href=\"#\" class=\"get-started notext\"></a>\t\r\n");
      out.write("\t\t\t    \t</div>\r\n");
      out.write("\t\t\t    \t\r\n");
      out.write("\t\t\t    \t<div class=\"cl\">&nbsp;</div>\r\n");
      out.write("\t\t\t    </li>\r\n");
      out.write("\t\t\t    <li>\r\n");
      out.write("\t\t\t    \t<div class=\"left-side\">\r\n");
      out.write("\t\t\t    \t\t<img src=\"css/images/mac-image.png\" alt=\"\" />\r\n");
      out.write("\t\t\t    \t</div>\r\n");
      out.write("\t\t\t    \t\r\n");
      out.write("\t\t\t    \t<div class=\"right-side\">\r\n");
      out.write("\t\t\t    \t\t<h2></h2>\r\n");
      out.write("\t\t\t    \t\t<p> <strong></strong> <a href=\"#\" title=\"Free Website Templates\"></a>  <a href=\"#\" title=\"Free Website Templates\">Donec</a></p>\r\n");
      out.write("\t\t\t    \t\t\r\n");
      out.write("\t\t\t    \t\t<a href=\"#\" class=\"get-started notext\"></a>\t\r\n");
      out.write("\t\t\t    \t</div>\r\n");
      out.write("\t\t\t    \t\r\n");
      out.write("\t\t\t    \t<div class=\"cl\">&nbsp;</div>\r\n");
      out.write("\t\t\t    </li>\r\n");
      out.write("\t\t\t</ul>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<!-- End Slider -->\r\n");
      out.write("\t\r\n");
      out.write("\t<!-- Main -->\r\n");
      out.write("\t<div id=\"main\">\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t<div class=\"cols\">\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t<div class=\"col\">\r\n");
      out.write("\t\t\t\t<div class=\"post\">\r\n");
      out.write("\t\t\t\t\t<h3></h3>\r\n");
      out.write("\t\t\t\t\t<img src=\"css/images/monitor.gif\" alt=\"\" class=\"right\" />\r\n");
      out.write("\t\t\t\t\t<p><strong></strong>  <a href=\"#\" title=\"\"></a> at blandit ac.</p>\r\n");
      out.write("\t\t\t\t\t<div class=\"cl\">&nbsp;</div>\r\n");
      out.write("\t\t\t\t\t<a href=\"#\" title=\"Free Website Templates\" class=\"learn-more\" >Learn more</a>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t<div class=\"col\">\r\n");
      out.write("\t\t\t\t<div class=\"post\">\r\n");
      out.write("\t\t\t\t\t<h3></h3>\r\n");
      out.write("\t\t\t\t\t<img src=\"css/images/gears.gif\" alt=\"\" class=\"right\" />\r\n");
      out.write("\t\t\t\t\t<p> <strong></strong>  <a href=\"#\" title=\"\"></a> ac.</p>\r\n");
      out.write("\t\t\t\t\t<div class=\"cl\">&nbsp;</div>\r\n");
      out.write("\t\t\t\t\t<a href=\"#\" title=\"Free Website Templates\" class=\"learn-more\"></a>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t<div class=\"col col-last\">\r\n");
      out.write("\t\t\t\t<div class=\"post\">\r\n");
      out.write("\t\t\t\t\t<h3>Monday Support</h3>\r\n");
      out.write("\t\t\t\t\t<p>Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nunc ornare consequat tortor quis porttitor. Aliquam sed fringilla arcu. <strong>Maecenas</strong> sit amet cursus augue. Donec felis eros, luctus at blandit ac. Nunc ornare <span class=\"underline\">consequat</span> tortor quis porttitor.</p>\r\n");
      out.write("\t\t\t\t\t<a href=\"#\" title=\"Free Website Templates\" class=\"learn-more\">Learn more</a>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t<div class=\"cl\">&nbsp;</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t<div id=\"content\">\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t<div class=\"col\">\r\n");
      out.write("\t\t\t\t<div class=\"post\">\r\n");
      out.write("\t\t\t\t\t<h3>Why Mondays?</h3>\r\n");
      out.write("\t\t\t\t\t<img src=\"css/images/mac.gif\" alt=\"\" class=\"right\"/>\r\n");
      out.write("\t\t\t\t\t<p>Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nunc <a href=\"#\" title=\"Free Website Templates\">ornare</a>ornare consequat tortor quis porttitor. Aliquam sed fringilla arcu. Maecenas sit amet <strong>cursus</strong> augue. Donec felis eros, luctus at blandit ac.</p>\r\n");
      out.write("\t\t\t\t\t<p>Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nunc ornare consequat tortor quis porttitor. <span class=\"underline\">Aliquam</span> sed fringilla arcu. </p>\r\n");
      out.write("\t\t\t\t\t<a href=\"#\" title=\"Free Website Templates\" class=\"learn-more\">Learn more</a>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t<div class=\"col col-last\">\r\n");
      out.write("\t\t\t\t<div class=\"post\">\r\n");
      out.write("\t\t\t\t\t<h3>This Solution and That Solution...</h3>\r\n");
      out.write("\t\t\t\t\t<p>Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nunc <a href=\"#\" title=\"Free Website Templates\">ornare</a> consequat tortor quis porttitor. Aliquam sed fringilla arcu. Maecenas sit amet cursus augue. <span class=\"underline\">Donec</span> felis eros, luctus at blandit ac.</p>\r\n");
      out.write("\t\t\t\t\t<p>Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nunc ornare consequat tortor quis porttitor. Aliquam sed <strong>fringilla</strong> arcu. </p>\r\n");
      out.write("\t\t\t\t\t<a href=\"#\" title=\"Free Website Templates\" class=\"learn-more\">Learn more</a>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t<div class=\"cl\">&nbsp;</div>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<!-- End Main -->\r\n");
      out.write("\t\r\n");
      out.write("</div>\r\n");
      out.write("<!-- End Shell -->\r\n");
      out.write("<!-- Footer -->\r\n");
      out.write("<div id=\"footer\">\r\n");
      out.write("\t<div class=\"shell\">\r\n");
      out.write("\t\t<p class=\"left\">\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t<a href=\"#\" title=\"Home\" >Home</a>\r\n");
      out.write("\t\t\t<span>|</span>\r\n");
      out.write("\t\t\t<a href=\"#\" title=\"About Us\">About Us</a>\r\n");
      out.write("\t\t\t<span>|</span>\r\n");
      out.write("\t\t\t<a href=\"#\" title=\"Services\">Services</a>\r\n");
      out.write("\t\t\t<span>|</span>\r\n");
      out.write("\t\t\t<a href=\"#\" title=\"Solutions\">Solutions</a>\r\n");
      out.write("\t\t\t<span>|</span>\r\n");
      out.write("\t\t\t<a href=\"#\" title=\"Support\">Support</a>\r\n");
      out.write("\t\t\t<span>|</span>\r\n");
      out.write("\t\t\t<a href=\"#\" title=\"Partners\">Partners</a>\r\n");
      out.write("\t\t\t<span>|</span>\r\n");
      out.write("\t\t\t<a href=\"#\" title=\"Contact\">Contact</a>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t</p>\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t<p class=\"right\">\r\n");
      out.write("\t\t\t&copy; Sitename.com. Design by <a href=\"http://css-free-templates.com/\" title=\"Free Website Templates\">CSS-Free-Templates</a>\r\n");
      out.write("\t\t</p>\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t<div class=\"cl\">&nbsp;</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("</div>\t\r\n");
      out.write("<!-- End Footer -->\r\n");
      out.write("\r\n");
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
