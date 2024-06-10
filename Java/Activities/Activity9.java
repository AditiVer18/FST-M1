import java.util.*;

public class Activity9 {
public static void main(String[] args) {
    List<String> mylist = new ArrayList<String>();
    mylist.add("Apple");
    mylist.add("Mango");
    mylist.add("Pinapple");
    mylist.add("Guava");
    mylist.add("Orange");

    for(String s:mylist){
        System.out.println(s);
    }
    System.out.println("Value on 3rd position is :"+mylist.get(2));
    System.out.println("If Pinapple is in List:"+ mylist.contains("Pinapple"));
    System.out.println("Size of list:-"+ mylist.size());
    mylist.remove("Mango");
    System.out.println("Size of list:-"+ mylist.size());
}
}
