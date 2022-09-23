package cuartaParte;

public class Circulo extends FGeometricas{

    private double radio;

    public Circulo(double radio){
        this.radio = radio;
    }

    @Override
    public double area() {
        return Math.PI*(Math.pow(2,this.radio));
    }

}
