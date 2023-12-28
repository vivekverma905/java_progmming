import java.util.Scanner;
public class pattern_02 {
    public static void hollorectangle( int totrows,int totcol){
        for(int i = 1; i<=totrows;i++){
            for(int j = 1; j <= totcol;j++){

                if(i==1||i==totrows ||j==1||j==totcol){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();

        }

    }
    public static void halfpyramid(int n){
        for(int i = 1; i <= n; i++){
            for(int j = 1; j<=n-i;j++){
                System.out.print(" ");
            }
            for(int j=1 ; j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }


    }

    public static void main(String[] args) {
        halfpyramid(4);

    }
}
