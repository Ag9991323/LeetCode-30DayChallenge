package May;
import java.util.*;
class  Main{
      public static void main(String[] args) {
          Scanner scan = new Scanner(System.in);
          String j = scan.next();
          String s = scan.next();
          int arr [] = new int[256];
          for(int i=0;i<j.length();i++) arr[j.charAt(i)]+=1;
          int count=0;
          for(int i=0;i<s.length();i++){
              int stone = s.charAt(i);
              if(arr[stone]!=0)count++;
          }
          System.out.println(count);
          
          }
   }
