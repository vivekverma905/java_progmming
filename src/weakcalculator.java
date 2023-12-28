import java.util.Scanner;
public class weakcalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int days = sc.nextInt();

        switch (days){
            case 1 :
                System.out.println("monday");
                break;
            case 2 :
                System.out.println("tuesday");
                break;
            case 3:
                System.out.println("wednesday");
                break;
            case 4:
                System.out.println("thusday");
                break;
            case 5:
                System.out.println("firday");
                break;
            case 6:
                System.out.println(
                        "saterday"
                );

                break;
            case 7:
                System.out.println("sunday");
                break;
            default:
                System.out.println("invalid input");
        }
    }
}
