/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package servicios;
import java.util.List;
import modelo.inter.Bonificable;
import modelo.utils.Empleado;
/**
 *
 * @author Josh
 */
public class Nomina {
    public static double totalAPagar(List<Empleado> empleados) {
        double total = 0;
        for (Empleado e : empleados) {
            double base = e.salarioQuincena();
            double bono = (e instanceof Bonificable b) ? b.bono() : 0.0;
            total += base + bono;
        }
        return total;
    }
}
