<%-- 
    Document   : CrearCotizacion1
    Created on : 29/05/2023, 05:01:35 PM
    Author     : diego
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page import="ModeloVO.ClienteVO"%>
<%@page import="ModeloDAO.ClienteDAO"%>
<%@page import="java.util.Date"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@page import="ModeloVO.productosVO"%>
<%@page import="java.util.List"%>
<%@page import="ModeloVO.CategoriaVO"%>
<%@page import="ModeloDAO.CategoriaDAO"%>
<%@page import="ModeloDAO.productosDAO"%>
<%@include file="menuVendedor.jsp" %>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%
    response.setHeader("Cache-Control", "no-cache, no-store, must-revalidate");
    response.setHeader("Pragma", "no-cache");
    response.setDateHeader("Expires", 0);
%>
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
        <link href="CSS/pedido.css" rel="stylesheet" type="text/css"/>
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
        <script src="https://cdn.jsdelivr.net/npm/sweetalert2@10"></script>
    </head>
    <c:set var="lista" value="${lista}" scope="session" />
    <c:set var="item" value="${item}" scope="session" />
    <c:set var="Total" value="${total}" scope="session" />
    <%-- Mostrar SweetAlert si se registra el cliente normal exitosamente --%>
    <% String successMessage = (String) request.getAttribute("RegistroExitoso"); %>
    <% if (successMessage != null) {%>
    <script>
        Swal.fire({
            icon: 'success',
            title: 'Cotizacion generada con exito',
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
            title: 'Error',
            text: '<%= errorMessage%>'
        });
    </script>
    <% } %>

    <body >

        <section class="main">
            <form  id="cotizacion-form" method="post" action="cotizacion" autocomplete="off">
                <div class="dash-content">
                    <div class="overview">
                        <div class="title">
                            <span class="text">Crear Cotizacion</span>
                        </div>
                    </div>

                    <div class="container">

                        <div class="columna1">

                            <div class="caja1">

                                <h4>Datos Generales</h4>
                                <div class="datos-usu">
                                    <%
                                        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
                                        Date currentDate = new Date();
                                        String currentDateStr = dateFormat.format(currentDate);
                                    %>
                                    <div class="box-container">
                                        <label>Fecha</label>
                                        <input type="date" value="<%= currentDateStr%>"readonly>
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
                                <h4>Datos Cliente</h4>

                                <div class="datos-prov">
                                    <div class="datosclientes">
                                        <div style="display: flex; flex-wrap: wrap;">

                                            <div style="flex: 0 0 33.33%; max-width: 33.33%;">
                                                <label>Documento</label>
                                                <div style="display: flex; align-items: center;">
                                                    <input type="text" name="cot_id_cliente" value="${c.getId_cliente()}" autofocus> 
                                                    <button type="submit" name="accion" value="buscarcliente" class="btn btn-success">Buscar</button>
                                                </div>
                                            </div>

                                            <div style="flex: 0 0 33.33%; max-width: 33.33%;">
                                                <label>Nombre</label>
                                                <input type="text" placeholder="Nombre" value="${c.getClinombre()}" class="form-field" readonly>
                                            </div>

                                            <div style="flex: 0 0 33.33%; max-width: 33.33%;">
                                                <label>Apellido</label>
                                                <input type="text" placeholder="Apellido" value="${c.getCliapellido()}" class="form-field" readonly>
                                            </div>

                                            <div style="flex: 0 0 33.33%; max-width: 33.33%;">
                                                <label>Descripción</label>
                                                <input type="text" placeholder="Descripción" value="${c.getClidescripcion()}" class="form-field" readonly>
                                            </div>

                                            <div style="flex: 0 0 33.33%; max-width: 33.33%;">
                                                <label>Correo</label>
                                                <input type="text" placeholder="Correo" value="${c.getClicorreo()}" class="form-field" readonly>
                                            </div>

                                            <div style="flex: 0 0 33.33%; max-width: 33.33%;">
                                                <label>Dirección</label>
                                                <input type="text" placeholder="Dirección" value="${c.getClidireccion()}" class="form-field" readonly>
                                            </div>

                                            <div style="flex: 0 0 33.33%; max-width: 33.33%;">
                                                <label>Teléfono</label>
                                                <input type="text" placeholder="Teléfono" value="${c.getClitelefono()}" class="form-field" readonly>
                                            </div>

                                        </div>
                                    </div>
                                </div>

                            </div>

                            <h2>Lista de Productos</h2>
                            <table class="tabla1" id="tablaProductos">
                                <thead>
                                    <tr id="fila-${list.item}">
                                        <th>Item</th>
                                        <th>Idproducto</th>
                                        <th>Producto</th>
                                        <th>Cantidad</th>
                                        <th>Precio unitario</th>
                                        <th>Subtotal</th>
                                        <th class="action">Acciones</th>

                                    </tr>
                                </thead>
                                <tbody>

                                    <c:forEach var="list" items="${lista}" varStatus="status">
                                        <tr>
                                            <td>${list.getItem()}</td>
                                            <td>${list.getDc_id_producto()}</td>
                                            <td>${list.getNombreproductoL()}</td>
                                            <td>${list.getCantidad()}</td>
                                            <td>${list.getPrecio()}</td>
                                            <td>${list.getSubtotal()}</td>
                                            <td class="d-flex">
                                                <a class="btn btn-danger" style="margin-left: 10px" onclick="borrarProducto(${list.item})">Borrar</a>


                                            </td>
                                            <td></td>
                                        </tr>
                                    </c:forEach>
                                </tbody>
                            </table>
                            <div class="card-footer d-flex parte04">
                                <div class="col-sm-3 ml-auto">

                                    <p>Total: <span id="total">${Total}</span></p>

                                </div>

                                <div class="col-sm-6">
                                    <button type="submit" name="accion" value="generarcotizacion" class="btn btn-secondary">generar cotizacion</button>
                                    <input type="button" value="Cancelar" onclick="cancelarRegistro()" class="btn btn-danger" style="margin-left: 10px">
                                </div>

                            </div>
                        </div>

                        <div class="columna2">
                            <h3 class="titulo-prod">Productos</h3>
                            <div class="caja2">

                                <div class="productos">
                                    <div class="datosproductos">

                                        <label>Producto</label>
                                        <input type="text"  name="dc_id_prod" value="${pr.getId_prod()}"  >
                                        <button type="submit" name="accion" value="buscarproducto" class="btn btn-secondary">buscar</button>

                                        <label>Descripción</label>
                                        <input type="text" placeholder="Producto" value="${pr.getProdnombre()}"  name="nomproducto" readonly >
                                        <label>Precio</label>
                                        <input type="text" placeholder="Precio"  value="${pr.getProdprecio()}" name="precio" readonly>
                                        <label>Stock</label>
                                        <input type="text" placeholder="Stock" value="${pr. getProdstock_disp()}" name="stock" readonly>
                                        <label>Cantidad</label>
                                        <input type="text" placeholder="Cantidad" name="cantidad">

                                        <label>Foto</label>
                                        <img class="foto-prod" src="ASSETS/Breaker.png" alt=""/>
                                        <button class="btn agregar" id="agregar-btn" >Agregar al pedido</button>
                                        <input  type="hidden" name="accion" value="agregarproducto">
                                    </div>
                                </div>


                            </div>
                        </div>
                    </div>
                </div>
            </form>
        </section>

        <script src="JS/agregaProducto.js" type="text/javascript"></script>
        <script src="JS/cotizacion.js" type="text/javascript"></script>
        <script src="JS/buscador.js" type="text/javascript"></script>
        <script src="JS/popup.js" type="text/javascript"></script>
        <script src="https://code.jquery.com/jquery-3.6.0.min.js"></script>
        <script>
                                        function cancelarRegistro() {
                                            if (confirm("¿Estás seguro que deseas cancelar el registro?")) {
                                                document.getElementById("cotizacion-form").setAttribute("onsubmit", "return false;");

                                                var tablaProductos = document.getElementById("tablaProductos");
                                                if (tablaProductos) {
                                                    var tbody = tablaProductos.getElementsByTagName("tbody")[0];
                                                    while (tbody.firstChild) {
                                                        tbody.removeChild(tbody.firstChild); // Eliminar todas las filas de la tabla
                                                    }
                                                }

                                                // Llamar al controlador para cancelar el registro
                                                window.location.href = "cotizacion?accion=cancelar";
                                            }
                                        }



        </script>
        <script>
            // Función para agregar un producto a la tabla de la cotización
            function agregarProducto() {
                // Obtener los valores de los campos de producto
                var idProducto = $("input[name='dc_id_prod']").val();
                var producto = $("input[name='nomproducto']").val();
                var precio = parseFloat($("input[name='precio']").val());
                var stock = parseInt($("input[name='stock']").val());
                var cantidad = parseInt($("input[name='cantidad']").val());

                // Validar la cantidad ingresada
                if (isNaN(cantidad) || cantidad <= 0) {
                    alert("Ingrese una cantidad válida.");
                    return;
                }

                // Validar el stock disponible
                if (cantidad > stock) {
                    alert("La cantidad ingresada supera el stock disponible.");
                    return;
                }

                // Calcular el subtotal
                var subtotal = precio * cantidad;

                // Crear la nueva fila de la tabla
                var newRow =
                        "<tr>" +
                        "<td></td>" +
                        "<td>" + idProducto + "</td>" +
                        "<td>" + producto + "</td>" +
                        "<td>" + cantidad + "</td>" +
                        "<td>" + precio + "</td>" +
                        "<td>" + subtotal + "</td>" +
                        "<td class='d-flex'>" +
                        "<a class='btn btn-danger' style='margin-left: 10px' onclick='borrarProducto(this)'>Borrar</a>" +
                        "</td>" +
                        "</tr>";

                // Agregar la nueva fila a la tabla
                $("#tablaProductos tbody").append(newRow);

                // Actualizar los índices de los ítems
                actualizarIndices();

                // Calcular el nuevo total
                calcularTotal();
            }

// Función para borrar un producto de la tabla de la cotización
            function borrarProducto(button) {
                // Obtener la fila padre del botón de borrar
                var row = $(button).closest("tr");

                // Eliminar la fila de la tabla
                row.remove();

                // Actualizar los índices de los ítems
                actualizarIndices();

                // Calcular el nuevo total
                calcularTotal();
            }

// Función para actualizar los índices de los ítems en la tabla
            function actualizarIndices() {
                $("#tablaProductos tbody tr").each(function (index) {
                    $(this).find("td:first").text(index + 1);
                });
            }

// Función para calcular el total de la cotización
            function calcularTotal() {
                var total = 0.0;

                $("#tablaProductos tbody tr").each(function () {
                    var subtotal = parseFloat($(this).find("td:nth-child(6)").text());
                    total += subtotal;
                });

                $("#total").text(total);
            }

// Evento para agregar un producto al hacer clic en el botón
            $("#agregar-btn").click(function () {
                agregarProducto();
            });

// Evento para borrar un producto al hacer clic en el botón de borrar
            $(document).on("click", ".btn-danger", function () {
                borrarProducto(this);
            });
        </script>


        < /body>
        < /html>
