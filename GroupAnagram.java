import java.util.*;

public class GroupAnagram {
   
        public static List<List<String>> groupAnagrams(String[] arr) {
            List<List<String>> finallst = new ArrayList<>();
            //hey loop start
            for(int i=0;i<arr.length; i++) {
                if(arr[i]!="-1"){
                    List<String> lst = new ArrayList<String>();
    
                    String temp=arr[i];
                    lst.add(temp);
                    int hash1=0;
                    for(int j=0;j<temp.length();j++){
                        hash1+=temp.charAt(j);
                        hash1%=100000007;
                    }
                    arr[i]="-1";
                    int count[]= new int[26];
                    for(int j=0;j<temp.length();j++){
                        count[temp.charAt(j)-97]+=1;
                    }
                    for(int k=i+1;k<arr.length;k++){
                        if(arr[k]!="-1"){
                        String temp2=arr[k];
                        if(temp.length()==temp2.length()){
                             int hash2=0;
                            for(int j=0;j<temp2.length();j++){
                                hash2+=temp2.charAt(j);
                                hash2%=100000007;
                            }
                            if(hash1==hash2){
                                
                                    int count2[]= new int[256];
                                 for(int j=0;j<temp2.length();j++){
                                    count2[temp2.charAt(j)-97]+=1;
                                  }
    
                                  boolean isequal =true;
                                  for(int j=0;j<26;j++){
                                      if(count[j]!=count2[j]){
                                          isequal=false;
                                        break;
                                      }
                                  }
    
                                  if(isequal){
                                      arr[k]="-1";
                                    lst.add(temp2);
    
                                  }
                                }
                   
                    
                            }
    
                             
                
        
                        }
        
                    }
                    finallst.add(lst);
        
                }
                }
                
            return finallst;
            
        }
    

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        String arr[] = new String[n];
        for(int i=0;i<n;i++){
            arr[i]= scan.next();
        }
      List ls = groupAnagrams(arr);
        System.out.println(ls);
    

        }
    }
