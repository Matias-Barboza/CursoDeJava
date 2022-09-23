package trabajosPracticos.practicaParcial2;

import java.io.IOException;

public class ExcepcionEvaluarIngreso extends IOException {

    public ExcepcionEvaluarIngreso(){

    }

    public ExcepcionEvaluarIngreso(String mensajeDeError){
        super(mensajeDeError);
    }
}
