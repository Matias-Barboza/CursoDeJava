package terceraParte;

public class programaBanco {

    public static void  main(String[] args){

        Caja cajaAutomatica = new Caja();

        Cliente clientela[] = {
                new Cliente("Matias Barboza",1234,5000),
                new Cliente("Alejo Czombos", 5678,10000),
                new Cliente("Agustin Campanella",9017,400),
                new Cliente("Agustin Mansilla", 2015,6700),
        };

        Banco bancoDeCorrientes = new Banco(clientela);

        for(Cliente cliente:clientela){
            cajaAutomatica.extraer(cliente,500);
            System.out.println(cliente);
        }

        System.out.println("\n\n" + bancoDeCorrientes);
    }

}
