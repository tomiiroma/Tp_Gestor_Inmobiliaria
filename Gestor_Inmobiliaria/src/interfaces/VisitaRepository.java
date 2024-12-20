package interfaces;

import java.util.List; 

import inmobiliaria.Visita;


public interface VisitaRepository {
	
	List<Visita> getAllVisita(); 
    
    Visita getVisitaById(int id); 
    
    void addVisita(Visita visita); 
    
    void updateVisita(Visita visita); 
    
    void deleteVisita(int id); 

}
