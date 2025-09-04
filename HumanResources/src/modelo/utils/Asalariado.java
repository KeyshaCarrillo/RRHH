package modelo.utils;
import modelo.inter.*;

public class Asalariado extends Empleado implements Bonificable {

    private double salarioMensual;
    private Incentivo politicaDeIncentivo;
      public Asalariado(String cedula, String nombre, double salarioMensual) {
        //super(cedula, nombre);
        this.salarioMensual = salarioMensual;
        this.politicaDeIncentivo = new IncentivoPorDesempeno(this.salarioMensual);
    }

    public Asalariado() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    @Override
    public double bono() {
       return politicaDeIncentivo.calcularIncentivo(this);
    }

    @Override
    public double salarioQuincena() {return salarioMensual/2.0; 
    }
 public void setPoliticaDeIncentivo(Incentivo nuevaPolitica) {
        this.politicaDeIncentivo = nuevaPolitica;
    }
 public double getSalarioMensual(){
     return salarioMensual;
 }
}
