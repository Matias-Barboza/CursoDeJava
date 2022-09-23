package quintaParte;

import javax.swing.*;

public final class Pelea {

    public static void duelo(Personaje p1,Personaje p2){

        while(p1.getPtosVida()>=0 && p2.getPtosVida()>=0){
            int opcionJugador = Integer.parseInt(JOptionPane.showInputDialog("Ingrese una opcion: \n1- Para atacar\n2- Para defender"));
            int opcionEnemigo = (int) (Math.random()*2);

            if(opcionJugador == 1 && opcionEnemigo == 1){
                JOptionPane.showMessageDialog(null,"Ambos atacaron ¡ATAQUE FALLIDO!");
            }else if(opcionJugador == 1 && opcionEnemigo == 2){
                p1.atacar(p2);
                JOptionPane.showMessageDialog(null,p2.toString());
            }else if(opcionJugador == 2 && opcionEnemigo == 2){
                JOptionPane.showMessageDialog(null,"Ambos se defendieron ¡MOVIMIENTO INUTIL!");
            }else if(opcionJugador == 2 && opcionEnemigo == 1){
                p2.atacar(p1);
                JOptionPane.showMessageDialog(null,p1.toString());
            }
        }
    }
}
