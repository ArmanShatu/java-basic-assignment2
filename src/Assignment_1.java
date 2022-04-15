//Find out the year, month and day between your birthday and today
import java.time.LocalDate;
import java.time.Period;

public class Assignment_1 {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        LocalDate birthDate = LocalDate.of(1994, 11, 29);
        int year = Period.between(birthDate, today).getYears();
        int month = Period.between(birthDate, today).getMonths();
        int day = Period.between(birthDate, today).getDays();
        System.out.println("Years "+year);
        System.out.println("Month "+month);
        System.out.println("Days "+day);
    }
}
