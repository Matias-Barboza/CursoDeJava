package segundaParte;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class EjercicioRepaso1_2 {

    public static void main(String[] args) {

        int numero;
        int suma = 0;
        int cantidad;
        int j=0;
        String strNum = "c";

        List<String> numberArray = new ArrayList<>();


        while(!strNum.equals("f")){
            strNum = JOptionPane.showInputDialog("Ingrese un numero (f para salir):");
            numberArray.add(strNum);
        }

        cantidad = numberArray.size();
        numberArray.remove(cantidad-1);

        for(String i : numberArray) {
            numero = Integer.parseInt(i);
            suma += numero;
            if(j < cantidad - 2){
                System.out.print(numero + " + ");
            }else if (j < cantidad - 1) {
                System.out.print(numero + " = " + suma);
            }
            j++;
        }

        if(suma >=100){
            if(suma == 100){
                JOptionPane.showMessageDialog(null,"Es 100");
            }else{
                JOptionPane.showMessageDialog(null,"Es mayor a 100 porque es:" + suma);
            }
        }else if (suma < 0){
            JOptionPane.showMessageDialog(null,"Es negativo");
        }

    }
}
