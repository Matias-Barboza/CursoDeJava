package trabajosPracticos.parcialIILab;

import java.io.FileWriter;

public class Archivo implements Impresion{

    private String textoAImprimir;
    private String nombreArchivo;

    public Archivo(String nombreArchivo){
        this.nombreArchivo = nombreArchivo;
    }

    @Override
    public void imprimir(String texto) {
        try {
            FileWriter escritura = new FileWriter(nombreArchivo +".txt");
            textoAImprimir = texto;

            for (int i=0; i < textoAImprimir.length(); i++){
                escritura.write(texto.charAt(i));
            }

            escritura.write("\n");
            escritura.close();

        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
