package briliana.florist.Koneksi;
import com.mysql.cj.jdbc.MysqlDataSource;
import java.sql.Connection;
import java.sql.SQLException;

public class Koneksi_floristDB {
    static Connection con;
    
    public static Connection connection(){
        
        if(con == null){
            MysqlDataSource data = new MysqlDataSource();
            data.setDatabaseName("brilianaflorist");
            data.setUser("root");
            data.setPassword("");
            try{
                con = (Connection) data.getConnection();
            } catch (SQLException ex){
                ex.printStackTrace();
            }
        }
        
        return con;
    }
}
