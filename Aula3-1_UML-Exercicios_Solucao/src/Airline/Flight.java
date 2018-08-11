/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Airline;

import Passengers.Passenger;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author Sebastián
 */
public abstract class Flight {
    private final String code;
    private final Date schedulue;
    private final Date date;
    private final Airport start;
    private final Airport finish;
    private final int numberTripulation;
    private final int numberSites;
    private final List<Reservation> reservations;
    List<Integer> vacantSites = new ArrayList<>();
    
    public Flight(String code, Date schedule, Date date, 
            int numberSites, int numberTripulation,
                    Airport start, Airport finish){
            this.code = code;
            this.schedulue = schedule;
            this.date = date;
            this.numberTripulation = numberTripulation;
            this.start = start;
            this.finish = finish;
            this.numberSites = numberSites;
            
            vacantSites = new ArrayList<>();
            for(int i=1; i<=numberSites; i++){
                this.vacantSites.add(i);
            }
            
            reservations = new ArrayList<>();
    }
    
    public List<Integer> getVacantSites(){
        return vacantSites;
    }
    
    public int getNumberTripulation() {
        return numberTripulation;
    }
    
    public boolean addReservation(Passenger passenger){
        if(this.vacantSites.isEmpty())
            return false;
        
        Reservation r = new Reservation(this.vacantSites.get(0));
        this.vacantSites.remove(new Integer(r.getNumberSeat()));
        r.setPassenger(passenger);
        this.reservations.add(r);
        return true;
    }
    
    public boolean addReservation(Passenger passenger, int numberSeat){
        for(int i: vacantSites){
            if(i == numberSeat){
                Reservation r = new Reservation(numberSeat);
                this.vacantSites.remove(new Integer(numberSeat));
                r.setPassenger(passenger);
                this.reservations.add(r);
                return true;
            }
        }
        
        return false;
     
    }
    
    
    public boolean cancelReservation(Passenger passenger, int numberSeat){
        for(Reservation r: reservations){
            if(r.getNumberSeat() == numberSeat 
                    && r.getPassenger().equals(passenger)){
                this.reservations.remove(r);
                this.vacantSites.add(numberSeat);
                return true;
            }
        }
        return false;
    }
    
    public boolean paid(Passenger passenger, int numberSeat){
        for(Reservation r: reservations){
            if(r.getNumberSeat() == numberSeat 
                    && r.getPassenger().equals(passenger)){
                r.paid();
                return true;
            }
        }
        return false;
    }
    
    public boolean isPaid(Passenger passenger, int numberSeat){
        for(Reservation r: reservations){
            if(r.getNumberSeat() == numberSeat 
                    && r.getPassenger().equals(passenger)){
                return r.isPaid();
            }
        }
        return false;
    }
}
