import java.util.*;
public class countchar {
    public static void main(String[]args){
        String str="educeation";
        HashMap<Character,Integer>macha=new HashMap<>();
        for(char sai:str.toCharArray()){
            macha.put(sai,macha.getOrDefault(sai,0)+1);

        }
        System.out.println(macha);

    }
    
}
