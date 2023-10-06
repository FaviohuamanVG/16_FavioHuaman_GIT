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
public class Estudiante_16 {
        // Atributos
    private String nombre;
    private int edad;
    private String curso;

    // Constructor
    public Estudiante_16(String nombre, int edad, String curso) {
        this.nombre = nombre;
        this.edad = edad;
        this.curso = curso;
    }

    // Métodos
    public void estudiar() {
        System.out.println(nombre + " está estudiando en el curso de " + curso);
    }

    public void presentarse() {
        System.out.println("Hola, soy " + nombre + " y tengo " + edad + " años.");
    }
}
