package DAL;
import java.sql.Connection;
import java.sql.*;

/**
 *
 * @author Windows.lite
 */
public class ModuloConexao {

    public static Connection conector() {

        java.sql.Connection conexao = null;

        String driver = "com.mysql.cj.jdbc.Driver";
        String url = "jdbc:mysql://localhost:3306/segnoturno";
        String user = "root";
        String password = "";

        try {
            Class.forName(driver);
            conexao = DriverManager.getConnection(url, user, password);
            return conexao;
        } catch (Exception e) {
        System.out.println(e);
        }
        {
            return null;
        }
    }
}
