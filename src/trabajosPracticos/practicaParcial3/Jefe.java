package trabajosPracticos.practicaParcial3;

public class Jefe extends Persona{

    private double porcentaje;
    private double sueldo;

    public Jefe(String nombre,String apellido,int dni,double sueldoBasico,double sueldo,double porcentaje){
        super(nombre, apellido, dni, sueldoBasico);
        this.porcentaje = porcentaje;
        this.sueldo = getSueldoBasico() + sueldo + ((sueldo*porcentaje)/100);
    }

    public double verSueldo(){
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    @Override
    public void subirSueldo(double incremento){
        setSueldo(verSueldo() + incremento + ((verSueldo()*porcentaje)/100));
    }

    @Override
    public String toString(){
        return "Jefe \nNombre: " + getNombre() + ", apellido: " + getApellido() + ", sueldo basico: "
                 + getSueldoBasico() + ", sueldo: " + verSueldo() + ", porcentaje: " + porcentaje + "%";
    }
}
