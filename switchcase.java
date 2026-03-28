import java.util.Scanner;

public class switchcase {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter number: ");
        int days = in.nextInt();

        switch (days) {
            case 1:
                System.out.println("monday");
                break;
            case 2:
                System.out.println("tuesday");
                break;
            default:
                System.out.println("none");
        }

        in.close();
    }
}
