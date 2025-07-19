import java.util.Scanner;

public class maxminarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("How many numbers? ");
        int n = sc.nextInt();                                // 1️⃣

        int[] arr = new int[n];
        System.out.println("Enter " + n + " numbers:");
        for (int i = 0; i < n; i++)                          // 2️⃣
            arr[i] = sc.nextInt();

        int max = arr[0];                                    // 3️⃣
        int min = arr[0];

        for (int num : arr) {                                // 4️⃣
            if (num > max) max = num;
            if (num < min) min = num;
        }

        System.out.println("Max: " + max);                  // 5️⃣
        System.out.println("Min: " + min);
    }
}
