package trabajosPracticos.practicaParcial3;

public class Empleado extends Persona{

    private double sueldo;

    public Empleado(String nombre,String apellido,int dni,double sueldoBasico,double sueldo){
        super(nombre, apellido, dni, sueldoBasico);
        this.sueldo = getSueldoBasico() + sueldo;
    }

    public double verSueldo(){
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    @Override
    public void subirSueldo(double incremento){
        setSueldo(verSueldo() + incremento);
    }

    @Override
    public String toString(){
        return "Empleado \nNombre: " + getNombre() + ", apellido: " + getApellido() + ", sueldo basico: "
                + getSueldoBasico() + ", sueldo: " + verSueldo();
    }
}
