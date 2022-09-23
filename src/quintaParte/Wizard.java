package quintaParte;

public class Wizard extends Personaje implements Ataque,Defensa{

    public Wizard() {
        this.ptosVida *= 1.1;
        this.ptosFuerza *= 1.1;
        this.ptosDefensa *= 1.1;
    }

    @Override
    public String toString() {
        return "Wizard: \n" + "Puntos de vida restantes: " + this.ptosVida ;
    }
}
