import java.util.Scanner;

public class BuyStockProblem {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i]= scan.nextInt();
        }
        int max=0;
        int stock=arr[0];
        for(int i=1;i<n-1;i++){
            if(arr[i]>=arr[i-1]&&arr[i+1]<arr[i]){
                max+=arr[i]-stock;
                stock=arr[i+1];
                i+=1;
            }
            else if(arr[i]<stock){
                stock=arr[i];
            }
        }
        if(arr[n-1]>stock){
            max+=arr[n-1]-stock;
        }
        System.out.println(max);

        }
    }
