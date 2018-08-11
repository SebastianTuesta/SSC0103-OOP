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
public class Reservation {
    private Passenger passenger;
    private final int numberSeat;
    private boolean paid;

    public void paid() {
        paid = true;
    }

    public boolean isPaid(){
        return paid;
    }
    
    public Reservation(int numberSeat){
        this.paid = false;
        this.numberSeat = numberSeat;
    }
    
    public void setPassenger(Passenger passenger){
        this.passenger = passenger;
    }

    public Passenger getPassenger() {
        return passenger;
    }    
    
    public int getNumberSeat(){
        return numberSeat;
    }
    
}
