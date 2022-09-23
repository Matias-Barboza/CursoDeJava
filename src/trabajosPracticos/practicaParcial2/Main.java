package trabajosPracticos.practicaParcial2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String legajo;

        Scanner leer = new Scanner(System.in);

        Facultad facultad1 = new Facultad("UTN");

        Carrera LARC = new Carrera("Licenciatura en admin. rural");
        Carrera TUP = new Carrera("Tecnicatura universitaria en programacion");
        Carrera ISI = new Carrera("Ingenieria en sistemas de informacion");
        Carrera IQ = new Carrera("Ingenieria quimica");

        Profesor profesor1 = new Profesor("Facundo","Matoff","1234");

        Materia materia1 = new Materia("Programacion I",profesor1);
        Materia materia2 = new Materia("Programacion II",profesor1);
        Materia materia3 = new Materia("Laboratorio de computacion I",profesor1);
        Materia materia4 = new Materia("Laboratorio de computacion II",profesor1);

        facultad1.agregarCarrera(LARC);
        facultad1.agregarCarrera(TUP);
        facultad1.agregarCarrera(ISI);
        facultad1.agregarCarrera(IQ);

        facultad1.mostrarCarreras();

        TUP.agregarMateria(materia1);
        TUP.agregarMateria(materia2);
        TUP.agregarMateria(materia3);
        TUP.agregarMateria(materia4);


        Estudiante estudiante1 = new Estudiante("Agustin","Mansilla","1235");
        Estudiante estudiante2 = new Estudiante("Matias","Barboza","1236");
        Estudiante estudiante3 = new Estudiante("Agustin","Campanella","1237");
        Estudiante estudiante4 = new Estudiante("Alejo","Czombos","1238");

        materia1.agregarEstudiante(estudiante1);
        materia1.agregarEstudiante(estudiante2);
        materia1.agregarEstudiante(estudiante3);
        materia1.agregarEstudiante(estudiante4);

        System.out.println(TUP);

        System.out.println("Ingrese el numero de legajo");

        try{
            legajo = leer.nextLine();
            evaluarIngreso(legajo);
        }catch (ExcepcionEvaluarIngreso e){
            e.printStackTrace();
            System.out.println("ERROR: Eso no parece ser un número de legajo");
        }

    }

    public static void evaluarIngreso(String numero) throws ExcepcionEvaluarIngreso {

        boolean resultado = numero.matches("[+-]?\\d*(\\.\\d+)?");

        if(!resultado){
            throw new ExcepcionEvaluarIngreso();
        }
    }
}
