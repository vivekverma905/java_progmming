import java.util.Scanner;
public class function_5 {
    public static int factorial(int n){
        int f = 1;

        for(int i =1; i<= n ; i++){

                f = f*i;

        }

        return f;

    }
    public static int bionimal(int n , int r){

        int   a = factorial(n);
        int b = factorial(r);
        int c = factorial(n-r);
        int bc = a/(b*c);
      //  System.out.println(bc);
        return bc;


    }
    public static int sum(int a , int b ){
        return a+b;
    }
    public static float sum(float a, float b){
        return a+b;
    }
    public static int sum(int a , int b , int c){
        return a+b+c;
    }
    public static boolean isprime(int n){
        if(n==2){
            return true;
        }
        boolean isprime = true;
        for(int i = 2;i<= Math.sqrt(n);i++){
            if(n % i ==0){
                isprime = false;

            }
        }

        return isprime;


    }
    public static void primeinrange(int n){
        for(int i = 2 ; i<=n;i++){
            if(isprime(i)){
                System.out.print(i + " ");

            }

        }
        System.out.println();

    }
    public static void bintodec(int n){
        int pow = 0;
        int decnum = 0;
        while(n>0){
            int lastDigit = n%10;
            decnum=decnum+(lastDigit* (int) Math.pow(2,0));
            pow++;
            decnum = decnum/10;
        }
        System.out.println("binery no "+  "dec is " + decnum);
    }
    public static void dectobin(int n){
        int mynum = n;
        int pow = 0 ;
        int binnum = 0 ;

        while(n>0){
            int rem = n%2;
            binnum = binnum + ( rem * (int) Math.pow(10,pow));

            pow++;
            n = n/2;

        }
        System.out.println("binery number of "+ mynum + " decicmal number "+ binnum);
    }


    public static void main(String[] args) {



    }
}
