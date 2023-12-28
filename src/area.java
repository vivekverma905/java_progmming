import java.util.*;

public class area {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 1;
        for (int i = 1; i <= 2 * n - 1; i++) {
            for (int j = 1; j <= n - i + 1; j++) {
                System.out.print("*");
                for (int k = 11
                     ; k <= i-4; k++) {
                    System.out.print("*");
                }


            }


            System.out.println();

        }


    }
}
