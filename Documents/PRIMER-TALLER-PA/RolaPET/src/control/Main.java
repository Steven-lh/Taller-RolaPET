/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package control;
import vista.VentanaInicio;
import vista.VentanaUsuario;
        
/**
 *
 * @author Steven
 */
public class Main {
    public static void main(String[] args){
       VentanaInicio vistaInicio = new VentanaInicio();
       VentanaUsuario vistaUsuario = new VentanaUsuario();
       ControlVentanaInicio controlVInicio = new ControlVentanaInicio(vistaInicio);
       ControlVentanaUsuario controlVUsuario = new ControlVentanaUsuario(vistaUsuario);
    }
}
