<%-- 
    Document   : prueba
    Created on : 9/04/2023, 12:38:11 AM
    Author     : Alexander
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Inicio de Sesion</title>
        <link href="CSS/stylelogin.css" rel="stylesheet" type="text/css"/>
        <link href="https://fonts.googleapis.com/css?family=Poppins:600&display=swap" rel="stylesheet">
        <script src="https://kit.fontawesome.com/a81368914c.js"></script>
        <meta name="viewport" content="width=device-width, initial-scale=1">
<style>
    .imagenes-flotantes {
        display: flex;
        flex-wrap: wrap;
        justify-content: space-between;
        animation: floatAnimation 3s ease-in-out infinite; /* Animación de flotación */
    }

    .imagenes-flotantes img {
        width: 30%;
        height: auto;
        margin-bottom: 10px;
    }

    @keyframes floatAnimation {
        0% {
            transform: translateX(0);
        }
        50% {
            transform: translateX(-10px);
        }
        100% {
            transform: translateX(0);
        }
    }
</style>


    </head>
    <body>
    <img class="wave" src="ASSETS/wave.png" alt=""/>
    <div class="container">
        <div class="img">
            <!-- Imágenes flotantes -->
            <div class="imagenes-flotantes">
                <img src="ASSETS/fotoelectricos1.jpg" alt=""/>
                <img src="ASSETS/fotoelectricos2.jpg" alt=""/>
                <img src="ASSETS/fotoselectricos3.jpg" alt=""/>
            </div>
            <!-- Fin de las imágenes flotantes -->
        </div>
        <div class="login-content">
            <form method="post" action="usuario">
                <img src="ASSETS/logo_web.png" alt=""/>
                    <h2 class="title">Bienvenido</h2>
                    <div class="input-div one">
                        <div class="i">
                            <i class="fas fa-user"></i>
                        </div>
                        <div class="div">
                            <h5>Documento</h5>
                            <input class="input" type="text" name="id_usuario" required>
                        </div>
                    </div>
                    <div class="input-div pass">
                        <div class="i"> 
                            <i class="fas fa-lock"></i>
                        </div>
                        <div class="div">
                            <h5>Contraseña</h5>
                            <input class="input"type="Password" name="usupassword"required>
                        </div>
                    </div>
                    <a href="recuperacionContraseña.jsp">Olvidé mi contraseña</a>
                    <button class="btn">Iniciar Sesion</button>
                    <input type ="hidden" name="opcion" value ="3">
                    <%
                                if (request.getAttribute("mensajeError") != null) {%>
                    ${mensajeError}

                    <%} else {%>
                    ${mensajeExito}
                    <%}%>
                </form>
            </div>
        </div>
        <script src="JS/login.js" type="text/javascript"></script>
    </body>

</html>
