import java.util.HashMap;


public class Activity11 {
public static void main(String[] args) {
    HashMap<Integer,String> hasmap = new HashMap<Integer,String>();
    hasmap.put(1,"Apple");
    hasmap.put(2,"Mango");
    hasmap.put(3,"Pinapple");
    hasmap.put(4,"Guava");
    hasmap.put(5,"Orange");
    hasmap.put(6,"Banana");

    System.out.println("Original HashMap: " + hasmap);   
   
    hasmap.remove(3);
    System.out.println("Updated HashSet: " + hasmap);   

    if(hasmap.containsValue("onion")) {
        System.out.println("onion removed from the Set");
    } else {
        System.out.println("onion is not present in the Set");
    }
    System.out.println("Size of HashMap:-"+ hasmap.size());
}
}
