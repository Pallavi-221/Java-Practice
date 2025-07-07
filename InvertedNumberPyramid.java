public class InvertedNumberPyramid {
    public static void main(String[] args) {
        int rows = 5;
        for (int i = rows; i >= 1; i--) {           // i = 5 to 1
            for (int j = 1; j <= i; j++) {           // j = 1 to i
                System.out.print(j + " ");
            }
            System.out.println(); // Move to next line
        }
    }
}
