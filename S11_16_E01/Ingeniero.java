/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package S11_16_E01;

/**
 *
 * @author Lab06
 */
public class Ingeniero extends Persona_16 {

    public Ingeniero(int aniosCarrera, String Metodologia, int id, String nombre, int edad, String fechaNac) {
        super(nombre, edad, fechaNac);
        this.aniosCarrera = aniosCarrera;
        this.Metodologia = Metodologia;
        this.id = id;
    }
    
    
    
    
    //Atributos
    int aniosCarrera;
    String Metodologia;
    int id;
    
    public void carrera(){
        
    }
    
    public void metodologia(){
        
    }
    
}
