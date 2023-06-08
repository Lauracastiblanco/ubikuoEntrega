<%-- 
    Document   : consultarcotizacion
    Created on : 7/06/2023, 10:04:29 PM
    Author     : diego
--%>

<%@ page import="java.util.ArrayList" %>
<%@ page import="ModeloVO.consultcotizacionVO" %>
<%@ page import="com.google.gson.Gson" %>

<%@page import="ModeloDAO.ConsultcotizacionDAO"%>
<%@page import="java.util.Date"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="menuVendedor.jsp" %>

<!DOCTYPE html>
<html>
    <head>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Usuarios</title>
        <!--------------------- Iconos ------------------------------->
        <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/boxicons@latest/css/boxicons.min.css">
        <!--------------------- Select ------------------------------->
        <link href="https://cdnjs.cloudflare.com/ajax/libs/select2/4.0.13/css/select2.min.css" rel="stylesheet" />
        <script src="https://code.jquery.com/jquery-3.6.0.min.js"></script>
        <!--<script src="https://cdnjs.cloudflare.com/ajax/libs/select2/4.0.13/js/select2.min.js"></script>-->
        <!--------------------- Estilos ------------------------------->
        <link href="CSS/stylepopup.css" rel="stylesheet" type="text/css"/>
        <link href="CSS/principal.css" rel="stylesheet" type="text/css"/>
        <link href="CSS/pedido.css" rel="stylesheet" type="text/css"/>
    </head>
    <body>
        <section class="main">
            <div class="dash-content pedido">
                <div class="overview">
                    <div class="title">
                        <span class="text">Cotizacion</span>
                    </div>
                    <div class="boxes">
                        <div class="box box1">
                            <a style="text-decoration:none" href="CrearCotizacion1.jsp">
                                <button class="open-popup" data-popup="popup1"><i class='bx bxs-plus-circle registrar'></i></button>
                                <span class="text">Nueva Cotizacion</span>
                            </a>

                        </div>
                        <div class="box box3">

                            <i class='bx bxs-report activos'></i>
                            <span class="text">Cotizaciones</span>
                        </div>
                        <div class="box box2">
                            <i class='bx bxs-user-check activos' ></i>
                            <span class="number">10</span>
                            <span class="text">Pendiente</span>
                        </div>
                    </div>
                </div>
                <div id="customers" class="table-data">
                    <div class="order">
                        <div class="head">
                            <h3>Últimas Cotizaciones</h3>
                            <div class="buscar">
                                <input type="text" id="buscador" name="id_prov" class="buscar__input" placeholder="Buscar">
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
                                    <th>N°Cotizacion</th>
                                    <th>N°documento</th>
                                    <th>Cliente</th>
                                    <th>Usuario</th>
                                    <th>Fecha</th>
                                    <th>Total</th>
                                    <th>Estado</th>
                                </tr>
                            </thead>
                            <tbody id="tablaCotizaciones">
                                <% ConsultcotizacionDAO ccotDAO = new ConsultcotizacionDAO();
                                    ArrayList<consultcotizacionVO> listaCotizaciones = ccotDAO.listarCot();
                                    for (consultcotizacionVO cotizacion : listaCotizaciones) {%>
                                <tr class="daticos">
                                    <td><%= cotizacion.getNcotizacion()%></td>
                                    <td><%= cotizacion.getDcumentocli()%></td>
                                    <td><%= cotizacion.getCliente()%></td>
                                    <td><%= cotizacion.getUsuario()%></td>
                                    <td><%= cotizacion.getFecha()%></td>
                                    <td><%= cotizacion.getCtotal()%></td>
                                    <td><%= cotizacion.getEstado()%></td>
                                </tr>
                                <% }%>
                            </tbody>
                        </table>
                    </div>
                </div>

            </div>
        </div>
    </section>
    <script src="JS/agregaProducto.js" type="text/javascript"></script>
    <script src="JS/pedidoproveedor.js" type="text/javascript"></script>
    <script src="JS/buscador.js" type="text/javascript"></script>
    <script src="JS/popup.js" type="text/javascript"></script>
    <script>
        const inputBuscador = document.getElementById('buscador');
        const selectEstado = document.getElementById('estado');
        const tablaCotizaciones = document.getElementById('tablaCotizaciones');
        const listaCotizaciones = <%= new Gson().toJson(listaCotizaciones)%>;
        inputBuscador.addEventListener('input', filtrarCotizaciones);
        selectEstado.addEventListener('change', filtrarCotizaciones);
        function filtrarCotizaciones() {
        const filtroDocumento = inputBuscador.value.toLowerCase();
        const filtroEstado = selectEstado.value.toLowerCase();
        const filtradas = listaCotizaciones.filter(cotizacion = > {
        const documento = cotizacion.Dcumentocli.toLowerCase();
        const estado = cotizacion.estado.toLowerCase();
        if (filtroDocumento && !documento.includes(filtroDocumento)) {
        return false;
        }

        if (filtroEstado && estado !== filtroEstado) {
        return false;
        }

        return true;
        });
        mostrarCotizacionesFiltradas(filtradas);
        }

        function mostrarCotizacionesFiltradas(cotizaciones) {
        tablaCotizaciones.innerHTML = '';
        cotizaciones.forEach(cotizacion = > {
        const row = document.createElement('tr');
        row.classList.add('daticos');
        row.innerHTML = `
                < td >${cotizacion.Ncotizacion} < /td>
                < td >${cotizacion.Dcumentocli} < /td>
                < td >${cotizacion.cliente} < /td>
                < td >${cotizacion.usuario} < /td>
                < td >${cotizacion.fecha} < /td>
                < td >${cotizacion.Ctotal} < /td>
                < td >${cotizacion.estado} < /td>
                `;
        tablaCotizaciones.appendChild(row);
        });
        }
    </script>


</script>

</body>
</html>
