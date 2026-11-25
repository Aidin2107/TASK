public class task12 {
    public static void main(String[] args){
        int [][]a={
                {5,4,3,5},
                {3,4,4,4},
                {2,2,3,4},
        };
        float overallSum=0f;
        float maxAvg=0f;
        for (int i = 0; i <a.length ; i++) {
            float sum=0;
            for(int j=0; j<a[i].length; j++){
                sum +=a[i][j];
            }
            float avg = sum / a[0].length;
            System.out.println("Average grade of stident "+i+" is "+ avg);
            if(avg > maxAvg)
                maxAvg = avg;
            overallSum +=sum;
        }
        float overallAvg = overallSum / (a.length * a[0].length);
        System.out.println("overall average grade of student "+ overallAvg);
        System.out.println("Max average grade of student "+ maxAvg);
    }
}

