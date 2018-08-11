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
public class TreeNode<T extends Comparable<T>> {

    protected final T data;
    protected TreeNode<T> leftNode;
    protected TreeNode<T> rightNode;

    public TreeNode(T data) {
        this.data = data;
        leftNode = rightNode = null;
    }

    public void insert(T insertValue) {
        if (insertValue.compareTo(data) < 0) {
            if (leftNode == null) {
                leftNode = new TreeNode<>(insertValue);
            } else {
                leftNode.insert(insertValue);
            }
        } else if (insertValue.compareTo(data) > 0) {
            if (rightNode == null) {
                rightNode = new TreeNode<>(insertValue);
            } else {
                rightNode.insert(insertValue);
            }
        }
    }
}
