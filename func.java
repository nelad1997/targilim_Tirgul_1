import java.util.Scanner;
public class func {
    public static int max_element(int[] arr) {
        int max = arr[0];
        int max_index = -1;
        for (int i = 0; i < arr.length; i++) {
            if (max <= arr[i]) {
                max = arr[i];
                max_index = i;
            }
        }
        return max_index;
    }


    public static void main(String[] args) {
        int[] array;
        array = new int[]{0, 5, 6, 7, 8, 9, 987, -999};
        int max_index = max_element(array);
        System.out.println("The index of the max element is: " + max_index);
    }
}

