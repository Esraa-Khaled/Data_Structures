/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package structures;

/**
 *
 * @author esraa
 * O(n)=1
 */
public class Queue {
    
    int[] arr;
    int nItems, size, front, rear;
    
    Queue(int n) {
        size = n;
        arr = new int[size];
        nItems = 0;
        front= -1;
        rear = -1;
    }
    
    public void Insert(int value) {
        if (IsFull())
            System.out.println("No more space! Queue is full");
        else {
            nItems ++;
        arr[++rear] = value;
        }
        
    }
    
    public int Pop() {
        if (IsEmpty()) {
            System.out.println("No more items! Queue is empty");
            return -1;
        }
        else {
            nItems--;
            return arr[++front];
        }
        
    }
    
    public int Size() {
        nItems = nItems > size ? size : nItems;
        return nItems;
    }
    
    public boolean IsEmpty() {
        return (nItems==0);
    }
    
    public boolean IsFull() {
        return (nItems==size);
    }
    
    public int Peak() { 
        return arr[front];
    }
    
}
