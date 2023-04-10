package Distribuida;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;

public class EjemploObjetoRemoto extends UnicastRemoteObject implements EjemploInterfaz {

    public EjemploObjetoRemoto() throws RemoteException {
        super();
    }

    public void saludar(String nombre) throws RemoteException {
        System.out.println("Hola " + nombre + " desde el objeto remoto!");
    }

    public static void main(String[] args) throws Exception {
        Registry registry = LocateRegistry.createRegistry(1099);
        registry.rebind("EjemploObjetoRemoto", new EjemploObjetoRemoto());
        System.out.println("El objeto remoto ha sido registrado en el registro RMI.");
    }
}
