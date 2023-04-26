package src;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class TestFack {
    public static void main(String[] args) {
        TestFack t = new TestFack();
        System.out.println(t.fack(4));
        LocalDate ld = LocalDate.now();
        System.out.println(ld);
        LocalTime lt = LocalTime.now();
        System.out.println(lt);

        LocalDateTime ldt = LocalDateTime.now();
        System.out.println(ldt);
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("d/M-y H-m:s");
        DateTimeFormatter dtf1 = DateTimeFormatter.ofPattern("yyy");


        String formattedDate = ldt.format(dtf);
        String formattedDate1 = ldt.format(dtf1);

        System.out.println("After formatting: " + formattedDate);
        System.out.println("After formatting: " + formattedDate1);


    }
    public int fack (int n){
        if(n == 1 || n ==0){
            return n;
        }
        return fack(n-1) * n;
    }
}
