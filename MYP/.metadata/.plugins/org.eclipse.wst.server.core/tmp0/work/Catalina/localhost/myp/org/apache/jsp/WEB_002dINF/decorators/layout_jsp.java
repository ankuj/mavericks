package org.apache.jsp.WEB_002dINF.decorators;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class layout_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList(3);
    _jspx_dependants.add("/WEB-INF/decorators/header.jsp");
    _jspx_dependants.add("/WEB-INF/decorators/navigation.jsp");
    _jspx_dependants.add("/WEB-INF/decorators/pagefooter.jsp");
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fdecorator_005ftitle_0026_005fdefault_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fdecorator_005fhead_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fdecorator_005fbody_005fnobody;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fdecorator_005ftitle_0026_005fdefault_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fdecorator_005fhead_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fdecorator_005fbody_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody.release();
    _005fjspx_005ftagPool_005fdecorator_005ftitle_0026_005fdefault_005fnobody.release();
    _005fjspx_005ftagPool_005fdecorator_005fhead_005fnobody.release();
    _005fjspx_005ftagPool_005fdecorator_005fbody_005fnobody.release();
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
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \r\n");
      out.write("    \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\"> \r\n");
      out.write(" \r\n");
      out.write(" \r\n");
      out.write(" \r\n");
      out.write(" \r\n");
      out.write(" \r\n");
      if (_jspx_meth_c_005fset_005f0(_jspx_page_context))
        return;
      out.write(" \r\n");
      out.write(" \r\n");
      out.write(" \r\n");
      out.write("<html xmlns=\"http://www.w3.org/1999/xhtml\" xml:lang=\"en\"> \r\n");
      out.write("<head> \r\n");
      out.write("    <title>");
      if (_jspx_meth_decorator_005ftitle_005f0(_jspx_page_context))
        return;
      out.write("</title> \r\n");
      out.write("    <meta http-equiv=\"content-type\" content=\"text/html; charset=utf-8\"/> \r\n");
      out.write("    <link rel=\"stylesheet\" type=\"text/css\" href=\"http://www.rkcole.com/crud/skin.css\"/> \r\n");
      out.write("    ");
      if (_jspx_meth_decorator_005fhead_005f0(_jspx_page_context))
        return;
      out.write(" \r\n");
      out.write("</head> \r\n");
      out.write(" \r\n");
      out.write("<body> \r\n");
      out.write("    <table id=\"page-container\" cellpadding=\"0\" cellspacing=\"0\"> \r\n");
      out.write("    <tr> \r\n");
      out.write("        <td colspan=\"2\" id=\"page-header\"> \r\n");
      out.write("            ");
      out.write("<div id=\"header\">\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t<h1 id=\"logo\"><a href=\"Aasov.jsp\" title=\"Aasov\">Aasov<span>The Holy Grail of Property</span></a></h1>\r\n");
      out.write("\r\n");
      out.write("\t\t<div id=\"navigation\">\r\n");
      out.write("\t\t\t<ul>\r\n");
      out.write("\t\t\t    <li><a href=\"#\" class=\"active\" title=\"Home\"><span>Home</span></a></li>\r\n");
      out.write("\t\t\t    <li><a href=\"#\" title=\"About Us\"><span>About Us</span></a></li>\r\n");
      out.write("\t\t\t    <li><a href=\"type.jsp\" title=\"Register\"><span>Register</span></a></li>\r\n");
      out.write("\t\t\t    <li><a href=\"#\" title=\"Solutions\"><span>Buzz</span></a></li>\r\n");
      out.write("\t\t\t    <li><a href=\"");
      out.print( request.getContextPath() );
      out.write("/html/loadLocations.action\" title=\"Contact\"><span>Contact</span></a></li>\r\n");
      out.write("\t\t\t</ul>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>");
      out.write(" \r\n");
      out.write("        </td> \r\n");
      out.write("\t</tr><tr> \r\n");
      out.write("        <td id=\"nav-container\"> \r\n");
      out.write("            ");
      out.write("<!--   includes/navigation.jsp --> \r\n");
      out.write("\r\n");
      out.write("<table cellpadding=\"0\" cellspacing=\"0\"> \r\n");
      out.write("<tr> \r\n");
      out.write("    <td> \r\n");
      out.write("        <a href=\"<s:url value=\"AddressBook.action\"/>\"> Here</a> \r\n");
      out.write("    </td> \r\n");
      out.write("</tr> \r\n");
      out.write("</table> ");
      out.write(" \r\n");
      out.write("        </td> \r\n");
      out.write("        <td id=\"content-container\"> \r\n");
      out.write("            ");
      if (_jspx_meth_decorator_005fbody_005f0(_jspx_page_context))
        return;
      out.write(" \r\n");
      out.write("        </td> \r\n");
      out.write("    </tr><tr> \r\n");
      out.write("    <td colspan=\"2\" id=\"page-footer\"> \r\n");
      out.write("        ");
      out.write("<div id=\"footer\">\r\n");
      out.write("\t<div class=\"shell\">\r\n");
      out.write("\t\t<p class=\"left\">\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t<a href=\"#\" title=\"Home\" >Home</a>\r\n");
      out.write("\t\t\t<span>|</span>\r\n");
      out.write("\t\t\t<a href=\"#\" title=\"About Us\">About Us</a>\r\n");
      out.write("\t\t\t<span>|</span>\r\n");
      out.write("\t\t\t<span>|</span>\r\n");
      out.write("\t\t\t<a href=\"#\" title=\"Solutions\">Buzz</a>\r\n");
      out.write("\t\t\t<span>|</span>\r\n");
      out.write("\t\t\t<a href=\"#\" title=\"Contact\">Contact</a>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t</p>\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t<p class=\"right\">\r\n");
      out.write("\t\t\t&copy; Aasov.com. Design by <a href=\"Dreamchasers\" >Dreamchasers</a>\r\n");
      out.write("\t\t</p>\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t<div class=\"cl\">&nbsp;</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("</div>\t\r\n");
      out.write("<!-- End Footer -->\r\n");
      out.write("\r\n");
      out.write(" \r\n");
      out.write("    </td> \r\n");
      out.write("    </tr></table> \r\n");
      out.write("</body> \r\n");
      out.write("</html> ");
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

  private boolean _jspx_meth_c_005fset_005f0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:set
    org.apache.taglibs.standard.tag.rt.core.SetTag _jspx_th_c_005fset_005f0 = (org.apache.taglibs.standard.tag.rt.core.SetTag) _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.SetTag.class);
    _jspx_th_c_005fset_005f0.setPageContext(_jspx_page_context);
    _jspx_th_c_005fset_005f0.setParent(null);
    // /WEB-INF/decorators/layout.jsp(8,0) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fset_005f0.setVar("ctx");
    // /WEB-INF/decorators/layout.jsp(8,0) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fset_005f0.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.Object.class, (PageContext)_jspx_page_context, null, false));
    int _jspx_eval_c_005fset_005f0 = _jspx_th_c_005fset_005f0.doStartTag();
    if (_jspx_th_c_005fset_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody.reuse(_jspx_th_c_005fset_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody.reuse(_jspx_th_c_005fset_005f0);
    return false;
  }

  private boolean _jspx_meth_decorator_005ftitle_005f0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  decorator:title
    com.opensymphony.module.sitemesh.taglib.decorator.TitleTag _jspx_th_decorator_005ftitle_005f0 = (com.opensymphony.module.sitemesh.taglib.decorator.TitleTag) _005fjspx_005ftagPool_005fdecorator_005ftitle_0026_005fdefault_005fnobody.get(com.opensymphony.module.sitemesh.taglib.decorator.TitleTag.class);
    _jspx_th_decorator_005ftitle_005f0.setPageContext(_jspx_page_context);
    _jspx_th_decorator_005ftitle_005f0.setParent(null);
    // /WEB-INF/decorators/layout.jsp(13,11) name = default type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_decorator_005ftitle_005f0.setDefault("Struts-2 CRUD Tutorial: Decorating with SiteMesh");
    int _jspx_eval_decorator_005ftitle_005f0 = _jspx_th_decorator_005ftitle_005f0.doStartTag();
    if (_jspx_th_decorator_005ftitle_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fdecorator_005ftitle_0026_005fdefault_005fnobody.reuse(_jspx_th_decorator_005ftitle_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fdecorator_005ftitle_0026_005fdefault_005fnobody.reuse(_jspx_th_decorator_005ftitle_005f0);
    return false;
  }

  private boolean _jspx_meth_decorator_005fhead_005f0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  decorator:head
    com.opensymphony.module.sitemesh.taglib.decorator.HeadTag _jspx_th_decorator_005fhead_005f0 = (com.opensymphony.module.sitemesh.taglib.decorator.HeadTag) _005fjspx_005ftagPool_005fdecorator_005fhead_005fnobody.get(com.opensymphony.module.sitemesh.taglib.decorator.HeadTag.class);
    _jspx_th_decorator_005fhead_005f0.setPageContext(_jspx_page_context);
    _jspx_th_decorator_005fhead_005f0.setParent(null);
    int _jspx_eval_decorator_005fhead_005f0 = _jspx_th_decorator_005fhead_005f0.doStartTag();
    if (_jspx_th_decorator_005fhead_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fdecorator_005fhead_005fnobody.reuse(_jspx_th_decorator_005fhead_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fdecorator_005fhead_005fnobody.reuse(_jspx_th_decorator_005fhead_005f0);
    return false;
  }

  private boolean _jspx_meth_decorator_005fbody_005f0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  decorator:body
    com.opensymphony.module.sitemesh.taglib.decorator.BodyTag _jspx_th_decorator_005fbody_005f0 = (com.opensymphony.module.sitemesh.taglib.decorator.BodyTag) _005fjspx_005ftagPool_005fdecorator_005fbody_005fnobody.get(com.opensymphony.module.sitemesh.taglib.decorator.BodyTag.class);
    _jspx_th_decorator_005fbody_005f0.setPageContext(_jspx_page_context);
    _jspx_th_decorator_005fbody_005f0.setParent(null);
    int _jspx_eval_decorator_005fbody_005f0 = _jspx_th_decorator_005fbody_005f0.doStartTag();
    if (_jspx_th_decorator_005fbody_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fdecorator_005fbody_005fnobody.reuse(_jspx_th_decorator_005fbody_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fdecorator_005fbody_005fnobody.reuse(_jspx_th_decorator_005fbody_005f0);
    return false;
  }
}
