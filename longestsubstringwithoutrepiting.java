import java.util.*;
public class longestsubstringwithoutrepiting {
    public static void main(String[] args) {
        String s="abcabc";
        int l=0;
        int ans=0;
        HashSet<Character>macha=new HashSet<>();
        for(int r=0;r<s.length();r++){
        char ch=s.charAt(r);
        if(!macha.contains(ch)){
            macha.add(ch);
        }
        else{
            while(macha.contains(ch)){
                macha.remove(s.charAt(l));
                l++;
            }
            macha.add(ch);
        }
        ans=Math.max(ans,r-l+1);
        }
            System.out.println(ans);   
    }   
}
