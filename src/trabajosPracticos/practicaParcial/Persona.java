package trabajosPracticos.practicaParcial;

public abstract class Persona implements Informaciones{

    private String nombre;
    private int dni;

    public Persona(String nombre){
        this.nombre = nombre;
        generarDni();
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    private void generarDni(){
        this.dni = (int) (Math.random()*99999999);
    }

    public int getDni(){
        return this.dni;
    }

    @Override
    public String getName() {
        return this.nombre;
    }

    @Override
    public String toString(){
        return "Nombre: " + this.nombre + ", DNI: " + this.dni ;
    }
}
