package trabajosPracticos.parcialIILab;

import java.util.LinkedList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    int opcion = 0;

        LinkedList<Contacto> listaContactos = new LinkedList<>();

        do{
            System.out.println("ADMINISTRADOR DE CONTACTOS: ");
            System.out.println("1) Nuevo Contacto \n2) Listar todos los Contactos\n3) Buscar contacto por nombre o apellido");
            System.out.println("4) Buscar Contacto por DNI\n5) Eliminar Contacto por DNI\n6) Imprimir en un archivo");
            System.out.println("7) Editar Contacto \n99) Salir");
            System.out.print("Ingrese una opcion: ");
            opcion = EvaluarIngreso.deEntero(opcion);
            System.out.println();

            switch (opcion){
                case 1:crearContacto(listaContactos);
                       System.out.println();break;
                case 2:listarContactos(listaContactos);
                       System.out.println();break;
                case 3:buscarContactoNombreOApellido(listaContactos);
                       System.out.println();break;
                case 4:buscarContactoDNI(listaContactos);
                       System.out.println();break;
                case 5:eliminarContactoDNI(listaContactos);
                       System.out.println();break;
                case 6:imprimirArchivo(listaContactos);
                       System.out.println();break;
                case 7:editarContacto(listaContactos);
                       System.out.println();break;
                case 99:System.out.println("Hasta luego!");break;
            }
        }while(opcion != 99);
    }

    public static void crearContacto(LinkedList<Contacto> lista){
        Scanner leer = new Scanner(System.in);
        int dni = 0, telefono = 0;
        String nombre,apellido,email;

        do {
            System.out.println("CREAR CONTACTO");
            System.out.print("Ingrese el nombre del contacto: ");
            nombre = leer.nextLine();
            System.out.print("Ingrese el apellido del contacto: ");
            apellido = leer.nextLine();
            System.out.print("Ingrese el DNI del contacto: ");
            dni = EvaluarIngreso.deEntero(dni);
            System.out.print("Ingrese el telefono del contacto: ");
            telefono = EvaluarIngreso.deEntero(telefono);
            System.out.print("Ingrese el email del contacto: ");
            email = leer.nextLine();

            if (dni == 0 || telefono == 0){
                System.out.println("\nCREACION INVALIDADA, SE REINICIARA EL PROCESO\n");
            }
        }while (dni == 0 || telefono == 0);

        lista.add(new Contacto(nombre,apellido,dni,String.valueOf(telefono),email));
    }

    public static void listarContactos(LinkedList<Contacto> lista){
        int i = 0;

        System.out.println("LISTAR CONTACTOS");
        if(!lista.isEmpty()) {
            for (Contacto contacto : lista) {
                System.out.println("Contacto " + (i + 1));
                System.out.println(contacto);
                i++;
            }
        }

        System.out.println("Usted tiene " + i + " contactos");
    }

    public static void buscarContactoNombreOApellido(LinkedList<Contacto> lista){
        Scanner leer = new Scanner(System.in);
        int opcion = 0, encontrados = 0;

        System.out.println("BUSCAR CONTACTO POR NOMBRE Y APELLIDO");
        System.out.println("1) Buscar por nombre \n2) Buscar por apellido");
        System.out.print("Ingrese una opcion: ");
        opcion = EvaluarIngreso.deEntero(opcion);
        while (opcion == 3){
            System.out.println("\nOPCION INVALIDA");
            System.out.println("1) Buscar por nombre \n2) Buscar por apellido");
            System.out.print("Ingrese una opcion: ");
            opcion = EvaluarIngreso.deEntero(opcion);
        }

        switch (opcion){
            case 1: System.out.println();
                    System.out.print("Ingrese el nombre: ");
                    String nombre = leer.nextLine();
                    System.out.println("Contactos encontrados:");
                    for (Contacto contacto:lista) {
                    if(contacto.getNombre().equals(nombre)){
                        System.out.println(contacto);
                        encontrados++;
                        }
                    }break;
            case 2:System.out.println();
                   System.out.print("Ingrese el nombre: ");
                   String apellido = leer.nextLine();
                   System.out.println("Contactos encontrados:");
                   for (Contacto contacto:lista) {
                       if (contacto.getApellido().equals(apellido)) {
                        System.out.println(contacto);
                        encontrados++;
                        }
                   }break;
            default:System.out.println();
                    System.out.println("OPCION INVALIDA");
                    break;
        }

        if(encontrados == 0){
            System.out.println("NO EXISTEN CONTACTOS QUE COINCIDADN CON EL CRITERIO");
        }
        System.out.println("Se encontraron " + encontrados + " contactos");
    }

    public static void buscarContactoDNI(LinkedList<Contacto> lista){
        int dni = 0, encontrados = 0;

        System.out.println("BUSCAR CONTACTO POR DNI");
        System.out.print("Ingrese DNI: ");
        dni = EvaluarIngreso.deEntero(dni);

        for (Contacto contacto:lista){
            if(contacto.getDni() == dni){
                System.out.println("Contacto:");
                System.out.println(contacto);
                encontrados++;
            }
        }

        if(encontrados == 0){
            System.out.println("NO EXISTEN CONTRACTOS CON DNI: " + dni);
        }
        System.out.println("Se encontraron " + encontrados + " contactos");
    }

    public static void eliminarContactoDNI(LinkedList<Contacto> lista){
        int dni = 0, encontrados = 0;

        System.out.println("ELIMINAR CONTACTO POR DNI");
        System.out.print("Ingrese DNI: ");
        dni = EvaluarIngreso.deEntero(dni);

        for (Contacto contacto:lista){
            if(contacto.getDni() == dni){
                System.out.println("Contacto:");
                System.out.println(contacto);
                lista.remove(contacto);
                encontrados++;
            }
        }

        if(encontrados == 0){
            System.out.println("NO EXISTEN CONTACTOS CON EL DNI " + dni);
        }

        System.out.println("Se encontraron " + encontrados + " contactos");
    }

    public static void imprimirArchivo(LinkedList<Contacto> lista){
        Scanner leer = new Scanner(System.in);

        System.out.println("IMPRIMIR ARCHIVO");
        System.out.print("Ingrese el nombre del archivo: ");
        String nombreArchivo = leer.nextLine();
        Archivo archivo = new Archivo(nombreArchivo);
        archivo.imprimir(lista.toString());
        System.out.println("ARCHIVO IMPRESO");
    }

    public static void editarContacto(LinkedList<Contacto> lista){
        Scanner leer = new Scanner(System.in);
        int dni = 0, dniEditar = 0, telefono = 0, encontrados = 0;
        String nombre, apellido, email;

        System.out.println("EDITAR CONTACTO");
        System.out.println("Ingrese el DNI del contacto a editar: ");
        dni = EvaluarIngreso.deEntero(dni);

        for (Contacto contacto: lista){
            if(contacto.getDni() == dni){
                do {
                    System.out.print("Ingrese el nombre del contacto: ");
                    nombre = leer.nextLine();
                    System.out.print("Ingrese el apellido del contacto: ");
                    apellido = leer.nextLine();
                    System.out.print("Ingrese el DNI del contacto: ");
                    dniEditar = EvaluarIngreso.deEntero(dniEditar);
                    System.out.print("Ingrese el telefono del contacto: ");
                    telefono = EvaluarIngreso.deEntero(telefono);
                    System.out.print("Ingrese el email del contacto: ");
                    email = leer.nextLine();

                    System.out.println("\nEDICION INVALIDADA, SE REINICIARA EL PROCESO\n");
                }while (dniEditar == 0 || telefono == 0);

                contacto.setNombre(nombre);
                contacto.setApellido(apellido);
                contacto.setDni(dniEditar);
                contacto.setTelefono(String.valueOf(telefono));
                contacto.setEmail(email);
                encontrados++;
                System.out.println("Contacto editado correctamente");
            }
        }

        if(encontrados == 0){
            System.out.println("NO EXISTEN CONTACTOS QUE EL DNI " + dni);
        }
    }
}
