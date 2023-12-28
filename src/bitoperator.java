import java.util.Scanner;
public class bitoperator {
    public static void evenodd(int n){
        int bitmark = 1;
        if((n&bitmark)==0){
            System.out.println("even");
        }
        else{
            System.out.println("odd");
        }
    }
    public static void evennumber(int n){
        Scanner sc = new Scanner(System.in);
        int num=sc.nextInt() ;
        for(int i=0;i<=n;i++){
            if(i%2==0){
                System.out.println("even :" +i);
            }else{
                System.out.println("odd : "+i);
            }
        }
    }
    public static int bitIthupdate(int n, int i){

        int bitMark = (~0)<<i;
        return n/bitMark;
    }

    public static void main(String[] args) {
        System.out.println(bitIthupdate(15,2));
    }
}
