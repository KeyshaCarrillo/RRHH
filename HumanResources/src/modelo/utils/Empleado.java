package modelo.utils;
import modelo.inter.*;

public abstract class Empleado implements Incentivo {

    private String cedula;

    private String nombre;

    public double salarioQuincena() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
