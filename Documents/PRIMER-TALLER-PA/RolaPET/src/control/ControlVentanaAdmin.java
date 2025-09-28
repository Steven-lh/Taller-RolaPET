package control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import modelo.ModeloDatos;
import modelo.Usuario;
import vista.VentanaAdmin;
import vista.VentanaInicio; 
import java.util.List;

public class ControlVentanaAdmin implements ActionListener {
    private VentanaInicio vistaInicio;
    private VentanaAdmin vistaAdmin;
    private ModeloDatos modelo;

    public ControlVentanaAdmin(VentanaAdmin vistaAdmin, VentanaInicio vistaInicio, ModeloDatos modelo) {
        this.vistaAdmin = vistaAdmin;
        this.vistaInicio = vistaInicio;
        this.modelo = modelo;
        this.vistaAdmin.getBotonSalir().addActionListener(this);
        this.vistaAdmin.getBotonAceptar().addActionListener(this);
        this.vistaAdmin.getBotonRechazar().addActionListener(this);
        
        cargarSolicitudesEnTabla();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == vistaAdmin.getBotonSalir()) {
            vistaAdmin.cerrarVentana();
            vistaInicio.mostrarVentana();
        }
         if (e.getSource() == vistaAdmin.getBotonAceptar()) {
            handleAceptar();
        } else if (e.getSource() == vistaAdmin.getBotonRechazar()) {
            handleRechazar();
        }
    }
    
    private void handleAceptar() {
        int filaSeleccionada = vistaAdmin.getTablaSolicitudes().getSelectedRow();

        if (filaSeleccionada != -1) { 
            Usuario usuarioSeleccionado = modelo.getSolicitudesDeRegistro().get(filaSeleccionada);
            modelo.aceptarSolicitud(usuarioSeleccionado);
            cargarSolicitudesEnTabla();
        }
    }
    private void handleRechazar() {
        int filaSeleccionada = vistaAdmin.getTablaSolicitudes().getSelectedRow();

        if (filaSeleccionada != -1) {
            Usuario usuarioSeleccionado = modelo.getSolicitudesDeRegistro().get(filaSeleccionada);
            modelo.rechazarSolicitud(usuarioSeleccionado);
            cargarSolicitudesEnTabla();
        }
    }
    
    private void cargarSolicitudesEnTabla() {
        vistaAdmin.getTableModel().setRowCount(0); // Limpia la tabla
        List<Usuario> solicitudes = modelo.getSolicitudesDeRegistro();

        for (Usuario u : solicitudes) {
            Object[] rowData = {
                u.getNombreCompleto(),
                u.getUsuario(),
                u.getEmail(),
                u.getIdentificacion(),
                u.getNumeroTel(),
                u.getTipoVehiculo() + " " + u.getMarcaVehiculo() + " " + u.getModeloVehiculo()
            };
            vistaAdmin.getTableModel().addRow(rowData);
        }
    }
}