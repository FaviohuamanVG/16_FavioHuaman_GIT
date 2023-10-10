/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package S11_16_E01;


public class Demo_16 extends Persona_16 {

    public Demo_16(int a, String b, String nombre, int edad, String fechaNac) {
        super(nombre, edad, fechaNac);
        this.a = a;
        this.b = b;
    }
    
//Atributos
    int a;
    String b;
    Float ar;

    
    public void AR(){
        System.out.println(a);
    }
    
    public void RD(){
        System.out.println(b);
    }
    
    public void TR(){
        System.out.println(ar);
    }
    
}
