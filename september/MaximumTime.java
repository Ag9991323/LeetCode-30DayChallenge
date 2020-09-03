class Solution {
    int maxSum=0;
    
    void solve(int [] arr,int [] hours,int used,String time){
        if(used==4){
            //System.out.println(time);
            int ghanta = Integer.parseInt(time.substring(0,2));
            if(ghanta>23)return;
            int minute = Integer.parseInt(time.substring(2,4));
            if(minute>59) return;
            int totalTime = Integer.parseInt(time);
            if(totalTime>maxSum){
                maxSum = totalTime;
            }
            return ;
            
        }
        
        for(int i=0;i<4;i++){
            if(hours[i]==0){
                hours[i]=1;
                solve(arr,hours,used+1,time+(char)(arr[i]+48));
                hours[i]=0;
            }
        }
    }
    public String largestTimeFromDigits(int[] A) {
        maxSum=0;
        int hours[]= new int[4];
        solve(A,hours,0,"");
        if(maxSum>0)
           return String.format("%02d:%02d",maxSum/100,maxSum%100);
        else{
            for(int i=0;i<4;i++){
                if(A[i]!=0) return "";
            }
            return "00:00";
        }
        
    }
}