import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        System.out.print("enter the size: ");
        int size = input.nextInt();
        
        int[] a = new int[size];
        
        int i = 0; 
        while(i<a.length){
            System.out.print("Enter at " +(i+1)+": ");
            a[i]=input.nextInt();
            i++;
        }
        
        boolean decreasing = decreasing(a);
        boolean increasing = increasing(a);
        
        if(increasing || decreasing){
            System.out.print("array is sorted");
        }
        else{
            System.out.print("your array is not sorted");
        }
        
    }
    
    public static boolean decreasing(int[] a){
        int i = 1;
        while(i<a.length){
            if(a[i]>a[i-1]){
                return false;
            }
            i++;
        }
        return true;
    }
    
public static boolean increasing(int[] a){
    int i =1;
    while(i<a.length){
        if(a[i]<a[i-1]){
            return false;
        }
        i++;
    }
    return true;
}
}
