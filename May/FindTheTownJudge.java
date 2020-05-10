
class FindTheTownJudge{
    public int findJudge(int N, int[][] trust) {
        HashSet<Integer> set = new HashSet<>();
        
        for(int i=0;i<trust.length;i++) set.add(trust[i][0]);
        ArrayList<Integer> lst = new ArrayList<>();
        for(int i=1;i<=N;i++){
            if(!set.contains(i)) lst.add(i);
        }
        if(lst.size()!=1) return -1;
        int missing=lst.get(0);
        for(int i=0;i<trust.length;i++){
            if(trust[i][1]==missing) set.remove(trust[i][0]);
        }
        if(set.size()>0) return -1;
        else return missing;
                                            
    }
}