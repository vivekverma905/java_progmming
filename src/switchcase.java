import java.util.Scanner;
public class switchcase {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int number = sc.nextInt();

        switch ( number){
            case 1 :
                System.out.println("pizza");
                break;
            case 2:
                System.out.println("barger");
                break;
            case 3:
                System.out.println("mango shake");
                break;

            default:
                System.out.println(
                        "invalid number"

                );
                break;

        }

    }
}
