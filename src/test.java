import java.util.Scanner;
import java.util.Collection;

public class test {
    public static void kadans(int number[]){
        int ms = Integer.MIN_VALUE;
        int cs = 0;

        for(int i =0;i<number.length;i++){
            cs = cs+ number[i];
            if(cs < 0 ){
                cs = 0;
            }
            ms = Math.max(cs, ms);



        }
        System.out.println(" our max subarray sum is "+ ms);
    }
    public static void bubblissort(int number[]){
        for(int turn =0; turn <number.length; turn++){
            for(int j=0; j<number.length;j++){
                if(number[j]>number[j+1]){
                    int temp = number[j];
                    number[j] = number[j+1];
                    number[j+1] = temp;

                }
            }
        }
    }
    public static void printarr(int arr[]){
        for(int i=0;i<arr.length; i++){
            System.out.print(arr[i]+" ");

        }
        System.out.println();
    }
    public static void selectionsort(int arr[]){
        for(int i =0; i<arr.length-1;i++){
            int minPos = i;
            for(int j=i+1;j<arr.length; j++){
                if(arr[minPos]<arr[j]){
                    minPos=j;
                }
            }
            int temp = arr[minPos];
            arr[minPos]= arr[i];
            arr[i] = temp;

        }
    }
    public static void insrertionsort(int arr[]){
        for(int i=1;i< arr.length;i++){
            int curr =1;
            int prev = i-1;
            while(prev >=0 && arr[prev] > arr[curr]){
                arr[prev+1] = arr[prev];
                prev--;

            }
            arr[prev+1] = arr[curr];

        }

    }
    public static void countingsort(int arr[]){
        int largest = Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++){
            largest = Math.max(largest,arr[i]);

        }
        int count[] = new int[largest +1];
        for(int i=0; i<arr.length;i++){
            count[arr[i]]++;
        }
        int j=0;
        for(int i=0; i<count.length;i++){
            while(count[i] >0){
                arr[j] = i;
                j++;
                count[i]--;

            }

        }
    }
    public static void printsprial(int matrix [][]){
        int startRow = 0;
        int startCol=0;
        int endRow = matrix.length-1;
        int endCol = matrix[0].length-1;
        while(startRow<= endRow && startCol <=endCol){
            for(int j=startCol; j<=endCol; j++){
                System.out.print(matrix[startRow] +" ");
            }
            for(int i = startRow+1; i<=endRow ; i++){
                System.out.print(matrix[i][endCol]+" ");
            }
        }

    }




    public static void main(String[] args) {
     /*   int matrix[][] = new int [3][3];
        int n= matrix.length, m= matrix.length;
        Scanner sc = new Scanner(System.in);
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                matrix[i][j] = sc.nextInt();

            }
        }
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }*/
        int matrix [][] = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};

    }
}
