import java.util.Scanner;

public class Main {

    public static boolean isVowel(char ch) {
        // write your code here
        switch (Character.toLowerCase(ch)) {
            case 'a':
                return true;
            case 'i':
                return true;
            case 'o':
                return true;
            case 'u':
                return true;
            case 'e':
                return true;
            default:
                return false;
        }
    }

    /* Do not change code below */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char letter = scanner.nextLine().charAt(0);
        System.out.println(isVowel(letter) ? "YES" : "NO");
    }
}