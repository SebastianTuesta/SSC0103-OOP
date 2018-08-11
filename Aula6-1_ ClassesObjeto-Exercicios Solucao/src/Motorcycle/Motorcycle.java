/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Motorcycle;

/**
 *
 * @author Sebastián
 */
public class Motorcycle {

    private int id;
    private double speed;
    private double gear;
    private int position;
    
    private static int numberOfMotorcycle = 0;

    public Motorcycle(double speed, double gear) {
        this.id = ++Motorcycle.numberOfMotorcycle;
        this.speed = speed;
        this.gear = gear;
    }

    public Motorcycle() {
        this(0, 0);
    }

    public int getId() {
        return id;
    }

    public double getSpeed() {
        return speed;
    }

    public double getGear() {
        return gear;
    }

    public void gearUp(double gear) {
        this.gear += gear;
        this.speed += this.gear * 2.5; 
    }

    public void speedUp(double speed) {
        this.speed += speed;
        this.gear += this.speed/2.5;
    }

    public void applyBreaks() {
        this.speed = 0;
        this.gear = 0;
    }
    
    public int getDistance(){
        return (int) (this.speed*950/this.gear)
                * (Motorcycle.numberOfMotorcycle - this.id + 1);
    }
    
    public void setPosition(int position){
        this.position = position;
    }
    
    public int getPosition(){
        return this.position;
    }
}
