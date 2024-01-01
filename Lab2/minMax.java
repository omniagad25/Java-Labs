import java.util.Random;

public class minMax {

    public static void main(String[] args) {

        Random random = new Random();
        int[] arr = new int[1000];

        for (int i = 0; i < 1000; i++) {
            arr[i] = random.nextInt(1000); 
        }
        long time1 = System.currentTimeMillis();
        int min=arr[0];
        int max=arr[0];
       
        for (int i = 0; i < arr.length; i++) {
            
            if (max < arr[i]) {
                max = arr[i];
            } 
            if (min > arr[i]) {
                min = arr[i];
            }
        }
        System.out.println("The maximum number is: "+ max);
        System.out.println("The minimum number is: "+ min);
        long time2 = System.currentTimeMillis();
        long totalTime= time2 - time1;
        System.out.println("The time it took to check the min and max is: " + totalTime );
    }
}