/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Zoo;

/**
 *
 * @author Sebastián
 */
public class Zoo {

    public static void main(String[] args) {
        Animal animal = new Animal("Bicho", 8);
        Vaca vaca = new Vaca("Mimosa", 4);
        Gato gato = new Gato("Garfield", 4);
        Ovelha ovelha = new Ovelha("Dolly", 4);
        Animal bichos[] = {animal, vaca, gato, ovelha};
        // Aqui, cada instancia eh de um tipo especializado
        if (vaca instanceof Animal) {
            System.out.println("vaca eh Animal");
        }
        if (gato instanceof Animal) {
            System.out.println("gato eh Animal");
        }
        if (ovelha instanceof Animal) {
            System.out.println("ovelha eh Animal");
        }
        System.out.println("-----------\n");
        for (int i = 0; i < bichos.length; i++) {
            System.out.println(bichos[i].toString());
            System.out.println();
        }
    }
}

/**
 * 1. emitirSom() por defecto utiliza el metodo definido en la clase padre.
 * 2. 
*/