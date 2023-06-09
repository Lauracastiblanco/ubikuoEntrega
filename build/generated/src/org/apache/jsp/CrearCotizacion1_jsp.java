package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import ModeloVO.ClienteVO;
import ModeloDAO.ClienteDAO;
import java.util.Date;
import java.text.SimpleDateFormat;
import ModeloVO.productosVO;
import java.util.List;
import ModeloVO.CategoriaVO;
import ModeloDAO.CategoriaDAO;
import ModeloDAO.productosDAO;

public final class CrearCotizacion1_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(1);
    _jspx_dependants.add("/menuVendedor.jsp");
  }

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_set_var_value_scope_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_forEach_varStatus_var_items;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_set_var_value_scope_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_forEach_varStatus_var_items = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_set_var_value_scope_nobody.release();
    _jspx_tagPool_c_forEach_varStatus_var_items.release();
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

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
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
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");

    response.setHeader("Cache-Control", "no-cache, no-store, must-revalidate");
    response.setHeader("Pragma", "no-cache");
    response.setDateHeader("Expires", 0);

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("        <title>Usuarios</title>\r\n");
      out.write("        <!--------------------- Iconos ------------------------------->\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://cdn.jsdelivr.net/npm/boxicons@latest/css/boxicons.min.css\">\r\n");
      out.write("        <!--------------------- Select ------------------------------->\r\n");
      out.write("        <link href=\"https://cdnjs.cloudflare.com/ajax/libs/select2/4.0.13/css/select2.min.css\" rel=\"stylesheet\" />\r\n");
      out.write("        <script src=\"https://code.jquery.com/jquery-3.6.0.min.js\"></script>\r\n");
      out.write("        <script src=\"https://cdnjs.cloudflare.com/ajax/libs/select2/4.0.13/js/select2.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("        <!--------------------- Estilos ------------------------------->\r\n");
      out.write("        <link href=\"CSS/stylepopup.css\" rel=\"stylesheet\" type=\"text/css\"/>\r\n");
      out.write("        <link href=\"CSS/principal.css\" rel=\"stylesheet\" type=\"text/css\"/>\r\n");
      out.write("        <link href=\"CSS/pedido.css\" rel=\"stylesheet\" type=\"text/css\"/>\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css\">\r\n");
      out.write("        <script src=\"https://cdn.jsdelivr.net/npm/sweetalert2@10\"></script>\r\n");
      out.write("    </head>\r\n");
      out.write("    ");
      if (_jspx_meth_c_set_0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("    ");
      if (_jspx_meth_c_set_1(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("    ");
      if (_jspx_meth_c_set_2(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("    ");
      out.write("\r\n");
      out.write("    ");
 String successMessage = (String) request.getAttribute("RegistroExitoso"); 
      out.write("\r\n");
      out.write("    ");
 if (successMessage != null) {
      out.write("\r\n");
      out.write("    <script>\r\n");
      out.write("        Swal.fire({\r\n");
      out.write("            icon: 'success',\r\n");
      out.write("            title: 'Cotizacion generada con exito',\r\n");
      out.write("            text: '");
      out.print( successMessage);
      out.write("'\r\n");
      out.write("        });\r\n");
      out.write("    </script>\r\n");
      out.write("    ");
 } 
      out.write("\r\n");
      out.write("\r\n");
      out.write("    ");
      out.write("\r\n");
      out.write("    ");
 String errorMessage = (String) request.getAttribute("mensajeError"); 
      out.write("\r\n");
      out.write("    ");
 if (errorMessage != null) {
      out.write("\r\n");
      out.write("    <script>\r\n");
      out.write("        Swal.fire({\r\n");
      out.write("            icon: 'error',\r\n");
      out.write("            title: 'Error',\r\n");
      out.write("            text: '");
      out.print( errorMessage);
      out.write("'\r\n");
      out.write("        });\r\n");
      out.write("    </script>\r\n");
      out.write("    ");
 } 
      out.write("\r\n");
      out.write("\r\n");
      out.write("    <body >\r\n");
      out.write("\r\n");
      out.write("        <section class=\"main\">\r\n");
      out.write("            <form  id=\"cotizacion-form\" method=\"post\" action=\"cotizacion\" autocomplete=\"off\">\r\n");
      out.write("                <div class=\"dash-content\">\r\n");
      out.write("                    <div class=\"overview\">\r\n");
      out.write("                        <div class=\"title\">\r\n");
      out.write("                            <span class=\"text\">Crear Cotizacion</span>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("\r\n");
      out.write("                    <div class=\"container\">\r\n");
      out.write("\r\n");
      out.write("                        <div class=\"columna1\">\r\n");
      out.write("\r\n");
      out.write("                            <div class=\"caja1\">\r\n");
      out.write("\r\n");
      out.write("                                <h4>Datos Generales</h4>\r\n");
      out.write("                                <div class=\"datos-usu\">\r\n");
      out.write("                                    ");

                                        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
                                        Date currentDate = new Date();
                                        String currentDateStr = dateFormat.format(currentDate);
                                    
      out.write("\r\n");
      out.write("                                    <div class=\"box-container\">\r\n");
      out.write("                                        <label>Fecha</label>\r\n");
      out.write("                                        <input type=\"date\" value=\"");
      out.print( currentDateStr);
      out.write("\"readonly>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                    <div class=\"box-container\">\r\n");
      out.write("                                        <label>Usuario</label>\r\n");
      out.write("                                        <select name=\"id_usuario\" id=\"id_usuario\">\r\n");
      out.write("                                            <option value=\"\">Selccione...</option>\r\n");
      out.write("                                            <option value=\"1\">Laura Castiblanco</option>\r\n");
      out.write("                                            <option value=\"1074414468\">Luisa Toquica</option>\r\n");
      out.write("                                        </select>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <h4>Datos Cliente</h4>\r\n");
      out.write("\r\n");
      out.write("                                <div class=\"datos-prov\">\r\n");
      out.write("                                    <div class=\"datosclientes\">\r\n");
      out.write("                                        <div style=\"display: flex; flex-wrap: wrap;\">\r\n");
      out.write("\r\n");
      out.write("                                            <div style=\"flex: 0 0 33.33%; max-width: 33.33%;\">\r\n");
      out.write("                                                <label>Documento</label>\r\n");
      out.write("                                                <div style=\"display: flex; align-items: center;\">\r\n");
      out.write("                                                    <input type=\"text\" name=\"cot_id_cliente\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${c.getId_cliente()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" autofocus> \r\n");
      out.write("                                                    <button type=\"submit\" name=\"accion\" value=\"buscarcliente\" class=\"btn btn-success\">Buscar</button>\r\n");
      out.write("                                                </div>\r\n");
      out.write("                                            </div>\r\n");
      out.write("\r\n");
      out.write("                                            <div style=\"flex: 0 0 33.33%; max-width: 33.33%;\">\r\n");
      out.write("                                                <label>Nombre</label>\r\n");
      out.write("                                                <input type=\"text\" placeholder=\"Nombre\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${c.getClinombre()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" class=\"form-field\" readonly>\r\n");
      out.write("                                            </div>\r\n");
      out.write("\r\n");
      out.write("                                            <div style=\"flex: 0 0 33.33%; max-width: 33.33%;\">\r\n");
      out.write("                                                <label>Apellido</label>\r\n");
      out.write("                                                <input type=\"text\" placeholder=\"Apellido\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${c.getCliapellido()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" class=\"form-field\" readonly>\r\n");
      out.write("                                            </div>\r\n");
      out.write("\r\n");
      out.write("                                            <div style=\"flex: 0 0 33.33%; max-width: 33.33%;\">\r\n");
      out.write("                                                <label>Descripción</label>\r\n");
      out.write("                                                <input type=\"text\" placeholder=\"Descripción\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${c.getClidescripcion()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" class=\"form-field\" readonly>\r\n");
      out.write("                                            </div>\r\n");
      out.write("\r\n");
      out.write("                                            <div style=\"flex: 0 0 33.33%; max-width: 33.33%;\">\r\n");
      out.write("                                                <label>Correo</label>\r\n");
      out.write("                                                <input type=\"text\" placeholder=\"Correo\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${c.getClicorreo()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" class=\"form-field\" readonly>\r\n");
      out.write("                                            </div>\r\n");
      out.write("\r\n");
      out.write("                                            <div style=\"flex: 0 0 33.33%; max-width: 33.33%;\">\r\n");
      out.write("                                                <label>Dirección</label>\r\n");
      out.write("                                                <input type=\"text\" placeholder=\"Dirección\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${c.getClidireccion()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" class=\"form-field\" readonly>\r\n");
      out.write("                                            </div>\r\n");
      out.write("\r\n");
      out.write("                                            <div style=\"flex: 0 0 33.33%; max-width: 33.33%;\">\r\n");
      out.write("                                                <label>Teléfono</label>\r\n");
      out.write("                                                <input type=\"text\" placeholder=\"Teléfono\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${c.getClitelefono()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" class=\"form-field\" readonly>\r\n");
      out.write("                                            </div>\r\n");
      out.write("\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                </div>\r\n");
      out.write("\r\n");
      out.write("                            </div>\r\n");
      out.write("\r\n");
      out.write("                            <h2>Lista de Productos</h2>\r\n");
      out.write("                            <table class=\"tabla1\" id=\"tablaProductos\">\r\n");
      out.write("                                <thead>\r\n");
      out.write("                                    <tr id=\"fila-");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${list.item}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\">\r\n");
      out.write("                                        <th>Item</th>\r\n");
      out.write("                                        <th>Idproducto</th>\r\n");
      out.write("                                        <th>Producto</th>\r\n");
      out.write("                                        <th>Cantidad</th>\r\n");
      out.write("                                        <th>Precio unitario</th>\r\n");
      out.write("                                        <th>Subtotal</th>\r\n");
      out.write("                                        <th class=\"action\">Acciones</th>\r\n");
      out.write("\r\n");
      out.write("                                    </tr>\r\n");
      out.write("                                </thead>\r\n");
      out.write("                                <tbody>\r\n");
      out.write("\r\n");
      out.write("                                    ");
      if (_jspx_meth_c_forEach_0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("                                </tbody>\r\n");
      out.write("                            </table>\r\n");
      out.write("                            <div class=\"card-footer d-flex parte04\">\r\n");
      out.write("                                <div class=\"col-sm-3 ml-auto\">\r\n");
      out.write("\r\n");
      out.write("                                    <p>Total: <span id=\"total\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${Total}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</span></p>\r\n");
      out.write("\r\n");
      out.write("                                </div>\r\n");
      out.write("\r\n");
      out.write("                                <div class=\"col-sm-6\">\r\n");
      out.write("                                    <button type=\"submit\" name=\"accion\" value=\"generarcotizacion\" class=\"btn btn-secondary\">generar cotizacion</button>\r\n");
      out.write("                                    <input type=\"button\" value=\"Cancelar\" onclick=\"cancelarRegistro()\" class=\"btn btn-danger\" style=\"margin-left: 10px\">\r\n");
      out.write("                                </div>\r\n");
      out.write("\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("\r\n");
      out.write("                        <div class=\"columna2\">\r\n");
      out.write("                            <h3 class=\"titulo-prod\">Productos</h3>\r\n");
      out.write("                            <div class=\"caja2\">\r\n");
      out.write("\r\n");
      out.write("                                <div class=\"productos\">\r\n");
      out.write("                                    <div class=\"datosproductos\">\r\n");
      out.write("\r\n");
      out.write("                                        <label>Producto</label>\r\n");
      out.write("                                        <input type=\"text\"  name=\"dc_id_prod\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pr.getId_prod()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\"  >\r\n");
      out.write("                                        <button type=\"submit\" name=\"accion\" value=\"buscarproducto\" class=\"btn btn-secondary\">buscar</button>\r\n");
      out.write("\r\n");
      out.write("                                        <label>Descripción</label>\r\n");
      out.write("                                        <input type=\"text\" placeholder=\"Producto\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pr.getProdnombre()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\"  name=\"nomproducto\" readonly >\r\n");
      out.write("                                        <label>Precio</label>\r\n");
      out.write("                                        <input type=\"text\" placeholder=\"Precio\"  value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pr.getProdprecio()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" name=\"precio\" readonly>\r\n");
      out.write("                                        <label>Stock</label>\r\n");
      out.write("                                        <input type=\"text\" placeholder=\"Stock\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pr. getProdstock_disp()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" name=\"stock\" readonly>\r\n");
      out.write("                                        <label>Cantidad</label>\r\n");
      out.write("                                        <input type=\"text\" placeholder=\"Cantidad\" name=\"cantidad\">\r\n");
      out.write("\r\n");
      out.write("                                        <label>Foto</label>\r\n");
      out.write("                                        <img class=\"foto-prod\" src=\"ASSETS/Breaker.png\" alt=\"\"/>\r\n");
      out.write("                                        <button class=\"btn agregar\" id=\"agregar-btn\" >Agregar al pedido</button>\r\n");
      out.write("                                        <input  type=\"hidden\" name=\"accion\" value=\"agregarproducto\">\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                </div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </form>\r\n");
      out.write("        </section>\r\n");
      out.write("\r\n");
      out.write("        <script src=\"JS/agregaProducto.js\" type=\"text/javascript\"></script>\r\n");
      out.write("        <script src=\"JS/cotizacion.js\" type=\"text/javascript\"></script>\r\n");
      out.write("        <script src=\"JS/buscador.js\" type=\"text/javascript\"></script>\r\n");
      out.write("        <script src=\"JS/popup.js\" type=\"text/javascript\"></script>\r\n");
      out.write("        <script src=\"https://code.jquery.com/jquery-3.6.0.min.js\"></script>\r\n");
      out.write("        <script>\r\n");
      out.write("                                        function cancelarRegistro() {\r\n");
      out.write("                                            if (confirm(\"¿Estás seguro que deseas cancelar el registro?\")) {\r\n");
      out.write("                                                document.getElementById(\"cotizacion-form\").setAttribute(\"onsubmit\", \"return false;\");\r\n");
      out.write("\r\n");
      out.write("                                                var tablaProductos = document.getElementById(\"tablaProductos\");\r\n");
      out.write("                                                if (tablaProductos) {\r\n");
      out.write("                                                    var tbody = tablaProductos.getElementsByTagName(\"tbody\")[0];\r\n");
      out.write("                                                    while (tbody.firstChild) {\r\n");
      out.write("                                                        tbody.removeChild(tbody.firstChild); // Eliminar todas las filas de la tabla\r\n");
      out.write("                                                    }\r\n");
      out.write("                                                }\r\n");
      out.write("\r\n");
      out.write("                                                // Llamar al controlador para cancelar el registro\r\n");
      out.write("                                                window.location.href = \"cotizacion?accion=cancelar\";\r\n");
      out.write("                                            }\r\n");
      out.write("                                        }\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("        </script>\r\n");
      out.write("        <script>\r\n");
      out.write("            // Función para agregar un producto a la tabla de la cotización\r\n");
      out.write("            function agregarProducto() {\r\n");
      out.write("                // Obtener los valores de los campos de producto\r\n");
      out.write("                var idProducto = $(\"input[name='dc_id_prod']\").val();\r\n");
      out.write("                var producto = $(\"input[name='nomproducto']\").val();\r\n");
      out.write("                var precio = parseFloat($(\"input[name='precio']\").val());\r\n");
      out.write("                var stock = parseInt($(\"input[name='stock']\").val());\r\n");
      out.write("                var cantidad = parseInt($(\"input[name='cantidad']\").val());\r\n");
      out.write("\r\n");
      out.write("                // Validar la cantidad ingresada\r\n");
      out.write("                if (isNaN(cantidad) || cantidad <= 0) {\r\n");
      out.write("                    alert(\"Ingrese una cantidad válida.\");\r\n");
      out.write("                    return;\r\n");
      out.write("                }\r\n");
      out.write("\r\n");
      out.write("                // Validar el stock disponible\r\n");
      out.write("                if (cantidad > stock) {\r\n");
      out.write("                    alert(\"La cantidad ingresada supera el stock disponible.\");\r\n");
      out.write("                    return;\r\n");
      out.write("                }\r\n");
      out.write("\r\n");
      out.write("                // Calcular el subtotal\r\n");
      out.write("                var subtotal = precio * cantidad;\r\n");
      out.write("\r\n");
      out.write("                // Crear la nueva fila de la tabla\r\n");
      out.write("                var newRow =\r\n");
      out.write("                        \"<tr>\" +\r\n");
      out.write("                        \"<td></td>\" +\r\n");
      out.write("                        \"<td>\" + idProducto + \"</td>\" +\r\n");
      out.write("                        \"<td>\" + producto + \"</td>\" +\r\n");
      out.write("                        \"<td>\" + cantidad + \"</td>\" +\r\n");
      out.write("                        \"<td>\" + precio + \"</td>\" +\r\n");
      out.write("                        \"<td>\" + subtotal + \"</td>\" +\r\n");
      out.write("                        \"<td class='d-flex'>\" +\r\n");
      out.write("                        \"<a class='btn btn-danger' style='margin-left: 10px' onclick='borrarProducto(this)'>Borrar</a>\" +\r\n");
      out.write("                        \"</td>\" +\r\n");
      out.write("                        \"</tr>\";\r\n");
      out.write("\r\n");
      out.write("                // Agregar la nueva fila a la tabla\r\n");
      out.write("                $(\"#tablaProductos tbody\").append(newRow);\r\n");
      out.write("\r\n");
      out.write("                // Actualizar los índices de los ítems\r\n");
      out.write("                actualizarIndices();\r\n");
      out.write("\r\n");
      out.write("                // Calcular el nuevo total\r\n");
      out.write("                calcularTotal();\r\n");
      out.write("            }\r\n");
      out.write("\r\n");
      out.write("// Función para borrar un producto de la tabla de la cotización\r\n");
      out.write("            function borrarProducto(button) {\r\n");
      out.write("                // Obtener la fila padre del botón de borrar\r\n");
      out.write("                var row = $(button).closest(\"tr\");\r\n");
      out.write("\r\n");
      out.write("                // Eliminar la fila de la tabla\r\n");
      out.write("                row.remove();\r\n");
      out.write("\r\n");
      out.write("                // Actualizar los índices de los ítems\r\n");
      out.write("                actualizarIndices();\r\n");
      out.write("\r\n");
      out.write("                // Calcular el nuevo total\r\n");
      out.write("                calcularTotal();\r\n");
      out.write("            }\r\n");
      out.write("\r\n");
      out.write("// Función para actualizar los índices de los ítems en la tabla\r\n");
      out.write("            function actualizarIndices() {\r\n");
      out.write("                $(\"#tablaProductos tbody tr\").each(function (index) {\r\n");
      out.write("                    $(this).find(\"td:first\").text(index + 1);\r\n");
      out.write("                });\r\n");
      out.write("            }\r\n");
      out.write("\r\n");
      out.write("// Función para calcular el total de la cotización\r\n");
      out.write("            function calcularTotal() {\r\n");
      out.write("                var total = 0.0;\r\n");
      out.write("\r\n");
      out.write("                $(\"#tablaProductos tbody tr\").each(function () {\r\n");
      out.write("                    var subtotal = parseFloat($(this).find(\"td:nth-child(6)\").text());\r\n");
      out.write("                    total += subtotal;\r\n");
      out.write("                });\r\n");
      out.write("\r\n");
      out.write("                $(\"#total\").text(total);\r\n");
      out.write("            }\r\n");
      out.write("\r\n");
      out.write("// Evento para agregar un producto al hacer clic en el botón\r\n");
      out.write("            $(\"#agregar-btn\").click(function () {\r\n");
      out.write("                agregarProducto();\r\n");
      out.write("            });\r\n");
      out.write("\r\n");
      out.write("// Evento para borrar un producto al hacer clic en el botón de borrar\r\n");
      out.write("            $(document).on(\"click\", \".btn-danger\", function () {\r\n");
      out.write("                borrarProducto(this);\r\n");
      out.write("            });\r\n");
      out.write("        </script>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("        < /body>\r\n");
      out.write("        < /html>\r\n");
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

  private boolean _jspx_meth_c_set_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:set
    org.apache.taglibs.standard.tag.rt.core.SetTag _jspx_th_c_set_0 = (org.apache.taglibs.standard.tag.rt.core.SetTag) _jspx_tagPool_c_set_var_value_scope_nobody.get(org.apache.taglibs.standard.tag.rt.core.SetTag.class);
    _jspx_th_c_set_0.setPageContext(_jspx_page_context);
    _jspx_th_c_set_0.setParent(null);
    _jspx_th_c_set_0.setVar("lista");
    _jspx_th_c_set_0.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${lista}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_set_0.setScope("session");
    int _jspx_eval_c_set_0 = _jspx_th_c_set_0.doStartTag();
    if (_jspx_th_c_set_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_set_var_value_scope_nobody.reuse(_jspx_th_c_set_0);
      return true;
    }
    _jspx_tagPool_c_set_var_value_scope_nobody.reuse(_jspx_th_c_set_0);
    return false;
  }

  private boolean _jspx_meth_c_set_1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:set
    org.apache.taglibs.standard.tag.rt.core.SetTag _jspx_th_c_set_1 = (org.apache.taglibs.standard.tag.rt.core.SetTag) _jspx_tagPool_c_set_var_value_scope_nobody.get(org.apache.taglibs.standard.tag.rt.core.SetTag.class);
    _jspx_th_c_set_1.setPageContext(_jspx_page_context);
    _jspx_th_c_set_1.setParent(null);
    _jspx_th_c_set_1.setVar("item");
    _jspx_th_c_set_1.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${item}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_set_1.setScope("session");
    int _jspx_eval_c_set_1 = _jspx_th_c_set_1.doStartTag();
    if (_jspx_th_c_set_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_set_var_value_scope_nobody.reuse(_jspx_th_c_set_1);
      return true;
    }
    _jspx_tagPool_c_set_var_value_scope_nobody.reuse(_jspx_th_c_set_1);
    return false;
  }

  private boolean _jspx_meth_c_set_2(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:set
    org.apache.taglibs.standard.tag.rt.core.SetTag _jspx_th_c_set_2 = (org.apache.taglibs.standard.tag.rt.core.SetTag) _jspx_tagPool_c_set_var_value_scope_nobody.get(org.apache.taglibs.standard.tag.rt.core.SetTag.class);
    _jspx_th_c_set_2.setPageContext(_jspx_page_context);
    _jspx_th_c_set_2.setParent(null);
    _jspx_th_c_set_2.setVar("Total");
    _jspx_th_c_set_2.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${total}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_set_2.setScope("session");
    int _jspx_eval_c_set_2 = _jspx_th_c_set_2.doStartTag();
    if (_jspx_th_c_set_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_set_var_value_scope_nobody.reuse(_jspx_th_c_set_2);
      return true;
    }
    _jspx_tagPool_c_set_var_value_scope_nobody.reuse(_jspx_th_c_set_2);
    return false;
  }

  private boolean _jspx_meth_c_forEach_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_varStatus_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_0.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_0.setParent(null);
    _jspx_th_c_forEach_0.setVar("list");
    _jspx_th_c_forEach_0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${lista}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_forEach_0.setVarStatus("status");
    int[] _jspx_push_body_count_c_forEach_0 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
      if (_jspx_eval_c_forEach_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("                                        <tr>\r\n");
          out.write("                                            <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${list.getItem()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\r\n");
          out.write("                                            <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${list.getDc_id_producto()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\r\n");
          out.write("                                            <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${list.getNombreproductoL()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\r\n");
          out.write("                                            <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${list.getCantidad()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\r\n");
          out.write("                                            <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${list.getPrecio()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\r\n");
          out.write("                                            <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${list.getSubtotal()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\r\n");
          out.write("                                            <td class=\"d-flex\">\r\n");
          out.write("                                                <a class=\"btn btn-danger\" style=\"margin-left: 10px\" onclick=\"borrarProducto(");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${list.item}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write(")\">Borrar</a>\r\n");
          out.write("\r\n");
          out.write("\r\n");
          out.write("                                            </td>\r\n");
          out.write("                                            <td></td>\r\n");
          out.write("                                        </tr>\r\n");
          out.write("                                    ");
          int evalDoAfterBody = _jspx_th_c_forEach_0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_0.doFinally();
      _jspx_tagPool_c_forEach_varStatus_var_items.reuse(_jspx_th_c_forEach_0);
    }
    return false;
  }
}
