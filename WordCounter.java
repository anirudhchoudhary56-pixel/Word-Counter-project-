import java.util.Scanner;

public class WordCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 

        System.out.println("Enter a sentence:");
        String input = scanner.nextLine();

        if (input.trim().isEmpty()) {
            System.out.println("Word count: 0");
        } else {
            String[] words = input.trim().split("\\s+");
            System.out.println("Word count: " + words.length);
        }
        
        scanner.close();
    }
}




