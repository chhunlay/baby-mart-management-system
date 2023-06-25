
package connections;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;


public class MyConnections {
    public static final String username = "root"; 
    public static final String password = "admin";
    public static final String url = "jdbc:mysql://localhost:3306/baby_mart_management_systems";
    public static Connection con = null;
    
    public static Connection getConnection() throws SQLException{
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection(url, username, password);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ""+ex, "",JOptionPane.WARNING_MESSAGE);
        }
        return con;  
    }
}
