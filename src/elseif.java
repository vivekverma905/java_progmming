import java.sql.SQLOutput;
import java.util.Scanner;
public class elseif {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();

        if (age>=18){
            System.out.println("adult");
        } else if (age <18 && age >13) {
            System.out.println("teenager");

        }else {
            System.out.println(
                    "child"
            );
        }



    }
}
