package trabajosPracticos.practicaParcial2;

import java.util.LinkedList;

public class Carrera {
    private String nombre;
    private LinkedList<Materia> materias;

    public Carrera(){
        this.materias = new LinkedList<Materia>();
    }

    public Carrera(String nombre){
        this.nombre = nombre;
        this.materias = new LinkedList<Materia>();
    }

    public void agregarMateria(Materia materia){
        this.materias.add(materia);
    }

    public String getNombre(){
        return this.nombre;
    }

    @Override
    public String toString() {
        return "Carrera{" +
                "nombre='" + nombre + '\'' +
                ", Materias=" + materias +
                '}';
    }
}
