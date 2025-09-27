/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package control;

import vista.VentanaInicio;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ControlVentanaInicio implements ActionListener {

    private VentanaInicio vistaSesion;

    public ControlVentanaInicio(VentanaInicio vistaSesion) {
        this.vistaSesion = vistaSesion;
        this.vistaSesion.getBotonLogin().addActionListener(this);
        this.vistaSesion.getBotonRegistro().addActionListener(this);
        this.vistaSesion.getBotonCrear().addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == vistaSesion.getBotonLogin()) {
            vistaSesion.mostrarLogin();
        } else if (e.getSource() == vistaSesion.getBotonRegistro()) {
            vistaSesion.mostrarRegistro();
        } else if (e.getSource() == vistaSesion.getBotonCrear()) {
            if (vistaSesion.getTextoRNombre().getText().trim().isEmpty()
                    || vistaSesion.getTextoRIdentificacion().getText().trim().isEmpty()
                    || vistaSesion.getTextoRNumeroTel().getText().trim().isEmpty()
                    || vistaSesion.getTextoRRolaPET().getText().trim().isEmpty()
                    || vistaSesion.getTextoRUsuario().getText().trim().isEmpty()
                    || new String(vistaSesion.getTextoRContraseña().getPassword()).trim().isEmpty()
                    || new String(vistaSesion.getTextoRConfirmar().getPassword()).trim().isEmpty()
                    || vistaSesion.getTextoRMarca().getText().trim().isEmpty()
                    || vistaSesion.getTextoRModelo().getText().trim().isEmpty()) {

                // Mostrar error en el JLabel de la vista
                vistaSesion.getLblErrorCampo().setText("Todos los campos deben estar llenos.");
                return;
            } else {
                vistaSesion.getLblErrorCampo().setText("");
            }
            validarRegistro();
        }
    }

    private void validarRegistro() {
        String pass = new String(vistaSesion.getTextoRContraseña().getPassword());
        String confirm = new String(vistaSesion.getTextoRConfirmar().getPassword());

        if (!pass.equals(confirm)) {
            vistaSesion.getLblError().setText("Las contraseñas no coinciden.");
        } else {
            vistaSesion.getLblError().setText("");
        }
    }
}
