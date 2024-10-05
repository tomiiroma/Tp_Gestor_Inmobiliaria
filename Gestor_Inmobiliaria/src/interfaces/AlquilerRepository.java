package interfaces;

import java.util.List;   

import inmobiliaria.Alquiler;

public interface AlquilerRepository {

	List<Alquiler> getAllAlquiler(); 
    
    Alquiler getAlquilerById(int id); 
    
    void addAlquiler(Alquiler alquiler); 
    
    void updateAlquiler(Alquiler alquiler); 
    
    void deleteAlquiler(int id); 
	
	
	
	
	
	
}
