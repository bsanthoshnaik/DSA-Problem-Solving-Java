import java.util.*;
public class thresholdvalue {
    public static void main(String[] args) {
        int arr[]={1,2,3,1,4};
        int l=0;
        int k=0;
        int threshold=7;
        int ans=0;
        int count=0;
        int temp=0;
        for(int r=0;r<arr.length;r++){
            temp=temp+arr[r];
            if(r-l==3){
                temp=temp-arr[l];
                l++;
            }
            if(r-l+1==3){
                //ans=Math.max(temp,ans);
            
            if(threshold<=temp){
                count++;
            }
            }
        }
        System.out.println(count);
        
    }
    
}
