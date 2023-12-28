import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
public class sorting {
    public static void main(String[] args) {
        //ClassName objectName=new ClassName
        ArrayList<Integer>list= new ArrayList<>();

        ArrayList<String> list2=new ArrayList<>();
        ArrayList<Boolean>list3=new ArrayList<>();
        list.add(9);
        list.add(2);
        list.add(322);
        list.add(4);
        System.out.println(list);


        // collectonm .sort(list);
        Collections.sort(list);
        System.out.println(list);
        Collections.sort(list,Collections.reverseOrder());
        System.out.println(list);





    }

}
