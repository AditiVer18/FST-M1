import java.util.Arrays;

public class Activity4 {
    public static void main(String[] args) {
        insertionsort obj = new insertionsort();
        int[] arr = {4,3,2,10,12,14,1,16,7,21}; 
        System.out.println("UnSorted Array in Ascending Order: ");
        System.out.println(Arrays.toString(arr));
        
        obj.sortArray(arr);
        System.out.println("Sorted Array in Ascending Order: ");
        System.out.println(Arrays.toString(arr));
    }
}
class insertionsort{
    public void sortArray(int []Array){
        int key, j;
        for(int i=1; i<=Array.length-1;i++)
        {   key = Array[i];
            j = i-1;
            while(j>=0 && Array[j]>key)
            {
                Array[j + 1] = Array[j];
               --j;

            }
        Array[j + 1] = key;

        }
    }
    
}
