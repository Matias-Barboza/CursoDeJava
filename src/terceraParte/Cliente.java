package terceraParte;

public class Cliente {
    private String nombre;
    private int nroCliente;
    private double saldo;

    public Cliente(String nombre, int nroCliente, double saldo){
        this.nombre = nombre;
        this.nroCliente = nroCliente;
        this.saldo = saldo;
    }

    public int getNroCliente (){
        return nroCliente;
    }

    public double getSaldo(){
        return saldo;
    }

    public void setSaldo(double monto){
        this.saldo = monto;
    }

    @Override
    public String toString() {
        return "Cliente n° " + nroCliente + " \n\tNombre: " + nombre + "\n\tSaldo: " + saldo ;
    }
}
