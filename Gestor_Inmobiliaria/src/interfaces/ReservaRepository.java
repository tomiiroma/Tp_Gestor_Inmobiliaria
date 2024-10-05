package interfaces;

import java.util.List; 

import inmobiliaria.Reserva;

public interface ReservaRepository {
	
	//prototipos de metodos 
    List<Reserva> getAllReserva(); 
    
    Reserva getReservaById(int id); 
    
    void addReserva(Reserva reserva); 
    
    void updateReserva(Reserva reserva); 
    
    void deleteReserva(int id); 

}
