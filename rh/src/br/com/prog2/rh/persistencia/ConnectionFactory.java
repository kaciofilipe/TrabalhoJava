package br.com.prog2.rh.persistencia;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.*;
import java.util.Properties;

public class ConnectionFactory {

    //    Connection object with JDBC database
    private static Connection conn = null;

    //    method that provides the database connection
    public static Connection getConnection() {

        if (conn == null) {
        	
            try {
                Properties props = loadProperties();
                String url = props.getProperty("dburl");
                System.out.println(props);
                conn = DriverManager.getConnection(url, props);
                
            } catch (SQLException e) {	
                throw new DbException(e.getMessage());
            }
        }
        return conn;
    }

//    Closes the database connection
    public static void closeConnection(){
        if (conn != null) {
            try {
                conn.close();
            } catch (SQLException e) {
                throw new DbException(e.getMessage());
            }

        }
    }

    //    Loads the properties from db.properties file of the project root through Properties object based class
    private static Properties loadProperties() {
        try (FileInputStream fs = new FileInputStream("db.properties")) {

            Properties props = new Properties();

            props.load(fs);

            return props;
        } catch (IOException e) {
            throw new DbException(e.getMessage());
        }
    }

    public static void closeStatement(Statement st) {
        if (st != null) {
            try {
                st.close();
            } catch (SQLException e) {
                throw new DbException(e.getMessage());
            }
        }
    }

    public  static void closeResultSet(ResultSet resultSet) {
        if (resultSet != null) {
            try {
                resultSet.close();
            } catch (SQLException e) {
                throw new DbException(e.getMessage());
            }
        }
    }
    
    public static void closeConnection(Connection con){
        if (con != null) {
            try {
                con.close();
            } catch (SQLException e) {
                throw new DbException(e.getMessage());
            }

        }
    }
}