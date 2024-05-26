import java.util.Scanner;

public class Bin_Search_D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long a = sc.nextLong();
        long b = sc.nextLong();
        long w = sc.nextLong();
        long h = sc.nextLong();
        System.out.println(binSearch(n, a, b, w, h));
        sc.close();
    }

    public static long binSearch(long n, long a, long b, long w, long h) {
        long low = 0;
        long high = w;
        while (high - low > 1) {
            long mid = (low + high)/2;
            if(check(n,a,b,w,h,mid)) {
                low = mid;
            } else {
                high =  mid;
            }
        }
        return low;
    }

    public static boolean check(long n, long a, long b, long w, long h, long mid) {
        return (w/(a+2*mid)) * (h/(b + 2*mid)) >= n || (w/(b+2*mid)) * (h/(a + 2*mid)) >= n;
    }
}
