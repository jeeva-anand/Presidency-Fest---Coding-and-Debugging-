public class LargestOfKConsequtive {
    public static int largest(int k, int[] arr) {
        int n = arr.length-1;
        int start = n - (k-1);
        int end = n;
        int sum = Integer.MIN_VALUE;
        while (start >= 0) {
            sum = Math.max(sum, findSum(arr, start, end));
            end--;
            start--;
        }
        return sum;
    }

    static int findSum(int[] arr, int start, int end) {
        int sum = 0;
        for (int k = start; k <= end; k++) {
            sum += arr[k];
        }
        return sum;
    }
    public static void main(String[] args) {
        System.out.println(largest(5, new int[] { 4,-1,2,5,3,-2,4 }));
        
    }
}
