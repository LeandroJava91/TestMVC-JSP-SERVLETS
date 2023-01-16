package datos;

import dominio.Producto;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ClienteDao {

    private static final String JDBC_SELECT = "SELECT id, nombre, precio FROM productos";

    public List<Producto> Select() {
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        List<Producto> productos = new ArrayList<>();
        Producto prod = null;

        try {
            conn = Conexion.getConnection();
            stmt = conn.prepareStatement(JDBC_SELECT);
            rs = stmt.executeQuery();

            while (rs.next()) {
                int id = rs.getInt("id");
                String nombre = rs.getString("nombre");
                int precio = rs.getInt("precio");

                prod = new Producto(id, nombre, precio);

                productos.add(prod);

            }

        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        /*} finally {
            try {
                Conexion.close(rs);
                Conexion.close(stmt);
                Conexion.close(conn);
            } catch (SQLException ex) {
                ex.printStackTrace(System.out);
            }*/
        }
        return productos;

    }

}
