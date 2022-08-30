package trabajosPracticos;

public class UsoCuenta {
    public static void main(String[] args){

        CuentaCorriente cuenta1 = new CuentaCorriente("Matias Barboza", 5000);
        CuentaCorriente cuenta2 = new CuentaCorriente("Agustin Mansilla", 2800);

        System.out.println(cuenta1);
        System.out.println(cuenta2 + "\n\n");

        cuenta1.transferencia(2500,cuenta2);

        System.out.println(cuenta1);
        System.out.println(cuenta2);
    }

    public static class CuentaCorriente{
        private String nombreTitular;
        private double saldo;
        private long numeroCuenta;

        public CuentaCorriente(String nombreTitular,double saldo){
            this.nombreTitular = nombreTitular;
            this.saldo = saldo;
            double numeroGenerado = 1000000000000000000.0 + (Math.random()*999999999999999999.0);
            this.numeroCuenta = (long) numeroGenerado;
        }

        public double getSaldo(){
            return saldo;
        }

        public void ingreso(double monto){
            this.saldo = monto;
        }

        public void reintegro(double gasto,int porcentajeReintegro){
            this.saldo = (getSaldo() + gasto*(porcentajeReintegro*1.00/100));
        }

        public void transferencia(double monto,CuentaCorriente destino){
            if (getSaldo() - monto >= 0) {
                this.saldo = (getSaldo() - monto);
                destino.ingreso(destino.getSaldo() + monto);
            }else{
                System.out.println("Saldo insuficiente para realizar la operacion");
            }
        }

        public String toString(){
            return "NUMERO DE CUENTA: " + this.numeroCuenta + " , CLIENTE: " + this.nombreTitular + " , SALDO: " + this.saldo;
        }
    }
}
