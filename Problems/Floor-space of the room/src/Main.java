import java.util.Scanner;
class Main {
    public static void calculate() {
        double a;
        double b;
        double c;
        double r;
        Scanner s = new Scanner(System.in);
        String shape = s.nextLine();
        switch (shape) {
            case "triangle":
                a = s.nextDouble();
                b = s.nextDouble();
                c = s.nextDouble();
                double x = (a + b + c) / 2;
                System.out.println(Math.sqrt(x * (x - a) * (x - b) * (x - c)));
                break;
            case "rectangle":
                a = s.nextDouble();
                b = s.nextDouble();
                System.out.println(a * b);
                break;
            case "circle":
                r = s.nextDouble();
                System.out.println(3.14 * r * r);
                break;
            default:
                break;
        }
    }

    public static void main(String[] args) {
        // put your code here
        calculate();
    }
}