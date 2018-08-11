/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ABB;

/**
 *
 * @author Sebastián
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Tree<Integer> tree = new Tree<>();
        tree.insertNode(5);
        tree.insertNode(3);
        tree.insertNode(6);
        tree.insertNode(2);
        
        System.out.print("Preorder: ");
        tree.preorder();
        
        System.out.print("Postorder: ");
        tree.postorder();
        
        System.out.print("Inorder: ");
        tree.inorder();
    }
    
}
