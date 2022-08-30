package trabajosPracticos;

import java.util.Scanner;

public class CalcularPeso {

    public static void main(String[] args){

        int altura;
        String genero;
        double pesoIdeal;

        Scanner leer = new Scanner(System.in);

        System.out.print("Ingrese su altura en cm: ");
        altura = leer.nextInt();

        while(altura<130 || altura>250){
            System.out.print("Altura invalida, ingrese nuevamente: ");
            altura = leer.nextInt();
        }

        leer.nextLine();

        System.out.print("Ingrese su genero (\"Hombre\" o \"Mujer\"): ");
        genero = leer.nextLine();

        while(!genero.equals("Hombre") && !genero.equals("Mujer")){
            System.out.print("Genero ingresado invalido, ingrese nuevamente: ");
            genero = leer.nextLine();
        }

        if(genero.equals("Hombre")){
            pesoIdeal = altura - 110;
        }else{
            pesoIdeal = altura - 120;
        }

        System.out.println("Su peso ideal es: " + pesoIdeal + "Kg");

    }

}
