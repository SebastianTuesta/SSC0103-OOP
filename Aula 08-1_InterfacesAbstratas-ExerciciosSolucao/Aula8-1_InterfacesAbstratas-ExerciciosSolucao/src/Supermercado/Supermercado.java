/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Supermercado;

import Products.Leite;
import Products.Shapoo;
import java.util.Vector;

/**
 *
 * @author Sebastián
 */
public class Supermercado {

    public static void main(String[] args) {
        Vector<Shapoo> sh = new Vector<>();
        Vector<Shapoo> bisc = new Vector<>();
        Vector<Leite> leit = new Vector<>();

        sh.add(new Shapoo("Shapoo1", 20.0, 3));
        sh.add(new Shapoo("Shapoo2", 50.0, 3));

        bisc.add(new Shapoo("Biscoito1", 40.0, 3));
        bisc.add(new Shapoo("Biscoito2", 50.0, 7));

        leit.add(new Leite("Leite1", 50.4, 8));
        leit.add(new Leite("Leite2", 50.5, 3));

        System.out.println("Shapoo 1 - Biscoito 2 : " 
                + sh.get(0).compareTo(bisc.get(1)));
        System.out.println("Biscoito 1 - Leite 2 : " 
                + bisc.get(0).compareTo(leit.get(1)));
        System.out.println("Leite 2 - Leite 2 : " 
                + leit.get(1).compareTo(leit.get(1)));
    }
}
