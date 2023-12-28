import java.util.Scanner;
public class javabasics {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float pencil = sc.nextFloat();
        float pen = sc.nextFloat();
        float eraser = sc.nextFloat();
        float sum = pencil + pen + eraser;
        System.out.println("your cost of pencil is : " + pencil);
        System.out.println("your cost of pen is : " + pen);
        System.out.println("your cost of eraser is : " + eraser);
        Float GST = 0.18F * sum;
        System.out.println("18 % GST :" + GST);
        float total = sum + GST;
        System.out.println("total amount : " + total);
    }
}
