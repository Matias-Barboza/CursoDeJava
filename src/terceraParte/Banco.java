package terceraParte;

import java.util.Arrays;

public class Banco {

    private Cliente clientela[];

    public Banco(Cliente clientela []){
        this.clientela = clientela;
    }

    public String toString(){
        return "Clientela:" + Arrays.toString(clientela);
    }
}
