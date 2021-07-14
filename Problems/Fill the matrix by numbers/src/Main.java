import java.util.Scanner;
class Main {

    public static void printGrid() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] ar = new int[n][n];
        for (int i = 0; i < ar.length; i++) {
            for (int j = 0; j < ar[i].length; j++) {
                if (i == j) {
                    ar[i][j] = 0;
                }  else {
                    ar[i][j] = Math.abs(j - i);
                }
            }

        }

        // print
        for (int p = 0; p < ar.length; p++) {
            for (int b = 0; b < ar[p].length; b++) {
                System.out.print(ar[p][b] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        // put your code here
        printGrid();
    }
}