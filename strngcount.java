import java.util.HashMap;
public class strngcount {
    public static void main(String[] args) {
        HashMap <String,Integer>macha=new HashMap<>();
        String [] arr={"ram","kiran","ram","kiran","harsha"};
        for(int i=0;i<arr.length;i++){
        String n=arr[i];
        if(macha.containsKey(n)){
            int temp=macha.get(n);
            macha.put(n,temp+1); 
        }
        else{
            macha.put(n,1);
        }
    }
    for(String boom:macha.keySet()){
        System.out.println(boom+" "+macha.get(boom));
    }   
    } 
}
