class Solution {
    public int twoCitySchedCost(int[][] costs) {
       Comparator<int[]> c = new Comparator<int []>(){
           public int compare(int[] a,int b[]){
                 return Math.abs(b[1]-b[0])-Math.abs(a[1]-a[0]); 
           }
        
       };
        Arrays.sort(costs,c);
        int countA=0;
        int countB=0;
        int n = costs.length/2;
        int sum=0;
        for(int i=0;i<2*n;i++){
            if(countA<n&&countB<n){
               if(costs[i][0]<costs[i][1]){
                sum+=costs[i][0];
                countA++;
            } 
                else{
                     sum+=costs[i][1];
                      countB++;
                }
            }
            else if(countA==n){
                sum+=costs[i][1];
                countB++;
            }
            else{
                sum+=costs[i][0];
                countA++;
            }
            
            
        }
       return sum;
        
    }
}