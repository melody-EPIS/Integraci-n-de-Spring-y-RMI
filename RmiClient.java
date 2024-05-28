// Importa la clase LocateRegistry que proporciona métodos para crear un registro de RMI y obtener acceso en un puerto específico
// En este caso, se usa otro método que también obtiene referencias a un registro RMI
import java.rmi.registry.LocateRegistry;
// Importa la interfaz Registry que define un regitro RMI, como buscar objetos remotos por nomre
import java.rmi.registry.Registry;

public class RmiClient {
  
    public static void main(String[] args) throws Exception {
	    // Obtiene referencia al registro TMI que se está ejecuatndo en localhost en puerto 1099 a través de getRegistry
        Registry registry = LocateRegistry.getRegistry("localhost", 1099);
	    // Busca el objeto remoto asociado con el nombre "CalculatorService" en el resgitro, utilizando lookup
 	    // luego hace un cast a la interfaz CalculatorService, devolviendo una referencia al objeto remoto
        CalculatorService calculatorService = (CalculatorService) registry.lookup("CalculatorService");
        // Llama a los metodos del objeto remoto calculatorService
        int resultAdd = calculatorService.add(10, 5);
        int resultSubtract = calculatorService.subtract(10, 5);
        
	    // Imprime resultados
        System.out.println("Result of add operation: " + resultAdd);
        System.out.println("Result of subtract operation: " + resultSubtract);
    }
}
