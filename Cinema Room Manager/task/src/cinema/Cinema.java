package cinema;

import java.util.Arrays;
import java.util.Scanner;

public class Cinema {
    public static Scanner scanner = new Scanner(System.in);

    public static int calculateRoom(int rows, int seats, int rowNr){
        int half = rows / 2; // divides the cinema in half
        int sum = 0;
        int second = rows - half; // finds the middle row
        boolean lower60 = false;
        boolean lowerHalf = false;
        boolean upperHalf = false;
        if (seats * rows <= 60) { // are there less than 60 seats
            lower60 = true;
            System.out.println("lower 60");
        } else if (rowNr < second && !lower60) {
            lowerHalf = true;
            System.out.println("lower half");
        } else if (rowNr >= second && !lower60) {
            upperHalf = true;
            System.out.println("upper half");
        }

        if (lower60 || lowerHalf) {
            sum = 10;
        } else if (upperHalf) {
            sum = 8;
        }


        return sum;
    }
    /* Ask for number of rows and seats
     *   and returns them as an array  */
    public static int[] init() {
        System.out.println("Enter the number of rows:");
        int rows = scanner.nextInt();
        System.out.println("Enter the number of seats in each row:");
        int seats = scanner.nextInt();
        return new int[] {rows, seats };
    }
    /* Ask for the row and seat the person wants to sit */
    public static int[] init2() {
        int rowNr;
        int seatNr;
        System.out.println("Enter a row number:");
        rowNr = scanner.nextInt();
        System.out.println("Enter a seat number in that row:");
        seatNr = scanner.nextInt();
        System.out.println();
        return new int[] {rowNr, seatNr};
    }
    /* This Method is for the second array, where the chosen
     *  seat and row is marked with a 'B' */
    public static String[][] chosenGrid(int rows, int seats , int rowNr, int seatNr) {
        String[][] grid = new String[rows][seats];
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if (i == rowNr -1 && j == seatNr - 1) {
                    grid[i][j] = "B";
                } else {
                    grid[i][j] = "S";
                }
            }
        }
        return grid;
    }
    /* First instantiation of the grid without markings */
    public static String[][] makeGrid(int rows, int seats) {

        String[][] grid = new String[rows][seats];
        for (String[] strings : grid) {
            Arrays.fill(strings, "S");
        }

        return grid;

    }
    /* Prints the grid out everytime this Method gets invoked. */
    public static void print(String[][] grid) {
        /* print the matrix */
        int nr = 1;
        int nr2 = 1;
        System.out.println("Cinema:");
        System.out.print(" ");
        for (; nr2 <= grid[0].length; nr2++) {
            System.out.print(" "+ nr2);
        }
        System.out.println();

        for (String[] strings : grid) {
            System.out.print(nr + " ");
            for (String string : strings) {
                System.out.print(string + " ");

            }
            nr++;
            System.out.println();
        }
    }

    public static void main(String[] args) {
        // Write your code here
        int[] result = init();
        System.out.println();
        print(makeGrid(result[0], result[1]));
        System.out.println();
        int[] input2 = init2();
        print(chosenGrid(result[0], result[1], input2[0], input2[1]));
        System.out.println();
        System.out.println("Ticket price: $" + calculateRoom(result[0], result[1], input2[0]));





    }
}