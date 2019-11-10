package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class engine {
    //Конфигурация для базы данных
    private static final String url = "jdbc:mysql://localhost:3306/test";
    private static final String user = "root";
    private static final String password = "root";

    //Объекты для управления с JDBC
    private static Connection con;
    private static Statement stmt;
    private static ResultSet rs;

    public static void main(String args[]) {

    }
}
