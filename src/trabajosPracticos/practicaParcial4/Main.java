package trabajosPracticos.practicaParcial4;

import java.io.*;
import java.util.InputMismatchException;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int opcionMenu = 0;
        LinkedList<Cliente> clientes = new LinkedList<>();
        Scanner leer = new Scanner(System.in);
        File datosClientes = new File("datosClientes.txt");

        if(datosClientes.isFile()){
            try {
                ObjectInputStream lecturaClientes = new ObjectInputStream(new FileInputStream("datosClientes.txt"));
                LinkedList<?> clientesRecuperados = (LinkedList<?>) lecturaClientes.readObject();
                lecturaClientes.close();
                for (Object object:clientesRecuperados) {
                    if(object instanceof Cliente){
                        clientes.add((Cliente) object);
                    }
                }

            }catch (Exception e){
                e.printStackTrace();
            }
        }

        do {
            System.out.println("Bienvenido al Sistema de Clientes");
            System.out.println("----------------------------------------------------------------------------------------------------------------");
            System.out.println("Seleccione una opcion:");
            System.out.println("1- Crear Cliente \n2- Listar Clientes \n3- Buscar cliente \n4- Eliminar cliente \n5- Agregar Activo a Cliente");
            System.out.println("6- Salir");
            System.out.println("----------------------------------------------------------------------------------------------------------------");
            System.out.print("Ingrese su opcion: ");
            try {
                opcionMenu = leer.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Eso no parece ser un numero");
                opcionMenu = 6;
                e.printStackTrace();
            }
            System.out.println("----------------------------------------------------------------------------------------------------------------");

            leer.nextLine();


            switch (opcionMenu) {
                case 1:
                    System.out.println("1- Crear cliente");
                    System.out.print("Ingrese el nombre del nuevo cliente: ");
                    String nombre = leer.nextLine();
                    System.out.print("Ingrese el apellido del nuevo cliente: ");
                    String apellido = leer.nextLine();
                    System.out.print("Ingrese el DNI del nuevo cliente: ");
                    int dni = 0;
                    try {
                        dni = leer.nextInt();
                    } catch (InputMismatchException e) {
                        e.printStackTrace();
                        System.out.println("ERROR! Eso no parece un numero de DNI");
                    }
                    System.out.print("Ingrese la direccion del nuevo cliente: ");
                    leer.nextLine();
                    String direccion = leer.nextLine();

                    clientes.add(new Cliente(nombre, apellido, dni, direccion));

                    System.out.println("\n¿Desea agregar activos al cliente?");
                    System.out.println("1- Si \n2- En otro momento");
                    System.out.print("Ingrese su opcion: ");
                    int opcionActivos = leer.nextInt();
                    while (opcionActivos != 2){
                        leer.nextLine();
                        System.out.print("Ingrese nombre del activo: ");
                        String nombreActivo = leer.nextLine();
                        System.out.print("Ingrese el monto del activo: ");
                        double montoActivo = 0.0;
                        try{
                            montoActivo = leer.nextDouble();
                        }catch (InputMismatchException e){
                            e.printStackTrace();
                            System.out.println("ERROR! Eso no parece ser un monto");
                        }

                        clientes.getLast().agregarActivo(nombreActivo,montoActivo);

                        System.out.println("\n¿Desea agregar activos al cliente?");
                        System.out.println("1- Si \n2- En otro momento");
                        System.out.print("Ingrese su opcion: ");
                        opcionActivos = leer.nextInt();
                    }

                    try {
                        ObjectOutputStream escrituraClientes = new ObjectOutputStream(new FileOutputStream("datosClientes.txt"));
                        escrituraClientes.writeObject(clientes);
                        escrituraClientes.close();
                    }catch (Exception e){
                        e.printStackTrace();
                    }

                    System.out.println();
                    break;
                case 2:
                    System.out.println("2- Listar clientes");
                    if (clientes.isEmpty()) {
                        System.out.println("La lista está vacía");
                    } else {
                        for (Cliente cliente : clientes) {
                            System.out.println("Informacion del cliente: ");
                            cliente.imprimirInformacion();
                        }
                    }
                    System.out.println();
                    break;
                case 3:
                    System.out.println("3- Buscar cliente");
                    System.out.print("Ingrese el nombre del cliente a buscar: ");
                    nombre = leer.nextLine();
                    System.out.print("Ingrese el apellido del cliente a buscar: ");
                    apellido = leer.nextLine();

                    String nombreCompleto = nombre + " " + apellido;

                    for (Cliente cliente:clientes){
                        if(cliente.getNombreCompleto().equals(nombreCompleto)){
                            cliente.imprimirInformacion();
                            break;
                        }
                    }

                    System.out.println();
                    break;
                case 4:
                    System.out.println("4- Eliminar Cliente");
                    System.out.print("Ingrese el nombre del cliente a buscar: ");
                    nombre = leer.nextLine();
                    System.out.print("Ingrese el apellido del cliente a buscar: ");
                    apellido = leer.nextLine();

                    nombreCompleto = nombre + " " + apellido;

                    loopeliminacion:
                    for (Cliente cliente:clientes){
                        if(cliente.getNombreCompleto().equals(nombreCompleto)){
                            clientes.remove(cliente);
                            break loopeliminacion;
                        }
                    }

                    try {
                        ObjectOutputStream escrituraClientes = new ObjectOutputStream(new FileOutputStream("datosClientes.txt"));
                        escrituraClientes.writeObject(clientes);
                        escrituraClientes.close();
                    }catch (Exception e){
                        e.printStackTrace();
                    }

                    System.out.println();
                    break;

                case 5:
                    System.out.println("5- Agregar Activo a Cliente");
                    System.out.print("Ingrese el nombre del cliente a buscar: ");
                    nombre = leer.nextLine();
                    System.out.print("Ingrese el apellido del cliente a buscar: ");
                    apellido = leer.nextLine();

                    nombreCompleto = nombre + " " + apellido;

                    for (Cliente cliente:clientes){
                        if(cliente.getNombreCompleto().equals(nombreCompleto)){
                            System.out.print("Ingrese nombre del activo: ");
                            String nombreActivo = leer.nextLine();
                            System.out.print("Ingrese el monto del activo: ");
                            double montoActivo = 0.0;
                            try{
                                montoActivo = leer.nextDouble();
                            }catch (InputMismatchException e){
                                e.printStackTrace();
                                System.out.println("ERROR! Eso no parece ser un monto");
                            }

                            cliente.agregarActivo(nombreActivo,montoActivo);
                        }
                    }

                    try {
                        ObjectOutputStream escrituraClientes = new ObjectOutputStream(new FileOutputStream("datosClientes.txt"));
                        escrituraClientes.writeObject(clientes);
                        escrituraClientes.close();
                    }catch (Exception e){
                        e.printStackTrace();
                    }

                    System.out.println();
                    break;
                case 6:
                    System.out.println("Hasta luego!");
                    break;
                default:
                    System.out.println("Opcion invalida");
                    break;
            }
        }while(opcionMenu != 6);
    }
}

