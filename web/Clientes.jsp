<%-- 
    Document   : Usuarios
    Created on : 12/04/2023, 10:18:32 PM
    Author     : Alexander
--%>

<%@page import="ModeloDAO.CategoriaDAO"%>
<%@page import="ModeloVO.CategoriaVO"%>
<%@page import="ModeloVO.ClienteVO"%>
<%@page import="ModeloDAO.ClienteDAO"%>
<%@page import="java.util.ArrayList"%>
<%@page import="ModeloDAO.usuarioDAO"%>
<%@page import="ModeloVO.usuarioVO"%>
<%@page import="ModeloVO.rolesVO"%>
<%@page import="ModeloDAO.rolesDAO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="menuVendedor.jsp" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Clientes</title>
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
                        <span class="text">Clientes</span>
                    </div>
                    <div class="boxes">
                        <div class="box box1">
                            <button class="open-popup" data-popup="popup1"><i class='bx bxs-plus-circle registrar'></i></button>
                            <span class="text">Registrar Cliente</span>
                            <div class="popup" id="popup1">
                                <div class="overlay"></div>
                                <div class="popup-content">
                                    <h2>Registrar Cliente</h2>
                                    <form method= "post" action="Cliente">
                                        <div class="module-details">
                                            <div class="input-box">
                                                <span class="details">Cédula <span style="color: red;">*</span></span>
                                                <input type="text" name ="id_cliente" placeholder="Cedula" required>
                                            </div> 
                                            <div class="input-box">
                                                <span class="details">Nombre(s) <span style="color: red;">*</span></span>
                                                <input type="text" name ="clinombre" placeholder="Nombre(s)" required>
                                            </div>  
                                            <div class="input-box">
                                                <span class="details">Apellido(s)<span style="color: red;">*</span> </span>
                                                <input type="text" name ="cliapellido" placeholder="Apellido(s)" required>
                                            </div>
                                            <div class="input-box">
                                                <span class="details">Correo <span style="color: red;">*</span> </span>
                                                <input type="email" name ="clicorreo" placeholder="Correo Electronico" required>
                                            </div>
                                            <div class="input-box">
                                                <span class="details">Dirección <span style="color: red;">*</span> </span>
                                                <input type="text" name ="clidireccion" placeholder="Dirección" required>
                                            </div>
                                            <div class="input-box">
                                                <span class="details">Telefono <span style="color: red;">*</span> </span>
                                                <input type="number" name ="clitelefono" placeholder="Telefono" required>
                                            </div>
                                            <div class="input-box">
                                                <span class="details">Descripción<span style="color: red;">*</span> </span>
                                                <input type="text" name ="clidescripcion" placeholder="Descripción" required>
                                            </div>
                                        </div>
                                        <div class="controls">
                                            <a href="#" class="cancelarbtn">Cancelar</a>
                                            <button class="registrarbtn">Registrar Categoria</button>
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
                                                <span class="details">Clientes Activos</span>
                                                <button class="button" type="submit" name="reporte" value="usuariosActivos">Descargar</button>
                                            </div>
                                            <div class="input-box">
                                                <span class="details">Clientes Inactivos</span>
                                                <button class="button" type="submit" name="reporte" value="usuariosInactivos">Descargar</button>
                                            </div>
                                            <div class="input-box">
                                                <span class="details">Todas los Clientes</span>
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
                            <h3>Consultar Cliente</h3>
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
                                    <th>Identificación</th>
                                    <th>Nombre</th>
                                    <th>Correo</th>
                                    <th>Dirección</th>
                                    <th>Télefono</th>
                                    <th>Descripción</th>
                                    <th>Estado</th>
                                    <th>Actualizar</th>
                                </tr>
                            </thead>
                            <%
                                ClienteDAO clienteDAO = new ClienteDAO();
                                ArrayList<ClienteVO> listaClientes = clienteDAO.listarClientes();
                                for (int i = 0; i < listaClientes.size(); i++) {
                                    ClienteVO cliVO = listaClientes.get(i);
                            %>
                            <tbody>
                                <tr class="daticos">
                                    <td class="id_usuario"><%= cliVO.getId_cliente()%></td>
                                    <td><%= cliVO.getClinombre()%> <%= cliVO.getCliapellido()%></td>
                                    <td><%= cliVO.getClicorreo()%></td>
                                    <td><%= cliVO.getClidireccion()%></td>
                                    <td><%= cliVO.getClitelefono()%></td>
                                    <td><%= cliVO.getClidescripcion()%></td>
                                    <td>Activo</td>
                                    <td><button class="open-popup actualizar-usuario updatebutton" data-popup="popup2" >
                                            <i class='bx bx-edit actualizar'></i></button>
                                            <%}%>
                                        <div class="popup actualizar-popup" id="popup2">
                                            <div class="overlay"></div>
                                            <div class="popup-content">
                                                <h2>Actualizar Clientes</h2>
                                                <form method="post" action="Cliente">
                                                    <div class="module-details">
                                                        <div class="input-box">
                                                            <span class="details">Identificación <span style="color: red;">*</span></span>
                                                            <input type="number" name ="id_cat" placeholder="Identificación" id="id_cat">
                                                        </div>
                                                        <div class="input-box">
                                                            <span class="details">Nombre <span style="color: red;">*</span></span>
                                                            <input type="text" name ="catnombre" placeholder="Nombre" id="catnombre">
                                                        </div>
                                                        <div class="input-box">
                                                            <span class="details">Descripción<span style="color: red;">*</span> </span>
                                                            <input type="text" name ="catdescripcion" placeholder="Descripción" id="catdescripcion">
                                                        </div>
                                                        <div class="input-box">
                                                            <span class="details">Estado<span style="color: red;">*</span></span>
                                                            <select name="catestado" id="catestado">
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
        <script src="JS/poupcategoria.js" type="text/javascript"></script>
    </body>
</html>
