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
public abstract class Product implements Comparable{
    protected static double tax_percent = 0.19;
    protected String name;
    protected double price;


    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getTax_percent() {
        return tax_percent;
    }    
    
    public abstract double getFinalPrice();
    
    /**
     * negative If thisObject is lower than anotherObject
     *  zero If thisObject is equal than anotherObject
     *  positive If thisObject is higher than anotherObject
     * @param other
    */
    @Override
    public int compareTo(Object other) {
        Product otherProduct = (Product) other;
        if(this.getFinalPrice() < otherProduct.getFinalPrice()){
            return -1;
        }
        else  if(this.getFinalPrice() == otherProduct.getFinalPrice()){
            return 0;
        }
        else{
            return 1;
        }
    }
    
}
