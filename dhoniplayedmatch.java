import java.util.*;

public class dhoniplayedmatch {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        // Check if n is negative
        if (n < 0) {
            System.out.println("Invalid Input");
            return;
        }

        int arr[] = new int[n];

        // Read array and validate elements
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            if (arr[i] < 0) {
                System.out.println("Invalid Input");
                return;
            }
        }

        // Bubble Sort (Ascending Order)
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        // Print sorted array
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i]);
        }
    }
}