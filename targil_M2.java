import java.util.Scanner;
public class targil_M2 {
    public static void zero_C(int[][] mat, int Coloumn) {
        for (int i = 0; i < mat.length; i++)
            mat[i][Coloumn] = 0;
        }
        public static void zero_R(int[][] mat, int Row){
        for (int j = 0; j < mat[0].length; j++)
            mat[Row][j] = 0;
        }


    public static void zeros(int[][] mat) {
        boolean[] row_b = new boolean[mat.length];
        boolean[] col_b = new boolean[mat[0].length];
        for (int Row = 0; Row < mat.length; Row++) {
            for (int Coloumn = 0; Coloumn < mat[0].length; Coloumn++)
                if (mat[Row][Coloumn] == 0) {
                    row_b[Row] = true;
                    col_b[Coloumn] = true;
                }
        }
        for (int r = 0; r < mat.length; r++)
            if (row_b[r])
                zero_R(mat, r);
        for (int c = 0; c < mat[0].length; c++)
            if (col_b[c])
                zero_C(mat, c);
    }
    public static void main(String[] args) {
        int[][] mat = new int[][]{{21, 0, 3, 17}, {9, 5, 7, 8}, {0, 10, 0, 12}, {11, 2, 19, 16}};
        zeros(mat);
        for(int Row = 0; Row < mat.length; Row++) {
            for (int Coloumn = 0; Coloumn < mat[0].length; Coloumn++) {
                System.out.print(mat[Row][Coloumn] + ",");
            }
            System.out.println();
        }
    }
}