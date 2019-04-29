/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package doublylinkedlist;

/**
 *
 * @author gjejen
 */
public class Node {
    //Campos
    private Object info;
    private Node prev;
    private Node next;
    
    //Constructor
    public Node(){
        setInfo(null);
        setNext(null);
        setPrev(null); 
    }
    
    public Node(Object o, Node n,Node p){
        setInfo(o);
        setNext(n);
        setPrev(p);
    }
    
    //Encapsulamiento
    
    public Node getPrev() {
        return prev;
    }

    public void setPrev(Node prev) {
        this.prev = prev;
    }
    
    public Object getInfo() {
        return info;
    }

    public void setInfo(Object info) {
        this.info = info;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }
    

}
