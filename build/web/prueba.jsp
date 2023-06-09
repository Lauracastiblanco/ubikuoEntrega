<%-- 
    Document   : Proveedor
    Created on : 26/04/2023, 07:56:00 AM
    Author     : APRENDIZ
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page import="java.util.List"%>
<%@page import="ModeloVO.productosVO"%>
<%@page import="ModeloDAO.productosDAO"%>
<%@page import="java.util.Date"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@page import="java.util.ArrayList"%>
<%@page import="ModeloDAO.ProveedorDAO"%>
<%@page import="ModeloVO.ProveedorVO"%>
<%@include file="menuVendedor.jsp" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Usuarios</title>
        <!--------------------- Iconos ------------------------------->
        <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/boxicons@latest/css/boxicons.min.css">
        <!--------------------- Select ------------------------------->
        <link href="https://cdnjs.cloudflare.com/ajax/libs/select2/4.0.13/css/select2.min.css" rel="stylesheet" />
        <script src="https://code.jquery.com/jquery-3.6.0.min.js"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/select2/4.0.13/js/select2.min.js"></script>

        <!--------------------- Estilos ------------------------------->
        <link href="CSS/stylepopup.css" rel="stylesheet" type="text/css"/>
        <link href="CSS/principal.css" rel="stylesheet" type="text/css"/>
        <link href="CSS/prueba.css" rel="stylesheet" type="text/css"/>
    </head>
    <body>
        <section class="main">
            <div class="dash-content">
                <div class="overview">
                    <div class="title">
                        <span class="text">Crear Pedido Proveedor</span>
                    </div>
                </div>
                <div class="container">
                    <form method="post" action="DetallesPedidoProveedor" >
                        <div class="caja1">
                            <h4>Datos Generales</h4>
                            <div class="datos-usu">
                                <% SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
                                    Date currentDate = new Date();
                                    String currentDateStr = dateFormat.format(currentDate);
                                %>
                                <div class="box-container">
                                    <label>Fecha</label>
                                    <input type="date" value="<%= currentDateStr%>" readonly>
                                </div>
                                <div class="box-container">
                                    <label>Usuario</label>
                                    <select name="id_usuario" id="id_usuario">
                                        <option value="">Selccione...</option>
                                        <option value="1">Laura Castiblanco</option>
                                        <option value="1074414468">Luisa Toquica</option>
                                    </select>
                                </div>
                            </div>
                            <h4>Datos Proveedor</h4>
                            <div class="datos-prov">
                                <div class="box-container">
                                    <label>NIT</label>
                                    <input type="number" placeholder="Identificación" name="id_prov" value="${provVO.id_prov}">
                                </div>
                                <div class="box-container">
                                    <button class="buttonProd">Buscar</button>
                                    <input type="hidden" name="opcion" value="3">
                                </div>
                                <div class="box-container">
                                    <label>Nombre</label>
                                    <input type="text" placeholder="Nombre" name="pronombre" value="${provVO.pronombre}" disabled>
                                </div>
                                <div class="box-container">
                                    <label>Representante</label>
                                    <input type="text" placeholder="Representante" name="prorepresentante" value="${provVO.prorepresentante}" disabled>
                                </div>
                                <div class="box-container">
                                    <label>Direccion</label>
                                    <input type="text" placeholder="Direccion" name="prodireccion" value="${provVO.prodireccion}" disabled>
                                </div>
                                <div class="box-container">
                                    <label>Correo Electronico</label>
                                    <input type="text" placeholder="Correo Electronico" name="procorreo" value="${provVO.procorreo}" disabled>
                                </div>
                            </div>
                        </div>
                        <br>
                        <h4 class="titulo-prod">Productos</h4>
                        <div class="caja2">
                            <div class="productos">
                                <h4>Datos Producto</h4>
                                <div class="datos-usu">
                                    <div class="box-container">
                                        <label>Referencia</label>
                                        <input type="text" placeholder="Identificación" name="id_prod" value="${prodVO.id_prod}">
                                    </div>
                                    <div class="box-container">
                                        <button class="buttonProd">Buscar</button>
                                        <input type="hidden" name="opcion" value="4">
                                    </div>
                                    <div class="box-container">
                                        <label>Precio</label>
                                        <input type="number" placeholder="Precio" name="prodprecio" value="${prodVO.prodprecio}">
                                    </div>
                                    <div class="box-container">
                                        <label>Stock</label>
                                        <input type="number" placeholder="Stock" name="prodstock_disp" value="${prodVO.prodstock_disp}">
                                    </div>
                                    <div class="box-container">
                                        <label>Cantidad</label>
                                        <input type="number" placeholder="Cantidad" name="dpro_cantidad" >
                                    </div>
                                    <div class="box-container">
                                        <button class="buttonProd">Agregar Producto</button>
                                        <input type="hidden" name="opcion" value="1">
                                    </div>
                                </div>
                            </div>
                        </div>

                        <br>
                        <h4>Lista de Productos</h4>
                        <table class="tabla1">
                            <thead>
                                <tr>    
                                    <td>Item</td>
                                    <th>Id Producto</th>
                                    <th>Nombre</th>
                                    <th>Cantidad</th>
                                    <th>Precio Unitario</th>
                                    <th>Sub Total</th>
                                    <th>Acciones</th>
                                </tr>
                            </thead>
                            <tbody>
                                <c:forEach var="detalle" items="${listaProductos}">
                                    <tr>
                                        <td>${detalle.item}</td>
                                        <td>${detalle.dpro_id_producto}</td>
                                        <td>${detalle.descripcionProducto}</td>
                                        <td>${detalle.dpro_cantidad}</td>
                                        <td>${detalle.dpro_preciocompra}</td>
                                        <td>${detalle.dpro_subtotal}</td>
                                        <td>Acciones</td>
                                    </tr>
                                </c:forEach>
                            </tbody>
                        </table>
                        <button class="generar-pedido">Generar Pedido</button>
                        <input type="hidden" name="opcion" value="2">
                    </form>
                </div>
            </div>
        </section>
        <script src="JS/pedidoproveedor.js" type="text/javascript"></script>
        <script src="JS/buscador.js" type="text/javascript"></script>
        <script src="JS/popup.js" type="text/javascript"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/select2/4.0.13/js/select2.min.js"></script>
    </body>
</html>