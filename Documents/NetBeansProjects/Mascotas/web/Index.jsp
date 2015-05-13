<%-- 
    Document   : Index
    Created on : 12/05/2015, 07:06:45 PM
    Author     : DANIEL
--%>

<%@page import="java.sql.Connection"%>
<%@page import="PaqueteConexion.DBConexion"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
      <% 
        DBConexion mysql = new DBConexion();
        Connection conn = mysql.Conectar();

        String confirmar = "No se ha podigo establecer la conexion";

        if (conn != null) {
            confirmar = "Conectado";
        }
     %>


<button type="button" onclick="alert('<%= confirmar %>')">Probar conexión</button>
       
    </body>
</html>
