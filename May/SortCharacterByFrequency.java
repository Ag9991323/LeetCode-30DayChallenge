class Solution {
    public String frequencySort(String s) {
        int arr[] = new int[256];
        for(int i=0;i<s.length();i++){
            arr[s.charAt(i)]+=1;
        }
        TreeMap<Integer,ArrayList<Character>> map = new TreeMap<>( Collections.reverseOrder());
        for(int i=0;i<256;i++){
            int temp = arr[i];
            if(map.containsKey(temp)){
                ArrayList<Character> ls= map.get(temp);
                ls.add((char)i);
                map.put(temp,ls);
            }
            else{
                ArrayList<Character> ls= new ArrayList<>();
                ls.add((char)i);
                map.put(temp,ls);
            }
        }
        StringBuilder str = new StringBuilder();
        for(Map.Entry<Integer,ArrayList<Character>> m: map.entrySet()){
            ArrayList<Character> temp = m.getValue();
            int num = m.getKey();
            for(int i=0;i<temp.size();i++){
                for(int j=0;j<num;j++) str.append(temp.get(i));
            }
        }
        return str.toString();
        
    }
}