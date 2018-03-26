import java.util.Scanner;

public class CountCharacter {
    public static int countLetters(String s) {
        int length = s.length();
        return length;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String s = input.nextLine();
        int length = countLetters(s);
        System.out.print("\nString has " + length + " letters");
    }
}
