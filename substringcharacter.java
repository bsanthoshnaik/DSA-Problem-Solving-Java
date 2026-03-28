import java.util.*;
public class substringcharacter {
    public static void main(String[]args){
        String s="abcxyz";
        int n=s.length();
        int ans=0;
        HashMap<Character,Integer>hm=new HashMap<>();
        int l=0;
        for(int r=0;r<n;r++){
        Character ch=s.charAt(r);
        hm.put(ch,hm.getOrDefault(ch,0)+1);
        if(r-l==3){
            Character tch=s.charAt(l);
            hm.put(tch,hm.get(tch)-1);
        
        if(hm.get(tch)==0){
            hm.remove(tch);
        }
        l++;
    }
        if(hm.size()==3){
            ans++;
        }
    }
        System.out.println(ans);
    }
    
}
