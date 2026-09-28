import java.sql.Connection;
import java.sql.DriverManager;
public class Conexao {
    public static Connection getConnection() {
        try {
            String url = "jdbc:mysql: //localhost:3306/cadastro";
            String user = "RAFAEL_5088"; // Meu user da etec
            String password = "Rd61619015112023"; // Minha senha de user da etec
            return DriverManager.getConnection(url, user, password);
        } catch (Exception e) {
            throw new RuntimeException("Erro na conexão: " + e.getMessage());
        }
    }
}
