public class optional2 {
    public static void main(String[] args) {
        int[][] a = {
                {3, 4, 4},
                {2, 2, 3},
        };
        int[][] b = new int[a[0].length][a.length];
        for (int column = 0; column < a[0].length; column++) {
            for (int row = 0; row < a.length; row++) {
                b[column][row] = a[row][column];
            }
        }
        for (int row = 0; row < b.length; row++) {
            for (int collumn = 0; collumn < b[row].length; collumn++) {
                System.out.print(b[row][collumn] + " ");
            }
            System.out.println();
        }
    }
}
