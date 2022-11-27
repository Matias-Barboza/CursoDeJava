package septimaParte;

import java.io.FileReader;

public class Lectura {
    public static void main(String[] args) {
        try {
            FileReader entrada = new FileReader("Tipos.txt");

            int caracter = entrada.read();
            char letra = (char) caracter;

            while (caracter != -1) {
                System.out.print(letra);
                caracter = entrada.read();
                letra = (char) caracter;
            }

            entrada.close();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}