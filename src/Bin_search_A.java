/*Реализуйте двоичный поиск в массиве

Формат ввода
В первой строке входных данных содержатся натуральные числа N и K ().
Во второй строке задаются N элементов первого массива, а в третьей строке – K элементов второго массива.
Элементы обоих массивов - целые числа, каждое из которых по модулю не превосходит 10^9


Формат вывода
Требуется для каждого из K чисел вывести в отдельную строку "YES", если это число встречается в первом массиве,
и "NO" в противном случае.
 */
import java.util.Arrays;
import java.util.Scanner;

public class Bin_search_A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n];
        int[] k_a = new int[k];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < k; i++) {
            k_a[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        for (int i = 0; i < k; i++) {
            if(binary_search(arr, k_a[i])) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }

    public static boolean binary_search (int[] arr, int target) {
        int l = 0;
        int r = arr.length - 1;

        while (l <= r) {
            int mid = l + (r - l) / 2;
            if (arr[mid] > target) {
                r = mid - 1;
            } else if (arr[mid] < target) {
                l = mid + 1;
            } else {
                return true;
            }
        }
        return false;
    }
}
