package trabajosPracticos.practicaParcial2;

public abstract class Persona {
    private String nombre;
    private String apellido;
    private int legajo;

    public Persona(String nombre,String apellido,String legajo){
        this.nombre = nombre;
        this.apellido = apellido;
        this.legajo = Integer.parseInt(legajo);
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setLegajo(int legajo) {
        this.legajo = legajo;
    }

    public int getLegajo() {
        return legajo;
    }

    public abstract void modificarDatos(String nombre,String apellido,String legajo);

    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", legajo=" + legajo +
                '}';
    }
}
