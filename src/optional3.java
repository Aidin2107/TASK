public class optional3 {
    public static void main(String[] args){
        int[][] matrix1 = {
                {1, 2, 3},
                {4, 5, 6}
        };
        int[][] matrix2 = {
                {4, 5, 6},
                {1, 2, 3}
        };

        int[][] matrix3 = new int[2][3];

        for (int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < matrix1[i].length; j++) {
                matrix3[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }

        for (int i = 0; i < matrix3.length; i++) {
            for (int j = 0; j < matrix3[i].length; j++) {
                System.out.print(matrix3[i][j] + " ");
            }
            System.out.println();
        }
    }
}
