public class optinal1 {
    public static void main(String[] args) {
        int[][] a = {
                {5, 4, 3, 5},
                {3, 4, 4, 4},
                {2, 2, 3, 4},
        };
        int maxrow = 0;
        for (int column = 0; column < a.length; column++) {
            maxrow += a[0][column];
        }
        int maxrowindex = 0;
        for (int row = 0; row< a.length; row++) {
            int rowsum=0;
            for (int column = 0; column < a.length; column++){
                rowsum +=a[row][column];
            }
            if(rowsum>maxrow){
                maxrow=rowsum;
                maxrowindex= row ;
            }
        }
        System.out.println("Row at index "+ maxrowindex +" has max sum of " + maxrow);


        }
    }
