package com.company.tree;


public class BinaryTree {

    private Node root;

    public BinaryTree(){
        root = null;
    }

    public BinaryTree(Node root){
        this.root = root;
    }

    public void insert(Node newNode){
        insertRecursive(root, newNode);
    }

    private void insertRecursive(Node root, Node newNode){
        if(root == null) root = newNode;
        if(newNode.getData()<root.getData())
        {
            if(root.getLeft() == null){ root.setLeft(newNode);}
            else insertRecursive(root.getLeft(), newNode);;
        }
        else if(newNode.getData()>root.getData())
        {
            if(root.getRight() == null) {root.setRight(newNode);}
            else insertRecursive(root.getRight(), newNode);
        }
    }

    public boolean contains(Node node){
        return containsRecursive(root, node);
    }

    private boolean containsRecursive(Node root,Node node){
        if(node.getData()<root.getData())
            containsRecursive(root.getLeft(), node);
        else if(node.getData()>root.getData())
            containsRecursive(root.getRight(), node);
        else if(node.getData()==root.getData())
            return true;

        return false;
    }

    public void display(){
        displayRecursive(root);
    }

    private void displayRecursive(Node root){
        if (root == null)
            return;
        if(root.getLeft()!=null)
            displayRecursive(root.getLeft());
        System.out.print(root.getData());
        if(root.getRight()!=null)
            displayRecursive(root.getRight());
    }

    public void delete(Node node){}

    private void deleteRecursive(Node node){}

}