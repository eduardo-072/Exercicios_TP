import java.sql.Connection;
import java.sql.DriverManager;

public class ConexaoPostgres {
    public static void main(String[] args) {
        String url = "jdbc:postgresql://localhost:5432/bd_api";
        String user = "eduardosilvaaa072"; // usuário que você usa no PgAdmin
        String password = "Dudu_2006";

        try (Connection conn = DriverManager.getConnection(url, user, password)) {
            System.out.println("Conexão bem-sucedida!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}