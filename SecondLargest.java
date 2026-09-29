import java .util.Arrays;
public class SecondLargest {
    public static void main(String[] args) {
        
        int[] arr= {3,5,6,7,9,10};
        Arrays.sort(arr);
        System.out.println("Second largewst="+arr[arr.length-2]);

    }
    
}
