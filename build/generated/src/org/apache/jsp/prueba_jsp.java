package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class prueba_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\n");
      out.write("\n");
      out.write("<form method=\"post\" action=\"Categoria\">\n");
      out.write("    <div class=\"module-details\">\n");
      out.write("        <div class=\"input-box\">\n");
      out.write("            <span class=\"details\">Identificación <span style=\"color: red;\">*</span></span>\n");
      out.write("            <input type=\"number\" name =\"id_cat\" placeholder=\"Identificación\" id=\"id_cat\">\n");
      out.write("        </div>\n");
      out.write("        <div class=\"input-box\">\n");
      out.write("            <span class=\"details\">Nombre <span style=\"color: red;\">*</span></span>\n");
      out.write("            <input type=\"text\" name =\"catnombre\" placeholder=\"Nombre\" id=\"catnombre\">\n");
      out.write("        </div>\n");
      out.write("        <div class=\"input-box\">\n");
      out.write("            <span class=\"details\">Descripción<span style=\"color: red;\">*</span> </span>\n");
      out.write("            <input type=\"text\" name =\"catdescripcion\" placeholder=\"Descripción\" id=\"catdescripcion\">\n");
      out.write("        </div>\n");
      out.write("        <div class=\"input-box\">\n");
      out.write("            <span class=\"details\">Estado<span style=\"color: red;\">*</span></span>\n");
      out.write("            <select name=\"catestado\" id=\"catestado\">\n");
      out.write("                <option value=\"activo\">Activo</option>\n");
      out.write("                <option value=\"inactivo\">Inactivo</option>\n");
      out.write("            </select>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("    <div class=\"controls\">\n");
      out.write("        <a href=\"#\" class=\"cancelarbtn\">Cancelar</a>\n");
      out.write("        <button class=\"registrarbtn\">Actualizar Usuario</button>\n");
      out.write("        <input  type=\"hidden\" name=\"opcion\" value=\"2\">\n");
      out.write("    </div>   \n");
      out.write("</form>\n");
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
