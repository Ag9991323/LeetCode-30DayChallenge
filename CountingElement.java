import java.io.*;
import java.util.*;

public class CountingElements{
  public int countElements(int[] arr) {
        HashSet<Integer> h = new HashSet<>();
        for(int i=0;i<arr.length;i++){
            h.add(arr[i]);
        }
        int count =0;
        for(int i=0;i<arr.length;i++){
            if(h.contains(arr[i]+1)){
                count++;
            }
        }
        return count;
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i]= scan.nextInt();
        }
        int count =countElements(arr);
        System.out.println(count);
        
        }
    

   
        
    }

