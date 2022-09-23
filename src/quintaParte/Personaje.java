package quintaParte;

public abstract class Personaje implements Ataque,Defensa {

    protected float ptosVida = 100.0f;
    protected float ptosFuerza = 10.0f;
    protected float ptosDefensa = 10.0f;

    public float getPtosVida() {
        return ptosVida;
    }

    public void setPtosVida(float ptosVida) {
        this.ptosVida = ptosVida;
    }

    public float getPtosFuerza() {
        return ptosFuerza;
    }

    public void setPtosFuerza(float ptosFuerza) {
        this.ptosFuerza = ptosFuerza;
    }

    public float getPtosDefensa() {
        return ptosDefensa;
    }

    public void setPtosDefensa(float ptosDefensa) {
        this.ptosDefensa = ptosDefensa;
    }

    public void atacar(Personaje enemigo){
        if(this.ptosFuerza > enemigo.getPtosDefensa()) {
            enemigo.setPtosVida(enemigo.getPtosVida() - (this.ptosFuerza - enemigo.getPtosDefensa()));
        }else if(this.ptosFuerza == enemigo.getPtosDefensa()){
            enemigo.setPtosVida(enemigo.getPtosVida() - 1);
        }else{
            enemigo.setPtosVida(enemigo.getPtosVida() - 0);
        }
    }

    public void defender(Personaje enemigo){
        if(this.ptosDefensa>enemigo.getPtosFuerza()){
            setPtosVida(getPtosVida()-0);
        }else if(this.ptosDefensa == enemigo.getPtosFuerza()){
            setPtosVida(getPtosVida()-1);
        }else{
            setPtosVida(getPtosVida()-(enemigo.ptosFuerza)-this.ptosDefensa);
        }
    }

    @Override
    public String toString() {
        return "Personaje: \n" + "Puntos de vida restante:" + ptosVida ;
    }
}
