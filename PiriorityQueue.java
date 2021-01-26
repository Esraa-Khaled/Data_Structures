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
public class PiriorityQueue extends Queue{
    
    
    PiriorityQueue(int n) {
        super(n);
    }
    
    @Override
    public void Insert(int value) {
        if (IsFull())
            System.out.println("No more space! Queue is full");
        else {
            int i;
            for(i=0;i<nItems;i++) {
                if (arr[i] > value)
                    break;
            }    
            nItems ++;
            for(int j=nItems-1; j>i; j--)
                arr[j]=arr[j-1];
            arr[i] = value;
        }
    }
    
    
}
