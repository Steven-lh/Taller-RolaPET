package control;

import modelo.ModeloDatos;
import vista.VentanaInicio;

/**
 * @author Steven
 */
public class Main {

    public static void main(String[] args) {
        ModeloDatos modelo = ModeloDatos.getInstance();
        VentanaInicio vistaInicio = new VentanaInicio();
        new ControlVentanaInicio(vistaInicio, modelo);
        

    }
}