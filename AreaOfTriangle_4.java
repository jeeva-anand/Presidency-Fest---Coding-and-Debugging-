import java.util.Scanner;

public class AreaOfTriangle_4 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();

        double s = (a + b + c) / 2.0;

        double area = Math.sqrt(s * (s - a) * (s - b) * (s - c));

        System.out.printf("%.2f", area);
    }

}
