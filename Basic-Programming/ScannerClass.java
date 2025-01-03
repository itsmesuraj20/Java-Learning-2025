import java.util.*;
public class ScannerClass{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n , a , b, sum = 0 ;

        n =sc.nextInt();
        a =sc.nextInt();
        b =sc.nextInt();
        for (int i = 0; i < n; i++) {
            sum = sum + (Math.max(a, b));
        }

        System.out.println(sum);
    }
}