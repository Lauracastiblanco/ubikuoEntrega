<%-- 
    Document   : Productos
    Created on : 6/06/2023, 09:42:43 PM
    Author     : Alexander
--%>

<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="ModeloDAO.CategoriaDAO"%>
<%@page import="ModeloDAO.ProveedorDAO"%>
<%@page import="ModeloDAO.productosDAO"%>
<%@page import="ModeloVO.CategoriaVO"%>
<%@page import="ModeloVO.ProveedorVO"%>
<%@page import="ModeloVO.productosVO"%>
<%@include file="menuVendedor.jsp" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Usuarios</title>
        <link href="CSS/stylepopup.css" rel="stylesheet" type="text/css"/>
        <link href="CSS/principal.css" rel="stylesheet" type="text/css"/>
        <!--------------------- Iconos ------------------------------->
        <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/boxicons@latest/css/boxicons.min.css">
        <script src="https://cdn.jsdelivr.net/npm/sweetalert2@10"></script>
    </head>
    <%-- Mostrar SweetAlert si se registra el cliente normal exitosamente --%>
    <% String successMessage = (String) request.getAttribute("mensajeExito"); %>
    <% if (successMessage != null) {%>
    <script>
        Swal.fire({
            icon: 'success',
            title: 'Producto Creado con exito',
            text: '<%= successMessage%>'
        });
    </script>
    <% } %>

    <%-- Mostrar SweetAlert en caso de error al registrar el cliente normal --%>
    <% String errorMessage = (String) request.getAttribute("mensajeError"); %>
    <% if (errorMessage != null) {%>
    <script>
        Swal.fire({
            icon: 'error',
            title: 'Producto no registrado',
            text: '<%= errorMessage%>'
        });
    </script>
    <% } %>
    <body>
        <section class="main">
            <div class="dash-content">
                <div class="overview">
                    <div class="title">
                        <span class="text">Productos</span>
                    </div>
                    <div class="boxes">
                        <div class="box box1">
                            <button class="open-popup" data-popup="popup1"><i class='bx bxs-plus-circle registrar'></i></button>
                            <span class="text">Nuevo Producto</span>
                            <div class="popup" id="popup1">
                                <div class="overlay"></div>
                                <div class="popup-content">
                                    <h2>Registrar Producto</h2>
                                    <form method= "post" action="Productos">
                                        <div class="module-details">
                                            <div class="input-box">
                                                <span class="details">Nombre<span style="color: red;">*</span></span>
                                                <input type="text" name="prodnombre" placeholder="Nombre" required>
                                            </div>
                                            <div class="input-box">
                                                <span class="details">Precio<span style="color: red;">*</span></span>
                                                <input type="number" name="prodprecio" placeholder="Precio" required>
                                            </div>
                                            <div class="input-box">
                                                <span class="details">Categoria<span style="color: red;">*</span></span>
                                                <select name="prod_id_categoria" >
                                                    <%
                                                        CategoriaDAO catDAO = new CategoriaDAO();
                                                        for (CategoriaVO catVO : catDAO.listarC()) {
                                                    %>
                                                    <option value="<%=catVO.getId_cat()%>"><%=catVO.getCatnombre()%></option>
                                                    <%}%>
                                                </select>
                                            </div>
                                            <div class="input-box">
                                                <span class="details">Referencia<span style="color: red;">*</span> </span>
                                                <input type="text" name ="id_prod" placeholder="id_prod" required>
                                            </div>
                                            <div class="input-box">
                                                <span class="details">Disponibilidad<span style="color: red;">*</span> </span>
                                                <input type="text" name ="prodstock_disp" placeholder="Stock" required>
                                            </div>
                                            <div class="input-box">
                                                <span class="details">Descripción<span style="color: red;">*</span> </span>
                                                <input type="text" name ="prod_descripcion" placeholder="Descipción" required>
                                            </div>
                                            <div class="input-box">
                                                <span class="details">Proveedor<span style="color: red;">*</span></span>
                                                <select name="prod_id_prov">
                                                    <%
                                                        ProveedorDAO provDAO = new ProveedorDAO();
                                                        for (ProveedorVO provVO : provDAO.listar()) {
                                                    %>
                                                    <option value="<%=provVO.getId_prov()%>"><%=provVO.getPronombre()%></option>
                                                    <%}%>
                                                </select>
                                            </div>
                                            <div class="input-box">
                                                <span class="details">Estado<span style="color: red;">*</span></span>
                                                <select name="prodestado">
                                                    <option value="activo">Activo</option>
                                                    <option value="inactivo">Inactivo</option>
                                                </select>
                                            </div>
                                        </div>
                                        <div class="controls">
                                            <a href="#" class="cancelarbtn">Cancelar</a>
                                            <button class="registrarbtn">Registrar Producto</button>
                                            <input  type="hidden" name="opcion" value="1">
                                        </div>
                                    </form>
                                </div>
                            </div>
                        </div>
                        <div class="box box3">
                            <button class="open-popup" data-popup="popup3"> <i class='bx bxs-report activos'></i></button>
                            <div class="popup" id="popup3">
                                <div class="overlay"></div>
                                <div class="popup-content">
                                    <h2>Reportes</h2>
                                    <form action="generar_reporte.java" method="post">
                                        <div class="module-detailsReportes">
                                            <div class="input-box">
                                                <span class="details">Productos Activos</span>
                                                <button class="button" type="submit" name="reporte" value="usuariosActivos">Descargar</button>
                                            </div>
                                            <div class="input-box">
                                                <span class="details">Productos Inactivos</span>
                                                <button class="button" type="submit" name="reporte" value="usuariosInactivos">Descargar</button>
                                            </div>
                                            <div class="input-box">
                                                <span class="details">Todos los Productos</span>
                                                <button class="button" type="submit" name="reporte" value="todosUsuarios">Descargar</button>
                                            </div>
                                        </div>
                                    </form>
                                    <div class="controls">
                                        <a href="#" class="cancelarbtn">Cancelar</a>
                                    </div>   
                                </div>
                            </div>
                            <span class="text">Generar Reporte</span>
                        </div>
                        <div class="box box2">
                            <i class='bx bxs-user-check activos' ></i>
                            <span class="number">10</span>
                            <span class="text">Activos</span>
                        </div>
                        <div class="box box3">
                            <i class='bx bxs-user total'></i>
                            <span class="number">20</span>
                            <span class="text">Total</span>
                        </div>
                    </div>
                </div>
                <div id="customers" class="table-data">
                    <div  class="order">
                        <div class="head">
                            <h3>Consultar Producto</h3>
                            <div class="buscar">
                                <input type="text" id="buscador" name="id_usuario"class="buscar__input" placeholder="Buscar">
                            </div>
                            <select class="selectico" id="estado">
                                <option value="">Todos</option>
                                <option value="activo">Activo</option>
                                <option value="inactivo">Inactivo</option>
                            </select>
                            <i class='bx bx-search'></i>
                            <i class='bx bx-filter'></i>
                        </div>
                        <table>
                            <thead>
                                <tr>
                                    <th>Referencia</th>
                                    <th>Nombre</th>
                                    <th>Precio</th>
                                    <th>Categoria</th>
                                    <th>Disponibilidad</th>
                                    <th>Descripcion</th>
                                    <th>Proveedor</th>
                                    <th>Estado</th>
                                    <th>Actualizar</th>
                                </tr>
                            </thead>
                            <%
                                productosVO prodVO = new productosVO();
                                productosDAO prodDAO = new productosDAO();
                                ArrayList<productosVO> listaProductos = prodDAO.listar();
                                int contador = 0;
                                for (int i = 0; i < listaProductos.size(); i++) {
                                    prodVO = listaProductos.get(i);
                                    contador = contador + 1;
                            %>
                            <tbody>
                                <tr class="daticos">
                                    <td class="id_usuario"><%=prodVO.getId_prod()%></td>
                                    <td><%=prodVO.getProdnombre()%></td>
                                    <td><%=prodVO.getProdprecio()%></td>
                                    <td><%=prodVO.getCatnombre()%></td>
                                    <td><%=prodVO.getProdstock_disp()%></td>
                                    <td><%=prodVO.getProd_descripcion()%></td>
                                    <td><%=prodVO.getProd_id_prov()%></td>
                                    <td class="estado-usuario"><span class="status <%=prodVO.getProdestado().equals("activo") ? "completed" : "inactive"%>"><%=prodVO.getProdestado()%></span></td>
                                    <td><button class="open-popup actualizar-usuario updatebutton" data-popup="popup2" data-prod-id="<%=prodVO.getId_prod()%>" data-prod-nombre="<%=prodVO.getProdnombre()%>" data-prod-precio="<%=prodVO.getProdprecio()%>" data-prod-categoria="<%=prodVO.getProd_id_categoria()%>" data-prod-dispo="<%=prodVO.getProdstock_disp()%>" data-prod-descripcion="<%=prodVO.getProd_descripcion()%>" data-prod-descripcion="<%=prodVO.getProd_descripcion()%>" data-prod-proveedor="<%=prodVO.getProd_id_prov()%>" data-prod-estado="<%=prodVO.getProdestado()%>">
                                            <i class='bx bx-edit actualizar'></i></button>
                                            <%}%>
                                        <div class="popup actualizar-popup" id="popup2">
                                            <div class="overlay"></div>
                                            <div class="popup-content">
                                                <h2>Actualizar Producto</h2>
                                                <form method = "post" action="Productos">
                                                    <div class="module-details">
                                                        <div class="input-box">
                                                            <span class="details">Referencia<span style="color: red;">*</span></span>
                                                            <input type="text" name ="id_prod" placeholder="Referencia" id="id_prod">
                                                        </div>
                                                        <div class="input-box">
                                                            <span class="details">Nombre<span style="color: red;">*</span></span>
                                                            <input type="text" name ="prodnombre" placeholder="Nombre" id="prodnombre">
                                                        </div>
                                                        <div class="input-box">
                                                            <span class="details">Precio<span style="color: red;">*</span></span>
                                                            <input type="text" name ="prodprecio" placeholder="Apellidos" id="prodprecio">
                                                        </div>
                                                        <div class="input-box">
                                                            <span class="details">Categoria<span style="color: red;">*</span></span>
                                                            <select name="prod_id_categoria" id="prod_id_categoria">
                                                                <%
                                                                    CategoriaDAO catActDAO = new CategoriaDAO();
                                                                    for (CategoriaVO catVO : catActDAO.listarC()) {
                                                                %>
                                                                <option value="<%=catVO.getId_cat()%>"><%=catVO.getCatnombre()%></option>
                                                                <%}%>
                                                            </select>
                                                        </div>
                                                        <div class="input-box">
                                                            <span class="details">Disponibilidad<span style="color: red;">*</span> </span>
                                                            <input type="text" name ="prodstock_disp" placeholder="Disponibiliad" id="prodstock_disp">
                                                        </div>
                                                        <div class="input-box">
                                                            <span class="details">Descripción<span style="color: red;">*</span></span>
                                                            <input type="text" name="prod_descripcion" placeholder="Descipcion" id="prod_descripcion">
                                                        </div>
                                                        <div class="input-box">
                                                            <span class="details">Proveedor<span style="color: red;">*</span></span>
                                                            <select name="prod_id_prov" id="prod_id_prov">
                                                                <%
                                                                    ProveedorDAO provActDAO = new ProveedorDAO();
                                                                    for (ProveedorVO provVO : provActDAO.listar()) {
                                                                %>
                                                                <option value="<%=provVO.getId_prov()%>"><%=provVO.getPronombre()%></option>
                                                                <%}%>
                                                            </select>
                                                        </div>                    
                                                        <div class="input-box">
                                                            <span class="details">Estado<span style="color: red;">*</span></span>
                                                            <select name="prodestado" id="prodestado">
                                                                <option value="activo">Activo</option>
                                                                <option value="inactivo">Inactivo</option>
                                                            </select>
                                                        </div>
                                                    </div>
                                                    <div class="controls">
                                                        <a href="#" class="cancelarbtn">Cancelar</a>
                                                        <button class="registrarbtn">Actualizar Usuario</button>
                                                        <input  type="hidden" name="opcion" value="2">
                                                    </div>   
                                                </form>
                                            </div>
                                        </div>
                                    </td>
                                </tr>
                            </tbody>
                        </table>
                    </div>
                </div>
            </div>
        </section>
        <script src="JS/buscador.js" type="text/javascript"></script>
        <script src="JS/popuproducto.js" type="text/javascript"></script>
    </body>
</html>