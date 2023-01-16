
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Listado de Productos</title>
    </head>
    <body>
        <h1>Listado de productos</h1>
        
       <table border="1">
            <tr>
              <th>ID</th>
              <th>NOMBRE</th>
              <th>PRECIO</th>
            </tr>
            <c:forEach var="producto" items="${productos}">
           <tr>
            <td>${producto.id}</td>
            <td>${producto.nombre}</td>
            <td>${producto.precio}</td>
           </tr>  
            
            </c:forEach>
    </table>

    </body>
</html>
