public class ArrayPalindrome_2 {

    static boolean arrayPalindrome(int arr[]) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            if (arr[start] != arr[end])
                return false;
            start++;
            end--;
        }
        return true;
    }

    public static void main(String[] args) {

        int arr[] = { -1, -2, 6 ,2, 1 };
        // System.out.println(arrayPalindrome(arr));
        System.out.println((char) 90);
    }
}