package interfaces;

import java.util.List; 

import inmobiliaria.Propietario;



public interface PropietarioRepository {
	
	
	    List<Propietario> getAllPropietario(); 
	    
	    Propietario getPropietarioById(int id); 
	    
	    void addPropietario(Propietario propietario); 
	    
	    void updatePropietario(Propietario propietario); 
	    
	    void deletePropietario(int id); 
	

	    
}
