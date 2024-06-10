
import java.util.HashSet;

public class Activity10 {
public static void main(String[] args) {
    HashSet<String> hasset = new HashSet<String>();
    hasset.add("Apple");
    hasset.add("Mango");
    hasset.add("Pinapple");
    hasset.add("Guava");
    hasset.add("Orange");
    hasset.add("Banana");

    System.out.println("Original HashSet: " + hasset);   
    System.out.println("Size of HAshSet:-"+ hasset.size());
    hasset.remove("Mango");
    if(hasset.remove("onion")) {
        System.out.println("onion removed from the Set");
    } else {
        System.out.println("onion is not present in the Set");
    }
  
    System.out.println("If Pinapple is in List:"+ hasset.contains("Pinapple"));
   
    System.out.println("Updated HashSet: " + hasset);   
}
}
