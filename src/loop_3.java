import java.util.Scanner;
public class loop_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        int i = 1;
        int sum = 0;

        while(i<=n){
            sum+=i;
            i++;
        }

        System.out.println(sum);
    }
}
