package trabajosPracticos;

import java.util.Scanner;

public class ejercicioRaizScanner {

    public static void main(String[] args){
        Scanner leer = new Scanner(System.in);

        RaizScanner raizScanner = new RaizScanner();

        int numero;

        System.out.println("Ingrese un numero:");

        numero = leer.nextInt();

        raizScanner.calculoRaiz(numero);

    }

    public static class RaizScanner {
        public void calculoRaiz(int numero){
            if(numero>0){
                System.out.println("La raiz cuadrada de "+ numero +" es: "+ Math.sqrt(numero));
            }else{
                System.out.println("El numero debe ser positivo");
            }
        }
    }

}
