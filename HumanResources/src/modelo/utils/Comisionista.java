package modelo.utils;
import modelo.inter.*;

public class Comisionista extends Empleado implements Bonificable {

    private double base;
    private float porcentaje;
    private int ventasQuincena;
    private Incentivo politicaDeIncentivo;
    @Override
    public double bono() {
    return politicaDeIncentivo.calcularIncentivo(this);
    }
    

    @Override
    public double salarioQuincena() {
        return base+porcentaje;
       }

}
