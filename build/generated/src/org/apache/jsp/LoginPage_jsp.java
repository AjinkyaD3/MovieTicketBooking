package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class LoginPage_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
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
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("<head>\n");
      out.write("  <meta charset=\"UTF-8\">\n");
      out.write("  <title>HTML5 Login Form with Validation Example</title>\n");
      out.write("  <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/normalize/5.0.0/normalize.min.css\">\n");
      out.write("  <style>\n");
      out.write("    body {\n");
      out.write("      background-color: #9f9da7;\n");
      out.write("      font-size: 1.6rem;\n");
      out.write("      font-family: \"Open Sans\", sans-serif;\n");
      out.write("      color: #2b3e51;\n");
      out.write("    }\n");
      out.write("\n");
      out.write("    h2 {\n");
      out.write("      font-weight: 300;\n");
      out.write("      text-align: center;\n");
      out.write("    }\n");
      out.write("\n");
      out.write("    p {\n");
      out.write("      position: relative;\n");
      out.write("    }\n");
      out.write("\n");
      out.write("    a, a:link, a:visited, a:active,\n");
      out.write("    a:focus, a:hover,\n");
      out.write("    a:link:focus, a:link:hover,\n");
      out.write("    a:visited:focus, a:visited:hover,\n");
      out.write("    a:active:focus, a:active:hover {\n");
      out.write("      color: #3ca9e2;\n");
      out.write("      -webkit-transition: all 0.2s ease;\n");
      out.write("      transition: all 0.2s ease;\n");
      out.write("    }\n");
      out.write("\n");
      out.write("    #login-form-wrap {\n");
      out.write("      background-color: #fff;\n");
      out.write("      width: 35%;\n");
      out.write("      margin: 30px auto;\n");
      out.write("      text-align: center;\n");
      out.write("      padding: 20px 0 0 0;\n");
      out.write("      border-radius: 4px;\n");
      out.write("      box-shadow: 0px 30px 50px 0px rgba(0, 0, 0, 0.2);\n");
      out.write("    }\n");
      out.write("\n");
      out.write("    #login-form {\n");
      out.write("      padding: 0 60px;\n");
      out.write("    }\n");
      out.write("\n");
      out.write("    input {\n");
      out.write("      display: block;\n");
      out.write("      box-sizing: border-box;\n");
      out.write("      width: 100%;\n");
      out.write("      outline: none;\n");
      out.write("      height: 60px;\n");
      out.write("      line-height: 60px;\n");
      out.write("      border-radius: 4px;\n");
      out.write("    }\n");
      out.write("\n");
      out.write("    input[type=\"text\"], input[type=\"password\"] {\n");
      out.write("      width: 100%;\n");
      out.write("      padding: 0 0 0 10px;\n");
      out.write("      margin: 0;\n");
      out.write("      color: #8a8b8e;\n");
      out.write("      border: 1px solid #c2c0ca;\n");
      out.write("      font-style: normal;\n");
      out.write("      font-size: 16px;\n");
      out.write("      -webkit-appearance: none;\n");
      out.write("      -moz-appearance: none;\n");
      out.write("      appearance: none;\n");
      out.write("      position: relative;\n");
      out.write("      display: inline-block;\n");
      out.write("      background: none;\n");
      out.write("    }\n");
      out.write("\n");
      out.write("    input[type=\"text\"]:focus, input[type=\"password\"]:focus {\n");
      out.write("      border-color: #3ca9e2;\n");
      out.write("    }\n");
      out.write("\n");
      out.write("    input[type=\"text\"]:focus:invalid, input[type=\"password\"]:focus:invalid {\n");
      out.write("      color: #cc1e2b;\n");
      out.write("      border-color: #cc1e2b;\n");
      out.write("    }\n");
      out.write("\n");
      out.write("    input[type=\"text\"]:valid ~ .validation, input[type=\"password\"]:valid ~ .validation {\n");
      out.write("      display: block;\n");
      out.write("      border-color: #0C0;\n");
      out.write("    }\n");
      out.write("\n");
      out.write("    input[type=\"text\"]:valid ~ .validation span, input[type=\"password\"]:valid ~ .validation span {\n");
      out.write("      background: #0C0;\n");
      out.write("      position: absolute;\n");
      out.write("      border-radius: 6px;\n");
      out.write("    }\n");
      out.write("\n");
      out.write("    input[type=\"text\"]:valid ~ .validation span:first-child, input[type=\"password\"]:valid ~ .validation span:first-child {\n");
      out.write("      top: 30px;\n");
      out.write("      left: 14px;\n");
      out.write("      width: 20px;\n");
      out.write("      height: 3px;\n");
      out.write("      -webkit-transform: rotate(-45deg);\n");
      out.write("      transform: rotate(-45deg);\n");
      out.write("    }\n");
      out.write("\n");
      out.write("    input[type=\"text\"]:valid ~ .validation span:last-child, input[type=\"password\"]:valid ~ .validation span:last-child {\n");
      out.write("      top: 35px;\n");
      out.write("      left: 8px;\n");
      out.write("      width: 11px;\n");
      out.write("      height: 3px;\n");
      out.write("      -webkit-transform: rotate(45deg);\n");
      out.write("      transform: rotate(45deg);\n");
      out.write("    }\n");
      out.write("\n");
      out.write("    .validation {\n");
      out.write("      display: none;\n");
      out.write("      position: absolute;\n");
      out.write("      content: \" \";\n");
      out.write("      height: 60px;\n");
      out.write("      width: 30px;\n");
      out.write("      right: 15px;\n");
      out.write("      top: 0px;\n");
      out.write("    }\n");
      out.write("\n");
      out.write("    input[type=\"submit\"] {\n");
      out.write("      border: none;\n");
      out.write("      display: block;\n");
      out.write("      background-color: #3ca9e2;\n");
      out.write("      color: #fff;\n");
      out.write("      font-weight: bold;\n");
      out.write("      text-transform: uppercase;\n");
      out.write("      cursor: pointer;\n");
      out.write("      -webkit-transition: all 0.2s ease;\n");
      out.write("      transition: all 0.2s ease;\n");
      out.write("      font-size: 18px;\n");
      out.write("      position: relative;\n");
      out.write("      display: inline-block;\n");
      out.write("      cursor: pointer;\n");
      out.write("      text-align: center;\n");
      out.write("    }\n");
      out.write("\n");
      out.write("    input[type=\"submit\"]:hover {\n");
      out.write("      background-color: #329dd5;\n");
      out.write("      -webkit-transition: all 0.2s ease;\n");
      out.write("      transition: all 0.2s ease;\n");
      out.write("    }\n");
      out.write("\n");
      out.write("    #create-account-wrap {\n");
      out.write("      background-color: #eeedf1;\n");
      out.write("      color: #8a8b8e;\n");
      out.write("      font-size: 14px;\n");
      out.write("      width: 100%;\n");
      out.write("      padding: 10px 0;\n");
      out.write("      border-radius: 0 0 4px 4px;\n");
      out.write("    }\n");
      out.write("  </style>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("<!-- partial:index.partial.html -->\n");
      out.write("<div id=\"login-form-wrap\">\n");
      out.write("  <h2>Login</h2>\n");
      out.write("  <form action=\"Login\" method=\"post\">\n");
      out.write("    <p>\n");
      out.write("      <input type=\"text\" id=\"username\" name=\"username\" placeholder=\"Enter Username\" required><i class=\"validation\"><span></span><span></span></i>\n");
      out.write("    </p>\n");
      out.write("    <p>\n");
      out.write("      <input type=\"password\" id=\"password\" name=\"password\" placeholder=\"Enter Password\" required><i class=\"validation\"><span></span><span></span></i>\n");
      out.write("    </p>\n");
      out.write("    <p>\n");
      out.write("      <input type=\"submit\" id=\"login\" value=\"Login\">\n");
      out.write("    </p>\n");
      out.write("  </form>\n");
      out.write("  <div id=\"create-account-wrap\">\n");
      out.write("    <p>Not a member? <a href=\"Createaccount\">Create Account</a></p>\n");
      out.write("  </div>\n");
      out.write("</div>\n");
      out.write("</body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
