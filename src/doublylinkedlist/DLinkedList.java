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
public class DLinkedList {
        //Campos protegidos
    protected Node head;
    protected Node tail;
 
    //Encapsulamiento
    
    
    //Constructor
    public DLinkedList(){
        head = null;
        tail = null;
    }
    
    //Métodos
    public void PushBack(Object o){

        Node tmp = new Node(o, null,null);
        
        if (this.tail == null){
            this.tail = tmp;
            this.head = tail;
            tmp.setPrev(null);
        }
        else{
            this.tail.setNext(tmp);
            tmp.setPrev(this.tail);
            this.tail = tmp;
        }
    }
    
    public void PushFront(Object o){

        Node tmp = new Node(o, null,null);
        tmp.setNext(head);
        head = tmp;
        
        if (this.tail == null)
            this.tail = this.head;
    }
    
    public void PopFront(){

        if(this.head == null)
            System.out.println("Lista vacia!!!");
        
        this.head = this.head.getNext();
        
        if(this.head == null)
            this.tail = null;
    }
    
    public void ImprimirLista(){
        if(this.head == null){
            System.out.println("Lista vacia!!!");
        }
        else{
            Node p = this.head;
            while(p!= null){
                System.out.println(p.getInfo());
                p = p.getNext();
            }
        }
    }
}
