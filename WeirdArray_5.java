public class WeirdArray_5 {

    public static int weirdArray(int arr[],int k) {
        
        int len = arr.length;
        int sum = 0;
        if (len % 2 == 1) {
            return arr[(len / 2) - k] + arr[(len / 2) + k];
        } else {
            return arr[((len / 2) - k)] + arr[((len / 2) + k) - 1];
        }


    }

    public static void main(String[] args) {
        int arr[] = { -5 ,1 ,8 ,10 ,-2 ,-5 ,8 ,3 ,1 ,99};

        System.out.println(weirdArray(arr, 4));
    }
}
