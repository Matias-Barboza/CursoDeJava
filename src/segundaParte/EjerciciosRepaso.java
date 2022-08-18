package segundaParte;

import javax.swing.*;

public class EjerciciosRepaso {

    public static void main(String[] args) {

        int numero1 = Integer.parseInt(JOptionPane.showInputDialog("Introduzca el primer numero"));

        int numero2 = Integer.parseInt(JOptionPane.showInputDialog("Introduzca el segundo numero"));

        int suma = numero1 + numero2;

        //Muestra el resultado a traves de consola
        //System.out.println("La suma de el numero: " + numero1 + " y el numero: " + numero2 + " es: "+suma);

        //Muestra el resultado por pantalla
        //JOptionPane.showMessageDialog(null,"La suma da como resultado " + suma);

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
