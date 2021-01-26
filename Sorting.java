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
public class Sorting extends UnorderedArray{
    
    Sorting(int n) {
        super(n);
    }
    
    public static void Swap(long [] arr, int m, int n) {
        long temp ;
        temp = arr[m];
        arr[m] = arr[n];
        arr[n] = temp;
        
    }
    
    public void BubbleSort() {
        
        for(int j=0; j < a.length-1; j++)
            for(int i=0; i < a.length-1-j; i++) 
                if(a[i] > a[i+1]) 
                   Swap(a, i, i+1);
    }
    
    public void SelectionSort() {
        
        int min;
        for(int out =0; out<a.length-1; out++) {
            min = out;
            for(int in = out+1 ; in<a.length; in++)
                if(a[min] > a[in])
                    min = in;
            Swap(a, min, out);                                 
        }
       
    }
    
    public void InsertionSort() {
        
        for(int o=1; o < a.length; o++) 
            for (int u= o-1; u >= 0; u--)
                if(a[u+1] < a[u])
                    Swap(a, u, u+1);
  
    }
    
    public void MergeSort(int[] list) {
        if(list.length >1) {
            int[] firstHalf = new int[list.length/2];
            System.arraycopy(list, 0, firstHalf, 0, firstHalf.length);
            MergeSort(firstHalf);
            int[] SecondHalf = new int[list.length-firstHalf.length];
            System.arraycopy(list, firstHalf.length, SecondHalf, 0, SecondHalf.length);
            MergeSort(SecondHalf);
            Merge(firstHalf, SecondHalf,list);
            
        }
    }
    
    public void Merge(int[] a, int[] b, int[] c){
        
        int aIndex=0, bIndex=0, cIndex=0;
        while(aIndex < a.length && bIndex < b.length) {
            if(a[aIndex] > b[bIndex])
                c[cIndex++] = b[bIndex++];
            else
                c[cIndex++] = a[aIndex++];
        }
        while(aIndex < a.length)
            c[cIndex++] = a[aIndex++];
        while(bIndex < b.length)
            c[cIndex++] = b[bIndex++];
            
    }
    
}
