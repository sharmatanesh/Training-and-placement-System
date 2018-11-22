
import java.sql.*;
import javax.swing.*;
public class Connect {
Connection con=null;
public static Connection ConnectDB(){
    
               try{
           
          Class.forName("com.mysql.jdbc.Driver");
         Connection con = DriverManager.getConnection("jdbc:mysql://localhost/tps_db","root","root");
          return con;
            
        }catch(ClassNotFoundException | SQLException e){
            JOptionPane.showMessageDialog(null, e);
            return null;
    
    }      
}
}
