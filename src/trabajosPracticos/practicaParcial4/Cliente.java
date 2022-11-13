package trabajosPracticos.practicaParcial4;

import java.util.LinkedList;

public class Cliente extends Persona{
    private LinkedList<Activo> activos;

    public Cliente(String nombre,String apellido,int dni,String direccion){
        super(nombre, apellido, dni, direccion);
        activos = new LinkedList<>();
    }

    public void agregarActivo(String nombre,double monto){
        activos.add(new Activo(nombre,monto));
    }

    @Override
    public String toString(){
        return super.toString() + ", Activos: " + activos;
    }

    @Override
    public void imprimirInformacion() {
        System.out.println(this);
    }
}
