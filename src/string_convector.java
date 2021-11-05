import java.lang.Math;
import java.lang.Double;
import java.lang.Number;

public class string_convector {
    public static void main(String[] args) {
        String string = "12.84";
        double con_string=Double.parseDouble(string);
        int round = (int) Math.round(con_string);
        System.out.println(round);
    }
}
