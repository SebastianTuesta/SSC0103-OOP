/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Calculator;

import java.util.Scanner;

/**
 *
 * @author Sebastián
 */
public class Aplicativo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Calculator c = new Calculator();
        while (true) {
            /*
            try {
            */
                System.out.println("1. Operacao Divisao");
                System.out.println("2. Operacao Log10");
                System.out.println("3. Salir");
                System.out.print("-Resp: ");
                
                Scanner sc = new Scanner(System.in);
                int opc = sc.nextInt();

                switch (opc) {
                    case 1:
                        System.out.print("--Ingresa numero 1 ");
                        double div1 = sc.nextDouble();
                        System.out.print("--Ingresa numero 2 ");
                        double div2 = sc.nextDouble();
                        System.out.println("---Divisao: "
                                + c.div(div1, div2));
                        break;
                    case 2:
                        System.out.print("--Ingresa numero ");
                        double div = sc.nextDouble();
                        System.out.println("---Log10: "
                                + c.log10(div));
                    case 3:
                    default:
                        return;

                }
            /*
            } catch (InvalidOperationException ioe) {
                System.out.println(ioe.getMessage());
            } catch (Exception e) {
                System.out.println("Ingrese tipo correcto de datos");
            }
            */
        }
    }

}
