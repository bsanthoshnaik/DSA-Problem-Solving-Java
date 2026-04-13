public class swlength{
    public static void main(String[] args) {
        int arr[]={0,1,3,1,1,6,7,1,0,1};
        int ans=0;
        int count=0;
        int l=0;
        int k=2;
        for(int r=0;r<arr.length;r++){
            if(arr[r]==1){
                count++;
            }
            while(count>k){
                if(arr[l]==1){

                    count--;
                }
                l++;
            }
            ans=Math.max(ans,r-l+1);
        }
        System.out.println(ans);
    }
}