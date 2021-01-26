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
public class Structures {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*
        Sorting arr ;
        arr = new Sorting(9);
        
        arr.insert(7);
        arr.insert(4);
        arr.insert(5);
        arr.insert(2);
        arr.insert(9);
        arr.insert(1);
        arr.insert(8);
        arr.insert(3);
        arr.insert(6);
        arr.display();
        //arr.delete(4);
        //arr.display();
        //arr.delete(2);
        //arr.display();
        arr.InsertionSort();
        arr.display();
        */
       /* 
        int v;
        v = arr.find(54);
        if (v == -1) 
            System.out.println("Not Found!");
        else
            System.out.println("Founded!");
        v = arr.find(7);
        if (v == -1) 
            System.out.println("Not Found!");
        else
            System.out.println("Founded!");
        v = arr.find(4);
        if (v == -1) 
            System.out.println("Not Found!");
        else
            System.out.println("Founded!");  
         */
       /* 
        Stack s =new Stack(4);
        System.out.println(s.IsEmpty());
        s.Push(1);
        s.Push(4);
        s.Push(2);
        s.Push(8);
        System.out.println(s.IsEmpty());
        System.out.println(s.IsFull());
        s.Pop();
        System.out.println(s.IsFull());
        System.out.println(s.Peak()); 
        */
        /* 
        String word = "Esraa";
        Stack st =new Stack(word.length());
        for(int i=0; i<word.length(); i++) {
            
            st.Push((int) word.charAt(i));
        
        }
        
        while(!st.IsEmpty())
            System.out.print((char)st.Pop());
        */
        /*
        LinkedList q = new LinkedList();
        q.AddFirst(1);
        q.AddLast(4);
        q.AddLast(2);
        q.AddFirst(8);
        q.AddLast(3);
        q.Display();
        node n = q.Find(2);
        q.Delete(n);
        q.Display();
        q.InsertAfter(8, 3);
        q.Display();
        */
        DoublyLinkedList q = new DoublyLinkedList();
        q.AddFirst(7);
        //q.AddLast(4);
        //q.AddLast(2);
        //q.AddFirst(8);
        q.AddLast(3);
        q.DisplayFirst();
        //node n = q.Find(2);
        //q.Delete(n);
        //q.DisplayFirst();
        q.DeleteLast();
        //q.DisplayLast();
        //q.AddLast(4);
        q.DisplayFirst();
        //q.AddAfter(10, 8);
        //q.DeleteFirst();
        q.DisplayFirst();
        int[] l = {4,5,6,8,7,2,1,6};
        Sorting ms = new Sorting(l.length);
        ms.MergeSort(l);
        for(int i : l) 
            System.out.print(i+ " ");
        
    }
    
}
