package com.company;

class Node{

    private Node left, right;
    private int data;

    Node(int data){
        this.data = data;
    }

    void insert(Node node){
        if (node.data < data ){
            if(left == null){
                left = node;
            }
            else{
                left.insert(node);
            }
        }
        else {
            if(right == null) {
                right = node;
            }
            else {
                right.insert(node);
            }
        }
    }

    boolean contains(Node node){
        if(data == node.data)
            return true;
        else if(node.data < data )
            left.contains(node);
        else
            right.contains(node);

        return false;
    }

    void display(){
        if(left != null) {
            left.display();
        }
        System.out.print(data + ":");
        if(right != null) {
            right.display();
        }

    }

    boolean delete(int val){

        if(val < data)
        {
            if(left == null)
            {
                return false;
            }
            else {
                left.delete(val);
            }
        }
        else if(val > data){

            if(right == null)
            {
                return false;
            }
            else {
                right.delete(val);
            }
        }
        else {
            if(left != null && right != null){
                Node smallestRightNode = getMinimum(right);
                data = smallestRightNode.data;
                delete(val);
                return true;
            }
            else if(right != null){
                data = right.data;
                right = null;
            }
            else if(left!=null){
                data = left.data;
                left = null;
            }
            else {
                data = 0;
            }
        }
        return false;
    }

    private Node getMinimum(Node node){
        if(node.right != null)
            getMinimum(node.right);
        else
            return node;

        return null;
    }

}
