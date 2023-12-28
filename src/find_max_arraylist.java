import java.util.ArrayList;

public class find_max_arraylist {
    public static void main(String[] args) {
        //ClassName objectName=new ClassName
        ArrayList<Integer>list= new ArrayList<>();

        ArrayList<String> list2=new ArrayList<>();
        ArrayList<Boolean>list3=new ArrayList<>();
        list.add(1);
        list.add(27);
        list.add(3);
        list.add(9);
        int max=0;
        for (int i=0;i<list.size();i++){
            //System.out.print(list.get(i)+" ");
            if (max<=list.get(i)){
                max=list.get(i);
            }


        }
        System.out.println(max);




    }

}
