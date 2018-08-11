/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Motorcycle;

import java.util.Scanner;

/**
 *
 * @author Sebastián
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Champion ch = new Champion();
        while(true){
            System.out.println("1. Add Motorcycle");
            System.out.println("2. Read entry");
            System.out.println("3. Show Positions");
            System.out.println("4. Exit");
            System.out.print("Answer: ");
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            
            switch(n){
                case 1: 
                    System.out.println("--Do you want add no-default values");
                    System.out.println("--1. Yes");
                    System.out.println("--2. No");
                    System.out.print("Answer: ");
                    n = sc.nextInt();
                    switch(n){
                        case 1:
                            System.out.print("---Speed: ");
                            double speed = sc.nextDouble();
                            System.out.print("---Gear: ");
                            double gear = sc.nextDouble();
                            System.out.println("------------");
                            ch.addMotorcycle(speed, gear);
                            System.out.println("------------");
                            break;
                        case 2:
                        default:
                            ch.addMotorcycle();
                    }
                    break;
                case 2: 
                    System.out.print("ID: ");
                    sc = new Scanner(System.in);
                    int id = sc.nextInt();
                    
                    System.out.print("SPEEDUP: ");
                    sc = new Scanner(System.in);
                    double speedUp = sc.nextDouble();
                    
                    System.out.println("------------");
                    ch.readEntry(id, speedUp);
                    System.out.println("------------");
                    break;
                case 3:
                    System.out.println("------------");
                    ch.getDistances();
                    System.out.println("------------");
                    break;
                case 4:    
                    return;
            }
            
        }
    }
    
}
