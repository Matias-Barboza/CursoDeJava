package trabajosPracticos.practicaParcial;

import java.util.Arrays;

public class Sala implements Informaciones{

    private String nombre;
    private String pelicula;
    private int capacidad;
    private Espectador []espectadores;

    public Sala(String nombreSala,String pelicula,int capacidad){
        this.nombre = nombreSala;
        this.pelicula = pelicula;
        this.capacidad = capacidad;
    }

    public void asignarListaEspectadores(Espectador []espectadores){
        if(espectadores.length <= this.capacidad) {
            this.espectadores = espectadores;
        }else{
            System.out.println("La lista de espectadores supera la capacidad de la sala");
        }
    }

    public void listarEspectadores(){
        if(this.espectadores == null){
            System.out.println("SIN ESPECTADORES CARGADOS");
        }else{
            for(Espectador espectador:espectadores){
                System.out.println(espectador.toString());
            }
        }
    }

    /*
    public String espectadoresToString(Espectador []espectadores){

        String listaEspectadores = "";

        if(this.espectadores == null){
            return "0 espectadores";
        }else{
            for(int i=0; i < this.espectadores.length ; i++){
                listaEspectadores += espectadores[i].toString() + '\n';
            }
            return listaEspectadores;
        }
    }
    */

    @Override
    public String toString(){
        return "Nombre de la sala: " + this.nombre + ", Pelicula: " + this.pelicula + ", Capacidad: " + this.capacidad +
        '\n' + "Espectadores: " + '\n' + Arrays.toString(this.espectadores); //espectadoresToString(this.espectadores);
    }

    @Override
    public String getName() {
        return this.nombre;
    }
}
