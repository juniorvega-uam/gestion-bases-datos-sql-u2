import java.sql.*;

public class ConexionBD {

    public static void main(String[] args) {

        String url = "jdbc:mysql://localhost:3306/empresa_db";
        String usuario = "root";
        String password = "admin";

        Connection con = null;
        Statement stmt = null;
        ResultSet rs = null;

        try {

            con = DriverManager.getConnection(url, usuario, password);

            stmt = con.createStatement();

            rs = stmt.executeQuery(
                    "SELECT id_producto, nombre, precio FROM productos"
            );

            while(rs.next()) {

                System.out.println(
                        rs.getInt("id_producto") + " - " +
                                rs.getString("nombre") + " - " +
                                rs.getDouble("precio")
                );
            }

        } catch(Exception e) {

            System.out.println("Error: " + e.getMessage());

        } finally {

            try {
                if(rs != null) rs.close();
                if(stmt != null) stmt.close();
                if(con != null) con.close();
            } catch(Exception e) {
                e.printStackTrace();
            }
        }
    }
}