package modelo.utils;
import modelo.inter.*;

public class Asalariado extends Empleado implements Bonificable {

    private double salarioMensual;
    //commit prueba 
    @Override
    public double bono() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public double salarioQuincena() {return salarioMensual/2.0; 
    }

}
