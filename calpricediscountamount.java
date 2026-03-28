import java.util.*;
public class discount {
    public static void main(String[] args) {
        Scanner sin=new Scanner(System.in);
        System.out.println("ener amout");
        Double amount=sin.nextDouble();
        double discountrate=0;
        if(amount<1000){
            discountrate=0.05;
        }
        else if(amount<4999){
            discountrate=0.10;
        }
        else if(amount<5000){
            discountrate=0.15;
        }
        else{
            System.out.println("invalid");
        }
        Double finalamou=amount-(amount*discountrate);
        System.out.println(finalamou);

    }
    
}
