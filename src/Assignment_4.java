//Write a program to find out the 3rd highest value from given array
//[42, 30, 56, 63, 74, 86, 48]

public class Assignment_4 {
    public static void main(String[] args) {
        int[] num={42, 30, 56, 63, 74, 86, 48};
        int thirdHighest=3;
        for(int i=0;i<num.length-1;i++){
            for(int j=i+1;j<num.length;j++){
                if (num[i]<num[j]){
                    int temp = num[i];
                    num[i]=num[j];
                    num[j]=temp;
                }
            }
            if (i==thirdHighest-1){
                System.out.println("Third highest value is "+num[i]);
            }
        }
    }
}
