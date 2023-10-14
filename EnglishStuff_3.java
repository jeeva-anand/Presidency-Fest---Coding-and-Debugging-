import java.util.Scanner;

public class EnglishStuff_3 {


    public static String englishStuff(String str) {
        
        StringBuffer sb = new StringBuffer();
        String vowel = "aeiou";
        String upperCase = "AEIOU";

        for (int i = 0; i < str.length(); i++) {
            if (vowel.indexOf(str.charAt(i)) != -1) {
                sb.append(upperCase.charAt(vowel.indexOf(str.charAt(i))));
            } else if(upperCase.indexOf(str.charAt(i)) != -1)
                sb.append(str.charAt(i));
            else if( str.charAt(i) >= 65 && str.charAt(i) <= 90)
                sb.append(String.valueOf( str.charAt(i)).toLowerCase());
            else
                sb.append(str.charAt(i));
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String str = sc.nextLine();
        
        System.out.println(englishStuff(str));

    }
}
