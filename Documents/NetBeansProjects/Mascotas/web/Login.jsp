<%-- 
    Document   : Login
    Created on : 12/05/2015, 05:18:02 PM
    Author     : DANIEL
--%>


<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="css/foundation.css" type="css/text">
        <link rel="stylesheet" href="css/Style.css" type="css/text">
        <link rel="shortcut icon" type="image/x-icon" href="Img/favicon.png">
        <title>Inicar Sesión</title>
    </head>
    <body>
        <form action="#" id="login-form">
            <div class="heading">Inicio de Sesión</div>
            <div class="left">
                <label for="email">Email</label> <br />
                <input type="email" name="email" id="email" /> <br />
                <label for="password">Contraseña</label> <br />
                <input type="password" name="password" id="pass" /> <br />
                <input type="submit" value="Login" name="Entrar" />
                
            </div>
            <div class="right">
                <div class="connect">Conectar con</div>
                <a href="" class="facebook">
                    <span class="fontawesome-facebook"></span>
                </a> <br />
                <a href="" class="twitter">
                    <span class="fontawesome-twitter"></span>
                </a> <br />
                <a href="" class="google-plus">
                    <span class="fontawesome-google-plus"></span>
                </a>
            </div>
        </form>  
    </body>
</html>
