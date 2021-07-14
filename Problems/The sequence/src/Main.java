import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int elem = scanner.nextInt();
        int i = 0;
        int input;
        int store = 0;
        while (true) {
            if (i == elem) {
                break;
            } else {
                input = scanner.nextInt();
                if (input % 4 == 0 && input > store) {
                    store = input;
                    i++;
                } else {
                    i++;

                }
            }

        }
        System.out.println(store);
    }
}