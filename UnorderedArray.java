/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package structures;

/**
 *
 * @author esraa
 * unordered array functions:
 * find()
 * insert()
 * delete()
 * display()
 */
public class UnorderedArray {
    
    protected long [] a;
    protected int elments;
    
    UnorderedArray(int n){
        a = new long [n];
        elments = 0;
    }

    public long[] getA() {
        return a;
    }
    
    public int find(long value){
        
        for(int i=0; i<= elments; i++)
            if (a[i] == value)
                return i;
        return -1;
    }
    
    public boolean insert(long value){
        
        if (elments == a.length)
           return false;
        else{
            a[elments++]= value;
            return true;
        }
    }
    
    public boolean delete(long value){
        
        if (elments == 0)
            return false;
        else {
            int n = find(value);
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

