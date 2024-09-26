import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {
		private static final String DB_NAME = System.getenv("DB_DATABASE");
    private static final String URL = "jdbc:mysql://localhost:3306/" + DB_NAME;
    private static final String USER = "root"; // Substitua pelo seu usuário
    private static final String PASSWORD = System.getenv("DB_ROOT_PASSWORD"); // Substitua pela sua senha

    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }
}