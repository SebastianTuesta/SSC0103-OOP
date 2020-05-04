/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Products;

/**
 *
 * @author Sebastián
 */
public class Shapoo extends Product{
    
    private int irritabilidad;
    
    public Shapoo(String name, double price, int irritabilidad) {
        super(name, price);
        this.irritabilidad = irritabilidad;
    }

    public int getIrritabilidad() {
        return irritabilidad;
    }

    public void setIrritabilidad(int irritabilidad) {
        this.irritabilidad = irritabilidad;
    }

    @Override
    public double getFinalPrice() {
        return -1 * this.price * Shapoo.tax_percent * this.irritabilidad;
    }
    
    
}
