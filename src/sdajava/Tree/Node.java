package sdajava.Tree;

import java.util.LinkedList;

/**
 * Created by Andrzej on 13.03.2017.
 */
public class Node <T> implements INode<T> {

    private T data;  //dane (obiekt)
    private Node<T> parent; // rodzic (obiekt)
    private  LinkedList<Node<T>> children; // Lista dzieci

    // Konstruktor donyslny
    public Node(){
        parent = null;
        children = new LinkedList<Node<T>>();
    }

    // konstruktor jednoparametrowy, ktory bedzie rodzicem


    public Node(Node<T>  parent) {
        this.parent = parent;
    }

    public Node(T data, Node<T> parent){
        this.data = data;
        this.parent = parent;
        this.children = new LinkedList<Node<T>>();
    }

    @Override
    public Node<T> getParent() {
        return parent;

    }

    @Override
    public void setParent(Node<T> parent) {
        this.parent = parent;

    }

    @Override
    public T getData() {
        return data;
    }

    @Override
    public void setData(T data) {
        this.data = data;

    }

    @Override
    public int getDegree() {
        return 0;
    }

    @Override
    public Node<T> getChild(int id) {
        return children.get(id);
    }

    @Override
    public boolean isLeaf() {
        return children.isEmpty();
    }

    @Override
    public Node<T> addChild(Node<T> child) {
        child.setParent(this); //tworzymy dziecko
        children.add(child);  //wrzucamy dziecko na liste dzieci
        return child;
    }

    @Override
    public Node<T> addChildData(T data) {
        Node<T> child = new Node<T>(data, this);
        children.add(child);
        return child;
    }

    @Override
    public Node<T> removeChild(int id) {
        return children.remove(id);
    }

    @Override
    public LinkedList<Node<T>> getChildren() {
        return children;
    }
    public String toString() {
        return data.toString(); // toString wyswietlanie wszystkich danej klasy
    }

    public Node<T> getLeftChild() {
        if (children.isEmpty()) {
            return null;
        }
        return children.get(0);

    }
    public Node<T> getRightChildrens(){
        if(parent != null){
            LinkedList<Node<T>>chilfrenofParent = parent.getChildren();
            int index = chilfrenofParent.indexOf(this);
            if(chilfrenofParent.size()>index +1){
                return chilfrenofParent.get(index+1);
            }

        }
        return null;
    }
}
