import java.util.Scanner;
public class targil_M1 {
    public static void same_element(int[][] arr) {
        int[] same = new int[arr.length * arr[0].length];
        int k = 0;
        for(int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++, k++)
                same[k] = arr[i][j];//k will end as 16 but we don't insert anything there!!! any way we can use another function for it as it would be in one dimention array
        }
        boolean flag = true;
        for(int i = 0; i < same.length; i++) {
            for (int j = i+1; j < same.length; j++) {
                if (same[i] == same[j]) {
                    System.out.print(same[i] + ",");
                    flag = false;
                }
            }
        }
        if (flag)
            System.out.print("every element occur only once");
    }
        public static void main (String[]args){
            int[][] arr = new int[][]{{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 1, 2, 3}, {4, 5, 8, 8}};
            same_element(arr);
        }
    }



