public class SquarePattern {
    public static void main(String[] args) {
        int n = 4; // number of rows & columns
        for(int i = 1; i <= n; i++) {
            for(int j = 1; j <= n; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
