import java.util.Scanner;

class Main {
    public static Scanner sc = new Scanner(System.in);
    public static void matrix() {

        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] ar = new int[n][m];
        for (int k = 0; k < n; k++) {
            for (int l = 0; l < m; l++) {
                ar[k][l] = sc.nextInt();
            }
        }
        int i = sc.nextInt();
        int j = sc.nextInt();

        for (int u = 0; u < ar.length; u++) {
            int var = ar[u][j];
            int var2 = ar[u][i];
            ar[u][i] = var;
            ar[u][j] = var2;
            for (int y = 0; y < ar[u].length; y++) {
                System.out.print((ar[u][y]) + " ");
            }
            System.out.println();
        }
    }



    public static void main(String[] args) {
        // put your code here
        matrix();
    }
}