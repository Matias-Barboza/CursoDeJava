package quintaParte;

public class Paladin extends Personaje implements Ataque,Defensa {

    public Paladin(){
        this.ptosVida *= 1.5;
        this.ptosFuerza *= 1.2;
        this.ptosDefensa *= 1.5;
    }

    @Override
    public String toString() {
        return "Paladin: \n" + "Puntos de vida restantes: " + this.ptosVida ;
    }
}
