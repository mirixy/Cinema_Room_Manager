import java.util.Scanner;
class Main {
    public static Scanner sc = new Scanner(System.in);

    public static void matrix() {
        int n = sc.nextInt();
        int m = sc.nextInt();
        // Initialize the array
        int[][] ar = new int[n][m];
        // Fill the array with a loop
        for (int i = 0; i < ar.length; i++) {
            for (int j = 0; j < ar[i].length; j++) {
                ar[i][j] = sc.nextInt();

            }

        }
        // Search for the indexes of the initial appearance of the
        // maximum element in a matrix
        int tmp = 0;
        int index = 0;
        int index2 = 0;
        for (int s = 0; s < ar.length; s++) {
            for (int x = 0; x < ar[s].length; x++) {
                if (ar[s][x] > tmp) { // if the element is positive and bigger than tmp
                    tmp = ar[s][x]; // save the element in tmp
                    index = s; // save the first index
                    index2 = x; // save the second index
                } else if (ar[s][x] < 0 && ar[s][x] < tmp) { // if the element is negative and smaller than 0 and the element is smaller than tmp
                    tmp = ar[s][x]; // save the element
                    index = s; // save the first index
                    index2 = x; // save the second index

                }
            }
        }
        System.out.println(index + " " + index2);
    }

    public static void main(String[] args) {
        // put your code here
        matrix();
    }
}