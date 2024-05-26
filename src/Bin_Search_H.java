import java.util.Scanner;

public class Bin_Search_H {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(binSearch(arr,n,k));
    }

    public static int binSearch(int[] arr, int n, int k) {
        int l = 0;
        int r = 10000001;
        while (l < r - 1) {
            int mid = (l+r)/2;
            if(check(arr, mid, n, k)) {
                l = mid;
            } else {
                r = mid;
            }
        }
        return l;
    }

    public static boolean check(int[] arr, int mid, int n, int k) {
        int sum = 0;
        for(int i = 0; i < n;++i) {
            sum += arr[i]/mid;
        }
        return sum>=k;
    }
}
