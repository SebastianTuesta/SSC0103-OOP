/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Motorcycle;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author Sebastián
 */
public class Champion {

    Map motorcycles;

    public Champion() {
        this.motorcycles = new HashMap<Integer, Motorcycle>();
    }

    public void addMotorcycle() {
        Motorcycle m = new Motorcycle();
        System.out.println("Nova moto: ID=" + m.getId());
        this.motorcycles.put(m.getId(), m);
    }

    public void addMotorcycle(double speed, double gear) {
        Motorcycle m = new Motorcycle(speed, gear);
        System.out.println("Nova moto: ID=" + m.getId());
        this.motorcycles.put(m.getId(), m);
    }

    public void readEntry(int id, double speed) {
        Motorcycle m = (Motorcycle) this.motorcycles.get(id);

        if (m == null) {
            System.out.println("Moto nao existe");
            return;
        }

        m.speedUp(speed);
        System.out.println("Moto " + m.getId() + ": Velocidade=" + m.getSpeed()
                + ", Marcha=" + m.getGear());
    }

    public void getDistances() {
        List<Motorcycle> motorcyclesByAge
                = new ArrayList<>(motorcycles.values());

        Collections.sort(motorcyclesByAge,
                 (Motorcycle m1, Motorcycle m2) -> m2.getDistance()
                - m1.getDistance());
        
        int pos = 0;
        for(Motorcycle m : motorcyclesByAge){
            m.setPosition(++pos);
            System.out.println("Moto " + m.getId() + ": Velocidade=" + m.getSpeed()
                + ", Marcha=" + m.getGear() + ", Distancia = " + m.getDistance()
                + ", Posicao = " + m.getPosition());
        }
    }
}
