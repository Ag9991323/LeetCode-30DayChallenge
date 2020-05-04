package May;
import java.util.*;
class  NumberCompliment{
      public static void main(String[] args) {
          Scanner scan = new Scanner(System.in);
          int N= scan.nextInt();
        
          int sum=0;
          int i=0;
          while(N!=0){
                if(N%2==0) sum+=Math.pow(2,i);
                i++;
                N=N>>1;
                
          }
          System.out.println(sum);
      
         
         
   }
}