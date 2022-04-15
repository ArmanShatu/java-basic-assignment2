import java.util.ArrayList;

//Write a program to check which values are duplicate and print them only [10, 5, 6, 6, 7, 8, 9, 9, 3, 1, 0, 0]
public class Assignment_6 {
    public static void main(String[] args) {
        int[] arr={10, 5, 6, 6, 7, 8, 9, 9, 3, 1, 0, 0};
        ArrayList<Integer> results=new ArrayList<>();
        for (int i=0;i<arr.length-1;i++){
            for (int j=i+1;j<arr.length;j++){
                if (arr[i]==arr[j]){
                    results.add(arr[i]);
                }
            }
        }
        System.out.println("Duplicate numbers are : "+results);
    }
}
