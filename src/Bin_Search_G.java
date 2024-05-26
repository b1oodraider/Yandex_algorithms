import java.util.Scanner;

public class Bin_Search_G {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long m = sc.nextLong();
        long t = sc.nextLong();
        System.out.println(binSearch(n, m, t));
        sc.close();
    }
    public static long binSearch(long n, long m, long t) {
        long max = Math.min(n, m);
        long min = 0;
        while (min < max - 1) {
            long mid = (max + min) / 2;
            if(check(n,m,t,mid)) {
                max = mid - 1;
            } else {
                min = mid;
            }
        }
        if(check(n,m,t,max)) {
            return min;
        } else {
            return max;
        }
    }

    public static boolean check(long n,long m,long t,long mid) {
        return 2*mid*(2*(n+m-2)-4*(mid-1))/2 >t || (n + m - 2 - 4*(mid -1)) < 0;
    }
}
