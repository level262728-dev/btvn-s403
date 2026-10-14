
import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 1. Nhap kich thuoc mang
        System.out.print("Nhap kich thuoc mang: ");
        int n = sc.nextInt();

        // 2. Nhap cac phan tu
        int[] arr = new int[n];

        System.out.println("Nhap cac phan tu cho mang:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // 3. Sap xep mang giam dan bang Bubble Sort
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if (arr[j] < arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        // 4. Hien thi mang sau khi sap xep
        System.out.print("Mang sau khi sap xep theo thu tu giam dan: [");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i]);
            if (i < n - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");

        sc.close();
    }
}
