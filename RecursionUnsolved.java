public class RecursionUnsolved {

    static int calling(int i) {
        if (i < 0) {
            return i;
        }else if(i%3 == 0)
            return i - calling(i - 1);
        else
            return i + calling(i - 1);
    }
    public static void main(String[] args) {
        System.out.println(calling(10));
    }
}