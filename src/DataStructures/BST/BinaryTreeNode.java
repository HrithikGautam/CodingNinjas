package DataStructures.BST;



public class BinaryTreeNode<T> {

    public BinaryTreeNode<T> right;
    public BinaryTreeNode<T> left;

    T data;
        BinaryTreeNode<T> next;
        BinaryTreeNode(T data){
            this.data=data;
        }
    }
