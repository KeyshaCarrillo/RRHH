package modelo.utils;

public abstract class Empleado {

    private String cedula;
    private String nombre;

    public abstract double salarioQuincena();
    
    public String getCedula(){
        return cedula;
    }
    
    public String getNombre(){
        return nombre;
    }
}
