package com.homework.week1.project;

import java.math.BigDecimal;
import java.sql.*;

// Top level classes cannot be static
public class SampleSingleton {

    private static Connection conn = null;

    private static SampleSingleton instance = null;

    // to prevent new instances from being created
    private SampleSingleton() {};

    // prevent instance from being created more then once
    public static SampleSingleton getInstance() {
        if (instance == null) {
            synchronized (SampleSingleton.class) {
                if (instance == null) {
                    instance = new SampleSingleton();
                }
            }
        }
        return instance;
    }


    public static void databaseQuery(BigDecimal input) {
        // Catch connection errors
        try {
            conn = DriverManager.getConnection("url of database");
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery("select id from table");
            BigDecimal x = new BigDecimal("0");
            while(rs.next()) {
                // To prevent overflow use appropriate casting
                x = BigDecimal.valueOf( rs.getInt(1) ).multiply( input );
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            // better way?
            try{
                conn.close(); // Close DB connection
            } catch (SQLException e) {
               e.printStackTrace();
            }
        }
    }
}
