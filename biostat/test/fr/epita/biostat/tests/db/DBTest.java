package fr.epita.biostat.tests.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DBTest {

    public static void main(String[] args) throws SQLException {
        Connection connection = DriverManager.getConnection("jdbc:h2:mem:test");

        System.out.println(connection.getSchema());

        PreparedStatement createTableStatement = connection.prepareStatement("""
                CREATE TABLE BIOSTATS (
                    name varchar(255), 
                    sex char, 
                    age int
                )                                                            
                """);
        createTableStatement.execute();

        PreparedStatement insertStatement = connection.prepareStatement("""
                                INSERT INTO BIOSTATS(name, sex, age) VALUES ('thomas', 'M', 39)
                """);

        insertStatement.execute();


    }
}
