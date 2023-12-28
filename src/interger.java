import java.util.Scanner;
public class interger {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int sumeven = 0;
        int sumodd = 0;

        for(int i =1 ; i<=num; i++){
            if(i%2==0){
                 sumeven += i;

            }else{
                sumodd += i;

            }


        }
        System.out.println("sum of even number : " + sumeven);
        System.out.println("sum of odd number : " + sumodd);
    }
}
