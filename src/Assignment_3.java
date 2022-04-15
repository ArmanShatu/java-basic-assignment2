import java.util.ArrayList;

public class Assignment_3 {
    public static void main(String[] args) {
        int[] year={2000, 2002, 2004, 2006, 2008, 2010, 2012, 2014, 2016, 2018, 2020, 2022, 2024};
        ArrayList<Integer> leapyears=new ArrayList<>();
        for (int i=0;i<year.length-1;i++){
            if (year[i]%400==0){
                leapyears.add(year[i]);
            }
            else if (year[i]%4==0 && year[i]%100!=0){
                leapyears.add(year[i]);
            }
        }
        System.out.println(leapyears);
    }
}
