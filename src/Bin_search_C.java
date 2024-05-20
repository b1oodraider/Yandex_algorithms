import java.util.Scanner;

public class Bin_search_C {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long w = sc.nextInt();
        long h = sc.nextInt();
        long n = sc.nextInt();
        System.out.println(binSearch(n, w, h));
    }

    public static long binSearch(long n, long w, long h) {
        long low = 0;
        long high = Math.max(w,h) * n * 2;
        while (high - low > 1) {
            long mid = (low + high)/2;
            if(check(n,w,h,mid)) {
                high = mid;
            } else {
                low = mid;
            }
        }
        return high;
    }

    public static boolean check(long n, long w, long h, long mid) {
        return (mid / w) * (mid / h) >= n;
    }

}
