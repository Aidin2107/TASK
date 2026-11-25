public class task5 {
    public static void main(String[] args) {
        int[][] a = {
                {1,2,3,4},
                {5,6,7,8},
                {9,10,11,12}

        };
        int max= a[0][0];
        int min= a[0][0];
        for (int i=0; i< a.length; i++){
            for (int j=0; j<a[i].length; j++){
                if (a[i][j]>max){
                    max=a[i][j];
                    if (a[i][j]<min){
                        min=a[i][j];
                    }
                }
            }
        }
        System.out.println(max);
        System.out.println(min);
    }
}
