/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CA_2;

import java.util.LinkedList;
import java.util.Queue;
/**
 *
 * @author HP
 */
public class BinaryTree {
    
    // Root node of the tree
    private TreeNode root;
    
    // Create an empty binary tree
    public BinaryTree() {
        this.root = null;
    }
    //Inserts an employee using level-order insertion.
     public void insertLevelOrder(Employee employee) {

        TreeNode newNode = new TreeNode(employee);

        if (root == null) {
            root = newNode;
            return;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        
         while (!queue.isEmpty()) {

            TreeNode current = queue.remove();

            if (current.getLeft() == null) {
                current.setLeft(newNode);
                return;
            } else {
                queue.add(current.getLeft());
            }
            
            if (current.getRight() == null) {
                current.setRight(newNode);
                return;
            } else {
                queue.add(current.getRight());
            }
        }
     }     
         //Displays the tree using level-order traversal.
          public void displayLevelOrder() {

        if (root == null) {
            System.out.println("Tree is empty.");
            return;
        }
        
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        
        System.out.println("\nEMPLOYEE HIERARCHY - LEVEL ORDER");
        System.out.println("================================");
        
         while (!queue.isEmpty()) {

            TreeNode current = queue.remove();

            System.out.println(current.getEmployee());
            
            if (current.getLeft() != null) {
                queue.add(current.getLeft());
            }

            if (current.getRight() != null) {
                queue.add(current.getRight());
            }
         }
          }
          // Public method to get tree height.
        public int getHeight() {
            return calculateHeight(root);
    }
        //Recursive method to calculate tree height.
        private int calculateHeight(TreeNode node) {

        if (node == null) {
            return 0;
        }

        int leftHeight = calculateHeight(node.getLeft());
        int rightHeight = calculateHeight(node.getRight());

        return Math.max(leftHeight, rightHeight) + 1;
        }
        // Public method to count nodes.
        public int countNodes() {
        return countNodesRecursive(root);
    }
        //Recursive method to count nodes
        private int countNodesRecursive(TreeNode node) {

        if (node == null) {
            return 0;
        }

        return 1
                + countNodesRecursive(node.getLeft())
                + countNodesRecursive(node.getRight());
        }
}
