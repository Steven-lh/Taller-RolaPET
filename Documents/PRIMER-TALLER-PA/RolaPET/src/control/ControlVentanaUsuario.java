/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import modelo.ModeloDatos;
import modelo.Usuario;
import vista.VentanaInicio;
import vista.VentanaUsuario;

/**
 *
 * @author Steven
 */
public class ControlVentanaUsuario implements ActionListener {

    private VentanaUsuario vistaUsuario;
    private VentanaInicio vistaInicio;
    private ModeloDatos modelo;
    private Usuario usuarioLogueado;

    public ControlVentanaUsuario(VentanaUsuario vistaUsuario, VentanaInicio vistaInicio, ModeloDatos modelo, Usuario usuarioLogueado) {

        this.vistaUsuario = vistaUsuario;
        this.vistaInicio = vistaInicio;
        this.modelo = modelo;
        this.usuarioLogueado = usuarioLogueado;
        this.vistaUsuario.getBotonVehiculos().addActionListener(this);
        this.vistaUsuario.getBotonAgregarVehiculo().addActionListener(this);
        this.vistaUsuario.getCancelarAgregar().addActionListener(this);
        this.vistaUsuario.getBotonAgregarForm().addActionListener(this);
        this.vistaUsuario.getBotonPerfil().addActionListener(this);
        this.vistaUsuario.getBotonProveedores().addActionListener(this);
        this.vistaUsuario.getBotonSalir().addActionListener(this);
        this.vistaUsuario.getBotonAmigos().addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        
        if (e.getSource() == vistaUsuario.getBotonAgregarForm()) {
            if (vistaUsuario.getTextMarca().getText().trim().isEmpty()
                    || vistaUsuario.getTextModelo().getText().trim().isEmpty()) {
                vistaUsuario.getLblErrorCampoForm().setText("Todos los campos deben estar llenos.");
                return;
            } else {
                vistaUsuario.getLblErrorCampoForm().setText("");
                vistaUsuario.getLblCampoForm().setText("Vehiculo agregado exitosamente.");
            }
        }
        
        if (e.getSource() == vistaUsuario.getBotonAgregarVehiculo()) {
            vistaUsuario.mostrarFormVehiculos();
        } else if (e.getSource() == vistaUsuario.getBotonPerfil()) {
            vistaUsuario.mostrarPerfil();
        } else if (e.getSource() == vistaUsuario.getBotonProveedores()) {
            vistaUsuario.mostrarProveedores();
        } else if(e.getSource() == vistaUsuario.getBotonAmigos()){
            vistaUsuario.mostrarAmigos();
        } else if (e.getSource() == vistaUsuario.getBotonVehiculos()) {
            vistaUsuario.mostrarVehiculos();
        } else if(e.getSource() == vistaUsuario.getBotonSalir()){
            vistaUsuario.cerrarVentana();
            vistaInicio.mostrarVentana();
        }

        if (e.getSource() == vistaUsuario.getCancelarAgregar()) {
            vistaUsuario.cancelarAgregar();
        }
    }
}
