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
public class Animal {

    private String nome;
    private int numeroPatas;
    
    public Animal(String nome, int numeroPatas) {
        this.nome = nome;
        this.numeroPatas = numeroPatas;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getNumeroPatas() {
        return numeroPatas;
    }

    public void setNumeroPatas(int numeroPatas) {
        this.numeroPatas = numeroPatas;
    }
    
    
    
    public String emitirSom(){
        return "Rgrgg.gr...";
    }

    @Override
    public String toString() {
        return nome + " he um animal e emite o som: " + emitirSom();
    }
    
    
    
}
