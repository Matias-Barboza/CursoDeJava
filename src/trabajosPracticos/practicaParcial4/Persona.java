package trabajosPracticos.practicaParcial4;

import java.io.Serializable;

public abstract class Persona implements IInforme, Serializable {
    private String nombre;
    private String apellido;
    private int dni;
    private String direccion;

    public Persona(String nombre,String apellido,int dni,String direccion){
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.direccion = direccion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getNombreCompleto(){
        return nombre + " " + apellido;
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre + ", Apellido: " + apellido  + ", DNI: " + dni + ", Direccion: " + direccion;
    }
}
