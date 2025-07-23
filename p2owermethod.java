import java.util.Scanner;

public class p2owermethod {
    static long power(int base, int exp) {
        long result = 1;
        for (int i = 1; i <= exp; i++) result *= base;
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Base? ");
        int b = sc.nextInt();
        System.out.print("Exponent? ");
        int e = sc.nextInt();

        System.out.println(b + " ^ " + e + " = " + power(b, e));
    }
}
