//Find out the sum and average of given array only which are divisible by 5 and 2 [10, 3, 8, 7, 15, 6, 9, 16, 25, 18]

public class Assignment_2 {
    public static void main(String[] args) {
        int num[]={10, 3, 8, 7, 15, 6, 9, 16, 25, 18};
        int sum = 0;
        int count=0;
        for (int i=0;i<num.length;i++){
            if(num[i] % 5==0 && num[i] % 2==0){
                sum +=num[i];
                count ++;
            }
        }
        System.out.println("sum "+sum);
        System.out.println("Average "+(float)sum/count);
    }
}
