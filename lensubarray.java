public class lensubarray {
    public static void main(String[]args){
        int arr[]={1,4,6,7,5,4,6};
        //int ans=0;
        int n=arr.length;
       // int ans=0;
        int sl=3;
        int ans=0;
        for(int i=0;i<n-2;i++){
            int j=i+sl-1;
           // System.out.println(+i+" "+j);
            int temp=0;
            for(int k=i;k<=j;k++){
            temp=temp+arr[k];
        
        }
        ans=Math.max(ans,temp);
        //System.out.println(ans);
    }
    System.out.println(ans);
}
}
    

