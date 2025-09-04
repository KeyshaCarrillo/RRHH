/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package servicios;
import modelo.utils.*;

/**
 *
 * @author Josh
 */
public class FabricaEmpleados {
    public static Empleado crearEmpleado(String tipoEmpleado){
        
        if (tipoEmpleado.equalsIgnoreCase("ASALARIADO")){
            return new Asalariado();
        }else if (tipoEmpleado.equalsIgnoreCase("COMISIONISTA")){
            return new Comisionista();
        }else if (tipoEmpleado.equalsIgnoreCase("PORHORAS")){
            return new PorHoras();
        }
        else {
            return new Temporal();
        }
    }
}
