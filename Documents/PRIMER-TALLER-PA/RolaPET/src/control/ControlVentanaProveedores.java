/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import vista.VentanaProveedores;
import vista.VentanaInicio;

/**
 *
 * @author Steven
 */
public class ControlVentanaProveedores implements ActionListener {

    private VentanaProveedores vistaProveedores;
    private VentanaInicio vistaInicio;

    public ControlVentanaProveedores(VentanaProveedores vistaProveedores, VentanaInicio vistaInicio) {
        this.vistaProveedores = vistaProveedores;

        this.vistaInicio = vistaInicio;


        this.vistaProveedores.getBotonPerfil().addActionListener(this);
        this.vistaProveedores.getBotonServicios().addActionListener(this);
        this.vistaProveedores.getBotonEventos().addActionListener(this);
        this.vistaProveedores.getBotonSalir().addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();

        if (source == vistaProveedores.getBotonPerfil()) {
            vistaProveedores.mostrarPerfil();
        } else if (source == vistaProveedores.getBotonServicios()) {
            vistaProveedores.mostrarServicios();
        } else if (source == vistaProveedores.getBotonEventos()) {
            vistaProveedores.mostrarEventos();
        } else if (source == vistaProveedores.getBotonSalir()) {
            vistaProveedores.cerrarVentana();
            vistaInicio.mostrarVentana();
        }
    }
}

