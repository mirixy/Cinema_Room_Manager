import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int big = 0;
        int nr;
        while (true) {
            nr = scanner.nextInt();
            if (nr == 0) {
                break;
            } else {
                if (nr > big) {
                    big = nr;
                }
            }

        }
        System.out.println(big);
    }
}

