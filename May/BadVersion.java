package May;
import java.util.*;
class  BadVersion{
      public static void main(String[] args) {
          Scanner scan = new Scanner(System.in);
          int t = scan.nextInt();
          while(t-- >0){
          int N= scan.nextInt();
          int start =0;
          int end =N;
         
          int version=5;
          while(start<end){
             int mid=start+end/2; 
               if(mid==version){
                    end = mid-1;
               }
               else{ start=mid+1;
               
               }
            }
          }
   }
}