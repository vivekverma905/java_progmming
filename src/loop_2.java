import java.util.Scanner;
public class loop_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int counter = 0;


        int num= sc.nextInt();

        while(counter <= num){
            System.out.println(counter);
            counter++;
        }
    }
}
