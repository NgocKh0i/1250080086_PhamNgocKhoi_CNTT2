import java.util.Arrays;
import java.util.Scanner;

public class Bai01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // a
        System.out.print("Nhập số lượng phần tử: ");
        int n = scanner.nextInt();
        int[] arr = new int[n];
        System.out.println("Nhập phần tử mảng:");
        for (int i = 0; i < n; i++) {
            System.out.print("Phần tử thứ " + (i + 1) + ": ");
            arr[i] = scanner.nextInt();
        }

        // b
        System.out.println("Các phần tử trong mảng: " + Arrays.toString(arr));

        // c
        System.out.print("Nhập số cần tìm: ");
        int x = scanner.nextInt();
        int indexX = -1;
        for (int i = 0; i < n; i++) {
            if (arr[i] == x) {
                indexX = i;
                break;
            }
        }
        if (indexX != -1) {
            System.out.println("Số nằm ở vị trí: " + indexX);
        } else {
            System.out.println("Số không tồn tại trong mảng.");
        }

        // d
        int max = arr[0];
        for (int i = 1; i < n; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println("Giá trị lớn nhất trong mảng: " + max);

        // e
        int min = arr[0];
        for (int i = 1; i < n; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println("Giá trị nhỏ nhất trong mảng: " + min);

        // f
        int indexMax = 0;
        for (int i = 1; i < n; i++) {
            if (arr[i] > arr[indexMax]) {
                indexMax = i;
            }
        }
        System.out.println("Vị trí phần tử lớn nhất trong mảng: " + indexMax);

        // g
        Arrays.sort(arr);
        System.out.println("Mảng sắp xếp tăng dần: " + Arrays.toString(arr));
    }
}
