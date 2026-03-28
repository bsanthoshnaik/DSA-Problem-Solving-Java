import java.util.*;
public class stringconvertcharappers {
    public static void main(String[]args){
        String str="jaisriram";
        HashMap<Character,Integer>macha=new HashMap<>();

        for(Character c:str.toCharArray()){
            macha.put(c,macha.getOrDefault(c,0)+1);


        }
        System.out.println(macha);
    }
    
}
