package interfaces;

import java.util.List;  

import inmobiliaria.Alquiler;
import inmobiliaria.Cliente;

public interface ClienteRepository {

	
	
	
List<Cliente> getAllClientes(); 
    
    Cliente getClienteById(int id); 
    
}
