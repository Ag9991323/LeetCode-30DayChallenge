import java.util.*;
class Day3 {
    public int maxSubArray(int[] arr) {
        int max=arr[0];
        int res=arr[0];
        for(int i=1;i<arr.length;i++){
            max=Math.max(max+arr[i],arr[i]);
            res=Math.max(res,max);
        }
        return res;
        
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n= scan.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=scan.nextInt();
        }
        Day3 d = new Day3();
        int num = d.maxSubArray(arr);
        System.out.println(num);
    }
}