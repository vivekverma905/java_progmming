public class floyd {
    public static void half(int n){
        for(int i = 1 ; i <= n ; i++){
            for(int j = 1 ; j <= n-i+1;j++ ){
                System.out.print(j);
            }
            System.out.println();
        }
    }
    public static void floy(int n){
        int counter=1;
        for(int i =1; i<=n; i++){
            for(int j = 1; j<=i;j++){
                System.out.print(counter + " ");
                counter++;
            }
            System.out.println();
        }
    }
    public static void trai(int n){

        for(int i = 1; i<=n ; i++){
            for(int j = 1 ; j<=i; j++){
                if((i+j)%2==0){
                    System.out.print("1");
                }else{
                    System.out.print(0);
                }
            }
            System.out.println();
        }
    }
    public static void batt(int n ){
        for(int i = 1; i<=n; i++){
            for(int j = 1 ; j <=i; j++){
                System.out.print("*");
            }
            for(int j = 1 ; j<=2*(n-i); j++){
                System.out.print(" ");

            }
            for( int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i = n ; i>=1 ; i--){

            for(int j = 1 ; j <=i; j++){
                System.out.print("*");
            }
            for(int j = 1 ; j<=2*(n-i); j++){
                System.out.print(" ");

            }
            for( int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        }

    public static void solid(int n){
        for(int i = 1; i<=n; i++){
            for(int j = 1; j<=(n-i); j++){
                System.out.print(" ");
            }
            for(int j = 1; j<=n;j++){
                if(i==1||i==n||j==1||j==n){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    public static void dia(int n){
        for(int i = 1 ; i<=n ; i++) {
            for (int j = 1; j <= (n - i); j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= (2 * i) - 1; j++) {
                System.out.print("*");
            }

            System.out.println();

        }
        for(int i =n;i>=1;i--){
            for (int j = 1; j <= (n - i); j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= (2 * i) - 1; j++) {
                System.out.print("*");
            }

            System.out.println();

        }

        }


    public static void main(String[] args) {
        dia(4);
    }
}
