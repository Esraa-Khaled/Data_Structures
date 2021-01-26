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
public class SelectionSort extends UnorderedArray{
    
    SelectionSort(int n) {
        super(n);
    }
    
    public static void Swap(long [] arr, int m, int n) {
        long temp ;
        temp = arr[m];
        arr[m] = arr[n];
        arr[n] = temp;
        
    }
    public void Sort() {
        
        
    }
    
}
