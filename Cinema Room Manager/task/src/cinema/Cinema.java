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
    public static String[][] init() {
        System.out.println("Enter the number of rows:");
        int rows = scanner.nextInt();
        System.out.println("Enter the number of seats in each row:");
        int seats = scanner.nextInt();

        String[][] grid = new String[rows][seats];
        for (String[] strings : grid) {
            Arrays.fill(strings, "S");
        }

        return grid;
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


    /* First instantiation of the grid without markings */
    public static String[][] makeGrid(String[][] grid, int status) {
        String[][] copy = new String[grid.length][grid[1].length];
        copy = grid;

        if (status == 2) {
            int[] input2 = init2();
            copy[input2[0] - 1][input2[1] - 1] = "B";

            System.out.println();
            System.out.println("Ticket price: $" + calculateRoom(grid.length, grid[1].length, input2[0]));
            System.out.println();
        }
//        for (int i = 0; i < copy.length; i++) {
//            for (int j = 0; j < copy[i].length; j++) {
//                if (i == input2[0] -1 && j == input2[1] - 1) {
//                    copy[i][j] = "B";
//                } else {
//                    copy[i][j] = "S";
//                }
//            }
//
//        }
        return copy;

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

    public static void menu(String[][] grid){
        int status = 1;
        boolean exit = false;

        System.out.println();
        while (exit == false) {
            System.out.println("1. Show the seats");
            System.out.println("2. Buy a ticket");
            System.out.println("0. Exit");
            switch (scanner.nextInt()) {
                case 0:
                    exit = true;
                    break;
                case 1:
                    status = 1;
                    print(makeGrid(grid, status));
                    System.out.println();
                    break;
                case 2:
                    status = 2;
                    print(makeGrid(grid, status));

                    break;
                default:
                    System.out.println("Please Enter a number from 0 - 2!");
                    break;

            }

        }
    }

    public static void main(String[] args) {
        // Write your code here

        menu(init());







    }
}