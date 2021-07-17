import java.util.Scanner;

class MultipleFunction {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double x = scanner.nextDouble();
        System.out.println(f(x));
    }

    public static double f(double x) {
        //call your implemented methods here.
        double res = 0;
        if (x < 0) {
            res = f1(x);
        } else if (0 < x && x < 1) {
            res = f2(x);
        } else if (x > 1) {
            res = f3(x);
        }
        return res;
    }

    //implement your methods here
    public static double f1(double n) {
        return (n * n) + 1;
    }

    public static double f2(double n) {
        return 1 / (n * n);
    }

    public static double f3(double n) {
        return (n * n) - 1;
    }
}