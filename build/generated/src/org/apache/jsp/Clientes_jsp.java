package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import ModeloDAO.CategoriaDAO;
import ModeloVO.CategoriaVO;
import ModeloVO.ClienteVO;
import ModeloDAO.ClienteDAO;
import java.util.ArrayList;
import ModeloDAO.usuarioDAO;
import ModeloVO.usuarioVO;
import ModeloVO.rolesVO;
import ModeloDAO.rolesDAO;

public final class Clientes_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("        <title>Clientes</title>\r\n");
      out.write("        <link href=\"CSS/stylepopup.css\" rel=\"stylesheet\" type=\"text/css\"/>\r\n");
      out.write("        <link href=\"CSS/principal.css\" rel=\"stylesheet\" type=\"text/css\"/>\r\n");
      out.write("        <!--------------------- Iconos ------------------------------->\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://cdn.jsdelivr.net/npm/boxicons@latest/css/boxicons.min.css\">\r\n");
      out.write("    </head>\r\n");
      out.write("    <body>\r\n");
      out.write("        <section class=\"main\">\r\n");
      out.write("            <div class=\"dash-content\">\r\n");
      out.write("                <div class=\"overview\">\r\n");
      out.write("                    <div class=\"title\">\r\n");
      out.write("                        <span class=\"text\">Clientes</span>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"boxes\">\r\n");
      out.write("                        <div class=\"box box1\">\r\n");
      out.write("                            <button class=\"open-popup\" data-popup=\"popup1\"><i class='bx bxs-plus-circle registrar'></i></button>\r\n");
      out.write("                            <span class=\"text\">Registrar Cliente</span>\r\n");
      out.write("                            <div class=\"popup\" id=\"popup1\">\r\n");
      out.write("                                <div class=\"overlay\"></div>\r\n");
      out.write("                                <div class=\"popup-content\">\r\n");
      out.write("                                    <h2>Registrar Cliente</h2>\r\n");
      out.write("                                    <form method= \"post\" action=\"Cliente\">\r\n");
      out.write("                                        <div class=\"module-details\">\r\n");
      out.write("                                            <div class=\"input-box\">\r\n");
      out.write("                                                <span class=\"details\">Cédula <span style=\"color: red;\">*</span></span>\r\n");
      out.write("                                                <input type=\"text\" name =\"id_cliente\" placeholder=\"Cedula\" required>\r\n");
      out.write("                                            </div> \r\n");
      out.write("                                            <div class=\"input-box\">\r\n");
      out.write("                                                <span class=\"details\">Nombre(s) <span style=\"color: red;\">*</span></span>\r\n");
      out.write("                                                <input type=\"text\" name =\"clinombre\" placeholder=\"Nombre(s)\" required>\r\n");
      out.write("                                            </div>  \r\n");
      out.write("                                            <div class=\"input-box\">\r\n");
      out.write("                                                <span class=\"details\">Apellido(s)<span style=\"color: red;\">*</span> </span>\r\n");
      out.write("                                                <input type=\"text\" name =\"cliapellido\" placeholder=\"Apellido(s)\" required>\r\n");
      out.write("                                            </div>\r\n");
      out.write("                                            <div class=\"input-box\">\r\n");
      out.write("                                                <span class=\"details\">Correo <span style=\"color: red;\">*</span> </span>\r\n");
      out.write("                                                <input type=\"email\" name =\"clicorreo\" placeholder=\"Correo Electronico\" required>\r\n");
      out.write("                                            </div>\r\n");
      out.write("                                            <div class=\"input-box\">\r\n");
      out.write("                                                <span class=\"details\">Dirección <span style=\"color: red;\">*</span> </span>\r\n");
      out.write("                                                <input type=\"text\" name =\"clidireccion\" placeholder=\"Dirección\" required>\r\n");
      out.write("                                            </div>\r\n");
      out.write("                                            <div class=\"input-box\">\r\n");
      out.write("                                                <span class=\"details\">Telefono <span style=\"color: red;\">*</span> </span>\r\n");
      out.write("                                                <input type=\"number\" name =\"clitelefono\" placeholder=\"Telefono\" required>\r\n");
      out.write("                                            </div>\r\n");
      out.write("                                            <div class=\"input-box\">\r\n");
      out.write("                                                <span class=\"details\">Descripción<span style=\"color: red;\">*</span> </span>\r\n");
      out.write("                                                <input type=\"text\" name =\"clidescripcion\" placeholder=\"Descripción\" required>\r\n");
      out.write("                                            </div>\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                        <div class=\"controls\">\r\n");
      out.write("                                            <a href=\"#\" class=\"cancelarbtn\">Cancelar</a>\r\n");
      out.write("                                            <button class=\"registrarbtn\">Registrar Categoria</button>\r\n");
      out.write("                                            <input  type=\"hidden\" name=\"opcion\" value=\"1\">\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                    </form>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"box box3\">\r\n");
      out.write("                            <button class=\"open-popup\" data-popup=\"popup3\"> <i class='bx bxs-report activos'></i></button>\r\n");
      out.write("                            <div class=\"popup\" id=\"popup3\">\r\n");
      out.write("                                <div class=\"overlay\"></div>\r\n");
      out.write("                                <div class=\"popup-content\">\r\n");
      out.write("                                    <h2>Reportes</h2>\r\n");
      out.write("                                    <form action=\"generar_reporte.java\" method=\"post\">\r\n");
      out.write("                                        <div class=\"module-detailsReportes\">\r\n");
      out.write("                                            <div class=\"input-box\">\r\n");
      out.write("                                                <span class=\"details\">Clientes Activos</span>\r\n");
      out.write("                                                <button class=\"button\" type=\"submit\" name=\"reporte\" value=\"usuariosActivos\">Descargar</button>\r\n");
      out.write("                                            </div>\r\n");
      out.write("                                            <div class=\"input-box\">\r\n");
      out.write("                                                <span class=\"details\">Clientes Inactivos</span>\r\n");
      out.write("                                                <button class=\"button\" type=\"submit\" name=\"reporte\" value=\"usuariosInactivos\">Descargar</button>\r\n");
      out.write("                                            </div>\r\n");
      out.write("                                            <div class=\"input-box\">\r\n");
      out.write("                                                <span class=\"details\">Todas los Clientes</span>\r\n");
      out.write("                                                <button class=\"button\" type=\"submit\" name=\"reporte\" value=\"todosUsuarios\">Descargar</button>\r\n");
      out.write("                                            </div>\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                    </form>\r\n");
      out.write("                                    <div class=\"controls\">\r\n");
      out.write("                                        <a href=\"#\" class=\"cancelarbtn\">Cancelar</a>\r\n");
      out.write("                                    </div>   \r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <span class=\"text\">Generar Reporte</span>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"box box2\">\r\n");
      out.write("                            <i class='bx bxs-user-check activos' ></i>\r\n");
      out.write("                            <span class=\"number\">10</span>\r\n");
      out.write("                            <span class=\"text\">Activos</span>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"box box3\">\r\n");
      out.write("                            <i class='bx bxs-user total'></i>\r\n");
      out.write("                            <span class=\"number\">20</span>\r\n");
      out.write("                            <span class=\"text\">Total</span>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div id=\"customers\" class=\"table-data\">\r\n");
      out.write("                    <div  class=\"order\">\r\n");
      out.write("                        <div class=\"head\">\r\n");
      out.write("                            <h3>Consultar Cliente</h3>\r\n");
      out.write("                            <div class=\"buscar\">\r\n");
      out.write("                                <input type=\"text\" id=\"buscador\" name=\"id_usuario\"class=\"buscar__input\" placeholder=\"Buscar\">\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <select class=\"selectico\" id=\"estado\">\r\n");
      out.write("                                <option value=\"\">Todos</option>\r\n");
      out.write("                                <option value=\"activo\">Activo</option>\r\n");
      out.write("                                <option value=\"inactivo\">Inactivo</option>\r\n");
      out.write("                            </select>\r\n");
      out.write("                            <i class='bx bx-search'></i>\r\n");
      out.write("                            <i class='bx bx-filter'></i>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <table>\r\n");
      out.write("                            <thead>\r\n");
      out.write("                                <tr>\r\n");
      out.write("                                    <th>Identificación</th>\r\n");
      out.write("                                    <th>Nombre</th>\r\n");
      out.write("                                    <th>Correo</th>\r\n");
      out.write("                                    <th>Dirección</th>\r\n");
      out.write("                                    <th>Télefono</th>\r\n");
      out.write("                                    <th>Descripción</th>\r\n");
      out.write("                                    <th>Estado</th>\r\n");
      out.write("                                    <th>Actualizar</th>\r\n");
      out.write("                                </tr>\r\n");
      out.write("                            </thead>\r\n");
      out.write("                            ");

                                ClienteDAO clienteDAO = new ClienteDAO();
                                ArrayList<ClienteVO> listaClientes = clienteDAO.listarClientes();
                                for (int i = 0; i < listaClientes.size(); i++) {
                                    ClienteVO cliVO = listaClientes.get(i);
                            
      out.write("\r\n");
      out.write("                            <tbody>\r\n");
      out.write("                                <tr class=\"daticos\">\r\n");
      out.write("                                    <td class=\"id_usuario\">");
      out.print( cliVO.getId_cliente());
      out.write("</td>\r\n");
      out.write("                                    <td>");
      out.print( cliVO.getClinombre());
      out.write(' ');
      out.print( cliVO.getCliapellido());
      out.write("</td>\r\n");
      out.write("                                    <td>");
      out.print( cliVO.getClicorreo());
      out.write("</td>\r\n");
      out.write("                                    <td>");
      out.print( cliVO.getClidireccion());
      out.write("</td>\r\n");
      out.write("                                    <td>");
      out.print( cliVO.getClitelefono());
      out.write("</td>\r\n");
      out.write("                                    <td>");
      out.print( cliVO.getClidescripcion());
      out.write("</td>\r\n");
      out.write("                                    <td>Activo</td>\r\n");
      out.write("                                    <td><button class=\"open-popup actualizar-usuario updatebutton\" data-popup=\"popup2\" >\r\n");
      out.write("                                            <i class='bx bx-edit actualizar'></i></button>\r\n");
      out.write("                                            ");
}
      out.write("\r\n");
      out.write("                                        <div class=\"popup actualizar-popup\" id=\"popup2\">\r\n");
      out.write("                                            <div class=\"overlay\"></div>\r\n");
      out.write("                                            <div class=\"popup-content\">\r\n");
      out.write("                                                <h2>Actualizar Clientes</h2>\r\n");
      out.write("                                                <form method=\"post\" action=\"Cliente\">\r\n");
      out.write("                                                    <div class=\"module-details\">\r\n");
      out.write("                                                        <div class=\"input-box\">\r\n");
      out.write("                                                            <span class=\"details\">Identificación <span style=\"color: red;\">*</span></span>\r\n");
      out.write("                                                            <input type=\"number\" name =\"id_cat\" placeholder=\"Identificación\" id=\"id_cat\">\r\n");
      out.write("                                                        </div>\r\n");
      out.write("                                                        <div class=\"input-box\">\r\n");
      out.write("                                                            <span class=\"details\">Nombre <span style=\"color: red;\">*</span></span>\r\n");
      out.write("                                                            <input type=\"text\" name =\"catnombre\" placeholder=\"Nombre\" id=\"catnombre\">\r\n");
      out.write("                                                        </div>\r\n");
      out.write("                                                        <div class=\"input-box\">\r\n");
      out.write("                                                            <span class=\"details\">Descripción<span style=\"color: red;\">*</span> </span>\r\n");
      out.write("                                                            <input type=\"text\" name =\"catdescripcion\" placeholder=\"Descripción\" id=\"catdescripcion\">\r\n");
      out.write("                                                        </div>\r\n");
      out.write("                                                        <div class=\"input-box\">\r\n");
      out.write("                                                            <span class=\"details\">Estado<span style=\"color: red;\">*</span></span>\r\n");
      out.write("                                                            <select name=\"catestado\" id=\"catestado\">\r\n");
      out.write("                                                                <option value=\"activo\">Activo</option>\r\n");
      out.write("                                                                <option value=\"inactivo\">Inactivo</option>\r\n");
      out.write("                                                            </select>\r\n");
      out.write("                                                        </div>\r\n");
      out.write("                                                    </div>\r\n");
      out.write("                                                    <div class=\"controls\">\r\n");
      out.write("                                                        <a href=\"#\" class=\"cancelarbtn\">Cancelar</a>\r\n");
      out.write("                                                        <button class=\"registrarbtn\">Actualizar Usuario</button>\r\n");
      out.write("                                                        <input  type=\"hidden\" name=\"opcion\" value=\"2\">\r\n");
      out.write("                                                    </div>   \r\n");
      out.write("                                                </form>\r\n");
      out.write("                                            </div>\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                    </td>\r\n");
      out.write("                                </tr>\r\n");
      out.write("                            </tbody>\r\n");
      out.write("                        </table>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </section>\r\n");
      out.write("        <script src=\"JS/buscador.js\" type=\"text/javascript\"></script>\r\n");
      out.write("        <script src=\"JS/poupcategoria.js\" type=\"text/javascript\"></script>\r\n");
      out.write("    </body>\r\n");
      out.write("</html>\r\n");
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
