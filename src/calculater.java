import java.util.Scanner;
public class calculater {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a ");
        int a = sc.nextInt();
        System.out.println("enter b");
        int b= sc.nextInt();
        System.out.println("enter operater");
        char operater = sc.next().charAt(0);


        switch (operater){
            case '+' :
                System.out.println(a+b);
                break;

            case '-' :
                System.out.println(a-b);
                break;

            case '*':
                System.out.println(a*b);


                break;

            case '/':
                System.out.println(a/b);
                break;

            case '%':

                System.out.println(a%b);
                break;
            default:
                System.out.println("invalid operater");
                break;

        }
    }
}
