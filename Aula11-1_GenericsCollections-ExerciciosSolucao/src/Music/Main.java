/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Music;

/**
 *
 * @author Sebastián
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Data data = new Data();
        
        System.out.println("-----------------Raw data------------------");
        data.showRawData();
        
        System.out.println("----------------Sorted data---------------");
        data.showSortedData();
    }
    
}
