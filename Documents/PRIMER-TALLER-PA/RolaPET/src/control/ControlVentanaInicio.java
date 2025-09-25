/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package control;
import vista.VentanaInicio;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

/**
 *
 * @author Steven
 */

public class ControlVentanaInicio implements ActionListener {
    private VentanaInicio vistaSesion;
   
    public ControlVentanaInicio(VentanaInicio vistaSesion){
        this.vistaSesion = vistaSesion;
        this.vistaSesion.getBotonLogin().addActionListener(this);
        this.vistaSesion.getBotonRegistro().addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == vistaSesion.getBotonLogin()) {
            vistaSesion.mostrarLogin();
        } else if (e.getSource() == vistaSesion.getBotonRegistro()) {
            vistaSesion.mostrarRegistro();
        }
    }
}
