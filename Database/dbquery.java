/*
Example of how to do an SQL query

Mauro Masciadro
Masciar®
*/

import java.sql.Connection;
import java.sql.Statement;
import java.sql.DriverManager;

class dbquery {
    private final static String drv = "com.mysql.jdbc.Driver";
    private final static String db = "jdbc:mysql://localhost:1122";
    private final static String user = "user";
    private final static String pass = "password";
    private Connection ct;
    private Statement st;

    public void connect() {
        try {
            Class.forName(drv);
            ct = DriverManager.getConnection(db, user, pass);
            st = ct.createStatement();
            System.out.println("Connected");

            st.close();
            ct.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public void insertData() {
        try {
            Class.forName(drv);
            ct = DriverManager.getConnection(db, user, pass);
            st = ct.createStatement();

            String insert = "INSERT INTO `Account` (`Name`) VALUES ( 'Mauro');";
            //String insertTextField = "INSERT INTO `Account` (`Name`) VALUES ('" + txtName.getText() + "')";
            String delete = "DELETE FROM `Account` WHERE id = 1;";
            String createTable = "CREATE TABLE `Account` ( `Name` varchar(45) DEFAULT NULL";
            
            st.executeUpdate(insert); //Example: execute insert

            st.close();
            ct.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public static void main(String[] args) {
        connect app = new connect();
    }
}
