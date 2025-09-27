/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import vista.VentanaFormVehiculo;
import vista.VentanaUsuario;

/**
 *
 * @author Steven
 */
public class ControlVentanaUsuario implements ActionListener {

    private VentanaUsuario vistaUsuario;
    private VentanaFormVehiculo vistaFormVehiculo;

    public ControlVentanaUsuario(VentanaUsuario vistaUsuario, VentanaFormVehiculo vistaFormVehiculo) {
        this.vistaUsuario = vistaUsuario;
        this.vistaFormVehiculo = vistaFormVehiculo;
        this.vistaUsuario.getBotonVehiculos().addActionListener(this);
        this.vistaUsuario.getBotonAgregarVehiculo().addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
        if(e.getSource() == vistaUsuario.getBotonAgregarVehiculo()){
            vistaFormVehiculo.mostrar();  
        }
        
        if (e.getSource() == vistaUsuario.getBotonVehiculos()) {
            vistaUsuario.mostrarVehiculos();
        } else if (e.getSource() == vistaUsuario.getBotonProveedores()) {
            vistaUsuario.mostrarProveedores();
        }
    }
}
