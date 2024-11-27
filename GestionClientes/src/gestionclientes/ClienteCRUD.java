/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package gestionclientes;



import javax.swing.JOptionPane;
import modelo.Cliente;


/**
 *
 * @author Cetecom
 */
public class ClienteCRUD {

   public static void agregarCliente(Cliente cliente){
       JOptionPane.showMessageDialog(null, "Cliente: " + cliente.getnombre() + "agregado.");
    }
   
   public static void actualizarCliente(String rut, String nombre, String contacto, String direccion){
       JOptionPane.showMessageDialog(null, "Cliente con rut: " + rut + "actualizado.");
    }
  
   public static void eliminarCliente(String rut){
       JOptionPane.showMessageDialog(null, "Cliente con rut: " + rut + "eliminado.");
    }
   
   public static void listarCliente(){
      
       String clientes = "1. Dilan Silva\n2. Insaggi Fuentes\n3 Insaggi Silva";
       JOptionPane.showMessageDialog(null, "Cliente registrados: \n " + clientes);
    }
}