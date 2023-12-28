import java.util.Scanner;
public class arra1 {
    public static void printpairs(int number[]){
        for(int i = 0; i<number.length;i++){
            int curr = number[i];
            for(int j=i+1; j<number.length; j++){
                System.out.print("("+curr+" ,"+number[j]+")");

            }
            System.out.println();
        }
    }
    public static void printsubarray(int  number[]){
        for(int i = 0; i<number.length;i++){
            int start = number[i];
            for(int j = i; j<number.length;j++){
                int end = j;
                for(int k = start; k<=end; k++){
                    System.out.print(number[k]+" ");
                }
                System.out.println();
            }
            System.out.println();
        }

    }
    public static void  printarr017(int number[] ){
        int currsum = 0;
        int maxsum = Integer.MIN_VALUE;

        for(int i = 0;i<number.length;i++){
            int start = i;
            for(int j=i;j<number.length;j++){
                int end = j;
                currsum = 0;
                for(int k = start; k<=end;k++){
                    currsum += number[k];

                }
                System.out.println(currsum);
                if(maxsum<currsum){
                    maxsum = currsum;
                }
            }
        }
        System.out.println("max sum :"+maxsum);
    }
    public static void prefix56(int number[]){
        int currsum = 0;
        int maxsum = Integer.MIN_VALUE;
        int prefix[] = new int[number.length];

        prefix[0] = number[0];
        for(int i=1;i< prefix.length;i++){
            prefix[i] = prefix[i-1] + number[i];

        }
        for(int i=0; i<number.length; i++){
            int start =i;

            for(int j = i; j<number.length; j++){
                int end = j;
                currsum = start ==0 ? prefix[end]: prefix[end] - prefix[start -1];
                if(maxsum < currsum){
                    maxsum = currsum;

                }
            }
        }
        System.out.println("max sum : " + maxsum);
    }

    public static void main(String[] args) {
        int number[] = {2,-4,6,-8,10,-12};
        prefix56(number);
    }

}
