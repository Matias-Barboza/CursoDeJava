package tiposAbstractosDeDatos.grafo;

public class AristaDirigida {
    private int valor;
    private String[] conexion;

    public AristaDirigida(int valor,String vertice1,String vertice2){
        this.valor = valor;
        conexion = new String[2];
        conexion[0] = vertice1;
        conexion[1] = vertice2;
    }

    @Override
    public String toString() {
        return  valor + "| " + conexion[0] + ", " + conexion[1] ;
    }
}
