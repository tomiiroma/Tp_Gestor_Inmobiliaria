package interfaces;

import java.util.List; 

import inmobiliaria.Inquilino;

public interface InquilinoRepository {

	//prototipos de metodos 
    List<Inquilino> getAllInquilino(); 
    
    Inquilino getInquilinoById(int id); 
    
    void addInquilino(Inquilino Inquilino); 
    
    void updateInquilino(Inquilino inquilino); 
    
    void deleteInquilino(int id); 
}
