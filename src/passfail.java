import java.util.Scanner;
public class passfail {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int marks = sc.nextInt();

        String type = ((marks >=33))? " pass":"fail";
        System.out.println(type);
    }
}
