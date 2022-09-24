package trabajosPracticos.practicaParcial3;

public abstract class Persona {
    private String nombre;
    private String apellido;
    private int dni;
    private double sueldoBasico;

    public Persona(String nombre,String apellido,int dni,double sueldo){
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.sueldoBasico = sueldo;
    }

    public String getNombre(){
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public int getDni(){
        return dni;
    }

    public double getSueldoBasico(){
        return sueldoBasico;
    }

    public void setSueldoBasico(double sueldo){
        this.sueldoBasico = sueldo;
    }

    public String modificarDatos(String nombre,String apellido,int dni){
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        return this.nombre + ", " + this.apellido + ", DNI: " + this.dni;
    }

    public abstract void subirSueldo(double incremento);

    @Override
    public String toString(){
        return "Nombre: " + nombre + ", apellido: " + apellido + ", DNI: " + dni + ", sueldo Basico: " + sueldoBasico;
    }
}
