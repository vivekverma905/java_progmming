import java.util.Scanner;
public class lin {
    public static int linearSearch(int number[],int key) {
        for (int i = 1; i <= number.length; i++) {
            if (number[i] == key) {

            }
            return i;
        }
        return -1;

    }

    public static void main(String[] args) {
        int number[] = { 2,3,4,5,6,7,8,9,12,33,54};
        int key = 8;

        int index = linearSearch(number,key);
        if(index == -1){
            System.out.print(
                    "not found"
            );
        }
        else{
            System.out.print("key at index:"+index);
        }

        System.out.println();
    }

}
