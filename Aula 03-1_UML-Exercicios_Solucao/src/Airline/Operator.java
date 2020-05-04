/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Airline;

import Passengers.Passenger;

/**
 *
 * @author Sebastián
 */
public class Operator extends Person{
   
    public Operator(String documentCode, String name) {
        super(documentCode, name);
    }
   
    public boolean createReservation(Passenger p, Flight f, int numberSeat){
        return f.addReservation(p, numberSeat);
    }
    
    public boolean createReservation(Passenger p, Flight f){
        return f.addReservation(p);
    }
    
    public boolean cancelReservation(Passenger p, Flight f, int numberSeat){
        return f.cancelReservation(p, numberSeat);
    }
    
    public boolean paid(Passenger p, Flight f, int numberSeat){
        return f.paid(p, numberSeat);
    }
    
    public boolean isPaid(Passenger p, Flight f, int numberSeat){
        return f.isPaid(p, numberSeat);
    }
}
