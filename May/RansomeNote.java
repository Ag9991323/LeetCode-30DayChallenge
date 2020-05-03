class Solution {
    public boolean canConstruct(String r, String m) {
       int arr [] = new int[26];
        for(int i=0;i<r.length();i++){
            arr[r.charAt(i)-'a']+=1;
        }
        for(int i=0;i<m.length();i++){
            arr[m.charAt(i)-'a']-=1;
        }
        for(int i: arr){
            if(i>0)return false;
        }
        return true;
    }
}