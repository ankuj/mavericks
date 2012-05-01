package org.apache.jsp.html;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.myp.customer.model.PropertyDetails;
import com.myp.action.login.PropertyDetailsAction;

public final class SearchResult_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fs_005fform_0026_005faction;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fs_005fiterator_0026_005fvar_005fvalue;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fs_005fiterator_0026_005fvalue;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fs_005fproperty_0026_005fvalue_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fs_005fiterator_0026_005fvalue_005fid;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fs_005fcheckbox_0026_005fvalue_005fonclick_005fname_005ffieldValue_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fs_005fif_0026_005ftest;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fs_005fset_0026_005fvalue_005fname_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fs_005fsubmit;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fs_005fform_0026_005faction = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fs_005fiterator_0026_005fvar_005fvalue = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fs_005fiterator_0026_005fvalue = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fs_005fproperty_0026_005fvalue_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fs_005fiterator_0026_005fvalue_005fid = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fs_005fcheckbox_0026_005fvalue_005fonclick_005fname_005ffieldValue_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fs_005fif_0026_005ftest = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fs_005fset_0026_005fvalue_005fname_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fs_005fsubmit = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fs_005fform_0026_005faction.release();
    _005fjspx_005ftagPool_005fs_005fiterator_0026_005fvar_005fvalue.release();
    _005fjspx_005ftagPool_005fs_005fiterator_0026_005fvalue.release();
    _005fjspx_005ftagPool_005fs_005fproperty_0026_005fvalue_005fnobody.release();
    _005fjspx_005ftagPool_005fs_005fiterator_0026_005fvalue_005fid.release();
    _005fjspx_005ftagPool_005fs_005fcheckbox_0026_005fvalue_005fonclick_005fname_005ffieldValue_005fnobody.release();
    _005fjspx_005ftagPool_005fs_005fif_0026_005ftest.release();
    _005fjspx_005ftagPool_005fs_005fset_0026_005fvalue_005fname_005fnobody.release();
    _005fjspx_005ftagPool_005fs_005fsubmit.release();
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
      response.setContentType("text/html; charset=ISO-8859-1");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=ISO-8859-1\">\r\n");
      out.write("<title>Insert title here</title>\r\n");
      out.write("<link rel=\"stylesheet\" href=\"css/style_table.css\" type=\"text/css\" media=\"all\" />\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("    ");
      //  s:form
      org.apache.struts2.views.jsp.ui.FormTag _jspx_th_s_005fform_005f0 = (org.apache.struts2.views.jsp.ui.FormTag) _005fjspx_005ftagPool_005fs_005fform_0026_005faction.get(org.apache.struts2.views.jsp.ui.FormTag.class);
      _jspx_th_s_005fform_005f0.setPageContext(_jspx_page_context);
      _jspx_th_s_005fform_005f0.setParent(null);
      // /html/SearchResult.jsp(14,4) name = action type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_s_005fform_005f0.setAction("interestAction");
      int _jspx_eval_s_005fform_005f0 = _jspx_th_s_005fform_005f0.doStartTag();
      if (_jspx_eval_s_005fform_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        if (_jspx_eval_s_005fform_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
          out = _jspx_page_context.pushBody();
          _jspx_th_s_005fform_005f0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
          _jspx_th_s_005fform_005f0.doInitBody();
        }
        do {
          out.write('\r');
          out.write('\n');
          if (_jspx_meth_s_005fiterator_005f0(_jspx_th_s_005fform_005f0, _jspx_page_context))
            return;
          out.write("  \r\n");
          out.write("        <ol>\r\n");
          out.write("        ");
int i=0; 
          out.write('\r');
          out.write('\n');
          if (_jspx_meth_s_005fiterator_005f1(_jspx_th_s_005fform_005f0, _jspx_page_context))
            return;
          out.write("\r\n");
          out.write("</ol>\r\n");
          out.write("          ");
          if (_jspx_meth_s_005fproperty_005f3(_jspx_th_s_005fform_005f0, _jspx_page_context))
            return;
          out.write("\r\n");
          out.write("          ");
          if (_jspx_meth_s_005fproperty_005f4(_jspx_th_s_005fform_005f0, _jspx_page_context))
            return;
          out.write("  \r\n");
          out.write("          ");
          if (_jspx_meth_s_005fproperty_005f5(_jspx_th_s_005fform_005f0, _jspx_page_context))
            return;
          out.write("\r\n");
          out.write("          ");
          if (_jspx_meth_s_005fproperty_005f6(_jspx_th_s_005fform_005f0, _jspx_page_context))
            return;
          out.write("\r\n");
          out.write("          \r\n");
          out.write("          <table id=\"background-image\" summary=\"Meeting Results\">\r\n");
          out.write("    <thead>\r\n");
          out.write("    \t<tr>\r\n");
          out.write("        \t<th scope=\"col\">Employee</th>\r\n");
          out.write("            <th scope=\"col\">Division</th>\r\n");
          out.write("            <th scope=\"col\">Suggestions</th>\r\n");
          out.write("        </tr>\r\n");
          out.write("    </thead>\r\n");
          out.write("    <tfoot>\r\n");
          out.write("    \t<tr>\r\n");
          out.write("        \t<td colspan=\"4\">IE 6 users won't see the transparent background if the hack is not applied</td>\r\n");
          out.write("        </tr>\r\n");
          out.write("    </tfoot>\r\n");
          out.write("    <tbody>\r\n");
          out.write("\r\n");
          out.write("    ");
          //  s:iterator
          org.apache.struts2.views.jsp.IteratorTag _jspx_th_s_005fiterator_005f2 = (org.apache.struts2.views.jsp.IteratorTag) _005fjspx_005ftagPool_005fs_005fiterator_0026_005fvalue_005fid.get(org.apache.struts2.views.jsp.IteratorTag.class);
          _jspx_th_s_005fiterator_005f2.setPageContext(_jspx_page_context);
          _jspx_th_s_005fiterator_005f2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005fform_005f0);
          // /html/SearchResult.jsp(51,4) name = id type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_s_005fiterator_005f2.setId("itrate");
          // /html/SearchResult.jsp(51,4) name = value type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_s_005fiterator_005f2.setValue("searchList");
          int _jspx_eval_s_005fiterator_005f2 = _jspx_th_s_005fiterator_005f2.doStartTag();
          if (_jspx_eval_s_005fiterator_005f2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            if (_jspx_eval_s_005fiterator_005f2 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
              out = _jspx_page_context.pushBody();
              _jspx_th_s_005fiterator_005f2.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
              _jspx_th_s_005fiterator_005f2.doInitBody();
            }
            do {
              out.write("\r\n");
              out.write("    \t<tr>\r\n");
              out.write("        \t<td>");
              if (_jspx_meth_s_005fproperty_005f7(_jspx_th_s_005fiterator_005f2, _jspx_page_context))
                return;
              out.write("</td>\r\n");
              out.write("            <td>");
              if (_jspx_meth_s_005fproperty_005f8(_jspx_th_s_005fiterator_005f2, _jspx_page_context))
                return;
              out.write("</td>\r\n");
              out.write("            <td>");
              if (_jspx_meth_s_005fproperty_005f9(_jspx_th_s_005fiterator_005f2, _jspx_page_context))
                return;
              out.write("</td>\r\n");
              out.write("            <td>");
              out.print(++i );
              out.write("</td>\r\n");
              out.write("             ");
              if (_jspx_meth_s_005fcheckbox_005f0(_jspx_th_s_005fiterator_005f2, _jspx_page_context))
                return;
              out.write("\r\n");
              out.write("             \r\n");
              out.write("             ");
              if (_jspx_meth_s_005fif_005f0(_jspx_th_s_005fiterator_005f2, _jspx_page_context))
                return;
              out.write("\r\n");
              out.write("             ");
              //  s:if
              org.apache.struts2.views.jsp.IfTag _jspx_th_s_005fif_005f1 = (org.apache.struts2.views.jsp.IfTag) _005fjspx_005ftagPool_005fs_005fif_0026_005ftest.get(org.apache.struts2.views.jsp.IfTag.class);
              _jspx_th_s_005fif_005f1.setPageContext(_jspx_page_context);
              _jspx_th_s_005fif_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005fiterator_005f2);
              // /html/SearchResult.jsp(63,13) name = test type = java.lang.String reqTime = false required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
              _jspx_th_s_005fif_005f1.setTest("%{#check=='true'}");
              int _jspx_eval_s_005fif_005f1 = _jspx_th_s_005fif_005f1.doStartTag();
              if (_jspx_eval_s_005fif_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                if (_jspx_eval_s_005fif_005f1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                  out = _jspx_page_context.pushBody();
                  _jspx_th_s_005fif_005f1.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
                  _jspx_th_s_005fif_005f1.doInitBody();
                }
                do {
System.out.println("i:"+i); 
                  int evalDoAfterBody = _jspx_th_s_005fif_005f1.doAfterBody();
                  if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                    break;
                } while (true);
                if (_jspx_eval_s_005fif_005f1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                  out = _jspx_page_context.popBody();
                }
              }
              if (_jspx_th_s_005fif_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _005fjspx_005ftagPool_005fs_005fif_0026_005ftest.reuse(_jspx_th_s_005fif_005f1);
                return;
              }
              _005fjspx_005ftagPool_005fs_005fif_0026_005ftest.reuse(_jspx_th_s_005fif_005f1);
              out.write("\r\n");
              out.write("        </tr>\r\n");
              out.write("      ");
              int evalDoAfterBody = _jspx_th_s_005fiterator_005f2.doAfterBody();
              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                break;
            } while (true);
            if (_jspx_eval_s_005fiterator_005f2 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
              out = _jspx_page_context.popBody();
            }
          }
          if (_jspx_th_s_005fiterator_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fs_005fiterator_0026_005fvalue_005fid.reuse(_jspx_th_s_005fiterator_005f2);
            return;
          }
          _005fjspx_005ftagPool_005fs_005fiterator_0026_005fvalue_005fid.reuse(_jspx_th_s_005fiterator_005f2);
          out.write("\r\n");
          out.write("      ");
          if (_jspx_meth_s_005fsubmit_005f0(_jspx_th_s_005fform_005f0, _jspx_page_context))
            return;
          out.write("\r\n");
          out.write(" \r\n");
          out.write("        <tr>\r\n");
          out.write("        \t<td>Josephin Tan</td>\r\n");
          out.write("            <td>Advertising</td>\r\n");
          out.write("            <td>Give bonuses</td>\r\n");
          out.write("        </tr>\r\n");
          out.write("        <tr>\r\n");
          out.write("        \t<td>Joyce Ming</td>\r\n");
          out.write("            <td>Marketing</td>\r\n");
          out.write("            <td>New designs</td>\r\n");
          out.write("        </tr>\r\n");
          out.write("        <tr>\r\n");
          out.write("        \t<td>James A. Pentel</td>\r\n");
          out.write("            <td>Marketing</td>\r\n");
          out.write("            <td>Better Packaging</td>\r\n");
          out.write("        </tr>\r\n");
          out.write("    </tbody>\r\n");
          out.write("</table>\r\n");
          out.write("     ");
          int evalDoAfterBody = _jspx_th_s_005fform_005f0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
        if (_jspx_eval_s_005fform_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
          out = _jspx_page_context.popBody();
        }
      }
      if (_jspx_th_s_005fform_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _005fjspx_005ftagPool_005fs_005fform_0026_005faction.reuse(_jspx_th_s_005fform_005f0);
        return;
      }
      _005fjspx_005ftagPool_005fs_005fform_0026_005faction.reuse(_jspx_th_s_005fform_005f0);
      out.write("          \r\n");
      out.write("</body>\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("function findvalue()\r\n");
      out.write("{\r\n");
      out.write("\talert(\"ankuj here\");\r\n");
      out.write("\tvar chkvalue=document.getElementById(\"interest1\");\r\n");
      out.write("\tvar itrate=document.getElementById(\"itrate\");\r\n");
      out.write("\tvar i=document.getElementById(\"i\");\r\n");
      out.write("\talert(\"chkvalue\"+chkvalue.checked);\r\n");
      out.write("\tif(chkvalue.checked)\r\n");
      out.write("\t{\r\n");
      out.write("\t\t\r\n");
      out.write("\t}\r\n");
      out.write("\talert(\"i\"+i);\r\n");
      out.write("\tfor(i=0;i<chkvalue.length;i++)\r\n");
      out.write("\t{\r\n");
      out.write("\t\talert(\"chkvalue.length\"+chkvalue.length);\r\n");
      out.write("\t\tif(chkvalue[i].type=\"s:checkbox\")\r\n");
      out.write("\t\t{\r\n");
      out.write("\t\t\talert(\"here\");\t\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\t\t\r\n");
      out.write("\r\n");
      out.write("\t}\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("</script>\r\n");
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

  private boolean _jspx_meth_s_005fiterator_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005fform_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:iterator
    org.apache.struts2.views.jsp.IteratorTag _jspx_th_s_005fiterator_005f0 = (org.apache.struts2.views.jsp.IteratorTag) _005fjspx_005ftagPool_005fs_005fiterator_0026_005fvar_005fvalue.get(org.apache.struts2.views.jsp.IteratorTag.class);
    _jspx_th_s_005fiterator_005f0.setPageContext(_jspx_page_context);
    _jspx_th_s_005fiterator_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005fform_005f0);
    // /html/SearchResult.jsp(15,0) name = value type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fiterator_005f0.setValue("list");
    // /html/SearchResult.jsp(15,0) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fiterator_005f0.setVar("i");
    int _jspx_eval_s_005fiterator_005f0 = _jspx_th_s_005fiterator_005f0.doStartTag();
    if (_jspx_eval_s_005fiterator_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_s_005fiterator_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_s_005fiterator_005f0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_s_005fiterator_005f0.doInitBody();
      }
      do {
        out.write("  \r\n");
        out.write("       <tr>  \r\n");
        out.write("          <td>%{i.state}</td>  \r\n");
        out.write("         <td>%{i.city}</td>  \r\n");
        out.write("         <td>%{i.state}</td>  \r\n");
        out.write("       \r\n");
        out.write("        </tr>  \r\n");
        out.write("        ");
        int evalDoAfterBody = _jspx_th_s_005fiterator_005f0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_s_005fiterator_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.popBody();
      }
    }
    if (_jspx_th_s_005fiterator_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005fiterator_0026_005fvar_005fvalue.reuse(_jspx_th_s_005fiterator_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005fiterator_0026_005fvar_005fvalue.reuse(_jspx_th_s_005fiterator_005f0);
    return false;
  }

  private boolean _jspx_meth_s_005fiterator_005f1(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005fform_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:iterator
    org.apache.struts2.views.jsp.IteratorTag _jspx_th_s_005fiterator_005f1 = (org.apache.struts2.views.jsp.IteratorTag) _005fjspx_005ftagPool_005fs_005fiterator_0026_005fvalue.get(org.apache.struts2.views.jsp.IteratorTag.class);
    _jspx_th_s_005fiterator_005f1.setPageContext(_jspx_page_context);
    _jspx_th_s_005fiterator_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005fform_005f0);
    // /html/SearchResult.jsp(25,0) name = value type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fiterator_005f1.setValue("searchList");
    int _jspx_eval_s_005fiterator_005f1 = _jspx_th_s_005fiterator_005f1.doStartTag();
    if (_jspx_eval_s_005fiterator_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_s_005fiterator_005f1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_s_005fiterator_005f1.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_s_005fiterator_005f1.doInitBody();
      }
      do {
        out.write("\r\n");
        out.write("  <li>");
        if (_jspx_meth_s_005fproperty_005f0(_jspx_th_s_005fiterator_005f1, _jspx_page_context))
          return true;
        out.write("</li>\r\n");
        out.write("  <li>");
        if (_jspx_meth_s_005fproperty_005f1(_jspx_th_s_005fiterator_005f1, _jspx_page_context))
          return true;
        out.write("</li>\r\n");
        out.write("  <li>");
        if (_jspx_meth_s_005fproperty_005f2(_jspx_th_s_005fiterator_005f1, _jspx_page_context))
          return true;
        out.write("</li>\r\n");
        int evalDoAfterBody = _jspx_th_s_005fiterator_005f1.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_s_005fiterator_005f1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.popBody();
      }
    }
    if (_jspx_th_s_005fiterator_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005fiterator_0026_005fvalue.reuse(_jspx_th_s_005fiterator_005f1);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005fiterator_0026_005fvalue.reuse(_jspx_th_s_005fiterator_005f1);
    return false;
  }

  private boolean _jspx_meth_s_005fproperty_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005fiterator_005f1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:property
    org.apache.struts2.views.jsp.PropertyTag _jspx_th_s_005fproperty_005f0 = (org.apache.struts2.views.jsp.PropertyTag) _005fjspx_005ftagPool_005fs_005fproperty_0026_005fvalue_005fnobody.get(org.apache.struts2.views.jsp.PropertyTag.class);
    _jspx_th_s_005fproperty_005f0.setPageContext(_jspx_page_context);
    _jspx_th_s_005fproperty_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005fiterator_005f1);
    // /html/SearchResult.jsp(26,6) name = value type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fproperty_005f0.setValue("pid");
    int _jspx_eval_s_005fproperty_005f0 = _jspx_th_s_005fproperty_005f0.doStartTag();
    if (_jspx_th_s_005fproperty_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005fproperty_0026_005fvalue_005fnobody.reuse(_jspx_th_s_005fproperty_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005fproperty_0026_005fvalue_005fnobody.reuse(_jspx_th_s_005fproperty_005f0);
    return false;
  }

  private boolean _jspx_meth_s_005fproperty_005f1(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005fiterator_005f1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:property
    org.apache.struts2.views.jsp.PropertyTag _jspx_th_s_005fproperty_005f1 = (org.apache.struts2.views.jsp.PropertyTag) _005fjspx_005ftagPool_005fs_005fproperty_0026_005fvalue_005fnobody.get(org.apache.struts2.views.jsp.PropertyTag.class);
    _jspx_th_s_005fproperty_005f1.setPageContext(_jspx_page_context);
    _jspx_th_s_005fproperty_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005fiterator_005f1);
    // /html/SearchResult.jsp(27,6) name = value type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fproperty_005f1.setValue("city");
    int _jspx_eval_s_005fproperty_005f1 = _jspx_th_s_005fproperty_005f1.doStartTag();
    if (_jspx_th_s_005fproperty_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005fproperty_0026_005fvalue_005fnobody.reuse(_jspx_th_s_005fproperty_005f1);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005fproperty_0026_005fvalue_005fnobody.reuse(_jspx_th_s_005fproperty_005f1);
    return false;
  }

  private boolean _jspx_meth_s_005fproperty_005f2(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005fiterator_005f1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:property
    org.apache.struts2.views.jsp.PropertyTag _jspx_th_s_005fproperty_005f2 = (org.apache.struts2.views.jsp.PropertyTag) _005fjspx_005ftagPool_005fs_005fproperty_0026_005fvalue_005fnobody.get(org.apache.struts2.views.jsp.PropertyTag.class);
    _jspx_th_s_005fproperty_005f2.setPageContext(_jspx_page_context);
    _jspx_th_s_005fproperty_005f2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005fiterator_005f1);
    // /html/SearchResult.jsp(28,6) name = value type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fproperty_005f2.setValue("zone");
    int _jspx_eval_s_005fproperty_005f2 = _jspx_th_s_005fproperty_005f2.doStartTag();
    if (_jspx_th_s_005fproperty_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005fproperty_0026_005fvalue_005fnobody.reuse(_jspx_th_s_005fproperty_005f2);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005fproperty_0026_005fvalue_005fnobody.reuse(_jspx_th_s_005fproperty_005f2);
    return false;
  }

  private boolean _jspx_meth_s_005fproperty_005f3(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005fform_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:property
    org.apache.struts2.views.jsp.PropertyTag _jspx_th_s_005fproperty_005f3 = (org.apache.struts2.views.jsp.PropertyTag) _005fjspx_005ftagPool_005fs_005fproperty_0026_005fvalue_005fnobody.get(org.apache.struts2.views.jsp.PropertyTag.class);
    _jspx_th_s_005fproperty_005f3.setPageContext(_jspx_page_context);
    _jspx_th_s_005fproperty_005f3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005fform_005f0);
    // /html/SearchResult.jsp(31,10) name = value type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fproperty_005f3.setValue("%{i.state}");
    int _jspx_eval_s_005fproperty_005f3 = _jspx_th_s_005fproperty_005f3.doStartTag();
    if (_jspx_th_s_005fproperty_005f3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005fproperty_0026_005fvalue_005fnobody.reuse(_jspx_th_s_005fproperty_005f3);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005fproperty_0026_005fvalue_005fnobody.reuse(_jspx_th_s_005fproperty_005f3);
    return false;
  }

  private boolean _jspx_meth_s_005fproperty_005f4(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005fform_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:property
    org.apache.struts2.views.jsp.PropertyTag _jspx_th_s_005fproperty_005f4 = (org.apache.struts2.views.jsp.PropertyTag) _005fjspx_005ftagPool_005fs_005fproperty_0026_005fvalue_005fnobody.get(org.apache.struts2.views.jsp.PropertyTag.class);
    _jspx_th_s_005fproperty_005f4.setPageContext(_jspx_page_context);
    _jspx_th_s_005fproperty_005f4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005fform_005f0);
    // /html/SearchResult.jsp(32,10) name = value type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fproperty_005f4.setValue("%{name}");
    int _jspx_eval_s_005fproperty_005f4 = _jspx_th_s_005fproperty_005f4.doStartTag();
    if (_jspx_th_s_005fproperty_005f4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005fproperty_0026_005fvalue_005fnobody.reuse(_jspx_th_s_005fproperty_005f4);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005fproperty_0026_005fvalue_005fnobody.reuse(_jspx_th_s_005fproperty_005f4);
    return false;
  }

  private boolean _jspx_meth_s_005fproperty_005f5(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005fform_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:property
    org.apache.struts2.views.jsp.PropertyTag _jspx_th_s_005fproperty_005f5 = (org.apache.struts2.views.jsp.PropertyTag) _005fjspx_005ftagPool_005fs_005fproperty_0026_005fvalue_005fnobody.get(org.apache.struts2.views.jsp.PropertyTag.class);
    _jspx_th_s_005fproperty_005f5.setPageContext(_jspx_page_context);
    _jspx_th_s_005fproperty_005f5.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005fform_005f0);
    // /html/SearchResult.jsp(33,10) name = value type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fproperty_005f5.setValue("name");
    int _jspx_eval_s_005fproperty_005f5 = _jspx_th_s_005fproperty_005f5.doStartTag();
    if (_jspx_th_s_005fproperty_005f5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005fproperty_0026_005fvalue_005fnobody.reuse(_jspx_th_s_005fproperty_005f5);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005fproperty_0026_005fvalue_005fnobody.reuse(_jspx_th_s_005fproperty_005f5);
    return false;
  }

  private boolean _jspx_meth_s_005fproperty_005f6(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005fform_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:property
    org.apache.struts2.views.jsp.PropertyTag _jspx_th_s_005fproperty_005f6 = (org.apache.struts2.views.jsp.PropertyTag) _005fjspx_005ftagPool_005fs_005fproperty_0026_005fvalue_005fnobody.get(org.apache.struts2.views.jsp.PropertyTag.class);
    _jspx_th_s_005fproperty_005f6.setPageContext(_jspx_page_context);
    _jspx_th_s_005fproperty_005f6.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005fform_005f0);
    // /html/SearchResult.jsp(34,10) name = value type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fproperty_005f6.setValue("key1");
    int _jspx_eval_s_005fproperty_005f6 = _jspx_th_s_005fproperty_005f6.doStartTag();
    if (_jspx_th_s_005fproperty_005f6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005fproperty_0026_005fvalue_005fnobody.reuse(_jspx_th_s_005fproperty_005f6);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005fproperty_0026_005fvalue_005fnobody.reuse(_jspx_th_s_005fproperty_005f6);
    return false;
  }

  private boolean _jspx_meth_s_005fproperty_005f7(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005fiterator_005f2, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:property
    org.apache.struts2.views.jsp.PropertyTag _jspx_th_s_005fproperty_005f7 = (org.apache.struts2.views.jsp.PropertyTag) _005fjspx_005ftagPool_005fs_005fproperty_0026_005fvalue_005fnobody.get(org.apache.struts2.views.jsp.PropertyTag.class);
    _jspx_th_s_005fproperty_005f7.setPageContext(_jspx_page_context);
    _jspx_th_s_005fproperty_005f7.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005fiterator_005f2);
    // /html/SearchResult.jsp(53,13) name = value type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fproperty_005f7.setValue("pid");
    int _jspx_eval_s_005fproperty_005f7 = _jspx_th_s_005fproperty_005f7.doStartTag();
    if (_jspx_th_s_005fproperty_005f7.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005fproperty_0026_005fvalue_005fnobody.reuse(_jspx_th_s_005fproperty_005f7);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005fproperty_0026_005fvalue_005fnobody.reuse(_jspx_th_s_005fproperty_005f7);
    return false;
  }

  private boolean _jspx_meth_s_005fproperty_005f8(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005fiterator_005f2, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:property
    org.apache.struts2.views.jsp.PropertyTag _jspx_th_s_005fproperty_005f8 = (org.apache.struts2.views.jsp.PropertyTag) _005fjspx_005ftagPool_005fs_005fproperty_0026_005fvalue_005fnobody.get(org.apache.struts2.views.jsp.PropertyTag.class);
    _jspx_th_s_005fproperty_005f8.setPageContext(_jspx_page_context);
    _jspx_th_s_005fproperty_005f8.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005fiterator_005f2);
    // /html/SearchResult.jsp(54,16) name = value type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fproperty_005f8.setValue("city");
    int _jspx_eval_s_005fproperty_005f8 = _jspx_th_s_005fproperty_005f8.doStartTag();
    if (_jspx_th_s_005fproperty_005f8.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005fproperty_0026_005fvalue_005fnobody.reuse(_jspx_th_s_005fproperty_005f8);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005fproperty_0026_005fvalue_005fnobody.reuse(_jspx_th_s_005fproperty_005f8);
    return false;
  }

  private boolean _jspx_meth_s_005fproperty_005f9(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005fiterator_005f2, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:property
    org.apache.struts2.views.jsp.PropertyTag _jspx_th_s_005fproperty_005f9 = (org.apache.struts2.views.jsp.PropertyTag) _005fjspx_005ftagPool_005fs_005fproperty_0026_005fvalue_005fnobody.get(org.apache.struts2.views.jsp.PropertyTag.class);
    _jspx_th_s_005fproperty_005f9.setPageContext(_jspx_page_context);
    _jspx_th_s_005fproperty_005f9.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005fiterator_005f2);
    // /html/SearchResult.jsp(55,16) name = value type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fproperty_005f9.setValue("zone");
    int _jspx_eval_s_005fproperty_005f9 = _jspx_th_s_005fproperty_005f9.doStartTag();
    if (_jspx_th_s_005fproperty_005f9.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005fproperty_0026_005fvalue_005fnobody.reuse(_jspx_th_s_005fproperty_005f9);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005fproperty_0026_005fvalue_005fnobody.reuse(_jspx_th_s_005fproperty_005f9);
    return false;
  }

  private boolean _jspx_meth_s_005fcheckbox_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005fiterator_005f2, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:checkbox
    org.apache.struts2.views.jsp.ui.CheckboxTag _jspx_th_s_005fcheckbox_005f0 = (org.apache.struts2.views.jsp.ui.CheckboxTag) _005fjspx_005ftagPool_005fs_005fcheckbox_0026_005fvalue_005fonclick_005fname_005ffieldValue_005fnobody.get(org.apache.struts2.views.jsp.ui.CheckboxTag.class);
    _jspx_th_s_005fcheckbox_005f0.setPageContext(_jspx_page_context);
    _jspx_th_s_005fcheckbox_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005fiterator_005f2);
    // /html/SearchResult.jsp(57,13) name = name type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fcheckbox_005f0.setName("interest");
    // /html/SearchResult.jsp(57,13) name = onclick type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fcheckbox_005f0.setOnclick("findvalue");
    // /html/SearchResult.jsp(57,13) name = value type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fcheckbox_005f0.setValue("interest");
    // /html/SearchResult.jsp(57,13) name = fieldValue type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fcheckbox_005f0.setFieldValue("%{pid}");
    int _jspx_eval_s_005fcheckbox_005f0 = _jspx_th_s_005fcheckbox_005f0.doStartTag();
    if (_jspx_th_s_005fcheckbox_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005fcheckbox_0026_005fvalue_005fonclick_005fname_005ffieldValue_005fnobody.reuse(_jspx_th_s_005fcheckbox_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005fcheckbox_0026_005fvalue_005fonclick_005fname_005ffieldValue_005fnobody.reuse(_jspx_th_s_005fcheckbox_005f0);
    return false;
  }

  private boolean _jspx_meth_s_005fif_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005fiterator_005f2, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:if
    org.apache.struts2.views.jsp.IfTag _jspx_th_s_005fif_005f0 = (org.apache.struts2.views.jsp.IfTag) _005fjspx_005ftagPool_005fs_005fif_0026_005ftest.get(org.apache.struts2.views.jsp.IfTag.class);
    _jspx_th_s_005fif_005f0.setPageContext(_jspx_page_context);
    _jspx_th_s_005fif_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005fiterator_005f2);
    // /html/SearchResult.jsp(59,13) name = test type = java.lang.String reqTime = false required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fif_005f0.setTest("%{#interest=='true'}");
    int _jspx_eval_s_005fif_005f0 = _jspx_th_s_005fif_005f0.doStartTag();
    if (_jspx_eval_s_005fif_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_s_005fif_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_s_005fif_005f0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_s_005fif_005f0.doInitBody();
      }
      do {
        out.write("\r\n");
        out.write("\tThis is Struts 2\r\n");
        out.write("\t");
        if (_jspx_meth_s_005fset_005f0(_jspx_th_s_005fif_005f0, _jspx_page_context))
          return true;
        out.write('\r');
        out.write('\n');
        int evalDoAfterBody = _jspx_th_s_005fif_005f0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_s_005fif_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.popBody();
      }
    }
    if (_jspx_th_s_005fif_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005fif_0026_005ftest.reuse(_jspx_th_s_005fif_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005fif_0026_005ftest.reuse(_jspx_th_s_005fif_005f0);
    return false;
  }

  private boolean _jspx_meth_s_005fset_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005fif_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:set
    org.apache.struts2.views.jsp.SetTag _jspx_th_s_005fset_005f0 = (org.apache.struts2.views.jsp.SetTag) _005fjspx_005ftagPool_005fs_005fset_0026_005fvalue_005fname_005fnobody.get(org.apache.struts2.views.jsp.SetTag.class);
    _jspx_th_s_005fset_005f0.setPageContext(_jspx_page_context);
    _jspx_th_s_005fset_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005fif_005f0);
    // /html/SearchResult.jsp(61,1) name = name type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fset_005f0.setName("interest1");
    // /html/SearchResult.jsp(61,1) name = value type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fset_005f0.setValue("true");
    int _jspx_eval_s_005fset_005f0 = _jspx_th_s_005fset_005f0.doStartTag();
    if (_jspx_th_s_005fset_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005fset_0026_005fvalue_005fname_005fnobody.reuse(_jspx_th_s_005fset_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005fset_0026_005fvalue_005fname_005fnobody.reuse(_jspx_th_s_005fset_005f0);
    return false;
  }

  private boolean _jspx_meth_s_005fsubmit_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005fform_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:submit
    org.apache.struts2.views.jsp.ui.SubmitTag _jspx_th_s_005fsubmit_005f0 = (org.apache.struts2.views.jsp.ui.SubmitTag) _005fjspx_005ftagPool_005fs_005fsubmit.get(org.apache.struts2.views.jsp.ui.SubmitTag.class);
    _jspx_th_s_005fsubmit_005f0.setPageContext(_jspx_page_context);
    _jspx_th_s_005fsubmit_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005fform_005f0);
    int _jspx_eval_s_005fsubmit_005f0 = _jspx_th_s_005fsubmit_005f0.doStartTag();
    if (_jspx_eval_s_005fsubmit_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_s_005fsubmit_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_s_005fsubmit_005f0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_s_005fsubmit_005f0.doInitBody();
      }
      do {
        out.write("Submit");
        int evalDoAfterBody = _jspx_th_s_005fsubmit_005f0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_s_005fsubmit_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.popBody();
      }
    }
    if (_jspx_th_s_005fsubmit_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005fsubmit.reuse(_jspx_th_s_005fsubmit_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005fsubmit.reuse(_jspx_th_s_005fsubmit_005f0);
    return false;
  }
}
