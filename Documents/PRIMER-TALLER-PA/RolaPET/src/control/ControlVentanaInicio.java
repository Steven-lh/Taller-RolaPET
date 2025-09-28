package control;

import vista.VentanaInicio;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import modelo.ModeloDatos;
import modelo.Usuario;
import vista.VentanaAdmin;
import vista.VentanaUsuario;
import vista.VentanaProveedores;

public class ControlVentanaInicio implements ActionListener {

    private VentanaInicio vistaInicio;
    private ModeloDatos modelo;

    public ControlVentanaInicio(VentanaInicio vistaInicio, ModeloDatos modelo) {
        this.vistaInicio = vistaInicio;
        this.modelo = modelo;
        this.vistaInicio.getBotonLogin().addActionListener(this);
        this.vistaInicio.getBotonRegistro().addActionListener(this);
        this.vistaInicio.getBotonCrear().addActionListener(this);
        this.vistaInicio.getBotonIngresar().addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();

        if (source == vistaInicio.getBotonIngresar()) {
            String usuario = vistaInicio.getTextoLUsuario().getText();
            String pass = new String(vistaInicio.getTextoLContraseña().getPassword());

            if (usuario.equals("admin") && pass.equals("admin123")) {
                vistaInicio.cerrarVentana();
                vistaInicio.getLblErrorPassUser().setText("");
                VentanaAdmin vistaAdmin = new VentanaAdmin();
                new ControlVentanaAdmin(vistaAdmin, vistaInicio, this.modelo);
                vistaAdmin.mostrarVentana();
            } else {
                Usuario usuarioLogueado = modelo.validarLoginUsuario(usuario, pass);
                if (usuarioLogueado != null) {

                    vistaInicio.ocultarVentana();
                    vistaInicio.getLblErrorPassUser().setText("");

                    if ("proveedor".equals(usuarioLogueado.getTipoUsuario())) {
 
                        VentanaProveedores vistaProveedor = new VentanaProveedores();
                        new ControlVentanaProveedores(vistaProveedor, vistaInicio);

                    } else {
                        VentanaUsuario vistaUsuario = new VentanaUsuario(usuarioLogueado, modelo);
                        new ControlVentanaUsuario(vistaUsuario, vistaInicio, modelo, usuarioLogueado);
                    }

                } else {
                    vistaInicio.getLblErrorPassUser().setText("Usuario o contraseña incorrectos.");
                }
            }
        } else if (source == vistaInicio.getBotonLogin()) {
            vistaInicio.mostrarLogin();
        } else if (source == vistaInicio.getBotonRegistro()) {
            vistaInicio.mostrarRegistro();
        } else if (source == vistaInicio.getBotonCrear()) {
            manejarCreacionUsuarios();
        }
    }

    private void manejarCreacionUsuarios() {
        if (validarCamposVacios() || !validarRegistro()) {
            return;
        }
        String nombre = vistaInicio.getTextoRNombre().getText();
        String email = vistaInicio.getTextoREmail().getText();
        String id = vistaInicio.getTextoRIdentificacion().getText();
        String tel = vistaInicio.getTextoRNumeroTel().getText();
        String rolaPET = vistaInicio.getTextoRRolaPET().getText();
        String user = vistaInicio.getTextoRUsuario().getText();
        String password = new String(vistaInicio.getTextoRContraseña().getPassword());
        String tipoVehiculo = (String) vistaInicio.getComboVehiculo().getSelectedItem();
        String marca = vistaInicio.getTextoRMarca().getText();
        String modeloVehiculo = vistaInicio.getTextoRModelo().getText();
        String tipoUsuario;

        if (user.startsWith("p-")) {
            tipoUsuario = "proveedor";
        } else {
            tipoUsuario = "estandar";
        }
        Usuario nuevoUsuario = new Usuario(id, nombre, email, password, tel, rolaPET, user, tipoVehiculo, marca, modeloVehiculo, tipoUsuario);
        modelo.agregarSolicitudDeRegistro(nuevoUsuario);
        vistaInicio.getLblErrorCampo().setText("");
        vistaInicio.getLblError().setText("");
        vistaInicio.getLblCampoConf().setText("Registro exitoso, solicitud enviada.");
    }

    private boolean validarRegistro() {
        String pass = new String(vistaInicio.getTextoRContraseña().getPassword());
        String confirm = new String(vistaInicio.getTextoRConfirmar().getPassword());
        if (!pass.equals(confirm)) {
            vistaInicio.getLblError().setText("Las contraseñas no coinciden.");
            return false;
        } else {
            vistaInicio.getLblError().setText("");
            return true;
        }
    }

    private boolean validarCamposVacios() {
        if (vistaInicio.getTextoRNombre().getText().trim().isEmpty()
                || vistaInicio.getTextoRUsuario().getText().trim().isEmpty()
                || new String(vistaInicio.getTextoRContraseña().getPassword()).trim().isEmpty()) {
            vistaInicio.getLblErrorCampo().setText("Todos los campos obligatorios deben estar llenos.");
            return true;
        }
        vistaInicio.getLblErrorCampo().setText("");
        return false;
    }
}
