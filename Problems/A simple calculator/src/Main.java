import java.util.Scanner;

class Main {

    public static void calculator() {
        Scanner s = new Scanner(System.in);
        long firstNumber = s.nextLong();
        char operator = s.next().charAt(0); // didn't know that
        long secondNumber = s.nextLong();


        switch (operator) {
            case '+':
                System.out.println(firstNumber + secondNumber);
                break;
            case '-':
                System.out.println(firstNumber - secondNumber);
                break;
            case '*':
                System.out.println(firstNumber * secondNumber);
                break;
            case '/':
                if (secondNumber == 0) {
                    System.out.println("Division by 0!");
                    break;
                } else {
                    System.out.println(firstNumber / secondNumber);
                    break;
                }
            default:
                System.out.println("Unknown operator");
                break;

        }

    }
    public static void main(String[] args) {
        // put your code here
        calculator();
    }
}