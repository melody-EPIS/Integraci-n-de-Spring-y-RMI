// Clase que puede ser lanzada durante una operación de RMI para indicar que hubo problema de comunicación
import java.rmi.RemoteException;
// Importa clase UnicastRemoteObject base para exportar un objeto remoto con soporte para RMI
import java.rmi.server.UnicastRemoteObject; 
 
// Clase que hereda de UnicastRemoteObject
public class CalculatorServiceImpl extends UnicastRemoteObject implements CalculatorService { 
    
    // Constructor que invoca al constructor de la clase UnicastRemoteObject, para que pueda ser exportado correctamente como un objeto remoto
    // Lanza RemoteException porque el constructor de UnicastRemoteObject también lanza esta excepción
    public CalculatorServiceImpl() throws RemoteException { 
        super(); 
    } 
    
    // El método puede lanzar una excepción como lo requiere la interfaz remota
    public int add(int a, int b) throws RemoteException { 
        return a + b; 
    }

    // El método puede lanzar una excepción como lo requiere la interfaz remota
    public int subtract(int a, int b) throws RemoteException { 
        return a - b; 
    } 
}
