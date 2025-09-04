package modelo.utils;
import modelo.inter.*;

public class Comisionista extends Empleado implements Bonificable {

    private double base;
    private float porcentaje;
    private int ventasQuincena;

    @Override
    public double bono() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public double salarioQuincena() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
