import java.util.Scanner;
public class task9 {
    public static void main(String[] args) {
        Scanner Scan = new Scanner(System.in);
        int[][] a = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        System.out.println("Enter number: ");
        int num = Scan.nextInt();
        boolean found = false;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                if(num == a[i][j])
                {
                    System.out.println("Number found on " + (i + 1) + "row and " + (j + 1) + "column\n");
                    found = true;
                }
            }
        }
        if (!found){
            System.out.println("Not found");
    }
}}
