/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

var selectedProveedor = null;
var selectedUsuario = null;

function inputsProveedor() {
    var selectProveedor = document.getElementById("selectProveedor");
    var provSeleccionado = selectProveedor.options[selectProveedor.selectedIndex];
    selectedProveedor = {
        nombre: provSeleccionado.getAttribute("data-nombre"),
        representante: provSeleccionado.getAttribute("data-representante"),
        direccion: provSeleccionado.getAttribute("data-direccion"),
        correo: provSeleccionado.getAttribute("data-correo")
    };
    document.getElementById("pronombre").value = selectedProveedor.nombre;
    document.getElementById("prorepresentante").value = selectedProveedor.representante;
    document.getElementById("prodireccion").value = selectedProveedor.direccion;
    document.getElementById("procorreo").value = selectedProveedor.correo;
}


function inputsProductos() {
    var selectProducto = document.getElementById("selectProducto");
    var prodSeleccionado = selectProducto.options[selectProducto.selectedIndex];
    var descripcion = prodSeleccionado.getAttribute("data-descripcion");
    document.getElementById("prod_descripcion").value = descripcion;
    var precio = prodSeleccionado.getAttribute("data-precio");
    document.getElementById("prodprecio").value = precio;
    var stock = prodSeleccionado.getAttribute("data-stock");
    document.getElementById("prodstock_disp").value = stock;
}

//select2
$(document).ready(function() {
  $('.select2').select2();
});
$(document).ready(function() {
  $('.select3').select2();
});
$(document).ready(function() {
  $('.select4').select2();
});
