package terceraParte;

public class Caja {

    public void extraer(Cliente titular, double monto){
        titular.setSaldo(titular.getSaldo() - monto);
    }

    public void depositar(Cliente titular,double monto){
        if(monto>0) {
            titular.setSaldo(titular.getSaldo() + monto);
        }
    }

    public void consultarSaldo(Cliente titular){
        System.out.println("Saldo disponible del la cuenta n°: " + titular.getNroCliente() + " es: " + titular.getSaldo());
    }
}
