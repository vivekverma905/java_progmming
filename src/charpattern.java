import java.util.Scanner;
public class charpattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char chare = 'A';
        int n = sc.nextInt();


        for(int i = 1 ; i<=n;i++){
            for(int ch = 1; ch<=i;ch++ ){
                System.out.print(chare);
                chare++;
            }
            System.out.println();
        }
    }
}
