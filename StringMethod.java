import java.util.Scanner;

public class StringMethod {
    public static void main(String[] args) throws Exception {

        Scanner scan = new Scanner(System.in);
        System.out.print("Please enter input: ");
        String word = scan.nextLine();
        scan.close();

        System.out.println("Length: " + word.length());
        System.out.println("Uppercase: " + word.toUpperCase());
        System.out.println("Lowercase: " + word.toLowerCase());
        System.out.println("First char: " + word.charAt(0));
        System.out.println("Last char: " + word.charAt(word.length() - 1));

        if (word.length() < 5) {
            System.out.println("Substring: Input has less than 5 characters.");
        } else
            System.out.println("Substring: " + word.substring(1, 5));
    }
}
