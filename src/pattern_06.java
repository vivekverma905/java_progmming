import java.util.Scanner;
public class pattern_06 {
    public static void halfprim(int n){
     for(int i= 1;i<=n;i++){
         for(int j=1;j<=n-i+i;j++){
             System.out.print(j+" ");
         }
         System.out.println();
     }
    }
    public static void half(){
        for(int i =1; i<=5; i++){
            for(int j = 1; 5 - i + i >= j; j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        half();
    }

}
