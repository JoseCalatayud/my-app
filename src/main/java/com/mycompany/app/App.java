package com.mycompany.app;

import java.util.*;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        // Inicio la clase Scanner para introducir por teclado un número
        // Scanner sc = new Scanner(System.in);
        // System.out.println("Introduzca un numero");
        // int a = sc.nextInt();
        // // Imprimo de prueba un "hello World"
        // System.out.printf("Es el numero %d \n", a);
        // System.out.println("Hello World!");
        // /*
        //  * System.out.println("Hello World!");
        //  * System.out.println("Hello World!");
        //  * System.out.println("Hello World!");
        //  */
        // sc.close();
        // // Cierro la entrada por teclado
        // Persona persona = new Persona();
        // persona.setNombre("Juan");
        // persona.setApellidos("Losada");
        // persona.setEdad(50);
        // persona.setProfesion("Profesor");
        // Persona persona1 = new Persona("Jose", "Calatayud", 44, "Programador");
        // System.out.println(persona.getNombre());
        // System.out.println(persona1.getNombre() + " " + persona1.getApellidos());
        // ArrayList<Persona> personas = new ArrayList<>();
        // personas.add(persona1);
        // personas.add(persona);

        // for (Persona persona2 : personas) {
        //     if (persona2.getProfesion() == "Profesor") {
        //         System.out.println(persona2.getNombre() + " " + persona2.getApellidos() + " " + "es profesor");
        //     } else {
        //         System.out.println(persona2.getNombre() + " " + persona2.getApellidos() + " " + "no es profesor");
        //     }
        // }
        // persona.hablar();
        // persona1.hablar();
        Coche coche1 = new Coche("Opel",500, 5, "4433KGB","automatico");
        coche1.subirMarcha();
        coche1.subirMarcha();
        coche1.subirMarcha();
        coche1.subirMarcha();
        coche1.subirMarcha();
        coche1.subbajarMarcha();
        coche1.subbajarMarcha();
        

    }
}
