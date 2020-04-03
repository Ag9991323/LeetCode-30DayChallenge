import java.util.HashSet;
import java.util.Scanner;

class Day2 {
    public boolean isHappy(int n) {
        HashSet<Integer> set = new HashSet<>();
        while(n!=1){
            int sum=0;
            while(n!=0){
                 sum+=((n%10)*(n%10));
                 n/=10;
            }
            
            if(set.contains(sum))
                return false;
            set.add(sum);
            
            n=sum;
           
    }
               return true;
        
    }
     public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        Day2 s = new Day2();
        boolean happy = s.isHappy(n);
        System.out.println(happy);
    }
}