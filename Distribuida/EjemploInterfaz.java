package Distribuida;
import java.rmi.Remote;
import java.rmi.RemoteException;

public interface EjemploInterfaz extends Remote {
    public void saludar(String nombre) throws RemoteException;
}
