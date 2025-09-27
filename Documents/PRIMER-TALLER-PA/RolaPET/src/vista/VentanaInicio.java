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
public class VentanaInicio {
    private CardLayout tarjeta;
    private JPanel panel;
    private JButton botonLogin, botonRegistro, botonIngresar, botonCrear;
    private JPasswordField textoRContraseña, textoLContraseña, textoRConfirmar;
    private JTextField textoRUsuario, textoLUsuario, textoRNombre, textoRIdentificacion, textoRNumeroTel, textoRRolaPET, textoRMarca, textoRModelo;
    private JLabel lblError, lblErrorCampo;
            
    JFrame frameInicio = new JFrame("RolaPET");

    
    
    public VentanaInicio(){
        
    // Creación de la ventana donde irá el inicio de sesion.
    frameInicio.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frameInicio.setSize(600, 500);
    frameInicio.setLocationRelativeTo(null);
    frameInicio.setResizable(false);
    
    // Botones para seleccionar login o registro
    JPanel botonesInicio = new JPanel(new GridBagLayout());
    // Botón inicio sesión
    GridBagConstraints gbcBotonLogin = new GridBagConstraints();
    gbcBotonLogin.insets = new Insets(5, 5, 5, 5);
    gbcBotonLogin.fill = GridBagConstraints.HORIZONTAL;
    
    gbcBotonLogin.gridx = 0; gbcBotonLogin.gridy = 1;
    gbcBotonLogin.gridwidth = 2;
    gbcBotonLogin.anchor = GridBagConstraints.CENTER;
    botonLogin = new JButton("Iniciar Sesión");
    botonesInicio.add(botonLogin, gbcBotonLogin);
    
    //Botón registrarse
    GridBagConstraints gbcBotonRegistro = new GridBagConstraints();
    gbcBotonRegistro.insets = new Insets(5, 5, 5, 5);
    gbcBotonRegistro.fill = GridBagConstraints.HORIZONTAL;
    
    gbcBotonRegistro.gridx = 0; gbcBotonRegistro.gridy = 2;
    gbcBotonRegistro.gridwidth = 2;
    gbcBotonRegistro.anchor = GridBagConstraints.CENTER;
    botonRegistro = new JButton("Registrarse");
    botonesInicio.add(botonRegistro, gbcBotonRegistro);

    // Esto permitirá el cambio de tarjetas
    tarjeta = new CardLayout();
    panel = new JPanel(tarjeta);
    
    // Creación de los paneles de registro e inicio de sesión
    
    // Panel login
    JPanel panelLogin = new JPanel(new GridBagLayout());
    
    // Instancia para organizar filas y columnas
    GridBagConstraints gbcLogin = new GridBagConstraints();
    gbcLogin.insets = new Insets(5, 5, 5, 5); // margen interno
    gbcLogin.fill = GridBagConstraints.HORIZONTAL;

    // Usuario
    gbcLogin.gridx = 0; gbcLogin.gridy = 0;
    panelLogin.add(new JLabel("Usuario"), gbcLogin);
    gbcLogin.gridx = 1; gbcLogin.gridy = 0;
    textoLUsuario = new JTextField(10);
    panelLogin.add(textoLUsuario, gbcLogin);

    // Contraseña
    gbcLogin.gridx = 0; gbcLogin.gridy = 1;
    panelLogin.add(new JLabel("Contraseña"), gbcLogin);
    gbcLogin.gridx = 1; gbcLogin.gridy = 1;
    textoLContraseña = new JPasswordField(10);
    panelLogin.add(textoLContraseña, gbcLogin);

    // Botón centrado
    gbcLogin.gridx = 0; gbcLogin.gridy = 2;
    gbcLogin.gridwidth = 2;
    gbcLogin.anchor = GridBagConstraints.CENTER;
    botonIngresar = new JButton("Ingresar");
    panelLogin.add(botonIngresar, gbcLogin);
    
    // Panel registro
    JPanel panelRegistro = new JPanel(new GridBagLayout());
    // Instancia para organizar filas y columnas
    GridBagConstraints gbcReg = new GridBagConstraints();
    gbcReg.insets = new Insets(5, 5, 5, 5);
    gbcReg.fill = GridBagConstraints.HORIZONTAL;

    // Nombre
    gbcReg.gridx = 0; gbcReg.gridy = 0;
    panelRegistro.add(new JLabel("Nombre completo"), gbcReg);
    gbcReg.gridx = 1; gbcReg.gridy = 0;
    textoRNombre = new JTextField(10);
    panelRegistro.add(textoRNombre, gbcReg);

    // Número identificación
    gbcReg.gridx = 0; gbcReg.gridy = 1;
    panelRegistro.add(new JLabel("Número de identificación"), gbcReg);
    gbcReg.gridx = 1; gbcReg.gridy = 1;
    textoRIdentificacion = new JTextField(10);
    panelRegistro.add(textoRIdentificacion, gbcReg);

     // Número de teléfono
    gbcReg.gridx = 0; gbcReg.gridy = 2;
    panelRegistro.add(new JLabel("Número de teléfono"), gbcReg);
    gbcReg.gridx = 1; gbcReg.gridy = 2;
    textoRNumeroTel = new JTextField(10);
    panelRegistro.add(textoRNumeroTel, gbcReg);

    // Número registro RolaPET
    gbcReg.gridx = 0; gbcReg.gridy = 3;
    panelRegistro.add(new JLabel("Número RolaPET"), gbcReg);
    gbcReg.gridx = 1; gbcReg.gridy = 3;
    textoRRolaPET   = new JTextField(10);
    panelRegistro.add(textoRRolaPET, gbcReg);
    
     // Usuario
    gbcReg.gridx = 0; gbcReg.gridy = 4;
    panelRegistro.add(new JLabel("Usuario"), gbcReg);
    gbcReg.gridx = 1; gbcReg.gridy = 4;
    textoRUsuario   = new JTextField(10);
    panelRegistro.add(textoRUsuario, gbcReg);
    
    // Contraseña
    gbcReg.gridx = 0; gbcReg.gridy = 5;
    panelRegistro.add(new JLabel("Contraseña"), gbcReg);
    gbcReg.gridx = 1; gbcReg.gridy = 5;
    textoRContraseña = new JPasswordField();
    panelRegistro.add(textoRContraseña, gbcReg);
    
    // Contraseña confirmar
    gbcReg.gridx = 0; gbcReg.gridy = 6;
    panelRegistro.add(new JLabel("Confirmar contraseña"), gbcReg);
    gbcReg.gridx = 1; gbcReg.gridy = 6;
    textoRConfirmar = new JPasswordField(10);
    panelRegistro.add(textoRConfirmar, gbcReg);
    
    // Mensaje de error contraseña
    gbcReg.gridx = 0; gbcReg.gridy = 7;
    gbcReg.gridwidth = 2;
    lblError = new JLabel("");
    lblError.setForeground(Color.RED);
    lblError.setHorizontalAlignment(SwingConstants.CENTER);
    panelRegistro.add(lblError, gbcReg);
    
    // Tipo vehiculo
    gbcReg.gridx = 0; gbcReg.gridy = 8;
    panelRegistro.add( new JLabel("Tipo de vehículo"), gbcReg);
    gbcReg.gridx = 1; gbcReg.gridy = 8;
    String[] tiposVehiculo = {"Scooter", "Moto"};
    JComboBox<String> comboVehiculo = new JComboBox<>(tiposVehiculo);
    panelRegistro.add(comboVehiculo, gbcReg);

    // Marca
    gbcReg.gridx = 0; gbcReg.gridy = 9;
    panelRegistro.add(new JLabel("Marca"), gbcReg);
    gbcReg.gridx = 1; gbcReg.gridy = 9;
    textoRMarca = new JTextField(10);
    panelRegistro.add(textoRMarca, gbcReg);

    // Modelo 
    gbcReg.gridx = 0; gbcReg.gridy = 10;
    panelRegistro.add(new JLabel("Modelo"), gbcReg);
    gbcReg.gridx = 1; gbcReg.gridy = 10;
    textoRModelo = new JTextField(10);
    panelRegistro.add(textoRModelo, gbcReg);
    
    // Mensaje de error campo
    gbcReg.gridx = 0; gbcReg.gridy = 11;
    gbcReg.gridwidth = 2;
    lblErrorCampo = new JLabel("");
    lblErrorCampo.setForeground(Color.RED);
    lblErrorCampo.setHorizontalAlignment(SwingConstants.CENTER);
    panelRegistro.add(lblErrorCampo, gbcReg);

    // Botón centrado
    gbcReg.gridx = 0; gbcReg.gridy = 12;
    gbcReg.gridwidth = 2;
    gbcReg.anchor = GridBagConstraints.CENTER;
    botonCrear = new JButton("Crear Cuenta");
    panelRegistro.add(botonCrear, gbcReg);
    
    // Se agregan ambos paneles con su respectiva 'clave'
    panel.add(panelLogin, "login");
    panel.add(panelRegistro, "registro");
    
    // Se agregan los paneles y su ubicación.
    frameInicio.setLayout(new BorderLayout()); // Metodo para la posición de los paneles.
    frameInicio.add(botonesInicio, BorderLayout.NORTH);
    frameInicio.getContentPane().add(panel,BorderLayout.CENTER);
    
    JSplitPane panelMitades = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT, botonesInicio, panel);
    
    frameInicio.getContentPane().add(panelMitades);
    panelMitades.setDividerLocation(150); // ancho lado izquierdo
    panelMitades.setResizeWeight(0.2);
    panelMitades.setEnabled(false);
        
    frameInicio.setVisible(true);
    }
    
    public void mostrarLogin() {
        tarjeta.show(panel, "login");
    }

    public void mostrarRegistro() {
        tarjeta.show(panel, "registro");
    }
    
    public JButton getBotonLogin() {
        return botonLogin;
    }

    public JButton getBotonRegistro() {
        return botonRegistro;
    }
    
    public JButton getBotonCrear() {
        return botonCrear;
    }

    public JPasswordField getTextoRContraseña() {
        return textoRContraseña;
    }

    public JPasswordField getTextoRConfirmar() {
        return textoRConfirmar;
    }

    public JLabel getLblError() {
        return lblError;
    }
    
    public JLabel getLblErrorCampo(){
        return lblErrorCampo;
    }

    public JTextField getTextoRNombre() {
        return textoRNombre;
    }

    public JTextField getTextoRIdentificacion() {
        return textoRIdentificacion;
    }

    public JTextField getTextoRNumeroTel() {
        return textoRNumeroTel;
    }

    public JTextField getTextoRRolaPET() {
        return textoRRolaPET;
    }

    public JTextField getTextoRUsuario() {
        return textoRUsuario;
    }

    public JTextField getTextoRMarca() {
        return textoRMarca;
    }

    public JTextField getTextoRModelo() {
        return textoRModelo;
    }
}
