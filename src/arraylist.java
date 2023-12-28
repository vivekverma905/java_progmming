import java.util.ArrayList;

public class arraylist {
    public static void main(String[] args) {
        //ClassName objectName=new ClassName
        ArrayList<Integer>list= new ArrayList<>();

        ArrayList<String> list2=new ArrayList<>();
        ArrayList<Boolean>list3=new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        System.out.println(list);


        int element=list.get(2);
        // get element
        System.out.println(element);

        // remove element
        list.remove(2);
        System.out.println(list);

        //set operation
        list.set(2,10);
        System.out.println(list);
        //contain element

        System.out.println(list.contains(2));






    }

}
