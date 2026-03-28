public class missing {
    public static void main(String[]args){
        int arr[]={1,2,3,4,5,6,7,8,10};
        int k=10;
        int ans=0;
        int a=0;
        int b=0;
        int n=arr.length;
        for(int i=0;i<n;i++){
            a=k*(k+1)/2;
            b=b+arr[i];
        }
        ans=a-b;
        System.out.println(ans);
    }   
}
