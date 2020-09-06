class Solution {
    public List<Integer> partitionLabels(String S) {
        int n = S.length();
        HashMap<Character,Integer> hmap = new HashMap<>();
        for(int i=0;i<n;i++){
            char c = S.charAt(i);
            hmap.put(c,hmap.getOrDefault(c,0)+1);
        }
        
        List<Integer> lst = new ArrayList<>();
        int count=0;
        HashSet<Character> set = new HashSet<>();
        for(int i=0;i<n;i++){
            char c = S.charAt(i);
            int freq= hmap.get(c);
            set.add(c);
            count++;
            if(freq==1){
                hmap.remove(c);
                set.remove(c);
            }
            else{
                hmap.put(c,freq-1);
            }
            if(set.size()==0){
                lst.add(count);
                count=0;    
            }
        }
        return lst;
    }
}