import java.util.Arrays;

public class Activity2 {
    public static void main(String[] args) {
        int[] arr = {10,12,-3,10,5,10,2,10}; 
        int searchnum = 10;
        int fixednum = 30;
        
        countArr obj = new countArr();
        obj.count10(arr,searchnum,fixednum);
        System.out.println("Original Array: " + Arrays.toString(arr));
        System.out.println("Result: " + obj.count10(arr, searchnum, searchnum));
    }
}

class countArr{
 public  boolean count10(int[] num, int search, int fixsum)
 {
    int count=0;
    for(int i=0; i<=num.length-1;i++)
    {
        if(num[i]==10)
        count=count+num[i];
    }
    if(count==fixsum)
    return true;
    else return false;
 }
}
