import java.util.Scanner;
public class conditial_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();

        if( age >=18){
            System.out.println("drive, vote");

        }
        if( age >13 && age < 18){
            System.out.println("teenager");
        }

        else{
            System.out.println("not adult");
        }
    }
}
