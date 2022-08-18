package segundaParte;

import javax.swing.*;

public class EjerciciosRepaso1 {
    public static void main(String[] args) {

        int cantidad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de numeros a procesar:"));
        int []numeros = new int[cantidad];
        int suma = 0;

        for(int i=0;i<cantidad;i++){
             numeros[i] = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero:"));
             suma += numeros[i];
        }

        for(int i=0;i<cantidad;i++){
            System.out.print(numeros[i]);
            if(i<cantidad-1){
                System.out.print(" + ");
            }else{
                System.out.println(" = " + suma);
            }
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
