import java.util.Scanner;

public class Bin_Search_E {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long b = sc.nextLong();
        long c = sc.nextLong();
        System.out.println(binSearch(a,b,c));
        sc.close();
    }
    public static long binSearch(long a, long b, long c) {
        long low = 0;
        long high = (a +b +c)*2;
        if(b == c) {
            return a;
        }
        while (high > low) {
            long mid = (low + high) / 2;
            if(check(a,b,c,mid)) {
                high = mid;
            } else {
                low = mid + 1;
            }
        }
        return high;
    }

    public static boolean check(long a, long b, long c, long mid) {
        double t = (double)(a * 2 + b * 3 + c * 4 + mid * 5)/(double)(a+b+c+mid);
        return t >= 3.5;
    }
}
