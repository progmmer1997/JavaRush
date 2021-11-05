import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;

public class Arrays_user_input {
    public static void main(String[] args) throws IOException {

        Reader r = new InputStreamReader(System.in);
        BufferedReader reader = new BufferedReader(r);

// ввод строк с клавиатуры
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        for (int i = 0; i < 5; i++) {
            int number = Integer.parseInt(reader.readLine());
            numbers.add(number);
        }

                Collections.sort(numbers);
        System.out.println(numbers.get(0));
        System.out.println(numbers.get(1));
        System.out.println(numbers.get(2));
        System.out.println(numbers.get(3));
        System.out.println(numbers.get(4));
    }
}
