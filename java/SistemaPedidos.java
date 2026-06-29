import java.sql.*;

public class SistemaPedidos {

    static String url = "jdbc:mysql://localhost:3306/empresa_db";
    static String usuario = "root";
    static String password = "admin";

    public static void mostrarProductos() {

        try(Connection con =
                    DriverManager.getConnection(url, usuario, password);
            Statement stmt = con.createStatement();
            ResultSet rs =
                    stmt.executeQuery("SELECT * FROM productos")) {

            System.out.println("\nPRODUCTOS");

            while(rs.next()) {
                System.out.printf("%-5d %-25s %.2f\n",
                        rs.getInt("id_producto"),
                        rs.getString("nombre"),
                        rs.getDouble("precio"));
            }

        } catch(Exception e) {
            e.printStackTrace();
        }
    }

    public static void mostrarPedidos() {

        String sql =
                "SELECT u.nombre, p.nombre AS producto, pe.fecha " +
                        "FROM pedidos pe " +
                        "INNER JOIN usuarios u ON pe.id_usuario=u.id_usuario " +
                        "INNER JOIN productos p ON pe.id_producto=p.id_producto";

        try(Connection con =
                    DriverManager.getConnection(url, usuario, password);
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(sql)) {

            System.out.println("\nPEDIDOS");

            while(rs.next()) {

                System.out.printf("%-20s %-25s %-10s\n",
                        rs.getString("nombre"),
                        rs.getString("producto"),
                        rs.getDate("fecha"));
            }

        } catch(Exception e) {
            e.printStackTrace();
        }
    }

    public static void pedidosPorUsuario(int idUsuario) {

        String sql =
                "SELECT p.nombre AS producto, pe.fecha " +
                        "FROM pedidos pe " +
                        "INNER JOIN productos p " +
                        "ON pe.id_producto=p.id_producto " +
                        "WHERE pe.id_usuario=?";

        try(Connection con =
                    DriverManager.getConnection(url, usuario, password);
            PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setInt(1,idUsuario);

            ResultSet rs = ps.executeQuery();

            System.out.println("\nPedidos usuario " + idUsuario);

            while(rs.next()) {

                System.out.printf("%-25s %-10s\n",
                        rs.getString("producto"),
                        rs.getDate("fecha"));
            }

        } catch(Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {

        mostrarProductos();
        mostrarPedidos();

        pedidosPorUsuario(1);
        pedidosPorUsuario(2);
        pedidosPorUsuario(3);
    }
}