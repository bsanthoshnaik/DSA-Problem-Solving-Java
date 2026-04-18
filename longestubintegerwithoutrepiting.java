import java.util.*;
class longestubintegerwithoutrepiting{
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,1,2,3,4,5};
        int ans=0;
        int l=0;
        HashSet<Integer>macha=new HashSet<>();
        for(int r=0;r<arr.length;r++){
                while(macha.contains(arr[r])){
                    macha.remove(arr[l]);
                    l++;
                }
                macha.add(arr[r]);
            
            ans=Math.max(ans,r-l+1);

        }
        System.out.println(ans);
    }

}
