/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package structures;

/**
 *
 * @author esraa
 */
public class DoublyLinkedList {
    
    node head = null;
    node tail = null;
    int size;
    
    public boolean IsEmpty() {
        return head == null;
    }
    
    public void AddFirst(int i) {
        
        node n = new node(i);
        if (IsEmpty()) {
            n.item  = i;
            head = n;
            tail = n;
        }
        else {
            head.previous = n;
            n.next = head;
            head = n;
        }   
        size++;
    }
    
    public void AddLast(int i) {
        node n = new node(i);
       if (size == 0) {    // if no nodes
           n.item= i;
           head = n;
           tail = n;
       }
       else {
           n.item= i;
           n.previous = tail;
           tail.next = n;
           tail = n;
       }
       size ++;
          
    }
    
    public void AddAfter(int i, int k) {
        node key = Find(k);
        node n = new node(i);
        if (key == null) {
            head = n;
            tail = n;
        }
        else {
            n.next = key.next;   
            key.next= n;
        }
            
    }
    
    public node Find(int i) {
        if(size==0) {
            System.out.println("No items exist");
            return null;
        }
        else {
            node current = head;
            while(current.item != i) {
                current = current.next;
            }
            return current;    
        }        
    }
    
    public void DisplayFirst() {
       node current = head; 
       if (size == 0)
           System.out.println("No items to show");
       else {
        while(current != null) {
            current.Display();
            current = current.next;
        }
        System.out.println(" ");
       }
    }
    
    public void DisplayLast() {
       node current = tail; 
       if (size == 0)
           System.out.println("No items to show");
       else {
        while(current != null) {
            current.Display();
            current = current.previous;
        }
        System.out.println(" ");
       }
    }
    
    public void DeleteFirst() {
        
        if (size == 0)
            System.out.println("No items to delete");
        else {
            head = head.next;
            size--;
        }
            
    }
    
    public void DeleteLast() {
        if (size == 0)
            System.out.println("No items to delete");
        else {
            tail = tail.previous;
            size-- ;
        }
    }
    
    public void Delete() {
        if (size == 0)
            System.out.println("No items to delete");
        else
            tail = tail.previous;
    }
    
    
}


class node{
    int item;
    node next;
    node previous;
    
    node(int i) {
        item = i;
        next = null;
        previous = null;
    }
    
    public void Display() {
        System.out.print(item+" ");
    }
}