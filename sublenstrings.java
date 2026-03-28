public class sublenstrings {
    public static void main(String[] args) {
        String arr="animutham";
        int n=arr.length();
        int sl=3;
        int ans=0;
        for(int i=0;i<=n-sl;i++){
            int j=i+sl-1;
            int temp=0;
            for(int k=i;k<=j;k++){                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                          
                int a=arr.charAt(k);
                temp=temp+a;
            }
            ans=Math.max(ans,temp);
            
        }
        System.out.println(ans);
        
    }
    
}
