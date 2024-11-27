/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.DriverManager;



/**
 *
 * @author Cetecom
 */
public class ConexionBaseDeDatos {
    
    public static Connection getConexion(){
        try {
            return DriverManager.getConnection("jdbc:mysql://localhost3306/dilanfuentes", "root", "");
        }catch (SQLException e){
            System.out.println("ERROR al conectar con la base de datos: " + e.getMessage());
            return null;
        }
    }
}
