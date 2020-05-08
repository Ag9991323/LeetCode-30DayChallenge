class Straightline {
    public boolean checkStraightLine(int[][] arr) {
        if(arr.length==1||arr.length==2) return true;
        double slope=(double)(arr[1][1]-arr[0][1])/(arr[1][0]-arr[0][0]);
        for(int i=2;i<arr.length;i++){
           double num = (double)(arr[i][1]-arr[i-1][1])/(arr[i][0]-arr[i-1][0]); 
    
           if(num!=slope) return false ; 
        }
        return true;
        
        
    }
}