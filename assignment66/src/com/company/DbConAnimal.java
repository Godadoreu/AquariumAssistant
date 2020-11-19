package com.company;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class DbConAnimal {
    private static DbConAnimal singleton;
    private Connection conn;
    String url = "jdbc:mysql://localhost:3306/animals?serverTimezone=UTC";
    String username = "root";
    String password = "";
    private DbConAnimal() {
        try{
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection(url, username, password);
        }
        catch (Exception ex) {
            System.out.println("Connection failed");

            System.out.println(ex);
        }
    }
    public static DbConAnimal getInstance(){
        if (singleton==null){
            singleton= new DbConAnimal();
        }
        return singleton;
    }

    public Connection getConn() {
        return conn;
    }


}
