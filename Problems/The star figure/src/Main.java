import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = n / 2;
        String[][] star = new String[n][n];
        for (int i = 0; i < star.length; i++) {
            for (int j = 0; j < star[i].length; j++) {
                if (i == j || k == i || k == j || j + i == n - 1) {
                    star[i][j] = "*";
                } else {
                    star[i][j] = ".";
                }


            }
        }

        for (int i = 0; i < star.length; i++) {
            for (int j = 0; j < star[i].length; j++) {
                System.out.print(star[i][j] + " ");
            }
            System.out.println();
        }

    }
}
