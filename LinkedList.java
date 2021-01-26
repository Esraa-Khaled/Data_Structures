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
public class LinkedList {
    
    Link head = null;
    Link tail = null;
    int size;
    // there is no need for constructor as it is a dynamic so we don't need to 
    //define the size.
    public void AddLast(int i) {
        
       if (size == 0) {    // if no Links
           Link n = new Link(i);
           n.item= i;
           head = n;
           tail = n;
           size ++;
       }
       else {
           Link n = new Link(i);
           n.item= i;
           tail.next = n;
           tail = n;
           size ++;
       }
       
        
    }
    
    public void AddFirst(int i) {
        
       if (size == 0) {    // if no Links
           Link n = new Link(i);
           n.item= i;
           head = n;
           tail = n;
           size ++;
       }
       else {
           Link n = new Link(i);
           n.item= i;
           n.next = head;
           head = n;
           size ++;
       }
        
    }
    
    
    public void Display() {
       Link current = head; 
       while(current != null) {
           current.Display();
           current = current.next;
       }
       System.out.println(" ");
    }
    
    public Link  Find(int i) {
        Link h = head;
        while(h != null) {
            if(h.item == i)
                return h;
            h = h.next;
        }
        return h;
    }
    
    public void Delete(Link p) {
        Link h = head;
        while(h.next != p)
            h = h.next;
        h.next = h.next.next;
        size--;
    }
    
    public void InsertAfter(int i , int q) {
        Link h = new Link(i);
        Link p = Find(q);
        h.next = p.next;
        p.next = h;
    }
}



class Link{
    
   int item;
   Link next;
    
    Link(int n) {
        item = n;
        next = null;
        
    }
    
    public void Display() {
        System.out.print(item+" ");
    } 
}