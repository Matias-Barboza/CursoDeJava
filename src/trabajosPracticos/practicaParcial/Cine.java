package trabajosPracticos.practicaParcial;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Cine {
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        Sala salaCinemaCenter = new Sala("Sala 1","Avengers 1",4);
        Sala salaCinemaCenter1 = new Sala("Sala 2","Avengers 2",5);
        Sala salaCinemaCenter2 = new Sala("Sala 3","Avengers 3",6);

        int cantidadEspectadores = 0;

        System.out.print("Ingrese la cantidad de espectadores de la siguiente lista: ");
        try {
            cantidadEspectadores = leer.nextInt();
            leer.nextLine();
        }catch (InputMismatchException e){
            System.out.println("Error en el ingreso de datos");
        }
        Espectador[] espectadores = new Espectador[cantidadEspectadores];

        for(int i=0; i < espectadores.length; i++){
            System.out.print("Ingrese el nombre del espectador " + (i+1) + ": ");
            String nombre = leer.nextLine();
            System.out.print("Ingrese la butaca del espectador " + (i+1) + ": ");
            String butaca = leer.nextLine();
            espectadores[i] = new Espectador(nombre,butaca);
        }

        salaCinemaCenter1.asignarListaEspectadores(espectadores);

        salaCinemaCenter1.listarEspectadores();

        System.out.println(salaCinemaCenter1.toString());

    }
}
