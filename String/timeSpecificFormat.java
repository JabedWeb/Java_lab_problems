package String;
import java.util.Calendar;
public class timeSpecificFormat {
    public static void main(String[] args) {
        Calendar cal=Calendar.getInstance();
        System.out.println(cal.get(Calendar.MONTH));
        System.out.println(cal.get(Calendar.YEAR));


    }
}