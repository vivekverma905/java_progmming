import java.util.Scanner;
public class forloop_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();

        while(i>0){
            int lastdigit = i %10;
            System.out.print(lastdigit + " "
            );
            i= i/10;

        }
        System.out.println(

        );
    }
}
