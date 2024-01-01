import java.util.Arrays;
import java.util.Random;

public class binarySearch {
    int binarySearch(int arr[], int start, int end, int x)
    {
        while ( start <= end) {
            int mid = (start + end) / 2;
 
            if (arr[mid] == x) {
                return mid;
 
 
            } else if (arr[mid] > x) {
                //end = mid - 1;
                return binarySearch(arr, start, mid - 1, x);
            } else {
              //start = mid + 1;
              return binarySearch(arr, mid + 1, end, x);
            }  
        }
 
        return -1;
    }
    public static void main(String[] args) {
        
        binarySearch ob = new binarySearch();
        Random random = new Random();
        int[] arr = new int[1000];

        for (int i = 0; i < 1000; i++) {
            arr[i] = random.nextInt(1000);
            System.out.println(arr[i]);
        }
        Arrays.sort(arr);
        int number=arr[800];
        long time1 = System.nanoTime();
        int result = ob.binarySearch(arr, 0, 999, number);
        long time2 = System.nanoTime();
        long totalTime= time2-time1;
        if (result == -1)
            System.out.println("Element not present");
        else
            System.out.println("Element found at index " + result);
            System.out.println("The time it took to check the min and max is: " + totalTime );
    }
}
