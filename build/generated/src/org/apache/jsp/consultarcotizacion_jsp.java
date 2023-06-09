package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.ArrayList;
import ModeloVO.consultcotizacionVO;
import com.google.gson.Gson;
import ModeloDAO.ConsultcotizacionDAO;
import java.util.Date;
import java.text.SimpleDateFormat;

public final class consultarcotizacion_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(1);
    _jspx_dependants.add("/menuVendedor.jsp");
  }

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
      response.setContentType("text/html;charset=UTF-8");
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
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("        <!------------------- Estilos Menu --------------------->\r\n");
      out.write("        <link href=\"CSS/stylemenu.css\" rel=\"stylesheet\" type=\"text/css\"/>\r\n");
      out.write("        <!------------------- Iconos --------------------->\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://unicons.iconscout.com/release/v4.0.0/css/line.css\">\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://fonts.googleapis.com/css2?family=Material+Symbols+Outlined:opsz,wght,FILL,GRAD@48,400,0,0\" />\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://fonts.googleapis.com/css2?family=Material+Symbols+Sharp:opsz,wght,FILL,GRAD@48,400,0,0\" />\r\n");
      out.write("        <title>Inicio</title>\r\n");
      out.write("    </head>\r\n");
      out.write("    <body>\r\n");
      out.write("        <nav>\r\n");
      out.write("            <!------------------- Logo --------------------->\r\n");
      out.write("        <div class=\"logo-name\">\r\n");
      out.write("            <div class=\"logo-image\">\r\n");
      out.write("                <img src=\"ASSETS/logo_web - copia.png\" alt=\"\"/>\r\n");
      out.write("            </div>\r\n");
      out.write("            <span class=\"logo_name\">Electricos <span style=\"color: black;\">Estrada</span></span>\r\n");
      out.write("        </div>\r\n");
      out.write("            <!------------------- Barra Lateral --------------------->\r\n");
      out.write("        <div class=\"menu-items\">\r\n");
      out.write("            <ul class=\"nav-links\">\r\n");
      out.write("                <li><a href=\"#\">\r\n");
      out.write("                    <i class=\"material-symbols-outlined\">home</i>\r\n");
      out.write("                    <span class=\"link-name\">Inicio</span>\r\n");
      out.write("                </a></li>\r\n");
      out.write("                <li><a href=\"Productos.jsp\">\r\n");
      out.write("                    <i class=\"material-symbols-outlined\">inventory</i>\r\n");
      out.write("                    <span class=\"link-name\">Productos</span>\r\n");
      out.write("                </a></li>\r\n");
      out.write("                <li><a href=\"Clientes.jsp\">\r\n");
      out.write("                    <i class=\"material-symbols-sharp\">face</i>\r\n");
      out.write("                    <span class=\"link-name\">Clientes</span>\r\n");
      out.write("                </a></li>\r\n");
      out.write("                <li><a href=\"#\">\r\n");
      out.write("                    <i class=\"material-symbols-sharp\">order_approve</i>\r\n");
      out.write("                    <span class=\"link-name\">Pedido</span>\r\n");
      out.write("                </a></li>\r\n");
      out.write("                <li><a href=\"Proveedor.jsp\">\r\n");
      out.write("                    <i class=\"material-symbols-sharp\">badge</i>\r\n");
      out.write("                    <span class=\"link-name\">Proveedores</span>\r\n");
      out.write("                </a></li>\r\n");
      out.write("                <li><a href=\"Cotizacion.jsp\">\r\n");
      out.write("                    <i class=\"material-symbols-sharp\">inactive_order</i>\r\n");
      out.write("                    <span class=\"link-name\">Cotizacion</span>\r\n");
      out.write("                </a></li>\r\n");
      out.write("                <li><a href=\"Categorias.jsp\">\r\n");
      out.write("                    <i class=\"material-symbols-sharp\">category</i>\r\n");
      out.write("                    <span class=\"link-name\">Categorias</span>\r\n");
      out.write("                </a></li>\r\n");
      out.write("                <li><a href=\"Usuarios.jsp\">\r\n");
      out.write("                    <i class=\"material-symbols-sharp\">account_circle</i>\r\n");
      out.write("                    <span class=\"link-name\">Usuarios</span>\r\n");
      out.write("                </a></li>\r\n");
      out.write("                <li><a href=\"Roles.jsp\">\r\n");
      out.write("                    <i class=\"material-symbols-sharp\">engineering</i>\r\n");
      out.write("                    <span class=\"link-name\">Roles</span>\r\n");
      out.write("                </a></li>\r\n");
      out.write("            </ul>\r\n");
      out.write("            <!------------------- Cerrar Sesion --------------------->\r\n");
      out.write("            <ul class=\"logout-mode\">\r\n");
      out.write("                <li><a href=\"#\">\r\n");
      out.write("                    <i class=\"uil uil-signout\"></i>\r\n");
      out.write("                    <span class=\"link-name\">Logout</span>\r\n");
      out.write("                </a></li>\r\n");
      out.write("                <div class=\"mode-toggle\">\r\n");
      out.write("                  <span class=\"switch\"></span>\r\n");
      out.write("                </div>\r\n");
      out.write("            </ul>\r\n");
      out.write("        </div>\r\n");
      out.write("    </nav>\r\n");
      out.write("        <!------------------- Barra Superior --------------------->\r\n");
      out.write("        <section class=\"dashboard\">\r\n");
      out.write("            <div class=\"top\">\r\n");
      out.write("                <i class=\"uil uil-bars sidebar-toggle\"></i>\r\n");
      out.write("                <!--<div class=\"text-header\">\r\n");
      out.write("                    <p>Hola, <b>Daniela</b></p>\r\n");
      out.write("                    <small>Admin</small>\r\n");
      out.write("                </div>\r\n");
      out.write("                \r\n");
      out.write("            </div>-->\r\n");
      out.write("                <p>Hola, <b>Daniela</b></p>\r\n");
      out.write("                <img src=\"ASSETS/fotoperfil.svg\">\r\n");
      out.write("        </section>\r\n");
      out.write("        <!------------------- Codigo Java --------------------->\r\n");
      out.write("        <script src=\"JS/menu.js\" type=\"text/javascript\"></script>\r\n");
      out.write("    </body>\r\n");
      out.write("</html>\r\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Usuarios</title>\n");
      out.write("        <!--------------------- Iconos ------------------------------->\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://cdn.jsdelivr.net/npm/boxicons@latest/css/boxicons.min.css\">\n");
      out.write("        <!--------------------- Select ------------------------------->\n");
      out.write("        <link href=\"https://cdnjs.cloudflare.com/ajax/libs/select2/4.0.13/css/select2.min.css\" rel=\"stylesheet\" />\n");
      out.write("        <script src=\"https://code.jquery.com/jquery-3.6.0.min.js\"></script>\n");
      out.write("        <!--<script src=\"https://cdnjs.cloudflare.com/ajax/libs/select2/4.0.13/js/select2.min.js\"></script>-->\n");
      out.write("        <!--------------------- Estilos ------------------------------->\n");
      out.write("        <link href=\"CSS/stylepopup.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <link href=\"CSS/principal.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <link href=\"CSS/pedido.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <section class=\"main\">\n");
      out.write("            <div class=\"dash-content pedido\">\n");
      out.write("                <div class=\"overview\">\n");
      out.write("                    <div class=\"title\">\n");
      out.write("                        <span class=\"text\">Cotizacion</span>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"boxes\">\n");
      out.write("                        <div class=\"box box1\">\n");
      out.write("                            <a style=\"text-decoration:none\" href=\"CrearCotizacion1.jsp\">\n");
      out.write("                                <button class=\"open-popup\" data-popup=\"popup1\"><i class='bx bxs-plus-circle registrar'></i></button>\n");
      out.write("                                <span class=\"text\">Nueva Cotizacion</span>\n");
      out.write("                            </a>\n");
      out.write("\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"box box3\">\n");
      out.write("\n");
      out.write("                            <i class='bx bxs-report activos'></i>\n");
      out.write("                            <span class=\"text\">Cotizaciones</span>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"box box2\">\n");
      out.write("                            <i class='bx bxs-user-check activos' ></i>\n");
      out.write("                            <span class=\"number\">10</span>\n");
      out.write("                            <span class=\"text\">Pendiente</span>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div id=\"customers\" class=\"table-data\">\n");
      out.write("                    <div class=\"order\">\n");
      out.write("                        <div class=\"head\">\n");
      out.write("                            <h3>Últimas Cotizaciones</h3>\n");
      out.write("                            <div class=\"buscar\">\n");
      out.write("                                <input type=\"text\" id=\"buscador\" name=\"id_prov\" class=\"buscar__input\" placeholder=\"Buscar\">\n");
      out.write("                            </div>\n");
      out.write("                            <select class=\"selectico\" id=\"estado\">\n");
      out.write("                                <option value=\"\">Todos</option>\n");
      out.write("                                <option value=\"activo\">Activo</option>\n");
      out.write("                                <option value=\"inactivo\">Inactivo</option>\n");
      out.write("                            </select>\n");
      out.write("                            <i class='bx bx-search'></i>\n");
      out.write("                            <i class='bx bx-filter'></i>\n");
      out.write("                        </div>\n");
      out.write("                        <table>\n");
      out.write("                            <thead>\n");
      out.write("                                <tr>\n");
      out.write("                                    <th>N°Cotizacion</th>\n");
      out.write("                                    <th>N°documento</th>\n");
      out.write("                                    <th>Cliente</th>\n");
      out.write("                                    <th>Usuario</th>\n");
      out.write("                                    <th>Fecha</th>\n");
      out.write("                                    <th>Total</th>\n");
      out.write("                                    <th>Estado</th>\n");
      out.write("                                </tr>\n");
      out.write("                            </thead>\n");
      out.write("                            <tbody id=\"tablaCotizaciones\">\n");
      out.write("                                ");
 ConsultcotizacionDAO ccotDAO = new ConsultcotizacionDAO();
                                    ArrayList<consultcotizacionVO> listaCotizaciones = ccotDAO.listarCot();
                                    for (consultcotizacionVO cotizacion : listaCotizaciones) {
      out.write("\n");
      out.write("                                <tr class=\"daticos\">\n");
      out.write("                                    <td>");
      out.print( cotizacion.getNcotizacion());
      out.write("</td>\n");
      out.write("                                    <td>");
      out.print( cotizacion.getDcumentocli());
      out.write("</td>\n");
      out.write("                                    <td>");
      out.print( cotizacion.getCliente());
      out.write("</td>\n");
      out.write("                                    <td>");
      out.print( cotizacion.getUsuario());
      out.write("</td>\n");
      out.write("                                    <td>");
      out.print( cotizacion.getFecha());
      out.write("</td>\n");
      out.write("                                    <td>");
      out.print( cotizacion.getCtotal());
      out.write("</td>\n");
      out.write("                                    <td>");
      out.print( cotizacion.getEstado());
      out.write("</td>\n");
      out.write("                                </tr>\n");
      out.write("                                ");
 }
      out.write("\n");
      out.write("                            </tbody>\n");
      out.write("                        </table>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </section>\n");
      out.write("    <script src=\"JS/agregaProducto.js\" type=\"text/javascript\"></script>\n");
      out.write("    <script src=\"JS/pedidoproveedor.js\" type=\"text/javascript\"></script>\n");
      out.write("    <script src=\"JS/buscador.js\" type=\"text/javascript\"></script>\n");
      out.write("    <script src=\"JS/popup.js\" type=\"text/javascript\"></script>\n");
      out.write("    <script>\n");
      out.write("        const inputBuscador = document.getElementById('buscador');\n");
      out.write("        const selectEstado = document.getElementById('estado');\n");
      out.write("        const tablaCotizaciones = document.getElementById('tablaCotizaciones');\n");
      out.write("        const listaCotizaciones = ");
      out.print( new Gson().toJson(listaCotizaciones));
      out.write(";\n");
      out.write("        inputBuscador.addEventListener('input', filtrarCotizaciones);\n");
      out.write("        selectEstado.addEventListener('change', filtrarCotizaciones);\n");
      out.write("        function filtrarCotizaciones() {\n");
      out.write("        const filtroDocumento = inputBuscador.value.toLowerCase();\n");
      out.write("        const filtroEstado = selectEstado.value.toLowerCase();\n");
      out.write("        const filtradas = listaCotizaciones.filter(cotizacion = > {\n");
      out.write("        const documento = cotizacion.Dcumentocli.toLowerCase();\n");
      out.write("        const estado = cotizacion.estado.toLowerCase();\n");
      out.write("        if (filtroDocumento && !documento.includes(filtroDocumento)) {\n");
      out.write("        return false;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        if (filtroEstado && estado !== filtroEstado) {\n");
      out.write("        return false;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        return true;\n");
      out.write("        });\n");
      out.write("        mostrarCotizacionesFiltradas(filtradas);\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        function mostrarCotizacionesFiltradas(cotizaciones) {\n");
      out.write("        tablaCotizaciones.innerHTML = '';\n");
      out.write("        cotizaciones.forEach(cotizacion = > {\n");
      out.write("        const row = document.createElement('tr');\n");
      out.write("        row.classList.add('daticos');\n");
      out.write("        row.innerHTML = `\n");
      out.write("                < td >");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${cotizacion.Ncotizacion}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write(" < /td>\n");
      out.write("                < td >");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${cotizacion.Dcumentocli}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write(" < /td>\n");
      out.write("                < td >");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${cotizacion.cliente}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write(" < /td>\n");
      out.write("                < td >");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${cotizacion.usuario}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write(" < /td>\n");
      out.write("                < td >");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${cotizacion.fecha}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write(" < /td>\n");
      out.write("                < td >");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${cotizacion.Ctotal}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write(" < /td>\n");
      out.write("                < td >");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${cotizacion.estado}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write(" < /td>\n");
      out.write("                `;\n");
      out.write("        tablaCotizaciones.appendChild(row);\n");
      out.write("        });\n");
      out.write("        }\n");
      out.write("    </script>\n");
      out.write("\n");
      out.write("\n");
      out.write("</script>\n");
      out.write("\n");
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
