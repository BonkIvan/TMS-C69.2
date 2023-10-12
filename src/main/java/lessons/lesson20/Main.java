package lessons.lesson20;

import com.mysql.jdbc.Driver;

import java.sql.DriverManager;
import java.sql.SQLException;

public class Main {

    public static void main(String[] args) {


        try{
            Driver driver = new com.mysql.jdbc.Driver();
            DriverManager.registerDriver(driver);


        } catch (SQLException e) {
            System.err.println("Driver hasn't started");
            throw new RuntimeException(e);
        }


    }

}
