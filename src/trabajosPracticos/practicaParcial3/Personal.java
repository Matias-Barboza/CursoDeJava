package trabajosPracticos.practicaParcial3;

import trabajosPracticos.practicaParcial3.Persona;

import java.util.InputMismatchException;
import java.util.LinkedList;
import java.util.Scanner;

public class Personal {
    private LinkedList<Persona> personas;

    public Personal(){
        personas = new LinkedList<Persona>();
    }

    public void listarPersonas(){
        for (Persona persona: personas){
            if(persona instanceof Jefe){
                System.out.println(persona);
            }else if(persona instanceof Empleado){
                System.out.println(persona);
            }
        }
    }

    public void addPersona(Persona persona){
        personas.add(persona);
    }

    public void eliminarPersona(int dniEliminar){
        for(Persona persona: personas){
            if(dniEliminar == persona.getDni()){
                personas.remove(persona);
            }
        }
    }

    public void modificarPersona(int dniModificar){
        Scanner leer = new Scanner(System.in);
        String nombre = "",apellido = "";
        int dni = 0;
        double sueldo = 0.0,porcentaje = 0.0;

        for(Persona persona: personas){
            if(dniModificar == persona.getDni()){
                if(persona instanceof Jefe){

                    System.out.println("Ingrese el nombre del jefe a modificar:");
                    try {
                        nombre = leer.nextLine();
                    } catch (InputMismatchException e) {
                        e.printStackTrace();
                        System.out.println("¡ERROR en el ingreso de datos!");
                    }
                    System.out.println("Ingrese el apellido del jefe a modificar:");
                    try {
                        apellido = leer.nextLine();
                    } catch (InputMismatchException e) {
                        e.printStackTrace();
                        System.out.println("¡ERROR en el ingreso de datos!");
                    }
                    System.out.println("Ingrese el DNI del jefe a modificar:");
                    try {
                        dni = leer.nextInt();
                    } catch (InputMismatchException e) {
                        e.printStackTrace();
                        System.out.println("¡ERROR en el ingreso de datos!");
                    }
                    System.out.println("Ingrese el sueldo del jefe a modificar:");
                    try {
                        sueldo = leer.nextDouble();
                    } catch (InputMismatchException e) {
                        e.printStackTrace();
                        System.out.println("¡ERROR en el ingreso de datos!");
                    }
                    System.out.println("Ingrese el porcentaje del jefe a modificar:");
                    try {
                        porcentaje = leer.nextDouble();
                    } catch (InputMismatchException e) {
                        e.printStackTrace();
                        System.out.println("¡ERROR en el ingreso de datos!");
                    }

                    persona.setNombre(nombre);
                    persona.setApellido(apellido);
                    ((Jefe) persona).setSueldo(persona.getSueldoBasico() + sueldo + ((persona.getSueldoBasico()*porcentaje)/100));
                }else if(persona instanceof Empleado){

                    System.out.println("Ingrese el nombre del empleado a agregar:");
                    try {
                        nombre = leer.nextLine();
                    } catch (InputMismatchException e) {
                        e.printStackTrace();
                        System.out.println("¡ERROR en el ingreso de datos!");
                    }
                    System.out.println("Ingrese el apellido del empleado a agregar:");
                    try {
                        apellido = leer.nextLine();
                    } catch (InputMismatchException e) {
                        e.printStackTrace();
                        System.out.println("¡ERROR en el ingreso de datos!");
                    }
                    System.out.println("Ingrese el DNI del empleado a agregar:");
                    try {
                        dni = leer.nextInt();
                    } catch (InputMismatchException e) {
                        e.printStackTrace();
                        System.out.println("¡ERROR en el ingreso de datos!");
                    }
                    System.out.println("Ingrese el sueldo del empleado a agregar:");
                    try {
                        sueldo = leer.nextDouble();
                    } catch (InputMismatchException e) {
                        e.printStackTrace();
                        System.out.println("¡ERROR en el ingreso de datos!");
                    }

                    persona.setNombre(nombre);
                    persona.setApellido(apellido);
                    ((Empleado) persona).setSueldo(persona.getSueldoBasico() + sueldo);
                }
            }
        }
    }

    public void buscarPersona(int dniBuscar){
        for(Persona persona: personas){
            if(dniBuscar == persona.getDni()){
                System.out.println(persona);
            }
        }
    }

    public void verSueldo(int dniVerSueldo){
        for(Persona persona: personas){
            if(dniVerSueldo == persona.getDni()){
                persona.getSueldoBasico();
            }
        }
    }

    public void verSueldo(){
        for(Persona persona: personas){
            if(persona instanceof Jefe){
                System.out.println("Sueldo de: " + persona.getNombre() + " es: " + ((Jefe) persona).verSueldo());
            }else if(persona instanceof Empleado){
                System.out.println("Sueldo de: " + persona.getNombre() + " es: " + ((Empleado) persona).verSueldo());
            }
        }
    }

    public void aumentarSalario(int dniAumentar,double incremento){
        for(Persona persona: personas){
            if(dniAumentar == persona.getDni()){
                persona.setSueldoBasico(persona.getSueldoBasico() + incremento);
            }
        }
    }


}
