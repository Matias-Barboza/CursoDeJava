package trabajosPracticos.practicaParcial2;

import javax.sound.midi.Soundbank;
import java.util.LinkedList;

public class Facultad {
    private String nombre;
    private LinkedList<Carrera> carreras;

    public Facultad(){
        this.carreras = new LinkedList<>();
    }

    public Facultad(String nombre){
        this.nombre = nombre;
        this.carreras = new LinkedList<>();
    }

    public void agregarCarrera(Carrera carrera){
        this.carreras.add(carrera);
    }

    public void mostrarCarreras(){
        System.out.println("Las carreras disponibles son: ");
        for(Carrera carrera:carreras){
            System.out.println(carrera);
        }
    }

}
