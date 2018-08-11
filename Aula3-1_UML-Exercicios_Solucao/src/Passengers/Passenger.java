/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Passengers;

import Airline.Flight;
import Airline.Operator;
import Airline.Person;

/**
 *
 * @author Sebastián
 */
public class Passenger extends Person{
       
    public Passenger(String documentCode, String name) {
        super(documentCode, name);
    }
    
    public boolean createReservation(Operator o, Flight f, int numberSeat){
        return o.createReservation(this, f, numberSeat);
    }
    
    public boolean createReservation(Operator o, Flight f){
        return o.createReservation(this, f);
    }
    
    public boolean cancelReservation(Operator o, Flight f, int numberSeat){
        return o.cancelReservation(this, f, numberSeat);
    }
    
    public boolean paid(Operator o, Flight f, int numberSeat){
        return o.paid(this, f, numberSeat);
    }
    
    public boolean isPaid(Operator o, Flight f, int numberSeat){
        return o.isPaid(this, f, numberSeat);
    }
}
