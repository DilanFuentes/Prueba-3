/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vista;

import Modelo.Cliente;
import GestionClientes.ClientesCRUD;
import gestionclientes.ClienteCRUD;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;



public class VentanaPrin extends JFrame{
    
    JTextField rutField, nombreField, contactoField, direccionField;
    JButton agregarButton, limpiarButton, actualizarButton, eliminarButton, listarButton;
    
    public VentanaPrin(){
        setTitle("Gestion de clientes");
        setSize(350,300);
        setLayout(new FlowLayout());
        
        rutField = new JTextField(25);
        nombreField = new JTextField(25);
        contactoField = new JTextField(25);
        direccionField = new JTextField(25);

        agregarButton = new JButton("Agregar cliente");
        limpiarButton = new JButton("Limpiar");
        actualizarButton = new JButton("Actualizar cliente");
        eliminarButton = new JButton("EliminarCliente");
        listarButton = new JButton("Listar clientes"); 
        
        add(new JLabel ("Rut: "));
        add(rutField);
        add(new JLabel ("Nombre: "));
        add(nombreField);
        add(new JLabel ("Contacto: "));
        add(contactoField);
        add(new JLabel ("Direccion: "));
        add(direccionField);
        add(agregarButton);
        add(limpiarButton);
        add(actualizarButton);
        add(eliminarButton);
        add(listarButton);
        
        agregarButton.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                String rut = rutField.getText();
                String nombre = nombreField.getText();
                String contacto = contactoField.getText();
                String direccion = direccionField.getText();
                
                if (!rut.isEmpty() && !nombre.isEmpty() && !contacto.isEmpty() && !direccion.isEmpty()){
                    JOptionPane.showMessageDialog(null, "Cliente agregado: " + nombre);
                }else{
                    JOptionPane.showMessageDialog(null, "Porfavor complete todos los campos requeriodos");
                }
            }
        });
        
        limpiarButton.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                rutField.setText("");
                nombreField.setText("");
                contactoField.setText("");
                direccionField.setText("");
            }
        });

        actualizarButton.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent e){
                    String rut = rutField.getText();
                    String nombre = nombreField.getText();
                    String contacto = contactoField.getText();
                    String direccion = direccionField.getText();

                    if (!rut.isEmpty() && !nombre.isEmpty() && !contacto.isEmpty() && !direccion.isEmpty()){
                        ClienteCRUD.actualizarCliente(rut, nombre, contacto, direccion);
                    }else{
                        JOptionPane.showMessageDialog(null, "Porfavor complete todos los campos requeriodos");
                    }
                }
            });
    
        eliminarButton.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent e){
                    String rut = rutField.getText();
                    
                    if (!rut.isEmpty()){
                        ClienteCRUD.eliminarCliente(rut);
                    }else{
                        JOptionPane.showMessageDialog(null, "Porfavor complete todos los campos requeriodos");
                    }
                }
            });

        listarButton.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent e){

                ClienteCRUD.listarCliente(); 
        }
    });
    }
   
    public static void main(String[] args){
        new VentanaPrin().setVisible(true);
    }
}
