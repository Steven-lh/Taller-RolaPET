package vista;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;

public class VentanaAdmin {

    private JFrame frameAdmin;
    private JTable tablaSolicitudes;
    private DefaultTableModel tableModel;
    private JPanel panelInferior, panelBotones;
    private JButton botonSalir, botonAceptar, botonRechazar;

    public VentanaAdmin() {
        frameAdmin = new JFrame("Panel de Administrador - RolaPET");
        frameAdmin.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frameAdmin.setSize(800, 600);
        frameAdmin.setLocationRelativeTo(null);

        String[] columnNames = {"Nombre", "Usuario", "Email", "Identificación", "Teléfono", "Vehículo"};

        tableModel = new DefaultTableModel(columnNames, 0) {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false; // Hace la tabla no editable
            }
        };

        tablaSolicitudes = new JTable(tableModel);

        JScrollPane scrollPane = new JScrollPane(tablaSolicitudes);
        frameAdmin.add(scrollPane, BorderLayout.CENTER);

        JLabel titleLabel = new JLabel("Solicitudes de Registro Pendientes", SwingConstants.CENTER);
        titleLabel.setFont(new Font("Arial", Font.BOLD, 20));
        frameAdmin.add(titleLabel, BorderLayout.NORTH);

        panelInferior = new JPanel();
        botonAceptar = new JButton("Aceptar registro");
        botonRechazar = new JButton("Rechazar");
        botonSalir = new JButton("Salir");
        
        panelInferior.add(botonAceptar);
        panelInferior.add(botonRechazar);
        panelInferior.add(botonSalir);
        frameAdmin.add(panelInferior, BorderLayout.SOUTH);

    }

    public DefaultTableModel getTableModel() {
        return tableModel;
    }

    public void mostrarVentana() {
        frameAdmin.setVisible(true);
    }
    
    public JButton getBotonSalir(){
        return botonSalir;
    }
    
    public JButton getBotonAceptar() {
        return botonAceptar;
    }

    public JButton getBotonRechazar() {
        return botonRechazar;
    }
    
    public JTable getTablaSolicitudes() {
        return tablaSolicitudes;
    }
    
    public void cerrarVentana(){
        frameAdmin.dispose();
    }
}
