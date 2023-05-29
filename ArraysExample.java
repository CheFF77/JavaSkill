import java.util.Arrays;

public class ArraysExample {
    public static void main (String [] args) {
        int[] ar = {1,23,4,5};
        int[] arr2 = new int[] {1,4,56,7};
        System.out.println(Arrays.toString(ar));
        /*for (int i=0; i <ar.length; i++) {
            if (ar[i] >10)
                break;
            System.out.println(ar[i]);
        }*/
        for (int i : arr2) {
            System.out.println(i);
        }
    }
}
