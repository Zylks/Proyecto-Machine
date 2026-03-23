import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Main {
    public static void main(String[] args) {

        String url = "jdbc:postgresql://localhost:5432/app_viajes";
        String usuario = "postgres";
        String contrasena = "MAR.mar.003.";

        System.out.println("Iniciando el gestor de presupuesto de viaje...");

        try {
            Connection conexion = DriverManager.getConnection(url, usuario, contrasena);
            
            if (conexion != null) {
                System.out.println("¡Éxito! Conectado correctamente a PostgreSQL.");
                System.out.println("La base de datos 'app_viajes' está lista para recibir datos.");

                conexion.close();
            }
        } catch (SQLException e) {
            System.out.println("Ocurrió un error al intentar conectar con la base de datos:");
            e.printStackTrace();
        }
    }
}