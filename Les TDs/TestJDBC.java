package employees;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class TestJDBC {
    public static final String DATABASE_NAME = "employees";
    public static final String DATABASE_SERVER = "localhost";
    public static final String DATABASE_USER_ID = "root";
    public static final String DATABASE_PASSWORD = "";

    public static final String connection_url = "jdbc:mysql://" + DATABASE_SERVER + "/" + DATABASE_NAME;
    
    Connection connection = null;
    Statement statement = null;
    ResultSet resultSet = null;
    
    public void afficherListeEmployes() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection(Config.connection_url, Config.DATABASE_USER_ID, Config.DATABASE_PASSWORD);
            
            statement = connection.createStatement();
            resultSet = statement.executeQuery("SELECT * FROM employees");
            while (resultSet.next()){
                System.out.println(resultSet.getString("full_name") + " - " + resultSet.getDouble("salary"));
            }
        } catch (SQLException ex) {
            System.out.println("The following error has occured: " + ex.getMessage());
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(TestJDBC.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                resultSet.close();
                statement.close();
                connection.close();
            } catch (Exception e) {
                
            }
        }
    }
    
    public int ajouterEmploye(String nom, String sexe, String departement, String position, String salaire){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection(Config.connection_url, Config.DATABASE_USER_ID, Config.DATABASE_PASSWORD);
            
            statement = connection.createStatement();
            int i = statement.executeUpdate("INSERT INTO employees (full_name, gender, department, position, salary) VALUES ("+nom+","+sexe+","+departement+","+position+","+salaire+")");
            return i;
        } catch (SQLException ex) {
            System.out.println("The following error has occured: " + ex.getMessage());
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(TestJDBC.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                resultSet.close();
                statement.close();
                connection.close();
            } catch (Exception e) {
                
            }
        }
        return -1;
    }
}
