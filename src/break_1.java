import java.util.Scanner;
public class break_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for(int i = 1 ; i<=5; i++){
            if(i==3){
                break;
            }
            System.out.println(i);
        }

    }
}
