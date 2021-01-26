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
public class OrderedArray {

    private long [] a;
    private int elments;
    
    OrderedArray(int n){
        a = new long [n];
        elments = 0;
    }
       
    public int find(long value){
        int upper= elments -1;
        int lower = 0;
        while(true)
        {   
            int mid = (lower+upper)/2;
            if (a[mid]== value)
                return mid;
            else if (lower > upper)
                return -1;
            else if (a[mid] < value)
                lower = mid+1;
            else if (a[mid] > value)
                upper = mid-1;
        }   
    }    
    public boolean insert(long value) {    
        int i;
        for(i=0;i<elments;i++) {
            if (a[i] > value)
                break;
        }    
        elments ++;
        for(int j=elments-1; j>i; j--)
            a[j]=a[j-1];
        a[i] = value;
        return true;
    }
    
    public boolean delete(long value){
        
        if (elments == 0)
            return false;
        else {
            int n = find(value);
            if( n == -1) return false;
            else
                for(int i=n+1; i<elments;i++)
                    a[i-1]= a[i];
        }
        elments--;
        return true;
    }
    
    public void display() {
        System.out.print("Array : ");
        for(int i=0; i<elments;i++)
            System.out.print(a[i] + " ");
        System.out.println(" ");    
    }
}
/*
// tester class
class UnorderedArrayApp {
    public static void main(String[] args) {
        UnorderedArray arr = new UnorderedArray(50);
        arr.insert(7);
        arr.insert(4);
        arr.insert(5);
        arr.insert(2);
        arr.insert(9);
        arr.insert(1);
        arr.insert(8);
        arr.insert(1);
        arr.insert(6);
        arr.display();
        arr.delete(4);
        arr.delete(50);
        int v = arr.find(54);
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
          
    }
}    
    
*/
