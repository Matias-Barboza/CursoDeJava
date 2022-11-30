package tiposAbstractosDeDatos.grafo;

import java.util.LinkedList;

public class GrafoDirigido {
    private String[] vertices;
    private int[][] matrizPesos;
    private LinkedList<AristaDirigida> aristas;
    private LinkedList<VerticeDirigido> verticesD;
    private int numAristas;

    public GrafoDirigido(String[] vertices){
        this.vertices = vertices;
        this.matrizPesos = new int[vertices.length][vertices.length];
        this.aristas = new LinkedList<>();
        this.verticesD = new LinkedList<>();
        this.numAristas = 0;
    }

    public String[] getVertices() {
        return vertices;
    }

    public void setVertices(String[] vertices) {
        this.vertices = vertices;
    }

    public int[][] getMatrizPesos() {
        return matrizPesos;
    }

    public void setMatrizPesos(int[][] matrizPesos) {
        this.matrizPesos = matrizPesos;
    }

    public LinkedList<AristaDirigida> getAristas() {
        return aristas;
    }

    public LinkedList<VerticeDirigido> getVerticesD() {
        return verticesD;
    }

    public void setVerticesD(LinkedList<VerticeDirigido> verticesD) {
        this.verticesD = verticesD;
    }

    public int getNumAristas() {
        return numAristas;
    }

    public void setNumAristas(int numAristas) {
        this.numAristas = numAristas;
    }

    public void setAristas(LinkedList<AristaDirigida> aristas) {
        this.aristas = aristas;
    }

    public void conectar(String vertice1, String vertice2){

        if(estanIncluidos(vertice1,vertice2)){

            for(int i=0; i < vertices.length ; i++){
                for (int j=0; j < vertices.length; j++){
                    if(vertices[i].equals(vertice1) && vertices[j].equals(vertice2)){
                        matrizPesos[i][j] = 1;
                    }
                }
            }

            aristas.add(new AristaDirigida(numAristas,vertice1,vertice2));
            numAristas++;

            if(noExiste(vertice1) && noExiste(vertice2)){
                verticesD.add(new VerticeDirigido(vertice1));
                verticesD.add(new VerticeDirigido(vertice2));
            }else if(noExiste(vertice1) && !noExiste(vertice2)){
                verticesD.add(new VerticeDirigido(vertice1));
            }else if(!noExiste(vertice1) && noExiste(vertice2)){
                verticesD.add(new VerticeDirigido(vertice2));
            }

            for (VerticeDirigido vertice:verticesD) {
                if(vertice.getValor().equals(vertice1)){
                    vertice.añadirAdyacente(vertice2);
                }
            }

        }else{
            System.out.println("Error en los vertices");
        }

    }

    public void conectar(String vertice1, String vertice2,int peso){

        if(estanIncluidos(vertice1,vertice2) && peso > 0){

            for(int i=0; i < vertices.length ; i++){
                for (int j=0; j < vertices.length; j++){
                    if(vertices[i].equals(vertice1) && vertices[j].equals(vertice2)){
                        matrizPesos[i][j] = peso;
                    }
                }
            }

            aristas.add(new AristaDirigida(numAristas,vertice1,vertice2));
            numAristas++;

            if(noExiste(vertice1) && noExiste(vertice2)){
                verticesD.add(new VerticeDirigido(vertice1));
                verticesD.add(new VerticeDirigido(vertice2));
            }else if(noExiste(vertice1) && !noExiste(vertice2)){
                verticesD.add(new VerticeDirigido(vertice1));
            }else if(!noExiste(vertice1) && noExiste(vertice2)){
                verticesD.add(new VerticeDirigido(vertice2));
            }

            for (VerticeDirigido vertice:verticesD) {
                if(vertice.getValor().equals(vertice1)){
                    vertice.añadirAdyacente(vertice2);
                }
            }

        }else{
            System.out.println("Error en el ingreso de datos");
        }

    }

    private boolean estanIncluidos(String vertice1,String vertice2){
        int num = 0;

        for (int i=0; i < vertices.length; i++){
            if(vertices[i].equals(vertice1)){
                num++;
            }else if(vertices[i].equals(vertice2)){
                num++;
            }
        }

        return num == 2;
    }

    private boolean noExiste(String vertice){
        int num = 0;

        for (VerticeDirigido verticeD:verticesD) {
            if(vertice.equals(verticeD.getValor())){
                num++;
            }
        }

        return num==0;
    }

    public void imprimirMatriz(){
        Object[][] matrizCompleta = new Object[(vertices.length+1)][(vertices.length+1)];


        for (int i = 0; i < (vertices.length+1) ; i++){
            for (int j = 0; j < (vertices.length + 1); j++){
                if(i == 0 && j != 0){
                    matrizCompleta[i][j] = vertices[j-1] + "\t";
                }else if(i != 0 && j == 0){
                    matrizCompleta[i][j] = vertices[i-1] + "\t";
                }else if(i == 0 && j == 0){
                    matrizCompleta[i][j] = "\t";
                }else{
                    matrizCompleta[i][j] = matrizPesos[i-1][j-1] + "\t";
                }
                System.out.print(matrizCompleta[i][j]);
            }
            System.out.println();
        }
    }

    public void imprimirParesAdyacencia(){
        for (AristaDirigida arista:aristas){
            System.out.println(arista);
        }
    }

    public void imprimirListaDeAdyacencia(){
        for (VerticeDirigido vertice:verticesD){
            System.out.println(vertice);
        }
    }
}
