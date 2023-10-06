/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package S08_16;

/**
 *
 * @author Carlos
 */
public class Animal_16 {
        // Atributos
    public String nombre;
    public int edad;
    public String especie;

    // Constructor
    public Animal_16(String nombre, int edad, String especie) {
        this.nombre = nombre;
        this.edad = edad;
        this.especie = especie;
    }

    // Métodos
    public void emitirSonido() {
        System.out.println(nombre + " emite un sonido.");
    }

    public void comer() {
        System.out.println(nombre + " está comiendo.");
    }

    public void presentarse() {
        System.out.println("Hola, soy un " + especie + " llamado " + nombre + " y tengo " + edad + " años.");
    }

}
