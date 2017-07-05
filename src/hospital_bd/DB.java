package hospital_bd;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DB {

   private final static String bd = "Hospital";
   private final static String login = "root";
   private final static String password = "12345678";
   private final static String host = "localhost";
   private final static String url = "jdbc:mysql://" + host + "/"+bd;

    public static Connection getConnection(){
        try{
            Class.forName("com.mysql.jdbc.Driver");         
            Connection conn = DriverManager.getConnection(url,login,password);
            if (conn!=null){
                System.out.println("Conectado a la base de datos ["+bd+"]");
            }
            return conn;
        }catch(SQLException e){
            System.err.println(e.getMessage());
        } catch (ClassNotFoundException ex) {
            System.err.println(ex.getMessage());
        }
        return null;
    }
}

