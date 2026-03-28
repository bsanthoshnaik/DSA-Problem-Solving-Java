public class prime {
    public static void main(String[] args) {
        int n=3;
        boolean isprime=true;
        if(n<=1){
            isprime=false;
        }
        else{
            for(int i=2;i<n;i++){
                if(n%2==0){
                    isprime=false;
                }
            }
        }
        if(isprime){
            System.out.println("prime");
        }
        else{
            System.out.println("notprime");
        }    
    }    
}
