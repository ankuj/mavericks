package org.apache.jsp.html;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class contacts_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("<HTML>\r\n");
      out.write("<HEAD>\r\n");
      out.write("<TITLE>MyProperty</TITLE>\r\n");
      out.write("<META HTTP-EQUIV=\"Content-Type\" CONTENT=\"text/html; charset=windows-1250\">\r\n");
      out.write("<!-- ImageReady Preload Script (index.psd) -->\r\n");
      out.write("<SCRIPT TYPE=\"text/javascript\">\r\n");
      out.write("<!--\r\n");
      out.write("\r\n");
      out.write("function newImage(arg) {\r\n");
      out.write("\tif (document.images) {\r\n");
      out.write("\t\trslt = new Image();\r\n");
      out.write("\t\trslt.src = arg;\r\n");
      out.write("\t\treturn rslt;\r\n");
      out.write("\t}\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("function changeImages() {\r\n");
      out.write("\tif (document.images && (preloadFlag == true)) {\r\n");
      out.write("\t\tfor (var i=0; i<changeImages.arguments.length; i+=2) {\r\n");
      out.write("\t\t\tdocument[changeImages.arguments[i]].src = changeImages.arguments[i+1];\r\n");
      out.write("\t\t}\r\n");
      out.write("\t}\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("var preloadFlag = false;\r\n");
      out.write("function preloadImages() {\r\n");
      out.write("\tif (document.images) {\r\n");
      out.write("\t\thome_page_over = newImage(\"images/home-page-over.gif\");\r\n");
      out.write("\t\tabout_us_over = newImage(\"images/about-us-over.gif\");\r\n");
      out.write("\t\thomes_over = newImage(\"images/homes-over.gif\");\r\n");
      out.write("\t\trenting_over = newImage(\"images/renting-over.gif\");\r\n");
      out.write("\t\tselling_over = newImage(\"images/selling-over.gif\");\r\n");
      out.write("\t\tnews___events_over = newImage(\"images/news-%26-events-over.gif\");\r\n");
      out.write("\t\tcontacts_over = newImage(\"images/contacts-over.gif\");\r\n");
      out.write("\t\tpreloadFlag = true;\r\n");
      out.write("\t}\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("// -->\r\n");
      out.write("</SCRIPT>\r\n");
      out.write("<!-- End Preload Script -->\r\n");
      out.write("</HEAD>\r\n");
      out.write("<link href=\"css/styles.css\" rel=\"stylesheet\" type=\"text/css\">\r\n");
      out.write("<center>\r\n");
      out.write("<BODY BGCOLOR=#FFFFFF LEFTMARGIN=0 TOPMARGIN=0 MARGINWIDTH=0 MARGINHEIGHT=0 ONLOAD=\"preloadImages();\">\r\n");
      out.write("<!-- ImageReady Slices (index.psd) -->\r\n");
      out.write("<TABLE WIDTH=775 BORDER=0 CELLPADDING=0 CELLSPACING=0 class=\"frame\">\r\n");
      out.write("\t<TR>\r\n");
      out.write("\t\t<TD ROWSPAN=3 BGCOLOR=#4B4B4B>\r\n");
      out.write("\t\t\t<IMG SRC=\"images/spacer.gif\" WIDTH=75 HEIGHT=114 ALT=\"\"></TD>\r\n");
      out.write("\t\t<TD COLSPAN=19 ROWSPAN=2 BGCOLOR=#4B4B4B>\r\n");
      out.write("\t\t\t<IMG SRC=\"images/spacer.gif\" WIDTH=427 HEIGHT=82 ALT=\"\"></TD>\r\n");
      out.write("\t\t<TD COLSPAN=14 BGCOLOR=#4B4B4B>\r\n");
      out.write("\t\t\t<IMG SRC=\"images/spacer.gif\" WIDTH=212 HEIGHT=41 ALT=\"\"></TD>\r\n");
      out.write("\t\t<TD ROWSPAN=3 BGCOLOR=#4B4B4B>\r\n");
      out.write("\t\t\t<IMG SRC=\"images/spacer.gif\" WIDTH=61 HEIGHT=114 ALT=\"\"></TD>\r\n");
      out.write("\t\t<TD>\r\n");
      out.write("\t\t\t<IMG SRC=\"images/spacer.gif\" WIDTH=1 HEIGHT=41 ALT=\"\"></TD>\r\n");
      out.write("\t</TR>\r\n");
      out.write("\t<TR>\r\n");
      out.write("\t\t<TD COLSPAN=2>\r\n");
      out.write("\t\t\t<IMG SRC=\"images/ico1.gif\" WIDTH=20 HEIGHT=41 ALT=\"\"></TD>\r\n");
      out.write("\t\t<TD WIDTH=56 HEIGHT=41 COLSPAN=3 align=\"left\" valign=\"top\" bgcolor=\"#4B4B4B\"><a href=\"index.jsp\" class=\"a\">Home</a></TD>\r\n");
      out.write("\t\t<TD align=\"left\" valign=\"top\" bgcolor=\"#4B4B4B\">\r\n");
      out.write("\t\t\t<IMG SRC=\"images/ico2.gif\" WIDTH=22 HEIGHT=41 ALT=\"\"></TD>\r\n");
      out.write("\t\t<TD WIDTH=46 HEIGHT=41 COLSPAN=4 align=\"left\" valign=\"top\" bgcolor=\"#4B4B4B\"><a href=\"#\" class=\"a\">Help</a></TD>\r\n");
      out.write("\t\t<TD align=\"left\" valign=\"top\" bgcolor=\"#4B4B4B\">\r\n");
      out.write("\t\t\t<IMG SRC=\"images/ico3.gif\" WIDTH=19 HEIGHT=41 ALT=\"\"></TD>\r\n");
      out.write("\t\t<TD WIDTH=49 HEIGHT=41 COLSPAN=3 align=\"left\" valign=\"top\" bgcolor=\"#4B4B4B\"><a href=\"#\" class=\"a\">Site Map</a></TD>\r\n");
      out.write("\t\t<TD>\r\n");
      out.write("\t\t\t<IMG SRC=\"images/spacer.gif\" WIDTH=1 HEIGHT=41 ALT=\"\"></TD>\r\n");
      out.write("\t</TR>\r\n");
      out.write("\t<TR>\r\n");
      out.write("\t\t<TD COLSPAN=6>\r\n");
      out.write("\t\t\t<A HREF=\"index.jsp\"\r\n");
      out.write("\t\t\t\tONMOUSEOVER=\"window.status='home page'; changeImages('home_page', 'images/home-page-over.gif'); return true;\"\r\n");
      out.write("\t\t\t\tONMOUSEOUT=\"window.status=''; changeImages('home_page', 'images/home-page.gif'); return true;\">\r\n");
      out.write("\t\t\t\t<IMG NAME=\"home_page\" SRC=\"images/home-page.gif\" WIDTH=94 HEIGHT=32 BORDER=0 ALT=\"home page\"></A></TD>\r\n");
      out.write("\t\t<TD COLSPAN=2>\r\n");
      out.write("\t\t\t<A HREF=\"about.jsp\"\r\n");
      out.write("\t\t\t\tONMOUSEOVER=\"window.status='about us'; changeImages('about_us', 'images/about-us-over.gif'); return true;\"\r\n");
      out.write("\t\t\t\tONMOUSEOUT=\"window.status=''; changeImages('about_us', 'images/about-us.gif'); return true;\">\r\n");
      out.write("\t\t\t\t<IMG NAME=\"about_us\" SRC=\"images/about-us.gif\" WIDTH=94 HEIGHT=32 BORDER=0 ALT=\"about us\"></A></TD>\r\n");
      out.write("\t\t<TD COLSPAN=6>\r\n");
      out.write("\t\t\t<A HREF=\"homes.jsp\"\r\n");
      out.write("\t\t\t\tONMOUSEOVER=\"window.status='homes'; changeImages('homes', 'images/homes-over.gif'); return true;\"\r\n");
      out.write("\t\t\t\tONMOUSEOUT=\"window.status=''; changeImages('homes', 'images/homes.gif'); return true;\">\r\n");
      out.write("\t\t\t\t<IMG NAME=\"homes\" SRC=\"images/homes.gif\" WIDTH=84 HEIGHT=32 BORDER=0 ALT=\"homes\"></A></TD>\r\n");
      out.write("\t\t<TD>\r\n");
      out.write("\t\t\t<A HREF=\"renting.jsp\"\r\n");
      out.write("\t\t\t\tONMOUSEOVER=\"window.status='renting'; changeImages('renting', 'images/renting-over.gif'); return true;\"\r\n");
      out.write("\t\t\t\tONMOUSEOUT=\"window.status=''; changeImages('renting', 'images/renting.gif'); return true;\">\r\n");
      out.write("\t\t\t\t<IMG NAME=\"renting\" SRC=\"images/renting.gif\" WIDTH=95 HEIGHT=32 BORDER=0 ALT=\"renting\"></A></TD>\r\n");
      out.write("\t\t<TD COLSPAN=7>\r\n");
      out.write("\t\t\t<A HREF=\"selling.jsp\"\r\n");
      out.write("\t\t\t\tONMOUSEOVER=\"window.status='selling'; changeImages('selling', 'images/selling-over.gif'); return true;\"\r\n");
      out.write("\t\t\t\tONMOUSEOUT=\"window.status=''; changeImages('selling', 'images/selling.gif'); return true;\">\r\n");
      out.write("\t\t\t\t<IMG NAME=\"selling\" SRC=\"images/selling.gif\" WIDTH=81 HEIGHT=32 BORDER=0 ALT=\"selling\"></A></TD>\r\n");
      out.write("\t\t<TD COLSPAN=6>\r\n");
      out.write("\t\t\t<A HREF=\"news.jsp\"\r\n");
      out.write("\t\t\t\tONMOUSEOVER=\"window.status='news & events'; changeImages('news___events', 'images/news-%26-events-over.gif'); return true;\"\r\n");
      out.write("\t\t\t\tONMOUSEOUT=\"window.status=''; changeImages('news___events', 'images/news-%26-events.gif'); return true;\">\r\n");
      out.write("\t\t\t\t<IMG NAME=\"news___events\" SRC=\"images/news-%26-events.gif\" WIDTH=108 HEIGHT=32 BORDER=0 ALT=\"news &#38; events\"></A></TD>\r\n");
      out.write("\t\t<TD COLSPAN=5>\r\n");
      out.write("\t\t\t<A HREF=\"contacts.jsp\"\r\n");
      out.write("\t\t\t\tONMOUSEOVER=\"window.status='contacts'; changeImages('contacts', 'images/contacts-over.gif'); return true;\"\r\n");
      out.write("\t\t\t\tONMOUSEOUT=\"window.status=''; changeImages('contacts', 'images/contacts.gif'); return true;\">\r\n");
      out.write("\t\t\t\t<IMG NAME=\"contacts\" SRC=\"images/contacts.gif\" WIDTH=83 HEIGHT=32 BORDER=0 ALT=\"contacts\"></A></TD>\r\n");
      out.write("\t\t<TD>\r\n");
      out.write("\t\t\t<IMG SRC=\"images/spacer.gif\" WIDTH=1 HEIGHT=32 ALT=\"\"></TD>\r\n");
      out.write("\t</TR>\r\n");
      out.write("\t<TR>\r\n");
      out.write("\t\t<TD ROWSPAN=24></TD>\r\n");
      out.write("\t\t<TD COLSPAN=33>\r\n");
      out.write("\t\t\t<IMG SRC=\"images/f2.gif\" WIDTH=639 HEIGHT=3 ALT=\"\"></TD>\r\n");
      out.write("\t\t<TD ROWSPAN=33></TD>\r\n");
      out.write("\t\t<TD>\r\n");
      out.write("\t\t\t<IMG SRC=\"images/spacer.gif\" WIDTH=1 HEIGHT=3 ALT=\"\"></TD>\r\n");
      out.write("\t</TR>\r\n");
      out.write("\t<TR>\r\n");
      out.write("\t\t<TD ROWSPAN=23>\r\n");
      out.write("\t\t\t<IMG SRC=\"images/f1.gif\" WIDTH=2 HEIGHT=310 ALT=\"\"></TD>\r\n");
      out.write("\t\t<TD COLSPAN=15 ROWSPAN=2 WIDTH=379 HEIGHT=64></TD>\r\n");
      out.write("\t\t<TD COLSPAN=2 ROWSPAN=8 WIDTH=44 HEIGHT=149></TD>\r\n");
      out.write("\t\t<TD WIDTH=212 HEIGHT=62 COLSPAN=14 bgcolor=\"#FFFFFF\"></TD>\r\n");
      out.write("\t\t<TD ROWSPAN=30>\r\n");
      out.write("\t\t\t<IMG SRC=\"images/f3.gif\" WIDTH=2 HEIGHT=500 ALT=\"\"></TD>\r\n");
      out.write("\t\t<TD>\r\n");
      out.write("\t\t\t<IMG SRC=\"images/spacer.gif\" WIDTH=1 HEIGHT=62 ALT=\"\"></TD>\r\n");
      out.write("\t</TR>\r\n");
      out.write("\t<TR>\r\n");
      out.write("\t\t<TD COLSPAN=2 ROWSPAN=16 BGCOLOR=#FFFFFF></TD>\r\n");
      out.write("\t\t<TD WIDTH=202 HEIGHT=17 COLSPAN=12 ROWSPAN=2 align=\"left\" valign=\"top\" BGCOLOR=#FFFFFF class=\"text3\"></TD>\r\n");
      out.write("\t\t<TD>\r\n");
      out.write("\t\t\t<IMG SRC=\"images/spacer.gif\" WIDTH=1 HEIGHT=2 ALT=\"\"></TD>\r\n");
      out.write("\t</TR>\r\n");
      out.write("\t<TR>\r\n");
      out.write("\t\t<TD COLSPAN=3 ROWSPAN=3></TD>\r\n");
      out.write("\t  <TD WIDTH=308 HEIGHT=54 COLSPAN=12 ROWSPAN=3 align=\"left\" valign=\"top\" class=\"text6\">Contacts </TD>\r\n");
      out.write("\t\t<TD>\r\n");
      out.write("\t\t\t<IMG SRC=\"images/spacer.gif\" WIDTH=1 HEIGHT=15 ALT=\"\"></TD>\r\n");
      out.write("\t</TR>\r\n");
      out.write("\t<TR>\r\n");
      out.write("\t\t<TD COLSPAN=6 align=\"left\" valign=\"top\" BGCOLOR=#FFFFFF class=\"text3\"></TD>\r\n");
      out.write("\t\t<TD WIDTH=14 HEIGHT=29 align=\"left\" valign=\"top\" BGCOLOR=#FFFFFF class=\"text3\" style=\"padding-top:5px\"></TD>\r\n");
      out.write("\t\t<TD COLSPAN=5 align=\"left\" valign=\"top\" BGCOLOR=#FFFFFF class=\"text3\"></TD>\r\n");
      out.write("\t\t<TD>\r\n");
      out.write("\t\t\t<IMG SRC=\"images/spacer.gif\" WIDTH=1 HEIGHT=29 ALT=\"\"></TD>\r\n");
      out.write("\t</TR>\r\n");
      out.write("\t<TR>\r\n");
      out.write("\t\t<TD WIDTH=202 HEIGHT=14 COLSPAN=12 ROWSPAN=2 align=\"left\" valign=\"top\" BGCOLOR=#FFFFFF class=\"text3\"></TD>\r\n");
      out.write("\t\t<TD>\r\n");
      out.write("\t\t\t<IMG SRC=\"images/spacer.gif\" WIDTH=1 HEIGHT=10 ALT=\"\"></TD>\r\n");
      out.write("\t</TR>\r\n");
      out.write("\t<TR>\r\n");
      out.write("\t\t<TD COLSPAN=2 ROWSPAN=2></TD>\r\n");
      out.write("\t\t<TD COLSPAN=4 ROWSPAN=2 WIDTH=73 HEIGHT=20></TD>\r\n");
      out.write("\t\t<TD COLSPAN=9 ROWSPAN=2></TD>\r\n");
      out.write("\t\t<TD>\r\n");
      out.write("\t\t\t<IMG SRC=\"images/spacer.gif\" WIDTH=1 HEIGHT=4 ALT=\"\"></TD>\r\n");
      out.write("\t</TR>\r\n");
      out.write("\t<TR>\r\n");
      out.write("\t\t<TD COLSPAN=12 ROWSPAN=3 align=\"left\" valign=\"top\" BGCOLOR=#FFFFFF class=\"text3\"></TD>\r\n");
      out.write("\t\t<TD>\r\n");
      out.write("\t\t\t<IMG SRC=\"images/spacer.gif\" WIDTH=1 HEIGHT=16 ALT=\"\"></TD>\r\n");
      out.write("\t</TR>\r\n");
      out.write("\t<TR>\r\n");
      out.write("\t\t<TD COLSPAN=15></TD>\r\n");
      out.write("\t\t<TD>\r\n");
      out.write("\t\t\t<IMG SRC=\"images/spacer.gif\" WIDTH=1 HEIGHT=11 ALT=\"\"></TD>\r\n");
      out.write("\t</TR>\r\n");
      out.write("\t<TR>\r\n");
      out.write("\t\t<TD COLSPAN=17 ROWSPAN=3 WIDTH=423 HEIGHT=25 ></TD>\r\n");
      out.write("\t\t<TD>\r\n");
      out.write("\t\t\t<IMG SRC=\"images/spacer.gif\" WIDTH=1 HEIGHT=6 ALT=\"\"></TD>\r\n");
      out.write("\t</TR>\r\n");
      out.write("\t<TR>\r\n");
      out.write("\t\t<TD WIDTH=109 HEIGHT=16 COLSPAN=7 align=\"left\" valign=\"top\" BGCOLOR=#FFFFFF class=\"text3\"></TD>\r\n");
      out.write("\t\t<TD WIDTH=93 HEIGHT=16 COLSPAN=5 align=\"left\" valign=\"top\" BGCOLOR=#FFFFFF class=\"text3\"></TD>\r\n");
      out.write("\t\t<TD>\r\n");
      out.write("\t\t\t<IMG SRC=\"images/spacer.gif\" WIDTH=1 HEIGHT=16 ALT=\"\"></TD>\r\n");
      out.write("\t</TR>\r\n");
      out.write("\t<TR>\r\n");
      out.write("\t\t<TD COLSPAN=7 ROWSPAN=4 align=\"left\" valign=\"top\" BGCOLOR=#FFFFFF class=\"text3\"></TD>\r\n");
      out.write("\t\t<TD COLSPAN=5 ROWSPAN=4 align=\"left\" valign=\"top\" BGCOLOR=#FFFFFF class=\"text3\"></TD>\r\n");
      out.write("\t\t<TD>\r\n");
      out.write("\t\t\t<IMG SRC=\"images/spacer.gif\" WIDTH=1 HEIGHT=3 ALT=\"\"></TD>\r\n");
      out.write("\t</TR>\r\n");
      out.write("\t<TR>\r\n");
      out.write("\t\t<TD ROWSPAN=12></TD>\r\n");
      out.write("\t\t<TD COLSPAN=3 ROWSPAN=12 WIDTH=13 HEIGHT=136></TD>\r\n");
      out.write("\t\t<TD COLSPAN=4 ROWSPAN=2></TD>\r\n");
      out.write("\t\t<TD ROWSPAN=18></TD>\r\n");
      out.write("\t\t<TD ROWSPAN=18 WIDTH=1 HEIGHT=242></TD>\r\n");
      out.write("\t\t<TD ROWSPAN=18></TD>\r\n");
      out.write("\t\t<TD COLSPAN=6></TD>\r\n");
      out.write("\t\t<TD>\r\n");
      out.write("\t\t\t<IMG SRC=\"images/spacer.gif\" WIDTH=1 HEIGHT=10 ALT=\"\"></TD>\r\n");
      out.write("\t</TR>\r\n");
      out.write("\t<TR>\r\n");
      out.write("\t\t<TD COLSPAN=5 ROWSPAN=4 WIDTH=176 HEIGHT=60></TD>\r\n");
      out.write("\t\t<TD ROWSPAN=18></TD>\r\n");
      out.write("\t\t<TD>\r\n");
      out.write("\t\t\t<IMG SRC=\"images/spacer.gif\" WIDTH=1 HEIGHT=5 ALT=\"\"></TD>\r\n");
      out.write("\t</TR>\r\n");
      out.write("\t<TR>\r\n");
      out.write("\t  <TD WIDTH=125 HEIGHT=84 COLSPAN=4 ROWSPAN=7 align=\"left\" valign=\"top\"></TD>\r\n");
      out.write("\t\t<TD>\r\n");
      out.write("\t\t\t<IMG SRC=\"images/spacer.gif\" WIDTH=1 HEIGHT=16 ALT=\"\"></TD>\r\n");
      out.write("\t</TR>\r\n");
      out.write("\t<TR>\r\n");
      out.write("\t\t<TD WIDTH=109 HEIGHT=15 COLSPAN=7 align=\"left\" valign=\"top\" BGCOLOR=#FFFFFF class=\"text3\"></TD>\r\n");
      out.write("\t\t<TD WIDTH=93 HEIGHT=15 COLSPAN=5 align=\"left\" valign=\"top\" BGCOLOR=#FFFFFF class=\"text3\"></TD>\r\n");
      out.write("\t\t<TD>\r\n");
      out.write("\t\t\t<IMG SRC=\"images/spacer.gif\" WIDTH=1 HEIGHT=15 ALT=\"\"></TD>\r\n");
      out.write("\t</TR>\r\n");
      out.write("\t<TR>\r\n");
      out.write("\t\t<TD COLSPAN=7 ROWSPAN=2 align=\"left\" valign=\"top\" BGCOLOR=#FFFFFF class=\"text3\"></TD>\r\n");
      out.write("\t\t<TD COLSPAN=5 ROWSPAN=2 align=\"left\" valign=\"top\" BGCOLOR=#FFFFFF class=\"text3\"></TD>\r\n");
      out.write("\t\t<TD>\r\n");
      out.write("\t\t\t<IMG SRC=\"images/spacer.gif\" WIDTH=1 HEIGHT=24 ALT=\"\"></TD>\r\n");
      out.write("\t</TR>\r\n");
      out.write("\t<TR>\r\n");
      out.write("\t\t<TD COLSPAN=5 ROWSPAN=2></TD>\r\n");
      out.write("\t\t<TD>\r\n");
      out.write("\t\t\t<IMG SRC=\"images/spacer.gif\" WIDTH=1 HEIGHT=7 ALT=\"\"></TD>\r\n");
      out.write("\t</TR>\r\n");
      out.write("\t<TR>\r\n");
      out.write("\t\t<TD COLSPAN=14 ROWSPAN=4 WIDTH=212 HEIGHT=29 ></TD>\r\n");
      out.write("\t\t<TD>\r\n");
      out.write("\t\t\t<IMG SRC=\"images/spacer.gif\" WIDTH=1 HEIGHT=2 ALT=\"\"></TD>\r\n");
      out.write("\t</TR>\r\n");
      out.write("\t<TR>\r\n");
      out.write("\t\t<TD WIDTH=31 HEIGHT=13></TD>\r\n");
      out.write("\t  <TD WIDTH=145 HEIGHT=81 COLSPAN=4 ROWSPAN=6 align=\"left\" valign=\"top\"></TD>\r\n");
      out.write("\t\t<TD>\r\n");
      out.write("\t\t\t<IMG SRC=\"images/spacer.gif\" WIDTH=1 HEIGHT=13 ALT=\"\"></TD>\r\n");
      out.write("\t</TR>\r\n");
      out.write("\t<TR>\r\n");
      out.write("\t\t<TD ROWSPAN=5></TD>\r\n");
      out.write("\t\t<TD>\r\n");
      out.write("\t\t\t<IMG SRC=\"images/spacer.gif\" WIDTH=1 HEIGHT=7 ALT=\"\"></TD>\r\n");
      out.write("\t</TR>\r\n");
      out.write("\t<TR>\r\n");
      out.write("\t  <TD WIDTH=125 HEIGHT=64 COLSPAN=4 ROWSPAN=5 align=\"left\" valign=\"top\"></TD>\r\n");
      out.write("\t\t<TD>\r\n");
      out.write("\t\t\t<IMG SRC=\"images/spacer.gif\" WIDTH=1 HEIGHT=7 ALT=\"\"></TD>\r\n");
      out.write("\t</TR>\r\n");
      out.write("\t<TR>\r\n");
      out.write("\t\t<TD COLSPAN=5 ROWSPAN=9 WIDTH=43 HEIGHT=220 ></TD>\r\n");
      out.write("\t\t<TD COLSPAN=9 WIDTH=169 HEIGHT=16></TD>\r\n");
      out.write("\t\t<TD>\r\n");
      out.write("\t\t\t<IMG SRC=\"images/spacer.gif\" WIDTH=1 HEIGHT=16 ALT=\"\"></TD>\r\n");
      out.write("\t</TR>\r\n");
      out.write("\t<TR>\r\n");
      out.write("\t\t<TD WIDTH=153 HEIGHT=60 COLSPAN=8 ROWSPAN=4 align=\"left\" valign=\"top\" >\r\n");
      out.write("\t    </TD>\r\n");
      out.write("\t\t<TD ROWSPAN=8 WIDTH=16 HEIGHT=204 ></TD>\r\n");
      out.write("\t\t<TD>\r\n");
      out.write("\t\t\t<IMG SRC=\"images/spacer.gif\" WIDTH=1 HEIGHT=14 ALT=\"\"></TD>\r\n");
      out.write("\t</TR>\r\n");
      out.write("\t<TR>\r\n");
      out.write("\t\t<TD COLSPAN=6 ROWSPAN=9>&nbsp;</TD>\r\n");
      out.write("  <TD>\r\n");
      out.write("\t\t\t<IMG SRC=\"images/spacer.gif\" WIDTH=1 HEIGHT=24 ALT=\"\"></TD>\r\n");
      out.write("\t</TR>\r\n");
      out.write("\t<TR>\r\n");
      out.write("\t\t<TD COLSPAN=5 ROWSPAN=3 WIDTH=176 HEIGHT=60></TD>\r\n");
      out.write("\t\t<TD>\r\n");
      out.write("\t\t\t<IMG SRC=\"images/spacer.gif\" WIDTH=1 HEIGHT=3 ALT=\"\"></TD>\r\n");
      out.write("\t</TR>\r\n");
      out.write("\t<TR>\r\n");
      out.write("\t\t<TD COLSPAN=4 ROWSPAN=7>&nbsp;</TD>\r\n");
      out.write("  <TD>\r\n");
      out.write("\t\t\t<IMG SRC=\"images/spacer.gif\" WIDTH=1 HEIGHT=19 ALT=\"\"></TD>\r\n");
      out.write("\t</TR>\r\n");
      out.write("\t<TR>\r\n");
      out.write("\t\t<TD WIDTH=153 HEIGHT=60 COLSPAN=8 ROWSPAN=3 align=\"left\" valign=\"top\">\r\n");
      out.write("\t    </TD>\r\n");
      out.write("\t\t<TD>\r\n");
      out.write("\t\t\t<IMG SRC=\"images/spacer.gif\" WIDTH=1 HEIGHT=38 ALT=\"\"></TD>\r\n");
      out.write("\t</TR>\r\n");
      out.write("\t<TR>\r\n");
      out.write("\t\t<TD COLSPAN=5></TD>\r\n");
      out.write("\t\t<TD>\r\n");
      out.write("\t\t\t<IMG SRC=\"images/spacer.gif\" WIDTH=1 HEIGHT=10 ALT=\"\"></TD>\r\n");
      out.write("\t</TR>\r\n");
      out.write("\t<TR>\r\n");
      out.write("\t\t<TD WIDTH=31 HEIGHT=12></TD>\r\n");
      out.write("\t  <TD WIDTH=145 HEIGHT=96 COLSPAN=4 ROWSPAN=2 align=\"left\" valign=\"top\"></TD>\r\n");
      out.write("\t\t<TD>\r\n");
      out.write("\t\t\t<IMG SRC=\"images/spacer.gif\" WIDTH=1 HEIGHT=12 ALT=\"\"></TD>\r\n");
      out.write("\t</TR>\r\n");
      out.write("\t<TR>\r\n");
      out.write("\t\t<TD COLSPAN=4 ROWSPAN=3>&nbsp;</TD>\r\n");
      out.write("\t  <TD WIDTH=153 HEIGHT=84 COLSPAN=8 align=\"left\" valign=\"top\" ></TD>\r\n");
      out.write("\t\t<TD>\r\n");
      out.write("\t\t\t<IMG SRC=\"images/spacer.gif\" WIDTH=1 HEIGHT=84 ALT=\"\"></TD>\r\n");
      out.write("\t</TR>\r\n");
      out.write("\t<TR>\r\n");
      out.write("\t\t<TD COLSPAN=20>&nbsp;</TD>\r\n");
      out.write("  <TD>\r\n");
      out.write("\t\t\t<IMG SRC=\"images/spacer.gif\" WIDTH=1 HEIGHT=83 ALT=\"\"></TD>\r\n");
      out.write("\t</TR>\r\n");
      out.write("\t<TR>\r\n");
      out.write("\t\t<TD WIDTH=384 HEIGHT=40 COLSPAN=20 align=\"right\" valign=\"top\" class=\"text5\"><span class=\"text4\"><a href=\"about.jsp\" class=\"text4\">Company</a> | <a href=\"homes.jsp\">Homes</a> | <a href=\"renting.jsp\">Renting</a> | <a href=\"selling.jsp\">Selling</a> | <a href=\"buying.jsp\">Buying</a> | <a href=\"news.jsp\">News & Events</a> | <a href=\"contacts.jsp\">Contacts</a></span><br>\r\n");
      out.write("\t    Copyright © XYZ</TD>\r\n");
      out.write("\t\t<TD>\r\n");
      out.write("\t\t\t<IMG SRC=\"images/spacer.gif\" WIDTH=1 HEIGHT=40 ALT=\"\"></TD>\r\n");
      out.write("\t</TR>\r\n");
      out.write("\t<TR>\r\n");
      out.write("\t\t<TD>\r\n");
      out.write("\t\t\t<IMG SRC=\"images/spacer.gif\" WIDTH=75 HEIGHT=1 ALT=\"\"></TD>\r\n");
      out.write("\t\t<TD>\r\n");
      out.write("\t\t\t<IMG SRC=\"images/spacer.gif\" WIDTH=2 HEIGHT=1 ALT=\"\"></TD>\r\n");
      out.write("\t\t<TD>\r\n");
      out.write("\t\t\t<IMG SRC=\"images/spacer.gif\" WIDTH=61 HEIGHT=1 ALT=\"\"></TD>\r\n");
      out.write("\t\t<TD>\r\n");
      out.write("\t\t\t<IMG SRC=\"images/spacer.gif\" WIDTH=8 HEIGHT=1 ALT=\"\"></TD>\r\n");
      out.write("\t\t<TD>\r\n");
      out.write("\t\t\t<IMG SRC=\"images/spacer.gif\" WIDTH=2 HEIGHT=1 ALT=\"\"></TD>\r\n");
      out.write("\t\t<TD>\r\n");
      out.write("\t\t\t<IMG SRC=\"images/spacer.gif\" WIDTH=3 HEIGHT=1 ALT=\"\"></TD>\r\n");
      out.write("\t\t<TD>\r\n");
      out.write("\t\t\t<IMG SRC=\"images/spacer.gif\" WIDTH=18 HEIGHT=1 ALT=\"\"></TD>\r\n");
      out.write("\t\t<TD>\r\n");
      out.write("\t\t\t<IMG SRC=\"images/spacer.gif\" WIDTH=50 HEIGHT=1 ALT=\"\"></TD>\r\n");
      out.write("\t\t<TD>\r\n");
      out.write("\t\t\t<IMG SRC=\"images/spacer.gif\" WIDTH=44 HEIGHT=1 ALT=\"\"></TD>\r\n");
      out.write("\t\t<TD>\r\n");
      out.write("\t\t\t<IMG SRC=\"images/spacer.gif\" WIDTH=13 HEIGHT=1 ALT=\"\"></TD>\r\n");
      out.write("\t\t<TD>\r\n");
      out.write("\t\t\t<IMG SRC=\"images/spacer.gif\" WIDTH=10 HEIGHT=1 ALT=\"\"></TD>\r\n");
      out.write("\t\t<TD>\r\n");
      out.write("\t\t\t<IMG SRC=\"images/spacer.gif\" WIDTH=1 HEIGHT=1 ALT=\"\"></TD>\r\n");
      out.write("\t\t<TD>\r\n");
      out.write("\t\t\t<IMG SRC=\"images/spacer.gif\" WIDTH=12 HEIGHT=1 ALT=\"\"></TD>\r\n");
      out.write("\t\t<TD>\r\n");
      out.write("\t\t\t<IMG SRC=\"images/spacer.gif\" WIDTH=31 HEIGHT=1 ALT=\"\"></TD>\r\n");
      out.write("\t\t<TD>\r\n");
      out.write("\t\t\t<IMG SRC=\"images/spacer.gif\" WIDTH=17 HEIGHT=1 ALT=\"\"></TD>\r\n");
      out.write("\t\t<TD>\r\n");
      out.write("\t\t\t<IMG SRC=\"images/spacer.gif\" WIDTH=95 HEIGHT=1 ALT=\"\"></TD>\r\n");
      out.write("\t\t<TD>\r\n");
      out.write("\t\t\t<IMG SRC=\"images/spacer.gif\" WIDTH=14 HEIGHT=1 ALT=\"\"></TD>\r\n");
      out.write("\t\t<TD>\r\n");
      out.write("\t\t\t<IMG SRC=\"images/spacer.gif\" WIDTH=19 HEIGHT=1 ALT=\"\"></TD>\r\n");
      out.write("\t\t<TD>\r\n");
      out.write("\t\t\t<IMG SRC=\"images/spacer.gif\" WIDTH=25 HEIGHT=1 ALT=\"\"></TD>\r\n");
      out.write("\t\t<TD>\r\n");
      out.write("\t\t\t<IMG SRC=\"images/spacer.gif\" WIDTH=2 HEIGHT=1 ALT=\"\"></TD>\r\n");
      out.write("\t\t<TD>\r\n");
      out.write("\t\t\t<IMG SRC=\"images/spacer.gif\" WIDTH=8 HEIGHT=1 ALT=\"\"></TD>\r\n");
      out.write("\t\t<TD>\r\n");
      out.write("\t\t\t<IMG SRC=\"images/spacer.gif\" WIDTH=12 HEIGHT=1 ALT=\"\"></TD>\r\n");
      out.write("\t\t<TD>\r\n");
      out.write("\t\t\t<IMG SRC=\"images/spacer.gif\" WIDTH=1 HEIGHT=1 ALT=\"\"></TD>\r\n");
      out.write("\t\t<TD>\r\n");
      out.write("\t\t\t<IMG SRC=\"images/spacer.gif\" WIDTH=20 HEIGHT=1 ALT=\"\"></TD>\r\n");
      out.write("\t\t<TD>\r\n");
      out.write("\t\t\t<IMG SRC=\"images/spacer.gif\" WIDTH=35 HEIGHT=1 ALT=\"\"></TD>\r\n");
      out.write("\t\t<TD>\r\n");
      out.write("\t\t\t<IMG SRC=\"images/spacer.gif\" WIDTH=22 HEIGHT=1 ALT=\"\"></TD>\r\n");
      out.write("\t\t<TD>\r\n");
      out.write("\t\t\t<IMG SRC=\"images/spacer.gif\" WIDTH=5 HEIGHT=1 ALT=\"\"></TD>\r\n");
      out.write("\t\t<TD>\r\n");
      out.write("\t\t\t<IMG SRC=\"images/spacer.gif\" WIDTH=14 HEIGHT=1 ALT=\"\"></TD>\r\n");
      out.write("\t\t<TD>\r\n");
      out.write("\t\t\t<IMG SRC=\"images/spacer.gif\" WIDTH=12 HEIGHT=1 ALT=\"\"></TD>\r\n");
      out.write("\t\t<TD>\r\n");
      out.write("\t\t\t<IMG SRC=\"images/spacer.gif\" WIDTH=15 HEIGHT=1 ALT=\"\"></TD>\r\n");
      out.write("\t\t<TD>\r\n");
      out.write("\t\t\t<IMG SRC=\"images/spacer.gif\" WIDTH=19 HEIGHT=1 ALT=\"\"></TD>\r\n");
      out.write("\t\t<TD>\r\n");
      out.write("\t\t\t<IMG SRC=\"images/spacer.gif\" WIDTH=31 HEIGHT=1 ALT=\"\"></TD>\r\n");
      out.write("\t\t<TD>\r\n");
      out.write("\t\t\t<IMG SRC=\"images/spacer.gif\" WIDTH=16 HEIGHT=1 ALT=\"\"></TD>\r\n");
      out.write("\t\t<TD>\r\n");
      out.write("\t\t\t<IMG SRC=\"images/spacer.gif\" WIDTH=2 HEIGHT=1 ALT=\"\"></TD>\r\n");
      out.write("\t\t<TD>\r\n");
      out.write("\t\t\t<IMG SRC=\"images/spacer.gif\" WIDTH=61 HEIGHT=1 ALT=\"\"></TD>\r\n");
      out.write("\t\t<TD></TD>\r\n");
      out.write("\t</TR>\r\n");
      out.write("</TABLE>\r\n");
      out.write("<!-- End ImageReady Slices -->\r\n");
      out.write("</BODY>\r\n");
      out.write("</center>\r\n");
      out.write("</HTML>");
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