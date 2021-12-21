/*
 Write a program that should connect mysql database and create a table
named student(id,name,rollno,address) in that database and insert one data
into that table.
 */
package lab10;

import java.sql.*;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
public class Q5 {
    
    public static void main(String arg[]) throws ClassNotFoundException {
        Q5 db = new Q5();
        try {
            Connection con =  connect();
//            db.createTable(con);
              db.insertData(con);
        } catch (SQLException ex) {
            Logger.getLogger(Q5.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

     
    public static Connection connect() throws ClassNotFoundException, SQLException {
         Class.forName("com.mysql.jdbc.Driver");
         String connectionUrl = "jdbc:mysql://localhost:3306/students";
         String user = "root";
         String password = "";
         Connection con = DriverManager.getConnection(connectionUrl, user,password);
         System.out.println("connected to db");
         return con;
    }
    
    private void createTable (Connection con) throws SQLException {
        String sql = "CREATE TABLE std ( id INT NOT NULL AUTO_INCREMENT PRIMARY KEY, name varChar(50), roll_no integer, address varchar(50))";
        Statement st = con.createStatement();
        st.executeUpdate(sql);
    }
    
    public void getAllData(Connection con) throws SQLException{
        String sql = "SELECT * FROM std";
        Statement statement = con.createStatement();
        ResultSet data = statement.executeQuery(sql);
        int count = 0;
        while(data.next()) {
            System.out.println("----------------------------------------------------------------------------");
            System.out.println("ID: "+ data.getInt("id"));
            System.out.println("Name: " + data.getString("name"));
            System.out.println("Roll no: "+ data.getInt("roll_no"));
            System.out.println("Address: " + data.getString("address"));
            System.out.println("----------------------------------------------------------------------------");
        }
    }
    
    public void insertData(Connection con) throws SQLException{
        Scanner input = new Scanner(System.in);
         
        System.out.print("Name: ");
        String name = input.nextLine();
        System.out.print("roll no: ");
        int roll = Integer.parseInt(input.nextLine());
        System.out.print("address: ");
        String address = input.nextLine();
        String sql = "INSERT INTO std(name, roll_no, address) VALUES(?,?,?)";
        PreparedStatement ps = con.prepareStatement(sql);
         
        ps.setString(1, name);
        ps.setInt(2, roll);
        ps.setString(3, address);
        int rows = ps.executeUpdate();
        if(rows>0)
            System.out.print(rows + "-- record inserted");
        getAllData(con);
    }
    
}
