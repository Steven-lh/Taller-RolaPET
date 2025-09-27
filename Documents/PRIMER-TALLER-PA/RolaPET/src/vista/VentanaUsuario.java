/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vista;

import java.awt.*;
import javax.swing.*;

/**
 *
 * @author Steven
 */
public class VentanaUsuario {

    private CardLayout tarjetas;
    private JPanel panel, panelSuperior, panelBienvenida, panelMenu, panelVehiculos;
    private JButton botonVehiculos, botonProveedores, botonPerfil, botonEventos, botonAmigos, botonAgregarVehiculo;
    private GridBagConstraints gbcVehiculos;

    JFrame frameUsuario = new JFrame("RolaPET");

    public VentanaUsuario() {

        // Ventana usuarios
        frameUsuario.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frameUsuario.setSize(800, 600);
        frameUsuario.setResizable(false);

        // Panel bienvenida
        panelBienvenida = new JPanel();
        panelBienvenida.add(new JLabel("Panel de Usuario - RolaPET."));
        frameUsuario.add(panelBienvenida);

        // Panel menú
        panelMenu = new JPanel();
        botonVehiculos = new JButton("Mis vehiculos");
        botonProveedores = new JButton("Proveedores");
        botonAmigos = new JButton("Mis amigos");
        botonPerfil = new JButton("Mi perfil");
        botonEventos = new JButton("Eventos");
        panelMenu.add(botonVehiculos);
        panelMenu.add(botonProveedores);
        panelMenu.add(botonAmigos);
        panelMenu.add(botonPerfil);
        panelMenu.add(botonEventos);

        // Panel Superior
        panelSuperior = new JPanel(new BorderLayout());
        panelSuperior.add(panelBienvenida, BorderLayout.NORTH);
        panelSuperior.add(panelMenu, BorderLayout.CENTER);

        // Tarjetas tipos menú
        tarjetas = new CardLayout();
        panel = new JPanel(tarjetas);

        //  Tarjeta 'Mis vehiculos'
        panelVehiculos = new JPanel(new GridBagLayout());
        gbcVehiculos = new GridBagConstraints();
        gbcVehiculos.insets = new Insets(5, 5, 5, 5);
        gbcVehiculos.fill = GridBagConstraints.HORIZONTAL;

        // Titulo
        gbcVehiculos.gridx = 0;
        gbcVehiculos.gridy = 0;
        panelVehiculos.add(new JLabel("Mis vehiculos"), gbcVehiculos);

        // Texto tipo-marca-modelo-opciones
        gbcVehiculos.gridx = 0;
        gbcVehiculos.gridy = 1;
        panelVehiculos.add(new JLabel("Tipo"), gbcVehiculos);
        
        gbcVehiculos.gridx = 1;
        gbcVehiculos.gridy = 1;
        panelVehiculos.add(new JLabel("Marca"), gbcVehiculos);
        
        gbcVehiculos.gridx = 2;
        gbcVehiculos.gridy = 1;
        panelVehiculos.add(new JLabel("Modelo"), gbcVehiculos);
        
        gbcVehiculos.gridx = 3;
        gbcVehiculos.gridy = 1;
        panelVehiculos.add(new JLabel("Opciones"), gbcVehiculos);
        
        gbcVehiculos.gridx = 0;
        gbcVehiculos.gridy = 2;
        botonAgregarVehiculo = new JButton("Agregar vehiculo");
        panelVehiculos.add(botonAgregarVehiculo, gbcVehiculos);
        
        

        panel.add(panelVehiculos, "vehiculos");

        frameUsuario.setLayout(new BorderLayout());
        frameUsuario.add(panelSuperior, BorderLayout.NORTH);

        frameUsuario.getContentPane().add(panel, BorderLayout.CENTER);
        frameUsuario.setVisible(true);
    }

    public JButton getBotonVehiculos() {
        return botonVehiculos;
    }

    public void mostrarVehiculos() {
        tarjetas.show(panel, "vehiculos");
    }

    public JButton getBotonProveedores() {
        return botonProveedores;
    }

    public void mostrarProveedores() {
        tarjetas.show(panel, "proveedores");
    }

    public JButton getBotonPerfil() {
        return botonPerfil;
    }

    public JButton getBotonEventos() {
        return botonEventos;
    }

    public JButton getBotonAmigos() {
        return botonAmigos;
    }
    
    public JButton getBotonAgregarVehiculo(){
        return botonAgregarVehiculo;
    }

}
