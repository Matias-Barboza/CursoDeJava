package trabajosPracticos.ParcialIILab;

import java.util.InputMismatchException;
import java.util.Scanner;

public final class EvaluarIngreso {

    public static int deEntero(int n){
        Scanner leer = new Scanner(System.in);
        try {
            n = leer.nextInt();
        }catch (InputMismatchException e){
            System.out.println("ERROR EN EL INGRESO DE DATOS");
            n = 0;
        }

        return  n;
    }
}
