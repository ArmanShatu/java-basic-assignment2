//Find the number of notes from input amount in given array [1000,500,100,50,20,10,5, 2, 1]
import java.util.Scanner;

public class Assignment_7 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter Amount : ");
        int amount = scanner.nextInt();
        while (amount>0) {
            if (amount>=1000){
                System.out.println("1000 "+(amount/1000));
                amount=amount % 1000;
            }
            else if (amount>=500){
                System.out.println("500 "+(amount/500));
                amount=amount%500;
            }
            else if (amount>=100){
                System.out.println("100 "+(amount/100));
                amount=amount%100;
            }
            else if (amount>=50){
                System.out.println("50 "+(amount/50));
                amount=amount%50;
            }
            else if (amount>=20){
                System.out.println("20 "+(amount/20));
                amount=amount%20;
            }
            else if (amount>=10){
                System.out.println("10 "+(amount/10));
                amount=amount%10;
            }
            else if (amount>=5){
                System.out.println("5 "+(amount/5));
                amount=amount%5;
            }
            else if (amount>=2){
                System.out.println("2 "+(amount/2));
                amount=amount%2;
            }
            else if (amount>=1){
                System.out.println("1 "+(amount/1));
                amount=amount%1;
            }
        }
    }
}
