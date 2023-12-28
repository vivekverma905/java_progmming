import java.util.Scanner;
public class terneryoperater {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = 4;

       String type =  ((number %2)==0)? "even": "odd";
        System.out.println(type);
    }
}
