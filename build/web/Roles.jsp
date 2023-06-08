<%-- 
    Document   : Usuarios
    Created on : 12/04/2023, 10:18:32 PM
    Author     : Alexander
--%>

<%@page import="ModeloDAO.rolesDAO"%>
<%@page import="ModeloVO.rolesVO"%>
<%@page import="ModeloDAO.CategoriaDAO"%>
<%@page import="ModeloVO.CategoriaVO"%>
<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="menuVendedor.jsp" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Roles</title>
        <link href="CSS/stylepopup.css" rel="stylesheet" type="text/css"/>
        <link href="CSS/principal.css" rel="stylesheet" type="text/css"/>
        <!--------------------- Iconos ------------------------------->
        <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/boxicons@latest/css/boxicons.min.css">
    </head>
    <body>
        <section class="main">
            <div class="dash-content">
                <div class="overview">
                    <div class="title">
                        <span class="text">Roles</span>
                    </div>
                    <div class="boxes">
                        <div class="box box1">
                            <button class="open-popup" data-popup="popup1"><i class='bx bxs-plus-circle registrar'></i></button>
                            <span class="text">Nuevo Rol</span>
                            <div class="popup" id="popup1">
                                <div class="overlay"></div>
                                <div class="popup-content">
                                    <h2>Registrar Rol</h2>
                                    <form method= "post" action="roles">
                                        <div class="module-details">
                                            <div class="input-box">
                                                <span class="details">Nombre <span style="color: red;">*</span></span>
                                                <input type="text" name ="rolnombre" placeholder="Nombre" required>
                                            </div>
                                        </div>
                                        <div class="controls">
                                            <a href="#" class="cancelarbtn">Cancelar</a>
                                            <button class="registrarbtn">Registrar Rol</button>
                                            <input  type="hidden" name="opcion" value="1">
                                        </div>
                                    </form>
                                </div>
                            </div>
                        </div>
                        <div class="box box2">
                            <i class='bx bxs-user-check activos' ></i>
                            <span class="number">10</span>
                            <span class="text">Activas</span>
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
                            <h3>Consultar Categoria</h3>
                            <div class="buscar">
                                <input type="text" id="buscador" name="id_usuario"class="buscar__input" placeholder="Buscar">
                            </div>
                            <select class="selectico" id="estado">
                                <option value="">Todas</option>
                                <option value="activo">Activo</option>
                                <option value="inactivo">Inactivo</option>
                            </select>
                            <i class='bx bx-search'></i>
                            <i class='bx bx-filter'></i>
                        </div>
                        <table>
                            <thead>
                                <tr>
                                    <th>Identificación</th>
                                    <th>Nombre</th>
                                </tr>
                            </thead>
                            <%
                                rolesVO rolVO = new rolesVO();
                                rolesDAO rolDAO = new rolesDAO();
                                ArrayList<rolesVO> listaRoles = rolDAO.listar();
                                int contador = 0;
                                for (int i = 0; i < listaRoles.size(); i++) {
                                    rolVO = listaRoles.get(i);
                                    contador = contador + 1;
                            %>
                            <tbody>
                                <tr class="daticos">
                                    <td class="id_usuario"><%=rolVO.getId_Rol()%></td>
                                    <td><%=rolVO.getRolnombre()%></td>
                                    <td>Activo</td>
                                    <td><button class="open-popup actualizar-usuario updatebutton" data-popup="popup2" data-rol-id="<%=rolVO.getId_Rol()%>" data-rol-nombre="<%=rolVO.getRolnombre()%>">
                                            <i class='bx bx-edit actualizar'></i></button>
                                            <%}%>
                                        <div class="popup actualizar-popup" id="popup2">
                                            <div class="overlay"></div>
                                            <div class="popup-content">
                                                <h2>Actualizar Rol</h2>
                                                <form method="post" action="roles">
                                                    <div class="module-details">
                                                        <div class="input-box">
                                                            <span class="details">Identificación <span style="color: red;">*</span></span>
                                                            <input type="number" name ="id_Rol" placeholder="Identificación" id="id_Rol">
                                                        </div>
                                                        <div class="input-box">
                                                            <span class="details">Nombre <span style="color: red;">*</span></span>
                                                            <input type="text" name ="rolnombre" placeholder="Nombre" id="rolnombre">
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
        <script src="JS/popuprol.js" type="text/javascript"></script>
    </body>
</html>
