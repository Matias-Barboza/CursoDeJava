package quintaParte;

public class Warrior extends Personaje implements Ataque,Defensa{

    public Warrior() {
        this.ptosVida *= 1.2;
        this.ptosFuerza *= 1.5;
        this.ptosDefensa *= 1.2;
    }

    @Override
    public String toString() {
        return "Warrior: \n" + "Puntos de vida restantes: " + this.ptosVida ;
    }
}
