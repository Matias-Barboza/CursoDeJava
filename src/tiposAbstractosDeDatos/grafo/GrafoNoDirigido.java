package tiposAbstractosDeDatos.grafo;

import java.util.LinkedList;

public class GrafoNoDirigido {
    private String[] vertices;
    private int[][] matrizPesos;
    private int[][] matrizPesos2;
    private LinkedList<AristaNoDirigida> aristas;
    private LinkedList<VerticeNoDirigido> verticesND;
    private int numAristas;

    public GrafoNoDirigido(String[] vertices){
        this.vertices = vertices;
        this.matrizPesos = new int[vertices.length][vertices.length];
        this.matrizPesos2 = new int[vertices.length][vertices.length];
        this.aristas = new LinkedList<>();
        this.verticesND = new LinkedList<>();
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

    public LinkedList<AristaNoDirigida> getAristas() {
        return aristas;
    }

    public void setAristas(LinkedList<AristaNoDirigida> aristas) {
        this.aristas = aristas;
    }

    public LinkedList<VerticeNoDirigido> getVerticesND() {
        return verticesND;
    }

    public void setVerticesND(LinkedList<VerticeNoDirigido> verticesND) {
        this.verticesND = verticesND;
    }

    public int getNumAristas() {
        return numAristas;
    }

    public void setNumAristas(int numAristas) {
        this.numAristas = numAristas;
    }

    public void conectar(String vertice1, String vertice2){

        if(estanIncluidos(vertice1,vertice2)){

            if(estanConectados(vertice1,vertice2) == 1 || (estanConectados(vertice1,vertice2) == 0)){
                if(estanConectados(vertice1,vertice2) == 1){
                    for(int i=0; i < vertices.length ; i++){
                        for (int j=0; j < vertices.length; j++){
                            if(vertices[i].equals(vertice1) && vertices[j].equals(vertice2)){
                                matrizPesos[i][j] = 2;
                            }else if(vertices[j].equals(vertice1) && vertices[i].equals(vertice2)){
                                matrizPesos[i][j] = 2;
                            }
                        }
                    }
                }else{
                    for (int i = 0; i < vertices.length; i++) {
                        for (int j = 0; j < vertices.length; j++) {
                            if (vertices[i].equals(vertice1) && vertices[j].equals(vertice2)) {
                                matrizPesos[i][j] = 1;
                            } else if (vertices[j].equals(vertice1) && vertices[i].equals(vertice2)) {
                                matrizPesos[i][j] = 1;
                            }
                        }
                    }
                }

                aristas.add(new AristaNoDirigida(numAristas,vertice1,vertice2));
                numAristas++;

                if(noExiste(vertice1) && noExiste(vertice2)){
                    verticesND.add(new VerticeNoDirigido(vertice1));
                    verticesND.add(new VerticeNoDirigido(vertice2));
                }else if(noExiste(vertice1) && !noExiste(vertice2)){
                    verticesND.add(new VerticeNoDirigido(vertice1));
                }else if(!noExiste(vertice1) && noExiste(vertice2)){
                    verticesND.add(new VerticeNoDirigido(vertice2));
                }

                if(estanConectados(vertice1,vertice2) == 1) {
                    for (VerticeNoDirigido vertice : verticesND) {
                        if (vertice.getValor().equals(vertice1)) {
                            vertice.añadirAdyacente(vertice2);
                        } else if (vertice.getValor().equals(vertice2)) {
                            vertice.añadirAdyacente(vertice1);
                        }
                    }
                }
            }else {
                System.out.println("Los Vertices tienen el maximo de conexiones: 2");
            }

        }else{
            System.out.println("Error en el ingreso de datos");
        }

    }

    public void conectar(String vertice1, String vertice2,int peso){

        if(estanIncluidos(vertice1,vertice2) && peso > 0){

            if(estanConectados(vertice1,vertice2) == 1 || (estanConectados(vertice1,vertice2) == 0)){

                if(estanConectados(vertice1,vertice2) == 0){
                    for(int i=0; i < vertices.length ; i++){
                        for (int j=0; j < vertices.length; j++){
                            if(vertices[i].equals(vertice1) && vertices[j].equals(vertice2)){
                                matrizPesos[i][j] = peso;
                            }else if(vertices[j].equals(vertice1) && vertices[i].equals(vertice2)){
                                matrizPesos[i][j] = peso;
                            }
                        }
                    }
                }else{
                    for (int i = 0; i < vertices.length; i++) {
                        for (int j = 0; j < vertices.length; j++) {
                            if (vertices[i].equals(vertice1) && vertices[j].equals(vertice2)) {
                                matrizPesos2[i][j] = peso;
                            } else if (vertices[j].equals(vertice1) && vertices[i].equals(vertice2)) {
                                matrizPesos2[i][j] = peso;
                            }
                        }
                    }
                }

                aristas.add(new AristaNoDirigida(peso,vertice1,vertice2));
                numAristas++;

                if(noExiste(vertice1) && noExiste(vertice2)){
                    verticesND.add(new VerticeNoDirigido(vertice1));
                    verticesND.add(new VerticeNoDirigido(vertice2));
                }else if(noExiste(vertice1) && !noExiste(vertice2)){
                    verticesND.add(new VerticeNoDirigido(vertice1));
                }else if(!noExiste(vertice1) && noExiste(vertice2)){
                    verticesND.add(new VerticeNoDirigido(vertice2));
                }

                if(estanConectados(vertice1,vertice2)  == 1) {
                    for (VerticeNoDirigido vertice : verticesND) {
                        if (vertice.getValor().equals(vertice1)) {
                            vertice.añadirAdyacente(vertice2);
                        } else if(vertice.getValor().equals(vertice2)) {
                            vertice.añadirAdyacente(vertice1);
                        }
                    }
                }

            }else {
                System.out.println("Los Vertices tienen el maximo de conexiones: 2");
            }

        }else{
            System.out.println("Error en el ingreso de datos");
        }

    }

    public void eliminarConexion(String vertice1,String vertice2){

        if(estanIncluidos(vertice1,vertice2)){

            if(estanConectados(vertice1, vertice2) != 0) {

                int valorArista = aristaQueLosUne(vertice1,vertice2);

                for (int i = 0; i < vertices.length; i++) {
                    for (int j = 0; j < vertices.length; j++) {
                        if (vertices[i].equals(vertice1) && vertices[j].equals(vertice2)) {
                            if(matrizPesos[i][j] == valorArista) {
                                matrizPesos[i][j] = 0;
                            }else if(matrizPesos2[i][j] == valorArista){
                                matrizPesos2[i][j] = 0;
                            }
                        } else if (vertices[j].equals(vertice1) && vertices[i].equals(vertice2)) {
                            if(matrizPesos[i][j] == valorArista) {
                                matrizPesos[i][j] = 0;
                            }else if(matrizPesos2[i][j] == valorArista){
                                matrizPesos2[i][j] = 0;
                            }
                        }
                    }
                }

                aristas.removeIf(arista -> arista.getConexion()[0].equals(vertice1) && arista.getConexion()[1].equals(vertice2));
                numAristas--;

                for (VerticeNoDirigido vertice : verticesND) {
                    if (vertice.getValor().equals(vertice1)) {
                        vertice.eliminarAdyacente(vertice2);
                    }
                }

            }else{
                System.out.println("Los Vertices no tienen conexion");
            }

        }else{
            System.out.println("Error en los vertices");
        }
    }

    public void modificarPeso(String vertice1,String vertice2,int peso){

        if(estanIncluidos(vertice1,vertice2)){

            for (AristaNoDirigida arista:aristas) {
                if(arista.getConexion()[0].equals(vertice1) && arista.getConexion()[1].equals(vertice2)){
                    arista.setValor(peso);
                }
            }

            for(int i=0; i < vertices.length ; i++){
                for (int j=0; j < vertices.length; j++){
                    if(vertices[i].equals(vertice1) && vertices[j].equals(vertice2)){
                        matrizPesos[i][j] = peso;
                    }else if(vertices[j].equals(vertice1) && vertices[i].equals(vertice2)){
                        matrizPesos[j][i] = peso;
                    }
                }
            }

        }else{
            System.out.println("Error en los vertices");
        }
    }

    public void conocerConexion(String vertice1,String vertice2){
        boolean conectados = false;

        if(estanIncluidos(vertice1,vertice2)){

            for(int i=0; i < vertices.length ; i++){
                for (int j=0; j < vertices.length; j++){
                    if(vertices[i].equals(vertice1) && vertices[j].equals(vertice2)){
                        if(matrizPesos[i][j] > 0 && matrizPesos[j][i] > 0){
                            System.out.println("Los Vertices estan conectados");
                            conectados = true;
                        }
                    }
                }
            }

            if(!conectados){
                System.out.println("Los Vertices no estan conectados");
            }

        }else{
            System.out.println("Error en el ingreso de datos");
        }
    }

    private int estanConectados(String vertice1,String vertice2){
        int num = 0;

        for (AristaNoDirigida arista:aristas){
            if(arista.getConexion()[0].equals(vertice1) && arista.getConexion()[1].equals(vertice2)){
                num++;
            }else if(arista.getConexion()[0].equals(vertice2) && arista.getConexion()[1].equals(vertice1)){
                num++;
            }
        }

        return num;
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

        for (VerticeNoDirigido verticeD: verticesND) {
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
                    if(matrizPesos2[i-1][j-1] == 0) {
                        matrizCompleta[i][j] = matrizPesos[i - 1][j - 1] + "\t";
                    }else if(matrizPesos[i-1][j-1] == 0){
                        matrizCompleta[i][j] = matrizPesos2[i - 1][j - 1] + "\t";
                    }
                    else{
                        matrizCompleta[i][j] = matrizPesos[i - 1][j - 1] + "-" + matrizPesos2[i - 1][j - 1] + "\t";
                    }
                }
                System.out.print(matrizCompleta[i][j]);
            }
            System.out.println();
        }
    }

    public void imprimirParesAdyacencia(){
        for (AristaNoDirigida arista:aristas){
            System.out.println(arista);
        }
    }

    public void imprimirListaDeAdyacencia(){
        for (VerticeNoDirigido vertice: verticesND){
            System.out.println(vertice);
        }
    }

    public LinkedList<String> obtenerNodosAdyacentes(String vertice){
        for (VerticeNoDirigido verticeND: verticesND) {
            if(verticeND.getValor().equals(vertice)){
                return verticeND.getAdyacentes();
            }
        }

        return null;
    }

    private int aristaQueLosUne(String vertice1,String vertice2){
        for (AristaNoDirigida arista:aristas) {
            if(arista.getConexion()[0].equals(vertice1) && arista.getConexion()[1].equals(vertice2)){
                return arista.getValor();
            }
        }

        return -1;
    }
}
