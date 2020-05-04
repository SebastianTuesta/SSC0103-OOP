/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MountainBike;

/**
 *
 * @author Sebastián
 */
public class TestBikes {

    public static void main(String[] args) {
        MountainBike bike01, bike02;
        System.out.println("Nova MoutainBike");
        bike01 = new MountainBike("MBSuspension");
        System.out.println("\nNova ChildMountainBike");
        bike02 = new ChildMountainBike("ChildSupension");
        System.out.println("\nDescricao MountainBike:");
        bike01.printDescription();
        System.out.println("\nDescricao ChildMountainBike");
        bike02.printDescription();
    }
}
