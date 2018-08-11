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
class Gato extends Animal{
    
    private boolean isSiames = false;

    public Gato(String nome, int numeroPatas) {
        super(nome, numeroPatas);
    }
    
    public boolean isIsSiames() {
        return isSiames;
    }

    public void setIsSiames(boolean isSiames) {
        this.isSiames = isSiames;
    }
    
    @Override
    public String emitirSom(){
        return "Miau....";
    }

    @Override
    public String toString() {
        return this.getNome() + "eh um gato, tem 4 patas e emite o som: Miau...."
                + "Es siames" + this.isSiames + "\n"
                + super.toString();
    }
    
    
}
