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
public class Main_S08_16 {
    public void Main_S08_16 (String [] args){
        
        System.out.println("Hola mundo");
        
              // Crear objetos de la clase Estudiante
        Estudiante_16 estudiante1 = new Estudiante_16("Juan", 20, "Matemáticas");
        Estudiante_16 estudiante2 = new Estudiante_16("María", 22, "Historia");

        // Llamar a métodos de la clase Estudiante
        estudiante1.presentarse();
        estudiante1.estudiar();

        estudiante2.presentarse();
        estudiante2.estudiar();
        
                // Llamar a métodos estáticos de la clase Calculadora
        int resultadoSuma = Calculadora_16.sumar(5, 3);
        int resultadoResta = Calculadora_16.restar(10, 4);
        int resultadoMultiplicacion = Calculadora_16.multiplicar(6, 7);
        double resultadoDivision = Calculadora_16.dividir(8.0, 2.0);

        System.out.println("Suma: " + resultadoSuma);
        System.out.println("Resta: " + resultadoResta);
        System.out.println("Multiplicación: " + resultadoMultiplicacion);
        System.out.println("División: " + resultadoDivision);
        
                // Crear objetos de la clase Animal
        Animal_16 perro = new Animal_16("Buddy", 3, "Perro");
        Animal_16 gato = new Animal_16("Whiskers", 2, "Gato");

        // Llamar a métodos de la clase Animal
        perro.presentarse();
        perro.emitirSonido();
        perro.comer();

        gato.presentarse();
        gato.emitirSonido();
        gato.comer();
    }
}
