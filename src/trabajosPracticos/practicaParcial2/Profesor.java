package trabajosPracticos.practicaParcial2;

public class Profesor extends Persona{

    public Profesor(String nombre,String apellido,String legajo){
        super(nombre,apellido,legajo);
    }

    @Override
    public void modificarDatos(String nombre, String apellido, String legajo) {
        super.setNombre(nombre);
        super.setApellido(apellido);
        super.setLegajo(Integer.parseInt(legajo));
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
