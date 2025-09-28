/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vista;

import javax.swing.*;
import java.awt.*;

/**
 *
 * @author Steven
 */
public class VentanaProveedores {

    private JButton botonPerfil, botonEventos, botonServicios, crearPublicacion, botonSalir;

    private JPanel panel, panelBienvenida, panelMenu, panelPerfil, panelEventos, panelServicios, panelSuperior;
    private CardLayout tarjetas;
    private Font titulos;
    private JLabel tituloBienvenida, tituloPerfil, tituloServicios, tituloEventos;
    private GridBagConstraints gbcServicios, gbcEventos, gbcMenu;
    private JComboBox<String> comboServiciosInsumos, comboPersonaVehiculo;
    private JTextField nombreServicio, descripcionServicio, categoria, direccion;

    JFrame frameProveedores = new JFrame("RolaPET - Proveedores");

    public VentanaProveedores() {

        titulos = new Font("Arial", Font.BOLD, 20);
        frameProveedores.setSize(800, 600);
        frameProveedores.setResizable(false);
        frameProveedores.setLocationRelativeTo(null); // Centrar ventana

        tarjetas = new CardLayout();
        panel = new JPanel(tarjetas);

        panelBienvenida = new JPanel();
        tituloBienvenida = new JLabel("Panel de Proveedor - RolaPET");
        tituloBienvenida.setFont(titulos);
        panelBienvenida.add(tituloBienvenida);

        // Panel menú
        panelMenu = new JPanel(new GridBagLayout());
        gbcMenu = new GridBagConstraints();
        gbcMenu.insets = new Insets(5, 5, 5, 5);
        gbcMenu.fill = GridBagConstraints.HORIZONTAL;

        gbcMenu.gridx = 0;
        gbcMenu.gridy = 0;
        botonPerfil = new JButton("Mi perfil");
        panelMenu.add(botonPerfil, gbcMenu);

        botonServicios = new JButton("Publicar servicios");
        gbcMenu.gridx = 1;
        gbcMenu.gridy = 0;
        panelMenu.add(botonServicios, gbcMenu);

        botonEventos = new JButton("Publicar eventos");
        gbcMenu.gridx = 2;
        gbcMenu.gridy = 0;
        panelMenu.add(botonEventos, gbcMenu);
        
        botonSalir = new JButton("salir");
        gbcMenu.gridx = 3;
        gbcMenu.gridy = 0;
        panelMenu.add(botonSalir, gbcMenu);

        panelPerfil = new JPanel(new BorderLayout()); 

        // Panel de datos del proveedor
        JPanel panelDatosIzquierda = new JPanel(new GridBagLayout());
        GridBagConstraints gbcPerfil = new GridBagConstraints(); 
        gbcPerfil.insets = new Insets(5, 5, 5, 5);
        gbcPerfil.fill = GridBagConstraints.HORIZONTAL;
        gbcPerfil.anchor = GridBagConstraints.WEST; 

        gbcPerfil.gridx = 0;
        gbcPerfil.gridy = 0;
        tituloPerfil = new JLabel("Datos del proveedor.");
        tituloPerfil.setFont(titulos);
        panelDatosIzquierda.add(tituloPerfil, gbcPerfil);

        gbcPerfil.gridx = 0;
        gbcPerfil.gridy = 1;
        panelDatosIzquierda.add(new JLabel("Nombre del proveedor: "), gbcPerfil);

        gbcPerfil.gridx = 0;
        gbcPerfil.gridy = 2;
        panelDatosIzquierda.add(new JLabel("Tipo proveedor: "), gbcPerfil);

        gbcPerfil.gridx = 0;
        gbcPerfil.gridy = 3;
        panelDatosIzquierda.add(new JLabel("E-mail: "), gbcPerfil);

        gbcPerfil.gridx = 0;
        gbcPerfil.gridy = 4;
        panelDatosIzquierda.add(new JLabel("Dirección: "), gbcPerfil);

        gbcPerfil.gridx = 0;
        gbcPerfil.gridy = 5;
        panelDatosIzquierda.add(new JLabel("Número de contacto: "), gbcPerfil);

        gbcPerfil.gridx = 0;
        gbcPerfil.gridy = 6;
        panelDatosIzquierda.add(new JLabel("ID Rola-PET: "), gbcPerfil);

        // Panel derecho
        JPanel panelPublicacionesDerecha = new JPanel(new BorderLayout());
        panelPublicacionesDerecha.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
        JLabel tituloPublicaciones = new JLabel("Mis Publicaciones Recientes");
        tituloPublicaciones.setFont(titulos);
        panelPublicacionesDerecha.add(tituloPublicaciones, BorderLayout.NORTH);
        
        // Unir ambos paneles
        JSplitPane panelDividido = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT, panelDatosIzquierda, panelPublicacionesDerecha);
        panelDividido.setDividerLocation(350);
        panelDividido.setEnabled(false); 

        panelPerfil.add(panelDividido, BorderLayout.CENTER);

        // Tarjeta 'servicios'
        panelServicios = new JPanel(new GridBagLayout());
        gbcServicios = new GridBagConstraints();
        gbcServicios.insets = new Insets(5, 5, 5, 5);
        gbcServicios.fill = GridBagConstraints.HORIZONTAL;

        gbcServicios.gridx = 0; gbcServicios.gridy = 0;
        gbcServicios.gridwidth = 2;
        tituloServicios = new JLabel("Crear servicios o insumos.");
        tituloServicios.setFont(titulos);
        panelServicios.add(tituloServicios, gbcServicios);
        
        gbcServicios.gridx = 0; gbcServicios.gridy = 1;
        gbcServicios.gridwidth = 1;
        panelServicios.add( new JLabel("Tipo de publicación"), gbcServicios);
        gbcServicios.gridx = 1; gbcServicios.gridy = 1;
        String[] tipo = {"Servicios", "Insumos"};
        comboServiciosInsumos = new JComboBox<>(tipo);
        panelServicios.add(comboServiciosInsumos, gbcServicios);
        
        gbcServicios.gridx = 0; gbcServicios.gridy = 2;
        panelServicios.add( new JLabel("Destino de la publicación"), gbcServicios);
        gbcServicios.gridx = 1; gbcServicios.gridy = 2;
        String[] destinoObjeto = {"Vehiculos", "Personas"};
        comboPersonaVehiculo = new JComboBox<>(destinoObjeto);
        panelServicios.add(comboPersonaVehiculo, gbcServicios);
        
        gbcServicios.gridx = 0; gbcServicios.gridy = 3;

        panelServicios.add(new JLabel("Nombre de la publicación"), gbcServicios);
        gbcServicios.gridx = 1; gbcServicios.gridy = 3;
        nombreServicio = new JTextField(10);
        panelServicios.add(nombreServicio, gbcServicios);
        
        gbcServicios.gridx = 0; gbcServicios.gridy = 4;
        panelServicios.add(new JLabel("Descripción de la oferta"), gbcServicios);
        gbcServicios.gridx = 1; gbcServicios.gridy = 4;
        descripcionServicio = new JTextField(15);
        panelServicios.add(descripcionServicio, gbcServicios);
        
        gbcServicios.gridx = 0; gbcServicios.gridy = 5;
        panelServicios.add(new JLabel("Categoria del servicio"), gbcServicios);
        gbcServicios.gridx = 1; gbcServicios.gridy = 5;
        categoria = new JTextField(10);
        panelServicios.add(categoria, gbcServicios);
        
        gbcServicios.gridx = 0; gbcServicios.gridy = 6;
        panelServicios.add(new JLabel("Dirección/Ubicación"), gbcServicios);
        gbcServicios.gridx = 1; gbcServicios.gridy = 6;
        direccion = new JTextField(10);
        panelServicios.add(direccion, gbcServicios);
        
        gbcServicios.gridx = 0; gbcServicios.gridy = 7;
        gbcServicios.gridwidth = 2;
        crearPublicacion =  new JButton("Crear publicación");
        panelServicios.add(crearPublicacion, gbcServicios);

        // Tarjeta 'eventos'
        panelEventos = new JPanel(new GridBagLayout());
        gbcEventos = new GridBagConstraints();
        gbcEventos.insets = new Insets(5, 5, 5, 5);
        gbcEventos.fill = GridBagConstraints.HORIZONTAL;
                
        tituloEventos = new JLabel("Eventos");
        tituloEventos.setFont(titulos);
        panelEventos.add(tituloEventos);

        // Panel superior
        panelSuperior = new JPanel(new BorderLayout());
        panelSuperior.add(panelBienvenida, BorderLayout.NORTH);
        panelSuperior.add(panelMenu, BorderLayout.CENTER);

        // Añadir las tarjetas
        panel.add(panelPerfil, "perfil");
        panel.add(panelServicios, "servicios");
        panel.add(panelEventos, "eventos"); 

        
        // Añadir paneles
        frameProveedores.add(panelSuperior, BorderLayout.NORTH);
        frameProveedores.add(panel, BorderLayout.CENTER);
        frameProveedores.setVisible(true);
    }

    public void mostrarPerfil() {
        tarjetas.show(panel, "perfil");
    }

    public void mostrarServicios() {
        tarjetas.show(panel, "servicios");
    }

    public void mostrarEventos() {
        tarjetas.show(panel, "eventos");
    }

    public JButton getBotonServicios() {
        return botonServicios;
    }

    public JButton getBotonPerfil() {
        return botonPerfil;
    }

    public JButton getBotonEventos() {
        return botonEventos;
    }
    
    public JButton getBotonSalir(){
        return botonSalir;
    }
    
    public void mostrarVentana(){
        frameProveedores.setVisible(true);
    }
    
    public void cerrarVentana(){
        frameProveedores.dispose();
    }
    
}
