package trabajosPracticos.practicaParcial2;

import java.util.LinkedList;

public class Materia {
    private String nombre;
    private Profesor titular;
    private LinkedList<Estudiante> estudiantes;

    public Materia(String nombre,Profesor profesor){
        this.nombre = nombre;
        this.titular = profesor;
        this.estudiantes = new LinkedList<Estudiante>();
    }

    public void agregarEstudiante(Estudiante estudiante){
        estudiantes.add(estudiante);
    }

    public void listarEstudiantes(){
        for(Estudiante estudiante:estudiantes){
            System.out.println(estudiante);
        }
    }

    @Override
    public String toString() {
        return "Materia{" +
                "nombre='" + nombre + '\'' +
                ", titular=" + titular +
                ", estudiantes=" + estudiantes +
                '}';
    }
}
