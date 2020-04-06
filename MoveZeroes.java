import java.io.*;
import java.util.*;

public class MoveZeroes {

    // public static void main(String[] args) {
    //     Scanner scan = new Scanner(System.in);
    //     int n = scan.nextInt();
    //     int arr[] = new int[n];
    //     for(int i=0;i<n;i++){
    //         arr[i]= scan.nextInt();
    //     }
    //     int zerocount=0;
    //     int j=0;
    //     for(int i=0;i<n;i++){
    //         if(arr[i]==0){
    //             zerocount+=1;
    //         }
    //         else{
    //             arr[j++]=arr[i];
    //         }

    //     }
    //     for(;j<n;j++){
    //         arr[j]=0;
    //         zerocount--;
    //     }
    //     System.out.println(Arrays.toString(arr));

    //     }
    // }

    public static void main(String[] args)throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        while(T-->0){
           // OddNo n = new OddNo();
            int N = Integer.parseInt(br.readLine().trim()); 
            int[] arr = new int[N];
            StringTokenizer  s = new StringTokenizer(br.readLine());
            for(int i=0;i<N;i++){
                arr[i]=Integer.parseInt(s.nextToken());
            }
            //n.oddnoprint(arr, N);
            System.out.println();
        }
    }
}
