package control;

import vista.VentanaInicio;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import modelo.ModeloDatos; // Importar el modelo
import modelo.Usuario; // Importar la clase Usuario
import vista.VentanaAdmin;
import control.ControlVentanaAdmin;

public class ControlVentanaInicio implements ActionListener {

    private VentanaInicio vistaSesion;
    private ModeloDatos modelo; // Referencia al modelo de datos

    // El constructor ahora recibe el modelo
    public ControlVentanaInicio(VentanaInicio vistaSesion, ModeloDatos modelo) {
        this.vistaSesion = vistaSesion;
        this.modelo = modelo; // Guardar la instancia del modelo
        this.vistaSesion.getBotonLogin().addActionListener(this);
        this.vistaSesion.getBotonRegistro().addActionListener(this);
        this.vistaSesion.getBotonCrear().addActionListener(this);
        this.vistaSesion.getBotonIngresar().addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == vistaSesion.getBotonIngresar()) {
            String usuario = vistaSesion.getTextoLUsuario().getText();
            String pass = new String(vistaSesion.getTextoLContraseña().getPassword());
            if (usuario.equals("admin") && pass.equals("admin123")) {
                vistaSesion.cerrarVentana();
                VentanaAdmin vistaAdmin = new VentanaAdmin();
                // Al crear el controlador del admin, le pasamos el MISMO modelo
                new ControlVentanaAdmin(vistaAdmin, vistaSesion, this.modelo);
                vistaAdmin.mostrarVentana();
            } else {
                vistaSesion.getLblErrorPassUser().setText("El usuario o la contraseña no son correctas.");
            }
        }

        if (e.getSource() == vistaSesion.getBotonLogin()) {
            vistaSesion.mostrarLogin();
        } else if (e.getSource() == vistaSesion.getBotonRegistro()) {
            vistaSesion.mostrarRegistro();
        } else if (e.getSource() == vistaSesion.getBotonCrear()) {
            // Tu validación de campos vacíos
            if (vistaSesion.getTextoRNombre().getText().trim().isEmpty()
                    // ... (el resto de tu validación de campos vacíos va aquí)
                    || vistaSesion.getTextoRModelo().getText().trim().isEmpty()) {

                vistaSesion.getLblErrorCampo().setText("Todos los campos deben estar llenos.");
                return;
            }
            if (!validarRegistro()) {
                return; 
            }
            
            String nombre = vistaSesion.getTextoRNombre().getText();
            String email = vistaSesion.getTextoREmail().getText();
            String id = vistaSesion.getTextoRIdentificacion().getText();
            String tel = vistaSesion.getTextoRNumeroTel().getText();
            String rolaPET = vistaSesion.getTextoRRolaPET().getText();
            String user = vistaSesion.getTextoRUsuario().getText();
            String password = new String(vistaSesion.getTextoRContraseña().getPassword());
            String tipoVehiculo = (String) vistaSesion.getComboVehiculo().getSelectedItem();
            String marca = vistaSesion.getTextoRMarca().getText();
            String modeloVehiculo = vistaSesion.getTextoRModelo().getText();
            

            Usuario nuevoUsuario = new Usuario(nombre, email, id, tel, rolaPET, user, password, tipoVehiculo, marca, modeloVehiculo);

            modelo.agregarSolicitudDeRegistro(nuevoUsuario);

            vistaSesion.getLblErrorCampo().setText("");
            vistaSesion.getLblError().setText("");
            vistaSesion.getLblCampoConf().setText("Registro exitoso, solicitud enviada.");
        }
    }

    private boolean validarRegistro() {
        String pass = new String(vistaSesion.getTextoRContraseña().getPassword());
        String confirm = new String(vistaSesion.getTextoRConfirmar().getPassword());

        if (!pass.equals(confirm)) {
            vistaSesion.getLblError().setText("Las contraseñas no coinciden.");
            return false;
        } else {
            vistaSesion.getLblError().setText("");
            return true;
        }
    }
}