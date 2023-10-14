import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FizzBuzz_1 {
    
    public static List<String> fizzBuzz(int range) {
        
        List<String> list = new ArrayList();
        
        for (int num = 1; num <= range; num++) {
            if (num % 3 == 0 && num % 5 == 0)
                list.add("FizzBuzz");
            else if (num % 3 == 0)
                list.add("Fizz");
            else if (num % 5 == 0)
                list.add("Buzz");
        }
        return list;
        
    }

    public static void main(String[] args) {
        
        int range = new Scanner(System.in).nextInt();

        System.out.println(fizzBuzz(range));
        
    }
}
