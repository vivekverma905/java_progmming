import java.util.ArrayList;

public class swap2number {
    public static void swap(ArrayList<Integer> list,int idx1,int idx2){
        int temp =list.get(idx1);
        list.set(idx1,list.get(idx2));
        list.set(idx2,temp);
    }
    public static void main(String[] args) {
        //ClassName objectName=new ClassName
        ArrayList<Integer>list= new ArrayList<>();

        ArrayList<String> list2=new ArrayList<>();
        ArrayList<Boolean>list3=new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);

        int idx1=1, idx2=3;
        System.out.println(list);

        swap(list,idx1,idx2);
        System.out.println(list);




    }

}
