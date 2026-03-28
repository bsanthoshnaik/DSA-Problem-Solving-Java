public class mindistanceslidingwindow {
    public static void main(String[]args){
        int arr[]={1,4,7,9};
        int n=arr.length;
        int temp=0;
        int l=0;
        int ans=Integer.MAX_VALUE;
        for(int r=0;r<n;r++){
            if(r-l+1==3){    
            temp=arr[r]-arr[l];
            ans=Math.min(ans,temp);
            l++;
        }
    }
        System.out.println(ans);
        
    }
    
}
