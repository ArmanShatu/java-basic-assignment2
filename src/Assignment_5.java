//Write a function to check if a number is prime or not

import java.util.Scanner;

public class Assignment_5 {
    static int count=0;
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int number =scanner.nextInt();
        for (int i=1;i<=number;i++){
            if (number%i==0){
                count++;
            }
        }
        if (count==2){
            System.out.println("Prime Number");
        }
        else {
            System.out.println("Not a Prime Number");
        }
    }
}
