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
            
    JFrame frame = new JFrame("RolaPET");

    
    
    public VentanaInicio(){
        
    // Creación de la ventana donde irá el inicio de sesion.
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setSize(400, 400);
    frame.setLocationRelativeTo(null);
    frame.setResizable(false);
    
    // Botones para seleccionar login o registro
    JPanel botonesInicio = new JPanel(new FlowLayout(FlowLayout.CENTER, 20, 10));
    botonLogin = new JButton("Iniciar Sesión");
    botonRegistro = new JButton("Registrarse");
    botonesInicio.add(botonLogin);
    botonesInicio.add(botonRegistro);
    
    
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
    panelLogin.add(new JTextField(10), gbcLogin);

    // Contraseña
    gbcLogin.gridx = 0; gbcLogin.gridy = 1;
    panelLogin.add(new JLabel("Contraseña"), gbcLogin);
    gbcLogin.gridx = 1; gbcLogin.gridy = 1;
    panelLogin.add(new JPasswordField(10), gbcLogin);

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
    panelRegistro.add(new JLabel("Nombre"), gbcReg);
    gbcReg.gridx = 1; gbcReg.gridy = 0;
    panelRegistro.add(new JTextField(10), gbcReg);

    // Apellido
    gbcReg.gridx = 0; gbcReg.gridy = 1;
    panelRegistro.add(new JLabel("Apellido"), gbcReg);
    gbcReg.gridx = 1; gbcReg.gridy = 1;
    panelRegistro.add(new JTextField(10), gbcReg);

    // Usuario
    gbcReg.gridx = 0; gbcReg.gridy = 2;
    panelRegistro.add(new JLabel("Usuario"), gbcReg);
    gbcReg.gridx = 1; gbcReg.gridy = 2;
    panelRegistro.add(new JTextField(10), gbcReg);

    // Contraseña
    gbcReg.gridx = 0; gbcReg.gridy = 3;
    panelRegistro.add(new JLabel("Contraseña"), gbcReg);
    gbcReg.gridx = 1; gbcReg.gridy = 3;
    panelRegistro.add(new JPasswordField(10), gbcReg);

    // Botón centrado
    gbcReg.gridx = 0; gbcReg.gridy = 4;
    gbcReg.gridwidth = 2;
    gbcReg.anchor = GridBagConstraints.CENTER;
    botonCrear = new JButton("Crear Cuenta");
    panelRegistro.add(botonCrear, gbcReg);
    
    // Se agregan ambos paneles con su respectiva 'clave'
    panel.add(panelLogin, "login");
    panel.add(panelRegistro, "registro");
    
    // Se agregan los paneles y su ubicación.
    frame.setLayout(new BorderLayout()); // Metodo para la posición de los paneles.
    frame.add(botonesInicio, BorderLayout.NORTH);
    frame.getContentPane().add(panel,BorderLayout.CENTER);
    
    frame.setVisible(true);
    
    
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
    
}
