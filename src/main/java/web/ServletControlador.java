package web;

import datos.ClienteDao;
import dominio.Producto;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet("/ServletControlador")
public class ServletControlador extends HttpServlet {

    @Override

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //String productos="hooola";
        List<Producto> productos = new ClienteDao().Select();
        System.out.println(productos);
        request.setAttribute("productos", productos);
        request.getRequestDispatcher("clientes.jsp").forward(request, response);
    }

}
