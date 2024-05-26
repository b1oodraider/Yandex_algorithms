import java.util.Scanner;

public class Bin_Search_F {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = sc.nextInt();
        int y = sc.nextInt();
        System.out.println(binSearch(n - 1, x, y) + Math.min(x,y));
        sc.close();
    }

    public static long binSearch(int n, int x, int y) {
        long low = 0;
        long high = (long)n * 10;
        while (low < high) {
            long mid = (high + low) / 2;
            if(check(mid, x, y, n)) {
                high = mid;
            } else {
                low = mid + 1;
            }
        }
        return high;
    }
    public static boolean check(long mid, int x, int y, int n) {
        return mid/x + mid/y >=n;
    }
}
