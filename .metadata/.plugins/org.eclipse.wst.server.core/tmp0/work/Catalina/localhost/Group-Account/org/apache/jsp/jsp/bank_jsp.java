/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.96
 * Generated at: 2024-12-04 16:04:34 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class bank_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("    <title>계모임 통장</title>\r\n");
      out.write("    <style>\r\n");
      out.write("        body {\r\n");
      out.write("            margin: 0;\r\n");
      out.write("            padding: 0;\r\n");
      out.write("            background: #161622;\r\n");
      out.write("            font-family: 'SF Pro Display', sans-serif;\r\n");
      out.write("        }\r\n");
      out.write("        /* 추가 CSS는 필요에 따라 여기에 포함 */\r\n");
      out.write("    </style>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("    <div style=\"width: 100%; height: 100%; position: relative; background: #161622;\">\r\n");
      out.write("        <!-- 상단 시간 표시 -->\r\n");
      out.write("        <div style=\"left: 24.89px; top: 14.50px; position: absolute;\">\r\n");
      out.write("            <div style=\"width: 30px; height: 17px; left: 0px; top: 0px; position: absolute; text-align: center; color: white; font-size: 15px; font-family: SF Pro Display; font-weight: 600; line-height: 18px; word-wrap: break-word;\">\r\n");
      out.write("                ");
      out.print( new java.text.SimpleDateFormat("HH:mm").format(new java.util.Date()) );
      out.write("\r\n");
      out.write("            </div>//JSP 내장객체 이용\r\n");
      out.write("            <div style=\"width: 67px; height: 11.50px; left: 273.61px; top: 2.50px; position: absolute;\">\r\n");
      out.write("                <div style=\"width: 24.50px; height: 11.50px; left: 42.50px; top: 0px; position: absolute;\">\r\n");
      out.write("                    <div style=\"width: 24.50px; height: 11.50px; left: 0px; top: 0px; position: absolute; background: #A2A2A7; border: 1px solid;\"></div>\r\n");
      out.write("                    <div style=\"width: 18px; height: 7.67px; left: 2px; top: 1.92px; position: absolute; background: white; border-radius: 1.60px; border: 1px solid;\"></div>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div style=\"width: 17.10px; height: 10.70px; left: 0px; top: 0.44px; position: absolute; background: white; border: 1px solid;\"></div>\r\n");
      out.write("                <div style=\"width: 15.40px; height: 11.06px; left: 22.10px; top: 0.24px; position: absolute; background: white; border: 1px solid;\"></div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("        <!-- 제목 섹션 -->\r\n");
      out.write("        <div style=\"width: 223px; left: 20px; top: 54px; position: absolute;\">\r\n");
      out.write("            <div style=\"width: 42px; height: 42px; left: 0px; top: 0px; position: absolute;\">\r\n");
      out.write("                <div style=\"width: 42px; height: 42px; left: 0px; top: 0px; position: absolute; background: #1E1E2D; border-radius: 9999px; border: 1px solid;\"></div>\r\n");
      out.write("                <div style=\"width: 20px; height: 20px; left: 11px; top: 11px; position: absolute;\">\r\n");
      out.write("                    <div style=\"width: 6px; height: 12px; left: 7px; top: 4px; position: absolute; border: 1.50px white solid;\"></div>\r\n");
      out.write("                    <div style=\"width: 20px; height: 20px; left: 0px; top: 0px; position: absolute; border: 1px solid;\"></div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div style=\"width: 112px; height: 20px; left: 111px; top: 11px; position: absolute; text-align: center; color: white; font-size: 18px; font-family: Poppins; font-weight: 500; line-height: 18px; word-wrap: break-word;\">계모임통장</div>\r\n");
      out.write("        </div>\r\n");
      out.write("        <!-- 입출금 버튼 -->\r\n");
      out.write("        \r\n");
      out.write("		<div \r\n");
      out.write("		    style=\"width: 335px; height: 56px; left: 20px; top: 706px; position: absolute; cursor: pointer;\" \r\n");
      out.write("		    onclick=\"location.href='deposit.jsp';\">\r\n");
      out.write("		    <div style=\"width: 335px; height: 56px; left: 0px; top: 0px; position: absolute; background: #0066FF; border-radius: 16px; border: 1px solid;\"></div>\r\n");
      out.write("		    <div style=\"width: 100px; height: 24px; left: 117.50px; top: 16px; position: absolute; text-align: center; color: white; font-size: 16px; font-family: Poppins; font-weight: 600; line-height: 24px; word-wrap: break-word;\">입/출금하기</div>\r\n");
      out.write("		</div>\r\n");
      out.write("\r\n");
      out.write("        <!-- 잔액 표시 -->\r\n");
      out.write("        <div style=\"width: 335px; height: 116px; left: 20px; top: 516px; position: absolute;\">\r\n");
      out.write("            <div style=\"width: 335px; height: 116px; left: 0px; top: 0px; position: absolute; background: #1E1E2D; border-radius: 14px; border: 1px solid;\"></div>\r\n");
      out.write("            <div style=\"width: 132px; height: 58px; left: 16px; top: 29px; position: absolute;\">\r\n");
      out.write("                <div style=\"width: 49px; height: 26px; left: 0px; top: 32px; position: absolute; text-align: center; color: #9CB1D1; font-size: 24px; font-family: Poppins; font-weight: 600; line-height: 24px; word-wrap: break-word;\">잔액</div>\r\n");
      out.write("                <div style=\"width: 102px; height: 13px; left: 0px; top: 0px; position: absolute; text-align: center; color: #9CB1D1; font-size: 11px; font-family: Poppins; font-weight: 400; line-height: 11px; word-wrap: break-word;\">Enter Your Amount</div>\r\n");
      out.write("                <div style=\"width: 67px; height: 26px; left: 65px; top: 32px; position: absolute; text-align: center; color: white; font-size: 24px; font-family: Poppins; font-weight: 600; line-height: 24px; word-wrap: break-word;\">36.00</div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("        <!-- 모임원 리스트 -->\r\n");
      out.write("        <div style=\"width: 335px; height: 128px; left: 20px; top: 357px; position: absolute;\">\r\n");
      out.write("            <div style=\"width: 335px; height: 128px; left: 0px; top: 0px; position: absolute; background: #1E1E2D; border-radius: 14px; border: 1px solid;\"></div>\r\n");
      out.write("            <div style=\"width: 48px; height: 68px; left: 12px; top: 46px; position: absolute;\">\r\n");
      out.write("                <div style=\"width: 23px; height: 13px; left: 13px; top: 55px; position: absolute; color: white; font-size: 11px; font-family: Poppins; font-weight: 400; line-height: 11px; word-wrap: break-word;\">Add</div>\r\n");
      out.write("                <div style=\"width: 48px; height: 48px; left: 0px; top: 0px; position: absolute;\">\r\n");
      out.write("                    <div style=\"width: 48px; height: 48px; left: 0px; top: 0px; position: absolute; background: #242433; border-radius: 9999px; border: 1px #0066FF solid;\"></div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
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
