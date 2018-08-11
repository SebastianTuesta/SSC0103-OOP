/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Zoo;

/**
 *
 * @author Sebastián
 */
class Ovelha extends Animal{    
    
    private String colorLana = "Blanca";

    public Ovelha(String nome, int numeroPatas) {
        super(nome, numeroPatas);
    }
    
    public String getColorLana() {
        return colorLana;
    }

    public void setColorLana(String colorLana) {
        this.colorLana = colorLana;
    }
    
    @Override
    public String emitirSom(){
        return "Meee....";
    }

    @Override
    public String toString() {
        return this.getNome() + "eh uma ovelha, tem 4 patas e emite o som: Meee...." 
                + "Ademas seu lana eh color " + this.colorLana +"\n"
                + super.toString();
    }
    
    
}
