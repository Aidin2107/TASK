import java.util.Scanner;
        public class task6 {
            public static void main(String[] args) {
                Scanner scan = new Scanner(System.in);
                int[][] c = new int[2][3];
                for (int i = 0; i < c.length; i++) {
                    for (int j = 0; j < c[i].length; j++) {
                        c[i][j] = scan.nextInt();
                    }
                }
                for (int i = 0; i < c.length; i++) {
                    for (int j = 0; j < c[i].length; j++) {
                        System.out.print(c[i][j] + " ");
                    }
                    System.out.println();
                }
            }
        }





