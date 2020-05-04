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
public class Leite extends Product{
    
    private int duracao;
    
    public Leite(String name, double price, int duracao) {
        super(name, price);
        this.duracao = duracao;
    }

    public int getDuracao() {
        return duracao;
    }

    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }
    
    @Override
    public double getFinalPrice(){
        return this.price*(1 + Leite.tax_percent) * duracao;
    }
    
}
