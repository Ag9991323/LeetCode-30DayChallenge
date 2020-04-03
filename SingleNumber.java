

import java.util.Scanner;

class Day1{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n= scan.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=scan.nextInt();
        }
        int sum=0;
        for(int i=0;i<n;i++){
            sum=sum^arr[i];
          
        }
        System.out.println(sum);
    }
}