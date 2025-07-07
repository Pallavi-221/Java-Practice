public class DiamondStarPattern {
    public static void main(String[] args) {
        int n = 3; // change this for larger diamonds

        // Upper triangle
        for (int i = 1; i <= n; i++) {
            for (int s = i; s < n; s++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= (2 * i - 1); j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // Lower triangle
        for (int i = n - 1; i >= 1; i--) {
            for (int s = n; s > i; s--) {
                System.out.print(" ");
            }
            for (int j = 1; j <= (2 * i - 1); j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
