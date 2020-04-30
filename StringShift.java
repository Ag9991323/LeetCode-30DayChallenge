import java.util.*;

class StringShift{
    public String stringShift(String s, int[][] shift) {
        int left=0;
        int right=0;
        for(int i=0;i<shift.length;i++){
            if(shift[i][0]==0) left+=shift[i][1];
            else right+=shift[i][1];
        }
         Deque<Character> d = new LinkedList<>();
            for(int i=0;i<s.length();i++){
                d.offerLast(s.charAt(i));
            }
       // System.out.print(d);
        int sum = left-right;
        if(sum>0){
           for(int i=0;i<sum;i++){
               char a = d.pollFirst();
               d.offerLast(a);
           }
        }
        else{
            sum = Math.abs(sum);
            for(int i=0;i<sum;i++){
               char a = d.pollLast();
               d.offerFirst(a);
           }
        }
        
        
        String str="";
        Iterator i = d.iterator();
        while(i.hasNext()){
            str+=i.next();
            
        }
        return str;
        
    }
}
class Main{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        StringShift ss = new StringShift();
        String s = scan.next();
        int arr[][]={{0,1},{1,2}};
        String p =ss.stringShift(s, arr);
        System.out.println(p);
    }
}