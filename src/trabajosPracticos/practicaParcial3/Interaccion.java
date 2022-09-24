package trabajosPracticos.practicaParcial3;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Interaccion {
    public static void main(String[] args) {
        Personal miPersonal = new Personal();
        Scanner leer = new Scanner(System.in);
        int opcion = 0,dni = 0;
        String nombre = "",apellido = "";
        double sueldoBasico = 0.0,sueldo = 0.0,porcentaje = 0.0;

        do {
            System.out.println("\n¿Que desea hacer? Ingrese el numero correspondiente");
            System.out.println("1. Para agregar un empleado/jefe \n2. Listar personal y sus datos \n3. Ver el sueldo del personal");
            System.out.println("4. Salir");
            System.out.print("Ingrese el numero correspondiente: ");

            try {
                opcion = leer.nextInt();
            } catch (InputMismatchException e) {
                e.printStackTrace();
                System.out.println("¡ERROR en el ingreso de datos!");
            }

            if(opcion == 1){

                System.out.println("\n¿Que tipo de empleado desea agregar?");
                System.out.println("1. Para agregar un jefe \n2. Para agregar un empleado");
                System.out.print("Ingrese el numero correspondiente: ");

                try {
                    opcion = leer.nextInt();
                } catch (InputMismatchException e) {
                    e.printStackTrace();
                    System.out.println("¡ERROR en el ingreso de datos!");
                }

                if(opcion == 1){

                    leer.nextLine();
                    System.out.println("\nIngrese el nombre del jefe a agregar:");
                    try {
                        nombre = leer.nextLine();
                    } catch (InputMismatchException e) {
                        e.printStackTrace();
                        System.out.println("¡ERROR en el ingreso de datos!");
                    }
                    System.out.println("Ingrese el apellido del jefe a agregar:");
                    try {
                        apellido = leer.nextLine();
                    } catch (InputMismatchException e) {
                        e.printStackTrace();
                        System.out.println("¡ERROR en el ingreso de datos!");
                    }
                    System.out.println("Ingrese el DNI del jefe a agregar:");
                    try {
                        dni = leer.nextInt();
                    } catch (InputMismatchException e) {
                        e.printStackTrace();
                        System.out.println("¡ERROR en el ingreso de datos!");
                    }
                    System.out.println("Ingrese el sueldo basico del jefe a agregar:");
                    try {
                        sueldoBasico = leer.nextDouble();
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
                    System.out.println("Ingrese el porcentaje del jefe a agregar:");
                    try {
                        porcentaje = leer.nextDouble();
                    } catch (InputMismatchException e) {
                        e.printStackTrace();
                        System.out.println("¡ERROR en el ingreso de datos!");
                    }

                    miPersonal.addPersona(new Jefe(nombre,apellido,dni,sueldoBasico,sueldo,porcentaje));
                }else if(opcion == 2){

                    leer.nextLine();
                    System.out.println("\nIngrese el nombre del empleado a agregar:");
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
                    System.out.println("Ingrese el sueldo basico del empleado a agregar:");
                    try {
                        sueldoBasico = leer.nextDouble();
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

                    miPersonal.addPersona(new Empleado(nombre,apellido,dni,sueldoBasico,sueldo));
                }
            }else if(opcion == 2){

                System.out.println("\nListado de personal:");
                miPersonal.listarPersonas();
            }else if(opcion == 3){

                System.out.println("\nListado de sueldos:");
                miPersonal.verSueldo();
            }else if(opcion == 4){

                System.out.println("\n¡Hasta pronto!");
            }else{

                System.out.println("\nOpcion ingresada invalida");
            }

        }while (opcion == 1 || opcion == 2 || opcion == 3);
    }
}
