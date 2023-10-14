public class IdProtection_8 {

    static String idProtecton(String str) {
        
        StringBuffer sb = new StringBuffer(str);
        String[] split = str.split(" ");

        for (int i = 0; i < split.length; i++) {
            String s = split[i];
            if (s.charAt(0) >= 48 && s.charAt(0) <= 57 && idValidate(s)) {
                String id = generateId(s.length());
                sb.replace(sb.indexOf(s), sb.indexOf(s)+s.length(),id);
            }
        }

        return sb.toString();


    }

    private static boolean idValidate(String s) {

        int letter = 3;
        int number = 6;
        int specialLetter = 1;

        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i) >= 48 && s.charAt(i) <= 57)
                number--;
            else if(s.charAt(i) >= 65 && s.charAt(i) <= 90)
                letter--;
            else if (s.charAt(i) == '-')
                specialLetter--;
        }
        return letter == 0 && number == 0 && specialLetter == 0;
    }

    private static String generateId(int length) {
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < length; i++) {
            sb.append('X');
        }
        return sb.toString();
    }

    public static void main(String[] args) {

        String str = "pleasehide555-555dddfromhere";
        System.out.println(idProtecton(str));

    }
}
