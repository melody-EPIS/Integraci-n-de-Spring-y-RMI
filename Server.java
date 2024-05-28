// Importa la clase LocateRegistry que proporciona métodos para crear un registro de RMI y obtener acceso en un puerto específico
import java.rmi.registry.LocateRegistry;
// Importa la interfaz Registry que define un regitro RMI, en esta clase permite a los clientes buscar objetos remotos por nombre, que se coloco en AppConfig
import java.rmi.registry.Registry; 
  
public class Server { 
    // Lanza una excepción genérica Exception para manejar cualquier posible excepción que ocurra
    public static void main(String[] args) throws Exception {
	    // Crea una instancia de CalculatorServiceImple que es la implementación de la interfaz remota CalculatorService
	    // Este será el objeto remoto que se expondrá a los clientes
        CalculatorService calculatorService = new CalculatorServiceImpl(); 
  
	    // Crea un registro RMI en el puerto 1099, el registro es un directorio que contiene referencias a los objetos remotos registrados
        Registry registry = LocateRegistry.createRegistry(1099);
        // Asocia el nombre CalcultaroService con el objeto creado calculatorService en el registro RMI
        // Esto hace que este objeto esté disponible para los clientes remotos que buscan CalculatorService en el registro
        registry.bind("CalculatorService", calculatorService); 
  
        System.out.println("Server started"); 
    } 
}
