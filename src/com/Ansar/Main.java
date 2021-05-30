package com.Ansar;

import com.Ansar.BinaryTree_Iterative.BinaryTree;

public class Main {

    public static void main(String[] args) {
	// write your code here
        BinaryTree tree=new BinaryTree();
        tree.insert(10);
        tree.insert(4);
        tree.insert(7);
        tree.insert(11);
        tree.insert(15);
        tree.insert(9);
        tree.insert(20);
        tree.insert(3);
        tree.insert(6);
        tree.InOrderTraversal();
        System.out.println(tree.contains(10));

    }
}
