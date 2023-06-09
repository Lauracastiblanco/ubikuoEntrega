package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.List;
import ModeloVO.productosVO;
import ModeloDAO.productosDAO;
import ModeloVO.CategoriaVO;
import ModeloDAO.CategoriaDAO;
import java.util.Date;
import java.text.SimpleDateFormat;
import ModeloDAO.rolesDAO;
import java.util.ArrayList;
import ModeloDAO.ProveedorDAO;
import ModeloVO.ProveedorVO;

public final class PedidoProveedor_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(1);
    _jspx_dependants.add("/menuVendedor.jsp");
  }

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_forEach_var_items;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_forEach_var_items = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_forEach_var_items.release();
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
      out.write("    </head>\r\n");
      out.write("    <body>\r\n");
      out.write("        <section class=\"main\">\r\n");
      out.write("            <div class=\"dash-content\">\r\n");
      out.write("                <div class=\"overview\">\r\n");
      out.write("                    <div class=\"title\">\r\n");
      out.write("                        <span class=\"text\">Pedido Proveedor</span>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"container\">\r\n");
      out.write("                    <div class=\"columna1\">\r\n");
      out.write("                        <div class=\"caja1\">\r\n");
      out.write("                            <h4>Datos Generales</h4>\r\n");
      out.write("                            <div class=\"datos-usu\">\r\n");
      out.write("                                ");

                                    SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
                                    Date currentDate = new Date();
                                    String currentDateStr = dateFormat.format(currentDate);
                                
      out.write("\r\n");
      out.write("                                <div class=\"box-container\">\r\n");
      out.write("                                    <label>Fecha</label>\r\n");
      out.write("                                    <input type=\"date\" value=\"");
      out.print( currentDateStr);
      out.write("\"readonly>\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <div class=\"box-container\">\r\n");
      out.write("                                    <label>Usuario</label>\r\n");
      out.write("                                    <select name=\"id_usuario\" id=\"id_usuario\">\r\n");
      out.write("                                        <option value=\"\">Selccione...</option>\r\n");
      out.write("                                        <option value=\"1\">Laura Castiblanco</option>\r\n");
      out.write("                                        <option value=\"1074414468\">Luisa Toquica</option>\r\n");
      out.write("                                    </select>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <h4>Datos Proveedor</h4>\r\n");
      out.write("                            <div class=\"datos-prov\">\r\n");
      out.write("                                <div class=\"box-container\">\r\n");
      out.write("                                    <label>NIT</label>\r\n");
      out.write("                                    <select name=\"id_prov\" onchange=\"inputsProveedor()\" id=\"id_prov\">\r\n");
      out.write("                                        <option>Seleccione...</option>\r\n");
      out.write("                                        ");
 ProveedorDAO provDAO = new ProveedorDAO();
                                            for (ProveedorVO rolVO : provDAO.listar()) {
                                                String id_prov = String.valueOf(rolVO.getId_prov());
                                        
      out.write("\r\n");
      out.write("                                        <option value=\"");
      out.print( id_prov);
      out.write("\" data-nombre=\"");
      out.print( rolVO.getPronombre());
      out.write("\" data-representante=\"");
      out.print( rolVO.getProrepresentante());
      out.write("\" data-direccion=\"");
      out.print( rolVO.getProdireccion());
      out.write("\" data-correo=\"");
      out.print( rolVO.getProcorreo());
      out.write('"');
      out.write('>');
      out.print( rolVO.getPronombre());
      out.write(" NIT ");
      out.print( rolVO.getId_prov());
      out.write("</option>\r\n");
      out.write("                                        ");
 }
      out.write("\r\n");
      out.write("                                    </select>\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <div class=\"box-container\">\r\n");
      out.write("                                    <label>Nombre</label>\r\n");
      out.write("                                    <input type=\"text\" placeholder=\"Nombre\" id=\"pronombre\" value=\"");
      out.print( request.getAttribute("pronombre"));
      out.write("\">\r\n");
      out.write("                                </div>  \r\n");
      out.write("                                <div class=\"box-container\">\r\n");
      out.write("                                    <label>Representante</label>\r\n");
      out.write("                                    <input type=\"text\" placeholder=\"Representante\" id=\"prorepresentante\" value=\"");
      out.print( request.getAttribute("prorepresentante"));
      out.write("\">\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <div class=\"box-container\">\r\n");
      out.write("                                    <label>Direccion</label>\r\n");
      out.write("                                    <input type=\"text\" placeholder=\"Direccion\" id=\"prodireccion\" value=\"");
      out.print( request.getAttribute("prodireccion"));
      out.write("\">\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <div class=\"box-container\">\r\n");
      out.write("                                    <label>Correo Electronico</label>\r\n");
      out.write("                                    <input type=\"text\" placeholder=\"Correo Electronico\" id=\"procorreo\" value=\"");
      out.print( request.getAttribute("procorreo"));
      out.write("\">\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <form method=\"post\" action=\"DetallesPedidoProveedor\">\r\n");
      out.write("                            <h2>Lista de Productos</h2>\r\n");
      out.write("                            <table class=\"tabla1\">\r\n");
      out.write("                                <thead>\r\n");
      out.write("                                    <tr>\r\n");
      out.write("                                        <td>Item</td>\r\n");
      out.write("                                        <th>Id Producto</th>\r\n");
      out.write("                                        <th>Nombre</th>\r\n");
      out.write("                                        <th>Cantidad</th>\r\n");
      out.write("                                        <th>Precio Unitario</th>\r\n");
      out.write("                                        <th>Sub Total</th>\r\n");
      out.write("                                        <th>Acciones</th>\r\n");
      out.write("                                    </tr>\r\n");
      out.write("                                </thead>\r\n");
      out.write("                                <tbody>\r\n");
      out.write("                                    ");
      if (_jspx_meth_c_forEach_0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("                                </tbody>\r\n");
      out.write("                            </table>\r\n");
      out.write("                            <button class=\"generar-pedido\">Generar Pedido</button>\r\n");
      out.write("                            <input  type=\"hidden\" name=\"opcion\" value=\"2\">\r\n");
      out.write("                        </form>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"columna2\">\r\n");
      out.write("                        <h3 class=\"titulo-prod\">Productos</h3>\r\n");
      out.write("                        <div class=\"caja2\">\r\n");
      out.write("                            <form method=\"post\" action=\"DetallesPedidoProveedor\">\r\n");
      out.write("                                <div class=\"productos\">\r\n");
      out.write("                                    <div class=\"datosproductos\">\r\n");
      out.write("                                        <label>Producto</label>\r\n");
      out.write("                                        <select name=\"id_prod\" id=\"selectProducto\" onchange=\"inputsProductos()\" class=\"select2\" id=\"miSelect\">\r\n");
      out.write("                                            <option value=\"\">Seleccione...</option>\r\n");
      out.write("                                            ");
 productosDAO prodDAO = new productosDAO();
                                                List<productosVO> listaProductos = prodDAO.listar();
                                                for (productosVO prodVO : listaProductos) {
      out.write("\r\n");
      out.write("                                            <option class=\"producto-option\" value=\"");
      out.print( prodVO.getId_prod());
      out.write("\" data-descripcion=\"");
      out.print( prodVO.getProd_descripcion());
      out.write("\" data-precio=\"");
      out.print( prodVO.getProdprecio());
      out.write("\" data-stock=\"");
      out.print( prodVO.getProdstock_disp());
      out.write('"');
      out.write('>');
      out.print( prodVO.getProdnombre());
      out.write(" - REF: ");
      out.print( prodVO.getId_prod());
      out.write("</option>\r\n");
      out.write("                                            ");
 }
      out.write("\r\n");
      out.write("                                        </select>\r\n");
      out.write("                                        <label>Descripción</label>\r\n");
      out.write("                                        <input type=\"text\" placeholder=\"Descripcion\" id=\"prod_descripcion\" name=\"prod_descripcion\" >\r\n");
      out.write("                                        <label>Precio</label>\r\n");
      out.write("                                        <input type=\"text\" placeholder=\"Precio\" id=\"prodprecio\" name=\"prodprecio\">\r\n");
      out.write("                                        <label>Stock</label>\r\n");
      out.write("                                        <input type=\"text\" placeholder=\"Stock\" id=\"prodstock_disp\" name=\"prodstock_disp\">\r\n");
      out.write("                                        <label>Cantidad</label>\r\n");
      out.write("                                        <input type=\"text\" placeholder=\"Cantidad\" name=\"dpro_cantidad\">\r\n");
      out.write("                                        <label>Foto</label>\r\n");
      out.write("                                        <img class=\"foto-prod\" src=\"ASSETS/Breaker.png\" alt=\"\"/>\r\n");
      out.write("                                        <button class=\"btn agregar\" id=\"agregar-btn\" onclick=\"guardarDatos()\">Agregar al pedido</button>\r\n");
      out.write("                                        <input  type=\"hidden\" name=\"opcion\" value=\"1\">\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </form>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </section>\r\n");
      out.write("        <script src=\"JS/pedidoproveedor.js\" type=\"text/javascript\"></script>\r\n");
      out.write("        <script src=\"JS/buscador.js\" type=\"text/javascript\"></script>\r\n");
      out.write("        <script src=\"JS/popup.js\" type=\"text/javascript\"></script>\r\n");
      out.write("        <script src=\"https://cdnjs.cloudflare.com/ajax/libs/jquery/3.6.0/jquery.min.js\"></script>\r\n");
      out.write("        <script src=\"https://cdnjs.cloudflare.com/ajax/libs/select2/4.0.13/js/select2.min.js\"></script>\r\n");
      out.write("        <script>\r\n");
      out.write("                  // Obtener los valores del almacenamiento local\r\n");
      out.write("           var id_usuario = localStorage.getItem('id_usuario');\r\n");
      out.write("           var pronombre = localStorage.getItem('pronombre');\r\n");
      out.write("           var prorepresentante = localStorage.getItem('prorepresentante');\r\n");
      out.write("           var procorreo = localStorage.getItem('procorreo');\r\n");
      out.write("           var prodireccion = localStorage.getItem('prodireccion');\r\n");
      out.write("           var id_prov = localStorage.getItem('id_prov');\r\n");
      out.write("\r\n");
      out.write("           // Establecer los valores en los campos del formulario\r\n");
      out.write("           document.getElementById('id_usuario').value = id_usuario;\r\n");
      out.write("           document.getElementById('pronombre').value = pronombre;\r\n");
      out.write("           document.getElementById('prorepresentante').value = prorepresentante;\r\n");
      out.write("           document.getElementById('procorreo').value = procorreo;\r\n");
      out.write("           document.getElementById('prodireccion').value = prodireccion;\r\n");
      out.write("           document.getElementById('id_prov').value = id_prov;\r\n");
      out.write("        </script>\r\n");
      out.write("    </body>\r\n");
      out.write("</html>");
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

  private boolean _jspx_meth_c_forEach_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_0.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_0.setParent(null);
    _jspx_th_c_forEach_0.setVar("detalle");
    _jspx_th_c_forEach_0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${listaProductos}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int[] _jspx_push_body_count_c_forEach_0 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
      if (_jspx_eval_c_forEach_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("                                        <tr>\r\n");
          out.write("                                            <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${detalle.item}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\r\n");
          out.write("                                            <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${detalle.dpro_id_producto}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\r\n");
          out.write("                                            <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${detalle.descripcionProducto}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\r\n");
          out.write("                                            <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${detalle.dpro_cantidad}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\r\n");
          out.write("                                            <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${detalle.dpro_preciocompra}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\r\n");
          out.write("                                            <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${detalle.dpro_subtotal}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\r\n");
          out.write("                                            <td>Acciones</td>\r\n");
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
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_0);
    }
    return false;
  }
}
