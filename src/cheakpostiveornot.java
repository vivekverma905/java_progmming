import java.util.Scanner;
public class cheakpostiveornot {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        String number = (num>0) ? "positive ": "negative";
        System.out.println(number);
    }
}
