/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vista;

import java.awt.*;
import javax.swing.*;
import modelo.Usuario;
import modelo.ModeloDatos;

/**
 *
 * @author Steven
 */
public class VentanaUsuario {

    private CardLayout tarjetas;
    private JPanel panel, panelSuperior, panelBienvenida, panelMenu, panelVehiculos, panelFormulario, panelPerfil, panelProveedores, panelEventos, panelAmigos, panelListaAgregables, panelAmigosAgregados;
    private JButton botonVehiculos, botonProveedores, botonPerfil, botonEventos, botonAmigos, botonAgregarVehiculo, botonAgregar, botonAgregarForm, botonCancelarForm, botonSalir;
    private GridBagConstraints gbcVehiculos, gbcNVehiculoForm, gbcPerfil, gbcProveedores, gbcAmigos, gbcEventos;
    private JTextField textMarca, textModelo;
    private JLabel lblErrorCampoForm, lblCampoForm, tituloPerfil, tituloVehiculos, tituloProveedores, tituloEventos, tituloAmigos,tituloSugerencias, tituloBienvenida, JLabel, lblNombre, lblEmail, lblRolaPET, lblIdentificacion, lblTelefono;
    private JComboBox<String> comboVehiculo;
    private Font titulos;

    JFrame frameUsuario = new JFrame("RolaPET - Usuario");

    public VentanaUsuario(Usuario usuarioLogueado, ModeloDatos modelo) {

        //Fuente para todos los titulos de las tarjetas
        titulos = new Font("Arial", Font.BOLD, 20);

        // Ventana usuarios
        frameUsuario.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frameUsuario.setSize(800, 600);
        frameUsuario.setResizable(false);

        // Panel bienvenida
        panelBienvenida = new JPanel();
        tituloBienvenida = new JLabel("Panel de Usuario - RolaPET.");
        tituloBienvenida.setFont(titulos);
        panelBienvenida.add(tituloBienvenida);
        frameUsuario.add(panelBienvenida);

        // Panel menú
        panelMenu = new JPanel();
        botonPerfil = new JButton("Mi perfil");
        botonAmigos = new JButton("Mis amigos");
        botonVehiculos = new JButton("Mis vehiculos");
        botonProveedores = new JButton("Proveedores");
        botonEventos = new JButton("Eventos");
        botonSalir = new JButton("Salir");
        panelMenu.add(botonPerfil);
        panelMenu.add(botonAmigos);
        panelMenu.add(botonVehiculos);
        panelMenu.add(botonProveedores);
        panelMenu.add(botonEventos);
        panelMenu.add(botonSalir);

        // Panel Superior
        panelSuperior = new JPanel(new BorderLayout());
        panelSuperior.add(panelBienvenida, BorderLayout.NORTH);
        panelSuperior.add(panelMenu, BorderLayout.CENTER);

        // Tarjetas tipos menú
        tarjetas = new CardLayout();
        panel = new JPanel(tarjetas);

        // Tarjeta 'Mi perfil'
        panelPerfil = new JPanel(new GridBagLayout());
        gbcPerfil = new GridBagConstraints();
        gbcPerfil.insets = new Insets(5, 5, 5, 5);
        gbcPerfil.fill = GridBagConstraints.HORIZONTAL;

        gbcPerfil.gridx = 0;
        gbcPerfil.gridy = 0;
        tituloPerfil = new JLabel("Datos personales.");
        tituloPerfil.setFont(titulos);
        panelPerfil.add(tituloPerfil, gbcPerfil);

        gbcPerfil.gridx = 0;
        gbcPerfil.gridy = 1;
        panelPerfil.add(new JLabel("Nombre completo: "), gbcPerfil);
        gbcPerfil.gridx = 1;
        gbcPerfil.gridy = 1;
        lblNombre = new JLabel(usuarioLogueado.getNombreCompleto());
        panelPerfil.add(lblNombre, gbcPerfil);

        gbcPerfil.gridx = 0;
        gbcPerfil.gridy = 2;
        panelPerfil.add(new JLabel("E-mail: "), gbcPerfil);
        gbcPerfil.gridx = 1;
        gbcPerfil.gridy = 2;
        lblEmail = new JLabel(usuarioLogueado.getEmail());
        panelPerfil.add(lblEmail, gbcPerfil);

        gbcPerfil.gridx = 0;
        gbcPerfil.gridy = 3;
        panelPerfil.add(new JLabel("ID Rola-PET: "), gbcPerfil);
        gbcPerfil.gridx = 1;
        gbcPerfil.gridy = 3;
        lblRolaPET = new JLabel(usuarioLogueado.getId_rola());
        panelPerfil.add(lblRolaPET, gbcPerfil);

        gbcPerfil.gridx = 0;
        gbcPerfil.gridy = 4;
        panelPerfil.add(new JLabel("Número de identificación: "), gbcPerfil);
        gbcPerfil.gridx = 1;
        gbcPerfil.gridy = 4;
        lblIdentificacion = new JLabel(usuarioLogueado.getIdentificacion());
        panelPerfil.add(lblIdentificacion, gbcPerfil);

        gbcPerfil.gridx = 0;
        gbcPerfil.gridy = 5;
        panelPerfil.add(new JLabel("Número de teléfono: "), gbcPerfil);
        gbcPerfil.gridx = 1;
        gbcPerfil.gridy = 5;
        lblTelefono = new JLabel(usuarioLogueado.getNumeroTel());
        panelPerfil.add(lblTelefono, gbcPerfil);
        
        // Tarjeta 'Mis amigos'
        panelAmigos = new JPanel(new BorderLayout());
        gbcAmigos = new GridBagConstraints();
        gbcAmigos.insets = new Insets(5, 5, 5, 5);
        gbcAmigos.fill = GridBagConstraints.HORIZONTAL;
        
        panelAmigosAgregados = new JPanel(new BorderLayout());
        gbcAmigos.gridx = 0; gbcAmigos.gridy = 0;
        tituloAmigos = new JLabel("Mis amigos.");
        tituloAmigos.setFont(titulos);
        panelAmigosAgregados.add(tituloAmigos, BorderLayout.NORTH);
        
        panelListaAgregables = new JPanel(new BorderLayout());
        gbcAmigos.gridx = 0; gbcAmigos.gridy = 0;
        tituloSugerencias = new JLabel("Sugerencias de amistad.");
        tituloSugerencias.setFont(titulos);
        panelListaAgregables.add(tituloSugerencias, BorderLayout.NORTH );
        
        JSplitPane panelDividido = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT, panelAmigosAgregados, panelListaAgregables);
        panelDividido.setDividerLocation(350);
        panelDividido.setEnabled(false); 
        
        panelAmigos.add(panelDividido, BorderLayout.CENTER);
        
        //  Tarjeta 'Mis vehiculos'
        panelVehiculos = new JPanel(new GridBagLayout());
        gbcVehiculos = new GridBagConstraints();
        gbcVehiculos.insets = new Insets(5, 5, 5, 5);
        gbcVehiculos.fill = GridBagConstraints.HORIZONTAL;

        // Titulo
        gbcVehiculos.gridx = 0;
        gbcVehiculos.gridy = 0;
        tituloVehiculos = new JLabel("Mis vehiculos");
        tituloVehiculos.setFont(titulos);
        panelVehiculos.add(tituloVehiculos, gbcVehiculos);

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
        gbcVehiculos.gridwidth = 4;
        botonAgregarVehiculo = new JButton("Agregar vehiculo");
        panelVehiculos.add(botonAgregarVehiculo, gbcVehiculos);

        // Formulario nuevo vehiculo
        panelFormulario = new JPanel(new GridBagLayout());
        gbcNVehiculoForm = new GridBagConstraints();
        gbcNVehiculoForm.insets = new Insets(5, 5, 5, 5);
        gbcNVehiculoForm.fill = GridBagConstraints.HORIZONTAL;

        // Tipo vehiculo
        gbcNVehiculoForm.gridx = 0;
        gbcNVehiculoForm.gridy = 0;
        panelFormulario.add(new JLabel("Tipo de vehículo"), gbcNVehiculoForm);
        gbcNVehiculoForm.gridx = 1;
        gbcNVehiculoForm.gridy = 0;
        String[] tiposVehiculo = {"Scooter", "Moto"};
        comboVehiculo = new JComboBox<>(tiposVehiculo);
        panelFormulario.add(comboVehiculo, gbcNVehiculoForm);

        // Marca
        gbcNVehiculoForm.gridx = 0;
        gbcNVehiculoForm.gridy = 1;
        panelFormulario.add(new JLabel("Marca"), gbcNVehiculoForm);
        gbcNVehiculoForm.gridx = 1;
        gbcNVehiculoForm.gridy = 1;
        textMarca = new JTextField(10);
        panelFormulario.add(textMarca, gbcNVehiculoForm);

        // Modelo 
        gbcNVehiculoForm.gridx = 0;
        gbcNVehiculoForm.gridy = 2;
        panelFormulario.add(new JLabel("Modelo"), gbcNVehiculoForm);
        gbcNVehiculoForm.gridx = 1;
        gbcNVehiculoForm.gridy = 2;
        textModelo = new JTextField(10);
        panelFormulario.add(textModelo, gbcNVehiculoForm);

        // Mensaje de error campo
        gbcNVehiculoForm.gridx = 0;
        gbcNVehiculoForm.gridy = 3;
        gbcNVehiculoForm.gridwidth = 2;
        lblErrorCampoForm = new JLabel("");
        lblErrorCampoForm.setForeground(Color.RED);
        lblErrorCampoForm.setHorizontalAlignment(SwingConstants.CENTER);
        panelFormulario.add(lblErrorCampoForm, gbcNVehiculoForm);

        // Confirmación vehiculo agregado
        gbcNVehiculoForm.gridx = 0;
        gbcNVehiculoForm.gridy = 4;
        gbcNVehiculoForm.gridwidth = 2;
        lblCampoForm = new JLabel("");
        lblCampoForm.setForeground(Color.GREEN);
        lblCampoForm.setHorizontalAlignment(SwingConstants.CENTER);
        panelFormulario.add(lblCampoForm, gbcNVehiculoForm);

        // Botón agregar vehiculo en el form
        gbcNVehiculoForm.gridx = 0;
        gbcNVehiculoForm.gridy = 5;
        gbcNVehiculoForm.gridwidth = 2;
        gbcNVehiculoForm.anchor = GridBagConstraints.CENTER;
        botonAgregarForm = new JButton("Confirmar");
        panelFormulario.add(botonAgregarForm, gbcNVehiculoForm);

        // Botón cancelar agregar vehiculo
        gbcNVehiculoForm.gridx = 0;
        gbcNVehiculoForm.gridy = 6;
        gbcNVehiculoForm.gridwidth = 2;
        gbcNVehiculoForm.anchor = GridBagConstraints.CENTER;
        botonCancelarForm = new JButton("Cancelar");
        panelFormulario.add(botonCancelarForm, gbcNVehiculoForm);

        // Tarjeta proveedores
        panelProveedores = new JPanel(new GridBagLayout());
        gbcProveedores = new GridBagConstraints();
        gbcProveedores.insets = new Insets(5, 5, 5, 5);
        gbcProveedores.fill = GridBagConstraints.CENTER;

        tituloProveedores = new JLabel("Proveedores y Servicios.");
        tituloProveedores.setFont(titulos);
        panelProveedores.add(tituloProveedores, gbcProveedores);

        panel.add(panelProveedores, "proveedores");
        panel.add(panelVehiculos, "vehiculos");
        panel.add(panelFormulario, "form-vehiculos");
        panel.add(panelPerfil, "perfil");
        panel.add(panelAmigos, "amigos");

        frameUsuario.setLayout(new BorderLayout());
        frameUsuario.add(panelSuperior, BorderLayout.NORTH);

        frameUsuario.getContentPane().add(panel, BorderLayout.CENTER);
        frameUsuario.setVisible(true);
    }

    public JButton getBotonVehiculos() {
        return botonVehiculos;
    }

    public void mostrarPerfil() {
        tarjetas.show(panel, "perfil");
    }

    public void mostrarVehiculos() {
        tarjetas.show(panel, "vehiculos");
    }

    public void mostrarProveedoresl() {
        tarjetas.show(panel, "proveedores");
    }

    public void mostrarEventos() {
        tarjetas.show(panel, "eventos");
    }
    
    public void mostrarAmigos(){
        tarjetas.show(panel, "amigos");
    }

    public void cancelarAgregar() {
        tarjetas.show(panel, "vehiculos");
    }

    public void cerrarVentana() {
        frameUsuario.dispose();
    }

    public JButton getCancelarAgregar() {
        return botonCancelarForm;
    }

    public void mostrarFormVehiculos() {
        tarjetas.show(panel, "form-vehiculos");
    }

    public JButton getBotonAgregarForm() {
        return botonAgregarForm;
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

    public JButton getBotonAgregarVehiculo() {
        return botonAgregarVehiculo;
    }

    public JButton getBotonAgregar() {
        return botonAgregar;
    }

    public JTextField getTextMarca() {
        return textMarca;
    }

    public JTextField getTextModelo() {
        return textModelo;
    }

    public JLabel getLblErrorCampoForm() {
        return lblErrorCampoForm;
    }

    public JLabel getLblCampoForm() {
        return lblCampoForm;
    }

    public JButton getBotonSalir() {
        return botonSalir;
    }

    public void limpiarCampos() {
        textMarca.setText("");
        textModelo.setText("");
        comboVehiculo.setSelectedIndex(0);
        lblErrorCampoForm.setText("");
    }

}
