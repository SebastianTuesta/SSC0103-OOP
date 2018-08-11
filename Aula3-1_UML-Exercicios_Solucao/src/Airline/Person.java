/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Airline;

/**
 *
 * @author Sebastián
 */
public abstract class Person {
    private final String documentCode;
    private final String name;

    public Person(String documentCode, String name) {
        this.documentCode = documentCode;
        this.name = name;
    }    
}
