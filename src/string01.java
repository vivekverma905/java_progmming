import java.util.Scanner;
public class string01 {
    public static boolean palindrom(String str){
        for(int i=0; i<=str.length(); i++){
            int n = str.length();
            if(str.charAt(i) != str.charAt(n-i-1)){
                return false;
            }

        }
        return true;

    }
    public static float shortestpath(String path){
        int x=0, y = 0;
        for(int i=0 ; i<path.length(); i++){
            char dri = path.charAt(i);
            if(dri == 'S'){
                y--;

            }else if(dri == 'N'){
                y++;
            }
            else if(dri == 'E'){
                x++;
            }
            else{
                x--;
            }
        }
        int x1 = x*x;
        int y1 = y*y;

        return (float) Math.sqrt(x1+y1);
    }
    public static void main(String[] args) {
        String path = "WWEESSEWNNSENN";
        System.out.println(shortestpath(path));

    }
}
