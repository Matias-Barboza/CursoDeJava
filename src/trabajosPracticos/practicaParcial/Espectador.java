package trabajosPracticos.practicaParcial;

public class Espectador extends Persona {

    public String butaca;

    public Espectador(String nombre, String butaca) {
        super(nombre);
        this.butaca = butaca;
    }

    public String getButaca() {
        return butaca;
    }

    @Override
    public String toString(){
        return '\n' + super.toString() + ", Butaca asignada: " + this.butaca + '\n';
    }

}
