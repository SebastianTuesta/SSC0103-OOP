/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Airline;

import java.util.Date;

/**
 *
 * @author Sebastián
 */
public class InternationalFlight extends Flight{
    
    public InternationalFlight(String code, Date schedule, Date date, int numberVacantSites, int numberTripulation, Airport start, Airport finish) {
        super(code, schedule, date, numberVacantSites, numberTripulation, start, finish);
    }
    
    
    
}
