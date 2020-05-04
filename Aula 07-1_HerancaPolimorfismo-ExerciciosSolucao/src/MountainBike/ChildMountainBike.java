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
public class ChildMountainBike extends MountainBike {

    private String suspension = "DEFAULT";

    public ChildMountainBike(String suspensionType) {
        super(suspensionType);
    }

    @Override
    public void setSuspension(String suspensionType) {
        System.out.println("ChildMountainBike setSuspension: "
                + "nao faz nada!");
    }

    @Override
    public void printDescription() {
        super.printDescription();
        System.out.println("The " + "ChildMountainBike has a <"
                + suspension + "> suspension.");
    }
}
