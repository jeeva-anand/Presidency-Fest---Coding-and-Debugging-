public class BeautifulMatrix_6 {

    static int beautifulMatrix(int arr[][]) {

        int row = 0;
        int col = 0;
        int loc = 0;
        int mid = arr.length / 2;
        for (row = 0; row < arr.length; row++) {
            for (col = 0; col < arr.length; col++) {
                if (arr[row][col] == 1) {
                    loc = row * arr.length + col;
                    break;
                }
            }
        }
        return Math.abs(mid - (loc / arr.length)) + Math.abs( mid - (loc % arr.length));
    }

    public static void main(String[] args) {
        int[][] arr = {
                { 0, 0, 0, 0, 0, 0, 0 },
                { 0, 0, 0, 0, 0, 0, 0 },
                { 0, 0, 0, 0, 0, 0, 0 },
                { 0, 0, 0, 0, 0, 0, 0 },
                { 0, 0, 0, 0, 0, 0, 0 },
                { 0, 0, 0, 0, 0, 0, 0 },
                { 0, 0, 0, 0, 0, 0, 1 }

        };

        System.out.println(beautifulMatrix(arr));
    }
}
