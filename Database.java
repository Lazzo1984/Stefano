package com.javatpoint.util;
import java.sql.Connection;
import java.sql.DriverManager;

public class Database {
	public static Connection getConnection() {
        try  {
            Class.forName("org.postgresql.Driver");
            Connection con = DriverManager.getConnection
                    ("dbc:postgresql://localhost:5432/MissioniProva/prodotti",
                    "postgres","Stefano");
            return con;
        }
        catch(Exception ex) {
            System.out.println("Database.getConnection() Error -->" + ex.getMessage());
            return null;
        }
    }

     public static void close(Connection con) {
        try  {
            con.close();
        }
        catch(Exception ex) {
        }
    }
}
