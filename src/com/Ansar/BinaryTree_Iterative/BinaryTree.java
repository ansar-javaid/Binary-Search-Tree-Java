package com.Ansar.BinaryTree_Iterative;

import java.util.Stack;

public class BinaryTree {
    private Node rootNode;
    //Constructor-------------------------------------------------------------------------------------------------------
    public BinaryTree() {
        this.rootNode = null;
    }
    //==================================================================================================================
    //TODO: Binary Search Tree methods----------------------------------------------------------------------------------
    /**
     * @param data integer type:
     *            <h2>‣ Algorithm:</h2>
     *<p>» Its Very much similar to contains() method.</p>
     *<p>» To insert a node our first task is to find the place to insert the node.</p>
     *<p>» Take current = root .</p>
     *<p>» start from the current and compare root.data with n.</p>
     *<p>» if current.data is greater than n that means we need to go to the left of the root.</p>
     *<p>» if current.data is smaller than n that means we need to go to the right of the root.</p>
     *<p>» if any point of time current is null that means we have reached to the leaf node, insert your
     *             node here with the help of parent node. (See code)</p>
     * @return true if Node is added as child else false.
     */
    public boolean insert(int data)
    {
        Node currentNode=new Node(data);
        if(rootNode==null)
        {
            rootNode=currentNode;
            return true;
        }
        Node targetingNode=rootNode;
        Node parentNode=null;
        while(true)
        {
            parentNode=targetingNode;
            if(data<targetingNode.data)
            {
                targetingNode=targetingNode.moveToLeft();
                if(targetingNode==null)
                {
                    parentNode.setLeftLink(currentNode);
                    return true;
                }
            }
            else
            {
                targetingNode=targetingNode.moveToRight();
                if(targetingNode==null)
                {
                    parentNode.setRightLink(currentNode);
                    return true;
                }
            }
        }
    }
    //------------------------------------------------------------------------------------------------------------------
    /**
     *<h2>‣ Algorithm:</h2>
     *<p>» Initialize an empty stack.</p>
     *<p>» Push the current node (starting from the root node) onto the stack.
     * Continue pushing nodes to the left of the current node until a NULL value is reached.</p>
     *<p>» If the current node is NULL and the stack is not empty:
     * <p>1. Remove and print the last item from the stack.</p>
     * <p>2. Set the current node to be the node to the right of the removed node.</p>
     * <p>3. Repeat the second step of the algorithm.</p></p>
     * <p>» If the current node is NULL and the stack is empty, then the algorithm has finished.</p>
     */
    public void InOrderTraversal()
    {
        Stack<Node> stack=new Stack<>();
        Node targetedNode=rootNode;
        while(!stack.empty() || targetedNode!=null)
        {
            if(targetedNode!=null)
            {
                stack.push(targetedNode);
                targetedNode=targetedNode.moveToLeft();
            }
            else
            {
                targetedNode=stack.pop();
                System.out.println(targetedNode.data);
                targetedNode=targetedNode.moveToRight();
            }
        }
    }
    //------------------------------------------------------------------------------------------------------------------

    /**
     * @param data integer type:
     *             <h2>‣ Algorithm:</h2>
     * <p>» Its very simple operation to perform.</p>
     * <p>» start from the root and compare root.data with data</p>
     * <p>» if root.data is greater than data that means we need to go to the left of the root.</p>
     * <p>» if root.data is smaller than data that means we need to go to the right of the root.</p>
     * <p>» if any point of time root.data is equal to the data then we have found the node, return true.</p>
     * <p>» if we reach to the leaves (end of the tree) return false, we didn’t find the element</p>
     * @return true if it contains data else false
     */
    public boolean contains(int data)
    {
        Node targetedNode=rootNode;
        while(targetedNode!=null)
        {
            if(data==targetedNode.data)
            {
                return true;
            }
            else if(data<targetedNode.data)
            {
                targetedNode=targetedNode.moveToLeft();
            }
            else
            {
                targetedNode=targetedNode.moveToRight();
            }
        }
        return false;
    }
    //------------------------------------------------------------------------------------------------------------------
}
