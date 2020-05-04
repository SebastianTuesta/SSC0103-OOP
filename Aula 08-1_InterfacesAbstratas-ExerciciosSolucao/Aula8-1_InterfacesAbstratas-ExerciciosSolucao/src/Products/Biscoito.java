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
public class Biscoito extends Product {

    private int quantidadeCancerigeno;

    public Biscoito(String name, double price,
            int quantidade) {
        super(name, price);
        this.quantidadeCancerigeno = quantidade;
    }

    public int getQuantidadeCancerigeno() {
        return quantidadeCancerigeno;
    }

    public void setQuantidadeCancerigeno(int quantidadeCancerigeno) {
        this.quantidadeCancerigeno = quantidadeCancerigeno;
    }

    @Override
    public double getFinalPrice() {
        return -1 * this.price * Biscoito.tax_percent * this.quantidadeCancerigeno;
    }

}
