package trabajosPracticos;

import java.util.Scanner;

public class AdivinarNumero {

    public static void main(String[] args){
        Scanner leer = new Scanner(System.in);

        double numeroGenerado = 1 + (Math.random()*100);
        int numeroRandom = (int) numeroGenerado;
        int numeroIntentos = 0,num;

        System.out.println("Hola! Vamos a jugar un juego: ");
        System.out.println("Tienes que adivinar el numero que estoy pensando entre 1 y 100");
        System.out.print("\n\nIngresa el numero: ");
        num = leer.nextInt();

        while(numeroRandom != num){
            if(numeroRandom>num){
                System.out.print("Estas mas cerca! Pero el numero que tengo en mente es mayor, intenta nuevamente: ");
            }else{
                System.out.print("Estas mas cerca! Pero el numero que tengo en mente es menor, intenta nuevamente: ");
            }
            numeroIntentos++;
            num = leer.nextInt();
        }

        numeroIntentos++;
        System.out.println("Acertaste! Solo te llevo "+ numeroIntentos + " intentos");

    }

}
