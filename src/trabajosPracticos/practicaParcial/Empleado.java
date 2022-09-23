package trabajosPracticos.practicaParcial;

public class Empleado extends Persona{

    private double sueldo;

    public Empleado(String nombre,double sueldo){
        super(nombre);
        this.sueldo = sueldo;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    @Override
    public String toString(){
        return super.toString() + ", Sueldo: " + this.sueldo;
    }

}
