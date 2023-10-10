/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package S11_16_E01;

/**
 *
 * @author Lab06
 */
public class Main_S16_16 {

    public static void main(String[] args) {
        // TODO code application logic here
        Estudiante_16 estudiante = new Estudiante_16("Sistemas", 3, 2, "Jose", 17, "20 de FebreroR");
        
        /*Demo_16 dem = new Demo_16(1, "B");
        Demo_16 dem2 = new Demo_16();*/
        
        estudiante.carrera = "carrera";
        estudiante.hablar();
        estudiante.escuchar();
        estudiante.caminar();
        estudiante.getNombre();
        estudiante.getEdad();
        estudiante.getClass();
        estudiante.getFechaNac();
    }
    
}
