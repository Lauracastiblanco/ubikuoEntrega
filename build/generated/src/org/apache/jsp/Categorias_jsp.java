package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import ModeloDAO.CategoriaDAO;
import ModeloVO.CategoriaVO;
import java.util.ArrayList;
import ModeloDAO.usuarioDAO;
import ModeloVO.usuarioVO;
import ModeloVO.rolesVO;
import ModeloDAO.rolesDAO;

public final class Categorias_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("                <li><a href=\"#\">\r\n");
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Categorias</title>\n");
      out.write("        <link href=\"CSS/stylepopup.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <link href=\"CSS/principal.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <!--------------------- Iconos ------------------------------->\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://cdn.jsdelivr.net/npm/boxicons@latest/css/boxicons.min.css\">\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <section class=\"main\">\n");
      out.write("            <div class=\"dash-content\">\n");
      out.write("                <div class=\"overview\">\n");
      out.write("                    <div class=\"title\">\n");
      out.write("                        <span class=\"text\">Categorias</span>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"boxes\">\n");
      out.write("                        <div class=\"box box1\">\n");
      out.write("                            <button class=\"open-popup\" data-popup=\"popup1\"><i class='bx bxs-plus-circle registrar'></i></button>\n");
      out.write("                            <span class=\"text\">Nueva Categoria</span>\n");
      out.write("                            <div class=\"popup\" id=\"popup1\">\n");
      out.write("                                <div class=\"overlay\"></div>\n");
      out.write("                                <div class=\"popup-content\">\n");
      out.write("                                    <h2>Registrar Categoria</h2>\n");
      out.write("                                    <form method= \"post\" action=\"Categoria\">\n");
      out.write("                                        <div class=\"module-details\">\n");
      out.write("                                            <div class=\"input-box\">\n");
      out.write("                                                <span class=\"details\">Nombre <span style=\"color: red;\">*</span></span>\n");
      out.write("                                                <input type=\"text\" name =\"catnombre\" placeholder=\"Categoria\" required>\n");
      out.write("                                            </div>\n");
      out.write("                                            <div class=\"input-box\">\n");
      out.write("                                                <span class=\"details\">Descripción<span style=\"color: red;\">*</span> </span>\n");
      out.write("                                                <input type=\"text\" name =\"catdescripcion\" placeholder=\"Descripción\" required>\n");
      out.write("                                            </div>\n");
      out.write("                                            <div class=\"input-box\">\n");
      out.write("                                                <span class=\"details\">Estado<span style=\"color: red;\">*</span></span>\n");
      out.write("                                                <select name=\"catestado\">\n");
      out.write("                                                    <option value=\"activo\">Activo</option>\n");
      out.write("                                                    <option value=\"inactivo\">Inactivo</option>\n");
      out.write("                                                </select>\n");
      out.write("                                            </div>\n");
      out.write("                                        </div>\n");
      out.write("                                        <div class=\"controls\">\n");
      out.write("                                            <a href=\"#\" class=\"cancelarbtn\">Cancelar</a>\n");
      out.write("                                            <button class=\"registrarbtn\">Registrar Categoria</button>\n");
      out.write("                                            <input  type=\"hidden\" name=\"opcion\" value=\"1\">\n");
      out.write("                                        </div>\n");
      out.write("                                    </form>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"box box3\">\n");
      out.write("                            <button class=\"open-popup\" data-popup=\"popup3\"> <i class='bx bxs-report activos'></i></button>\n");
      out.write("                            <div class=\"popup\" id=\"popup3\">\n");
      out.write("                                <div class=\"overlay\"></div>\n");
      out.write("                                <div class=\"popup-content\">\n");
      out.write("                                    <h2>Reportes</h2>\n");
      out.write("                                    <form action=\"generar_reporte.java\" method=\"post\">\n");
      out.write("                                        <div class=\"module-detailsReportes\">\n");
      out.write("                                            <div class=\"input-box\">\n");
      out.write("                                                <span class=\"details\">Categorias Activas</span>\n");
      out.write("                                                <button class=\"button\" type=\"submit\" name=\"reporte\" value=\"usuariosActivos\">Descargar</button>\n");
      out.write("                                            </div>\n");
      out.write("                                            <div class=\"input-box\">\n");
      out.write("                                                <span class=\"details\">Categorias Inactivos</span>\n");
      out.write("                                                <button class=\"button\" type=\"submit\" name=\"reporte\" value=\"usuariosInactivos\">Descargar</button>\n");
      out.write("                                            </div>\n");
      out.write("                                            <div class=\"input-box\">\n");
      out.write("                                                <span class=\"details\">Todos los Categorias</span>\n");
      out.write("                                                <button class=\"button\" type=\"submit\" name=\"reporte\" value=\"todosUsuarios\">Descargar</button>\n");
      out.write("                                            </div>\n");
      out.write("                                        </div>\n");
      out.write("                                    </form>\n");
      out.write("                                    <div class=\"controls\">\n");
      out.write("                                        <a href=\"#\" class=\"cancelarbtn\">Cancelar</a>\n");
      out.write("                                    </div>   \n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                            <span class=\"text\">Generar Reporte</span>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"box box2\">\n");
      out.write("                            <i class='bx bxs-user-check activos' ></i>\n");
      out.write("                            <span class=\"number\">10</span>\n");
      out.write("                            <span class=\"text\">Activas</span>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"box box3\">\n");
      out.write("                            <i class='bx bxs-user total'></i>\n");
      out.write("                            <span class=\"number\">20</span>\n");
      out.write("                            <span class=\"text\">Total</span>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div id=\"customers\" class=\"table-data\">\n");
      out.write("                    <div  class=\"order\">\n");
      out.write("                        <div class=\"head\">\n");
      out.write("                            <h3>Consultar Categoria</h3>\n");
      out.write("                            <div class=\"buscar\">\n");
      out.write("                                <input type=\"text\" id=\"buscador\" name=\"id_usuario\"class=\"buscar__input\" placeholder=\"Buscar\">\n");
      out.write("                            </div>\n");
      out.write("                            <select class=\"selectico\" id=\"estado\">\n");
      out.write("                                <option value=\"\">Todas</option>\n");
      out.write("                                <option value=\"activo\">Activo</option>\n");
      out.write("                                <option value=\"inactivo\">Inactivo</option>\n");
      out.write("                            </select>\n");
      out.write("                            <i class='bx bx-search'></i>\n");
      out.write("                            <i class='bx bx-filter'></i>\n");
      out.write("                        </div>\n");
      out.write("                        <table>\n");
      out.write("                            <thead>\n");
      out.write("                                <tr>\n");
      out.write("                                    <th>Identificación</th>\n");
      out.write("                                    <th>Nombre</th>\n");
      out.write("                                    <th>Descripción</th>\n");
      out.write("                                    <th>Estado</th>\n");
      out.write("                                    <th>Actualizar</th>\n");
      out.write("                                </tr>\n");
      out.write("                            </thead>\n");
      out.write("                            ");

                                CategoriaVO catVO = new CategoriaVO();
                                CategoriaDAO catDAO = new CategoriaDAO();
                                ArrayList<CategoriaVO> listaCategorias = catDAO.listarC();
                                int contador = 0;
                                for (int i = 0; i < listaCategorias.size(); i++) {
                                    catVO = listaCategorias.get(i);
                                    contador = contador + 1;
                            
      out.write("\n");
      out.write("                            <tbody>\n");
      out.write("                                <tr class=\"daticos\">\n");
      out.write("                                    <td class=\"id_usuario\">");
      out.print(catVO.getId_cat());
      out.write("</td>\n");
      out.write("                                    <td>");
      out.print(catVO.getCatnombre());
      out.write("</td>\n");
      out.write("                                    <td>");
      out.print(catVO.getCatdescripcion());
      out.write("</td>\n");
      out.write("                                    <td class=\"estado-usuario\"><span class=\"status ");
      out.print(catVO.getCatestado().equals("activo") ? "completed" : "inactive");
      out.write('"');
      out.write('>');
      out.print(catVO.getCatestado());
      out.write("</span></td>\n");
      out.write("                                    <td><button class=\"open-popup actualizar-usuario updatebutton\" data-popup=\"popup2\" data-cat-id=\"");
      out.print(catVO.getId_cat());
      out.write("\" data-cat-nombre =\"");
      out.print(catVO.getCatnombre());
      out.write("\"  data-cat-descripcion=\"");
      out.print(catVO.getCatdescripcion());
      out.write("\" data-cat-estado=\"");
      out.print(catVO.getCatestado());
      out.write("\">\n");
      out.write("                                            <i class='bx bx-edit actualizar'></i></button>\n");
      out.write("                                            ");
}
      out.write("\n");
      out.write("                                        <div class=\"popup actualizar-popup\" id=\"popup2\">\n");
      out.write("                                            <div class=\"overlay\"></div>\n");
      out.write("                                            <div class=\"popup-content\">\n");
      out.write("                                                <h2>Actualizar Categoria</h2>\n");
      out.write("                                                <form method=\"post\" action=\"Categoria\">\n");
      out.write("                                                    <div class=\"module-details\">\n");
      out.write("                                                        <div class=\"input-box\">\n");
      out.write("                                                            <span class=\"details\">Identificación <span style=\"color: red;\">*</span></span>\n");
      out.write("                                                            <input type=\"number\" name =\"id_cat\" placeholder=\"Identificación\" id=\"id_cat\">\n");
      out.write("                                                        </div>\n");
      out.write("                                                        <div class=\"input-box\">\n");
      out.write("                                                            <span class=\"details\">Nombre <span style=\"color: red;\">*</span></span>\n");
      out.write("                                                            <input type=\"text\" name =\"catnombre\" placeholder=\"Nombre\" id=\"catnombre\">\n");
      out.write("                                                        </div>\n");
      out.write("                                                        <div class=\"input-box\">\n");
      out.write("                                                            <span class=\"details\">Descripción<span style=\"color: red;\">*</span> </span>\n");
      out.write("                                                            <input type=\"text\" name =\"catdescripcion\" placeholder=\"Descripción\" id=\"catdescripcion\">\n");
      out.write("                                                        </div>\n");
      out.write("                                                        <div class=\"input-box\">\n");
      out.write("                                                            <span class=\"details\">Estado<span style=\"color: red;\">*</span></span>\n");
      out.write("                                                            <select name=\"catestado\" id=\"catestado\">\n");
      out.write("                                                                <option value=\"activo\">Activo</option>\n");
      out.write("                                                                <option value=\"inactivo\">Inactivo</option>\n");
      out.write("                                                            </select>\n");
      out.write("                                                        </div>\n");
      out.write("                                                    </div>\n");
      out.write("                                                    <div class=\"controls\">\n");
      out.write("                                                        <a href=\"#\" class=\"cancelarbtn\">Cancelar</a>\n");
      out.write("                                                        <button class=\"registrarbtn\">Actualizar Usuario</button>\n");
      out.write("                                                        <input  type=\"hidden\" name=\"opcion\" value=\"2\">\n");
      out.write("                                                    </div>   \n");
      out.write("                                                </form>\n");
      out.write("                                            </div>\n");
      out.write("                                        </div>\n");
      out.write("                                    </td>\n");
      out.write("                                </tr>\n");
      out.write("                            </tbody>\n");
      out.write("                        </table>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </section>\n");
      out.write("        <script src=\"JS/buscador.js\" type=\"text/javascript\"></script>\n");
      out.write("        <script src=\"JS/poupcategoria.js\" type=\"text/javascript\"></script>\n");
      out.write("    </body>\n");
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
