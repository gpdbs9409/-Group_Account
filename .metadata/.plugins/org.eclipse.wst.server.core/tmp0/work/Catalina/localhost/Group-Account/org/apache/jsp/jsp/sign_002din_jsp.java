/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.96
 * Generated at: 2024-12-04 16:04:17 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class sign_002din_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.LinkedHashSet<>(4);
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

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
  }

  public void _jspDestroy() {
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

      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("    <meta charset=\"UTF-8\">\r\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n");
      out.write("    <title>Sign In</title>\r\n");
      out.write("    <style>\r\n");
      out.write("        body {\r\n");
      out.write("            margin: 0;\r\n");
      out.write("            padding: 0;\r\n");
      out.write("            background: white;\r\n");
      out.write("            font-family: 'Poppins', sans-serif;\r\n");
      out.write("        }\r\n");
      out.write("    </style>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("    <div style=\"width: 100%; height: 100%; position: relative; background: white;\">\r\n");
      out.write("        <!-- 상단 시간 표시 -->\r\n");
      out.write("        <div style=\"left: 24.89px; top: 14.50px; position: absolute;\">\r\n");
      out.write("            <div style=\"width: 30px; height: 17px; left: 0px; top: 0px; position: absolute; text-align: center; color: #1E1E2D; font-size: 15px; font-family: 'SF Pro Display', sans-serif; font-weight: 600; line-height: 18px; word-wrap: break-word;\">\r\n");
      out.write("                ");
      out.print( new java.text.SimpleDateFormat("HH:mm").format(new java.util.Date()) );
      out.write("\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("        <!-- 로그인 폼 -->\r\n");
      out.write("        <form action=\"bank.jsp\" method=\"POST\">\r\n");
      out.write("            <!-- 이메일 입력 -->\r\n");
      out.write("            <div style=\"width: 335px; left: 20px; top: 221px; position: absolute;\">\r\n");
      out.write("                <label for=\"email\" style=\"width: 99px; height: 16px; left: 0px; top: 0px; position: absolute; color: #A2A2A7; font-size: 14px; font-family: Poppins; font-weight: 400; line-height: 14px; word-wrap: break-word;\">Email Address</label>\r\n");
      out.write("                <div style=\"width: 335px; height: 32px; left: 0px; top: 31px; position: absolute;\">\r\n");
      out.write("                    <input type=\"email\" id=\"email\" name=\"email\" required style=\"width: 300px; height: 30px; font-size: 14px; border: none; outline: none; background: none; color: #1E1E2D;\">\r\n");
      out.write("                    <div style=\"width: 335px; height: 0px; left: 0px; top: 32px; position: absolute; border: 1.50px #F4F4F4 solid;\"></div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("\r\n");
      out.write("            <!-- 비밀번호 입력 -->\r\n");
      out.write("            <div style=\"width: 335px; left: 20px; top: 305px; position: absolute;\">\r\n");
      out.write("                <label for=\"password\" style=\"width: 68px; height: 16px; left: 0px; top: 0px; position: absolute; color: #A2A2A7; font-size: 14px; font-family: Poppins; font-weight: 400; line-height: 14px; word-wrap: break-word;\">Password</label>\r\n");
      out.write("                <div style=\"width: 335px; height: 32px; left: 0px; top: 31px; position: absolute;\">\r\n");
      out.write("                    <input type=\"password\" id=\"password\" name=\"password\" required style=\"width: 300px; height: 30px; font-size: 14px; border: none; outline: none; background: none; color: #1E1E2D;\">\r\n");
      out.write("                    <div style=\"width: 335px; height: 0px; left: 0px; top: 32px; position: absolute; border: 1.50px #F4F4F4 solid;\"></div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("\r\n");
      out.write("            <!-- 로그인 버튼 -->\r\n");
      out.write("            <div style=\"width: 335px; height: 56px; left: 20px; top: 408px; position: absolute;\">\r\n");
      out.write("                <button type=\"submit\" style=\"width: 335px; height: 56px; background: #0066FF; border-radius: 16px; border: none; color: white; font-size: 16px; font-family: Poppins; font-weight: 700; cursor: pointer;\">Sign In</button>\r\n");
      out.write("            </div>\r\n");
      out.write("        </form>\r\n");
      out.write("\r\n");
      out.write("        <!-- 하단 텍스트 -->\r\n");
      out.write("        <div style=\"width: 155px; height: 16px; left: 110px; top: 493px; position: absolute;\">\r\n");
      out.write("            <span style=\"color: #A2A2A7; font-size: 14px; font-family: Poppins; font-weight: 400; line-height: 14px; word-wrap: break-word;\">I’m a new user.</span>\r\n");
      out.write("            <a href=\"signup.jsp\" style=\"color: #0066FF; font-size: 14px; font-family: Poppins; font-weight: 500; line-height: 14px; text-decoration: none;\"> Sign Up</a>\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("        <!-- 상단 아이콘 -->\r\n");
      out.write("        <div style=\"width: 42px; height: 42px; left: 20px; top: 54px; position: absolute;\">\r\n");
      out.write("            <div style=\"width: 42px; height: 42px; left: 0px; top: 0px; position: absolute; background: #F4F4F4; border-radius: 9999px; border: 1px solid;\"></div>\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("        <!-- 상단 제목 -->\r\n");
      out.write("        <div style=\"width: 108px; height: 34px; left: 20px; top: 149px; position: absolute; color: #1E1E2D; font-size: 32px; font-family: Poppins; font-weight: 500; line-height: 32px; word-wrap: break-word;\">Sign In</div>\r\n");
      out.write("    </div>\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
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
}