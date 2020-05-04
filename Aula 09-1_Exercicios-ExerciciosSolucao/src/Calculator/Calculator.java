/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Calculator;

/**
 *
 * @author Sebastián
 */
public class Calculator {

    public double div(double d1, double d2) throws InvalidOperationException {
        if (d2 == 0) {
            throw new InvalidOperationException("El segundo argumento"
                    + " no puede ser cero");
        }
        return d1 / d2;
    }

    public double log10(double d1) throws InvalidOperationException {
        if (d1 < 0) {
            throw new InvalidOperationException("El argumento debe ser"
                    + " un numero mayor a cero");
        }
        return Math.log10(d1);
    }

}
