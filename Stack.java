/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package structures;

/**
 *
 * @author esraa
 *  O(n)=1
 */
public class Stack {
    
    int [] arr;
    int size;
    int index;
    
    Stack(int size) {
        this.size = size;
        arr = new int[size]; 
        index = -1;
    
    }
    public void Push(int value){
        
        if(!IsFull())
            arr[++index]=value;
        
    }
    
    public int Pop(){
        
        return arr[index--];
        
    }
    
    public int Peak() {
        
        return arr[index];
    }
    
    public boolean IsEmpty() {
        
        return (index == -1);
    
    }
    
    public boolean IsFull() {
        
        return (index == size-1);
    
    }
}
    

