/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import Airline.Airport;
import Airline.NationalFlight;
import Airline.Operator;
import Passengers.Passenger;
import java.util.Date;

/**
 *
 * @author Sebastián
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Airport start = new Airport("New York", 2000, "Airport 1");
        Airport finish = new Airport("Washintong D.C.", 2000, "Airport 2");

        NationalFlight f = new NationalFlight("Flight1", new Date(), new Date(),
                 20, 5, start, finish);

        Operator o = new Operator("123", "cavt");
        Passenger p = new Passenger("111", "sgtg");
        
        System.out.println(f.getVacantSites().toString());
        p.createReservation(o, f);
        System.out.println(f.getVacantSites().toString());
        p.createReservation(o, f, 15);
        System.out.println(f.getVacantSites().toString());
        p.cancelReservation(o, f, 15);
        System.out.println(f.getVacantSites().toString());
        p.createReservation(o, f, 15);
        System.out.println(f.getVacantSites().toString());   
    }

}
