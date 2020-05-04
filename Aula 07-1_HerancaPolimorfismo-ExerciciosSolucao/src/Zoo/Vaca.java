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
class Vaca extends Animal{
    
    private String destinoLeche = "Queso";

    public Vaca(String nome, int numeroPatas) {
        super(nome, numeroPatas);
    }

    public String getDestinoLeche() {
        return destinoLeche;
    }

    public void setDestinoLeche(String destinoLeche) {
        this.destinoLeche = destinoLeche;
    }
    
    @Override
    public String emitirSom(){
        return "Muu....";
    }

    @Override
    public String toString() {
        return this.getNome() + " eh uma ovelha, tem 4 patas e emite o som: Meee...."
                + "O destino da leite e " + this.destinoLeche + "\n"
                + super.toString(); 
    }
    
    
}
