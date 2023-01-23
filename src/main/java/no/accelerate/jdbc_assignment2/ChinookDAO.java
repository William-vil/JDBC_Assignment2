package no.accelerate.jdbc_assignment2;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;

@Component
public class ChinookDAO {
    /*private String url;
    private String username;
    private String password;*/
    @Value("${spring.datasource.url}")
    private String url;

    @Value("${spring.datasource.username}")
    private String username;

    @Value("${spring.datasource.password}")
    private String password;


   /* public ChinookDAO(
            @Value("${spring.datasource.url}") String url,
            @Value("${spring.datasource.username}") String username,
            @Value("${spring.datasource.password}") String password){
        this.url = url;
        this.username = username;
        this.password = password;
    }*/
    public ChinookDAO(){
        testConnection();
    }

    public void testConnection(){
        try(Connection connection = DriverManager.getConnection(url, username, password)){
            System.out.println("Connected!");
        }catch (SQLException e){
            System.out.println(e.getMessage());
        }
    }
}


