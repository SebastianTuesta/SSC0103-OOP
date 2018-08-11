/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ABB;

/**
 *
 * @author Sebastián
 * @param <T>
 */
public class Tree<T extends Comparable<T>> {

    private TreeNode<T> root;

    public Tree() {
        this.root = null;
    }

    public void insertNode(T insertValue) {
        if (root == null) {
            root = new TreeNode<>(insertValue);
        } else {
            root.insert(insertValue);
        }
    }

    public void preorder() {
        preorderHelper(root);
        System.out.println("");
    }

    private void preorderHelper(TreeNode<T> node) {
        if (node == null) {
            return;
        }
        System.out.printf("%s ", node.data);
        preorderHelper(node.leftNode);
        preorderHelper(node.rightNode);
    }

    public void inorder() {
        inorderHelper(root);
        System.out.println("");
    }

    private void inorderHelper(TreeNode<T> node) {
        if (node == null) {
            return;
        }
        inorderHelper(node.leftNode);
        System.out.printf("%s ", node.data);
        inorderHelper(node.rightNode);
    }

    public void postorder() {
        postorderHelper(root);
        System.out.println("");
    }

    private void postorderHelper(TreeNode<T> node) {
        if (node == null) {
            return;
        }
        postorderHelper(node.leftNode);
        postorderHelper(node.rightNode);
        System.out.printf("%s ", node.data);
    }

}
