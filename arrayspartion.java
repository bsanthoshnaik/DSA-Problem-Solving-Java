import java.util.*;
public class arrayspartion {
    public static void main(String[]args){
        int arr[]={6,2,6,5,1,2};

        Arrays.sort(arr);
        int ans=0;
        for(int i=0;i<arr.length;i=i+2){
            ans=ans+arr[i];
        }
        System.out.println(ans);
    }
    
}
