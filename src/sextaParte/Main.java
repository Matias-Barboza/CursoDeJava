package sextaParte;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {

        try {
            BufferedImage imagen = ImageIO.read(new File("src/sextaParte/Bitacora.txt"));
            System.out.println("El bloc de notas existe");
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("El bloc de notas no existe");
        }

    }

}
