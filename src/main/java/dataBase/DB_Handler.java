package dataBase;

import java.sql.*;

public class DB_Handler {



        String connectionUrl = "jdbc:mysql://localhost:3306/shop";
        String user = "";
        String pass = "";

        Connection connection;
        public DB_Handler() {

            try {
                connection = DriverManager.getConnection(connectionUrl, user, pass);


                System.out.println("Connection successful.");


            } catch (SQLException e) {
                e.printStackTrace();
                System.out.println("Error connecting to database");
            }
        }
    public Connection getConnection(){
        return connection;
    }


}




