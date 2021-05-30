package com.Ansar.BinaryTree_Iterative;

class Node {
    public int data;
    private Node leftLink;
    private Node rightLink;
    //Constructor-------------------------------------------------------------------------------------------------------
    protected Node(int data) {
        this.leftLink = this.rightLink = null;
        this.data = data;
    }
    //Getters-----------------------------------------------------------------------------------------------------------
    /**
     * @return the Left Link of Node using in Binary Tree: Data Structure
     */
    public Node moveToLeft() { return leftLink; }
    /**
     * @return the Right Link of Node using in Binary Tree: Data Structure
     */
    public Node moveToRight() { return rightLink; }
    //Setters-----------------------------------------------------------------------------------------------------------
    public void setLeftLink(Node leftLink) { this.leftLink = leftLink; }
    public void setRightLink(Node rightLink) { this.rightLink = rightLink; }
    //==================================================================================================================
}
