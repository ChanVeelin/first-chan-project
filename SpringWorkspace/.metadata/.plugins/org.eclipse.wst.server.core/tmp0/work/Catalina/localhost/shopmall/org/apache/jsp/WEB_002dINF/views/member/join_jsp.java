/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.71
 * Generated at: 2023-03-17 07:20:56 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views.member;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class join_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(7);
    _jspx_dependants.put("/WEB-INF/views/member/../header.jsp", Long.valueOf(1678942915662L));
    _jspx_dependants.put("jar:file:/C:/Users/ehdtn/eclipse-workspace/SpringWorkspace/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/ShopMall/WEB-INF/lib/jstl-1.2.jar!/META-INF/fmt.tld", Long.valueOf(1153352682000L));
    _jspx_dependants.put("/WEB-INF/views/member/../footer.jsp", Long.valueOf(1678942915647L));
    _jspx_dependants.put("/WEB-INF/lib/jstl-1.2.jar", Long.valueOf(1678068583500L));
    _jspx_dependants.put("jar:file:/C:/Users/ehdtn/eclipse-workspace/SpringWorkspace/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/ShopMall/WEB-INF/lib/jstl-1.2.jar!/META-INF/c.tld", Long.valueOf(1153352682000L));
    _jspx_dependants.put("/WEB-INF/views/member/sub_img.html", Long.valueOf(1679017195045L));
    _jspx_dependants.put("/WEB-INF/views/member/sub_menu.html", Long.valueOf(1679017195061L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fchoose;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fwhen_0026_005ftest;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fotherwise;

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fc_005fchoose = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005fwhen_0026_005ftest = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005fotherwise = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005fchoose.release();
    _005fjspx_005ftagPool_005fc_005fwhen_0026_005ftest.release();
    _005fjspx_005ftagPool_005fc_005fotherwise.release();
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    if (!javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSP들은 오직 GET, POST 또는 HEAD 메소드만을 허용합니다. Jasper는 OPTIONS 메소드 또한 허용합니다.");
        return;
      }
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


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

      out.write("  \r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("  \r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("  <meta charset=\"UTF-8\">\r\n");
      out.write("  <title>Nonage Shop</title>\r\n");
      out.write("  <link rel=\"stylesheet\" href=\"css/shopping.css\" >  \r\n");
      out.write("  <script src=\"https://code.jquery.com/jquery-3.6.2.min.js\" integrity=\"sha256-2krYZKh//PcchRtd+H+VyyQoZ/e3EcrkxhM8ycwASPA=\" crossorigin=\"anonymous\"></script> \r\n");
      out.write("  <script type=\"text/javascript\" src=\"member/member.js\"></script>\r\n");
      out.write("  <script type=\"text/javascript\" src=\"product/product.js\"></script>\r\n");
      out.write("  <script type=\"text/javascript\" src=\"mypage/mypage.js\"></script> \r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("<div id=\"wrap\">\r\n");
      out.write("<!--헤더파일 들어가는 곳 시작 -->\r\n");
      out.write("  <header>\r\n");
      out.write("    <!--로고 들어가는 곳 시작--->  \r\n");
      out.write("    <div id=\"logo\">\r\n");
      out.write("      <a href=\"index\">\r\n");
      out.write("        <img src=\"images/logo.gif	\" width=\"180\" height=\"100\" alt=\"nonageshop\">\r\n");
      out.write("      </a>  \r\n");
      out.write("    </div>\r\n");
      out.write("    <!--로고 들어가는 곳 끝-->     \r\n");
      out.write("    <nav id=\"catagory_menu\">\r\n");
      out.write("     <ul>\r\n");
      out.write("       ");
      if (_jspx_meth_c_005fchoose_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("       <li>/</li>\r\n");
      out.write("       <li>\r\n");
      out.write("         <a href=\"cart_list\">CART</a>\r\n");
      out.write("       </li><li>/</li>\r\n");
      out.write("       <li>\r\n");
      out.write("         <a href=\"mypage\">MY PAGE</a>\r\n");
      out.write("       </li><li>/</li>\r\n");
      out.write("       <li>\r\n");
      out.write("         <a href=\"qna_list\">Q&amp;A(1:1)</a>\r\n");
      out.write("       </li>\r\n");
      out.write("     </ul>\r\n");
      out.write("    </nav>\r\n");
      out.write("\r\n");
      out.write("    <nav id=\"top_menu\">\r\n");
      out.write("      <ul>\r\n");
      out.write("        <li>\r\n");
      out.write("          <a href=\"category?kind=1\">Heels</a>\r\n");
      out.write("        </li>  \r\n");
      out.write("        <li>\r\n");
      out.write("          <a href=\"category?kind=2\">Boots</a>\r\n");
      out.write("        </li>  \r\n");
      out.write("        <li>\r\n");
      out.write("          <a href=\"category?kind=3\">Sandals</a>\r\n");
      out.write("        </li> \r\n");
      out.write("        <li>\r\n");
      out.write("          <a href=\"category?kind=4\">Sneakers</a>\r\n");
      out.write("        </li> \r\n");
      out.write("        <li>\r\n");
      out.write("          <a href=\"category?kind=5\">On Sale</a>\r\n");
      out.write("        </li>  \r\n");
      out.write("      </ul>\r\n");
      out.write("    </nav>\r\n");
      out.write("    <div class=\"clear\"></div>\r\n");
      out.write("    <hr>\r\n");
      out.write("  </header>\r\n");
      out.write("  <!--헤더파일 들어가는 곳 끝 -->");
      out.write("   \r\n");
      out.write("<div id=\"sub_img\">\r\n");
      out.write("	<img src=\"images/member/sub_img.jpg\" >		\r\n");
      out.write("</div>\r\n");
      out.write("<div class=\"clear\"></div>");
      out.write(' ');
      out.write('\r');
      out.write('\n');
      out.write("<nav id=\"sub_menu\">\r\n");
      out.write("  <ul>\r\n");
      out.write("    <li><a href=\"login_form\">Login</a></li>\r\n");
      out.write("    <li><a href=\"contract\">Join us</a></li>\r\n");
      out.write("  </ul>\r\n");
      out.write("</nav>");
      out.write("   \r\n");
      out.write("  <article>\r\n");
      out.write("    <h2>Join Us</h2>\r\n");
      out.write("    <form id=\"join\" action=\"join\" method=\"post\" name=\"formm\">\r\n");
      out.write("      <fieldset>\r\n");
      out.write("        <legend>Basic Info</legend>\r\n");
      out.write("        <label>User ID</label>\r\n");
      out.write("        <input type=\"text\"      name=\"id\"  id=\"id\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${id}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\"  size=\"12\"  >\r\n");
      out.write("        <input type=\"hidden\"    name=\"reid\" id=\"reid\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${reid}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\">\r\n");
      out.write("        <input type=\"button\"    value=\"중복 체크\"  class=\"dup\" onclick=\"idcheck()\"><br>\r\n");
      out.write("        <label>Password</label> \r\n");
      out.write("        <input type=\"password\"  name=\"pwd\" id=\"pwd\"><br> \r\n");
      out.write("        <label>Retype Password</label> \r\n");
      out.write("        <input type=\"password\"  name=\"pwdCheck\" id=\"pwdCheck\"><br> \r\n");
      out.write("        <label>Name</label>\r\n");
      out.write("        <input type=\"text\" name=\"name\" id=\"name\"><br> \r\n");
      out.write("        <label>E-Mail</label>\r\n");
      out.write("        <input type=\"text\" name=\"email\" id=\"email\"><br>\r\n");
      out.write("\r\n");
      out.write("        \r\n");
      out.write("      </fieldset>\r\n");
      out.write("      <fieldset>\r\n");
      out.write("        <legend>Optional</legend>\r\n");
      out.write("        <label>Zip Code</label> \r\n");
      out.write("        <input type=\"text\"       name=\"zip_num\"   size=\"10\" >      \r\n");
      out.write("        <input type=\"button\"     value=\"주소 찾기\" class=\"dup\" onclick=\"post_zip()\"><br>\r\n");
      out.write("        <label>Address</label> \r\n");
      out.write("        <input type=\"text\"        name=\"addr1\"   size=\"50\"> <br>\r\n");
      out.write("        <input type=\"text\"        name=\"addr2\"   size=\"25\" style=\"margin-left: 140px\"> <br>\r\n");
      out.write("        <label>Phone Number</label> \r\n");
      out.write("        <input  type=\"text\"       name=\"phone\"><br>\r\n");
      out.write("      </fieldset>\r\n");
      out.write("      <div class=\"clear\"></div>\r\n");
      out.write("      <div id=\"buttons\">\r\n");
      out.write("        <input type=\"button\"    value=\"회원가입\"   class=\"submit\" onclick=\"go_save()\"> \r\n");
      out.write("        <input type=\"reset\"      value=\"취소\"     class=\"cancel\">\r\n");
      out.write("      </div>\r\n");
      out.write("      <br>\r\n");
      out.write("    </form>\r\n");
      out.write("  </article>\r\n");
      out.write("\r\n");
      out.write("  <div class=\"clear\"></div>\r\n");
      out.write("    \r\n");
      out.write("  <footer>  \r\n");
      out.write("    <hr>\r\n");
      out.write("    <div id=\"copy\">\r\n");
      out.write("     All contents Copyright 2013 Nonage Inc. all rights reserved<br>\r\n");
      out.write("     Contact mail : Nonage@Nonage.com Tel: +82 64 123 4315 \r\n");
      out.write("     Fax +82 64 123 4321\r\n");
      out.write("    </div>         \r\n");
      out.write("  </footer>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
      out.write("\r\n");
      out.write("  ");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }

  private boolean _jspx_meth_c_005fchoose_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:choose
    org.apache.taglibs.standard.tag.common.core.ChooseTag _jspx_th_c_005fchoose_005f0 = (org.apache.taglibs.standard.tag.common.core.ChooseTag) _005fjspx_005ftagPool_005fc_005fchoose.get(org.apache.taglibs.standard.tag.common.core.ChooseTag.class);
    boolean _jspx_th_c_005fchoose_005f0_reused = false;
    try {
      _jspx_th_c_005fchoose_005f0.setPageContext(_jspx_page_context);
      _jspx_th_c_005fchoose_005f0.setParent(null);
      int _jspx_eval_c_005fchoose_005f0 = _jspx_th_c_005fchoose_005f0.doStartTag();
      if (_jspx_eval_c_005fchoose_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("       ");
          if (_jspx_meth_c_005fwhen_005f0(_jspx_th_c_005fchoose_005f0, _jspx_page_context))
            return true;
          out.write("\r\n");
          out.write("       ");
          if (_jspx_meth_c_005fotherwise_005f0(_jspx_th_c_005fchoose_005f0, _jspx_page_context))
            return true;
          out.write("       \r\n");
          out.write("       ");
          int evalDoAfterBody = _jspx_th_c_005fchoose_005f0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fchoose_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005fc_005fchoose.reuse(_jspx_th_c_005fchoose_005f0);
      _jspx_th_c_005fchoose_005f0_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005fchoose_005f0, _jsp_getInstanceManager(), _jspx_th_c_005fchoose_005f0_reused);
    }
    return false;
  }

  private boolean _jspx_meth_c_005fwhen_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fchoose_005f0, javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:when
    org.apache.taglibs.standard.tag.rt.core.WhenTag _jspx_th_c_005fwhen_005f0 = (org.apache.taglibs.standard.tag.rt.core.WhenTag) _005fjspx_005ftagPool_005fc_005fwhen_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.WhenTag.class);
    boolean _jspx_th_c_005fwhen_005f0_reused = false;
    try {
      _jspx_th_c_005fwhen_005f0.setPageContext(_jspx_page_context);
      _jspx_th_c_005fwhen_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fchoose_005f0);
      // /WEB-INF/views/member/../header.jsp(31,7) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fwhen_005f0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${empty sessionScope.loginUser}", boolean.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null)).booleanValue());
      int _jspx_eval_c_005fwhen_005f0 = _jspx_th_c_005fwhen_005f0.doStartTag();
      if (_jspx_eval_c_005fwhen_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("       <li>         \r\n");
          out.write("         <a href=\"login_form\" style=\"width:110px;\">LOGIN(CUSTOMER</a>   \r\n");
          out.write("	     <a href=\"admin_login_form\" style=\"width:100px;\">| ADMIN)</a>\r\n");
          out.write("	   </li>		       \r\n");
          out.write("       <li>/</li>\r\n");
          out.write("       <li><a href=\"contract\">JOIN</a></li>\r\n");
          out.write("       ");
          int evalDoAfterBody = _jspx_th_c_005fwhen_005f0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fwhen_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005fc_005fwhen_0026_005ftest.reuse(_jspx_th_c_005fwhen_005f0);
      _jspx_th_c_005fwhen_005f0_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005fwhen_005f0, _jsp_getInstanceManager(), _jspx_th_c_005fwhen_005f0_reused);
    }
    return false;
  }

  private boolean _jspx_meth_c_005fotherwise_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fchoose_005f0, javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:otherwise
    org.apache.taglibs.standard.tag.common.core.OtherwiseTag _jspx_th_c_005fotherwise_005f0 = (org.apache.taglibs.standard.tag.common.core.OtherwiseTag) _005fjspx_005ftagPool_005fc_005fotherwise.get(org.apache.taglibs.standard.tag.common.core.OtherwiseTag.class);
    boolean _jspx_th_c_005fotherwise_005f0_reused = false;
    try {
      _jspx_th_c_005fotherwise_005f0.setPageContext(_jspx_page_context);
      _jspx_th_c_005fotherwise_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fchoose_005f0);
      int _jspx_eval_c_005fotherwise_005f0 = _jspx_th_c_005fotherwise_005f0.doStartTag();
      if (_jspx_eval_c_005fotherwise_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("       <li style=\"color:orange\">\r\n");
          out.write("         ");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${sessionScope.loginUser.name}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
          out.write('(');
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${sessionScope.loginUser.id}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
          out.write(")\r\n");
          out.write("       </li>\r\n");
          out.write("       <li><a href=\"logout\">LOGOUT</a></li>\r\n");
          out.write("       ");
          int evalDoAfterBody = _jspx_th_c_005fotherwise_005f0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fotherwise_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005fc_005fotherwise.reuse(_jspx_th_c_005fotherwise_005f0);
      _jspx_th_c_005fotherwise_005f0_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005fotherwise_005f0, _jsp_getInstanceManager(), _jspx_th_c_005fotherwise_005f0_reused);
    }
    return false;
  }
}