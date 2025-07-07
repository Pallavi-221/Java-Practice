public class ReversedNumberPyramid {
    public static void main(String[] args) {
        int rows = 5;
        for (int i = rows; i >= 1; i--) {           // row loop: 5 to 1
            for (int j = 1; j <= i; j++) {          // print 1 to i
                System.out.print( " *");
            }
            System.out.println();
        }
    }
}
