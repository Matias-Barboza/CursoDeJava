package septimaParte;

import java.io.FileWriter;
import java.util.Scanner;

public class Escritura {
    public static void main(String[] args) {
        try {
            FileWriter escritura = new FileWriter("Tipos.txt");

            System.out.println("Ingrese el texto a escribir en el archivo");
            Scanner leer = new Scanner(System.in);
            String texto = leer.nextLine();

            for (int i=0; i < texto.length(); i++){
                escritura.write(texto.charAt(i));
            }

            escritura.write("\n");
            escritura.close();

        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
