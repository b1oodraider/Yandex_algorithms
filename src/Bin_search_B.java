import java.util.Arrays;
import java.util.Scanner;

/*Для каждого из чисел второй последовательности найдите ближайшее к нему в первой.

Формат ввода
В первой строке входных данных содержатся числа N и K ().
Во второй строке задаются N чисел первого массива, отсортированного по неубыванию,
а в третьей строке – K чисел второго массива.
Каждое число в обоих массивах по модулю не превосходит 2⋅10^9.

Формат вывода
Для каждого из K чисел выведите в отдельную строку число из первого массива, наиболее близкое к данному.
Если таких несколько, выведите меньшее из них.*/
public class Bin_search_B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        long[] arr = new long[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        long[] k_arr = new long[k];
        for (int i =0; i < k; ++i) {
            k_arr[i] = sc.nextInt();
        }

        for (int i = 0; i < k; ++i) {
            int min = binSearch(arr, k_arr[i], 'l');
            int max = binSearch(arr, k_arr[i], 'r');
            long diff = k_arr[i] - arr[min];
            long diff2 = k_arr[i] - arr[max];
            if(Math.abs(diff) <= Math.abs(diff2)) {
                System.out.println(arr[min]);
            } else {
                System.out.println(arr[max]);
            }

        }

    }
    public static int binSearch(long[] arr, long target, char path) {
        int left = 0, right = arr.length - 1;
        while (left < right) {
            int mid = (left + right) / 2;
            if(mid == left ) {
                if(path == 'r') {
                    return right;
                } else {
                    return left;
                }
            }
            if(arr[mid] > target) {
                right = mid;
            }else if(arr[mid] < target){
                left = mid;
            } else {
                return mid;
            }
        }
        return left;
    }
}
