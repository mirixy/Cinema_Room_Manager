package cinema;

import java.util.Scanner;

public class Cinema {

    public static int calculateRoom(int rows, int seats){
        int half;
        int sum;
        int second;
        if (seats * rows <= 60) {
            sum = rows * seats * 10;
        }
        else {
            half = rows / 2;
            sum = half * seats * 10;
            second = rows - half;
            sum += second * seats * 8;
        }
        return sum;
    }

    public static String makeGrid() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of rows:");
        int rows = scanner.nextInt();
        System.out.println("Enter the number of seats in each row:");
        int seats = scanner.nextInt();
        String[][] grid = new String[rows][seats];
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                grid[i][j] = scanner.nextLine();
            }
        }

    }

    public static void arrays () {

    }
    public static void main(String[] args) {
        // Write your code here
        System.out.println("Cinema:");
        for (int i = 1; i <= 7; i++) {
            if (i == 1 ) {
                System.out.println(" " + " 1 2 3 4 5 6 7 8");
                System.out.println(i + " S S S S S S S S");
            } else {
                System.out.println(i + " S S S S S S S S");
            }
        }
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of rows:");
        int rows = scanner.nextInt();
        System.out.println("Enter the number of seats in each row:");
        int seats = scanner.nextInt();
        System.out.println("Total income:");
        System.out.println("$" + calculateRoom(rows, seats));

        int rowNr;
        int seatNr;
        System.out.println("Enter a row number:");
        rowNr = scanner.nextInt();
        System.out.println("Enter a seat number:");
        seatNr = scanner.nextInt();

    }
}