class Solution {
     public boolean stringMatcher(String txt,StringBuilder pat,int n,int k){
         //System.out.println(txt+"  "+pat);
         for(int i=0;i<n;i++){
             if(txt.charAt(i)!=pat.charAt(i%k)) return false;
         }
         if(n%k==0) return true;
         return false;
     }
    public boolean repeatedSubstringPattern(String s) {
        int n = s.length();
        char last = s.charAt(n-1);
        char first= s.charAt(0);
        StringBuilder str = new StringBuilder();
        for(int i=0;i<n/2;i++){
            char curr= s.charAt(i);
            str.append(""+curr);
            if(curr==last&&s.charAt(i+1)==first){
                boolean ans =stringMatcher(s,str,n,str.length());
                if(ans==true) return true;
            }
            
          
        }
        return false;
    }
}