package Distribuida;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class EjemploClienteRMI {

    public static void main(String[] args) throws Exception {
        Registry registry = LocateRegistry.getRegistry("localhost", 1099);
        EjemploInterfaz objetoRemoto = (EjemploInterfaz) registry.lookup("EjemploObjetoRemoto");
        objetoRemoto.saludar("Juan");
    }
}
