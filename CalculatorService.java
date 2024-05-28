// Importa la interfaz Remote, fundamental para Java Remote Method Invocation. Todas las interfaces remotas deben extender Remote para que los objetos implementadores CalculatorServiceImpl sean considerados como objetos remotos
import java.rmi.Remote;
// Importa clase RemoteException, que puede ser lanzada durante una operación RMI para indicar que hubo un problema de comunicación. Todas las interfaces remotas deben declarar que sus métodos puedan lanzar RemoteException
import java.rmi.RemoteException;

// Al extender la interfaz Remote, CalculatorService se convierte en una interfaz remota, es decir, sus métodos pueden ser invocados desde una máquina remota
public interface CalculatorService extends Remote { 
    // Indica que puede lanzar RemoteException, lo que es necesario para todos los metodos de una interfaz remota
    public int add(int a, int b) throws RemoteException; 
    public int subtract(int a, int b) throws RemoteException; 
} 
