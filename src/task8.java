import java.util.Scanner;
public class task8 {
    public static void main(String[] args) {
        Scanner Scan = new Scanner(System.in);
        int[][] a = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        System.out.println("Enter number: ");
        int num = Scan.nextInt();
        int greater = 0;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                if (a[i][j] > num) {
                    greater +=1;
                }
            }
        }
        System.out.println("values greater"+num+ ": "+ greater);
    }
}