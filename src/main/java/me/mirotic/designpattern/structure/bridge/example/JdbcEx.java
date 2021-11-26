package me.mirotic.designpattern.structure.bridge.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;


public class JdbcEx {

    public static void main(String[] args) throws ClassNotFoundException {
        Class.forName("org.h2.Driver");

        try (Connection conn = DriverManager.getConnection("url", "username", "password")) {
            String sql =
                    "CREATE TABLE  ACCOUNT " +
                    "(id INTEGER NOT NULL, " +
                    " email VARCHAR(50), " +
                    " password VARCHAR(200), " +
                    " PRIMARY KEY (id))";

            Statement statement = conn.createStatement();
            statement.execute(sql);

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

}
