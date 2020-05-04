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
public class MountainBike {

    protected String suspension;

    public MountainBike(String suspensionType) {
        setSuspension(suspensionType);
    }

    public void setSuspension(String suspensionType) {
        System.out.println("MountainBike setSupension: "
                + "atualiza o campo!");
        suspension = suspensionType;
    }

    public void printDescription() {
        System.out.println("The " + "MountainBike has a <"
                + suspension + "> suspension.");
    }
}
