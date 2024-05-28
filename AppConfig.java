// Importa anotación bean que indica que un método produce un bean
import org.springframework.context.annotation.Bean;
// Importa anotación configuration que puede indicar que una clase declara uno o más métodos bean
import org.springframework.context.annotation.Configuration;
// Importa clase RmiServiceExportes que es un exportador de servicios RMI para que un bean esté disponible a través de Remote Method Invocation
import org.springframework.remoting.rmi.RmiServiceExporter; 

// Es una clase de configuración de Spring  
@Configuration
// Crea una clase pública llamada AppConfig
public class AppConfig { 
  
    // Método que produce un bean que debe ser administrado por contenedor de Spring
    @Bean
    // Puede lanzar una excepción
    public RmiServiceExporter rmiServiceExporter() throws Exception { 
	    // Crea una instancia nueva de RmiServiceExporter
        RmiServiceExporter exporter = new RmiServiceExporter();
	    // Establece el nombre del servicio RMI como "CalculatorService", con el cual el servicio se expondrá en el registro RMI
        exporter.setServiceName("CalculatorService");
	    // Establece la interfaz del servicio RMI, configurando CalculatorService
        exporter.setServiceInterface(CalculatorService.class);
	    // Establece la implementación del servicio RMI, configurando una nueva instancia de CalculatorServiceImpl
        exporter.setService(new CalculatorServiceImpl()); 
	    // Establece el puerto de registro RMI como 1099
        exporter.setRegistryPort(1099);
	    // Retorna el RmiServiceExporter configurado, este objeto será gestionado como un bean por el contenedor de Spring
        return exporter;
    } 
} 