import java.util.Scanner;

public class Countdigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        System.out.println("enter a number: ") ;  // 1️⃣
        int n = sc.nextInt();                   // 2️⃣

        int count = 0;                          // 3️⃣
        while (n != 0) {                        // 4️⃣
            n = n / 10;                         // 5️⃣
            count++;                            // 6️⃣
        }

        System.out.println("sum of didgits: "); // 7️⃣
    }
}
