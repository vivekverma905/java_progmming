import com.sun.security.jgss.GSSUtil;

import java.util.ArrayList;

public class size {
    public static void main(String[] args) {
        //ClassName objectName=new ClassName
        ArrayList<Integer>list= new ArrayList<>();

        ArrayList<String> list2=new ArrayList<>();
        ArrayList<Boolean>list3=new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        System.out.println(list.size());
        for(int i =0;i<list.size();i++){
            System.out.println(list.get(i));
        }
        System.out.println();



    }

}
