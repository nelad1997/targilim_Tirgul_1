import java.util.Scanner;
public class matrix {
    public static void main(String[] args) {
        int[][] mat1 = new int[][]{{1, 0,0}, {0, 1,0},{0,0,1}};
        int[][] mat2 = new int[][]{{1, 2,3}, {4, 5,6},{7,8,9}};
        int[][] mat3 = new int[mat1.length][mat1[0].length];
        for (int i = 0; i < mat1.length; i++) {
            for (int j = 0; j < mat1[0].length; j++) {
                    for (int k = 0; k < mat1[0].length; k++)
                        mat3[i][j] += mat1[i][k] * mat2[k][j];
                    System.out.print(mat3[i][j]+",");
            }
            System.out.println();
        }
    }
}
