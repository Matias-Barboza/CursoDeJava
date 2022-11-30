package tiposAbstractosDeDatos.grafo;

public class AristaNoDirigida {
    private int valor;
    private String[] conexion;

    public AristaNoDirigida(int valor,String vertice1,String vertice2){
        this.valor = valor;
        conexion = new String[2];
        conexion[0] = vertice1;
        conexion[1] = vertice2;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public String[] getConexion() {
        return conexion;
    }

    public void setConexion(String[] conexion) {
        this.conexion = conexion;
    }

    @Override
    public String toString() {
        return  valor + "| " + conexion[0] + ", " + conexion[1] ;
    }
}
