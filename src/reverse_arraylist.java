import java.util.ArrayList;

public class reverse_arraylist  {
    public static void main(String[] args) {
        //ClassName objectName=new ClassName
        ArrayList<Integer>list= new ArrayList<>();

        ArrayList<String> list2=new ArrayList<>();
        ArrayList<Boolean>list3=new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);

        for(int i =list.size()-1;i>=0;i--){
            System.out.print(list.get(i)+" ");
        }
        System.out.println();



    }

}
