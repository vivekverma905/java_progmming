import java.util.Scanner;
public class loop_5 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int i = sc.nextInt();
        int rev=0;



        while(i>0){
            int fistdigit =i%10;
           // System.out.println(fistdigit);
            rev = (rev*10)+fistdigit;
            i=i/10;
        }
        System.out.println(rev);
    }
}
