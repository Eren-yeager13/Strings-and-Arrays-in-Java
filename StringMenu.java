import java.util.Scanner;

public class StringMenu {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String word = "";
        int choice = 0;
        do {
            System.out.println("1. Enter \n2. Display, \n3. Reverse, \n4. Count, \n0. Quit");
            choice = input.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Enter word: ");
                    word = input.next();
                    break;

                case 2:
                    if (word.isEmpty()) { // or word.equals("")
                        System.out.println("You didn't enter any word.");
                    } else {
                        System.out.println("The word you entered is: " + word);
                    }
                    break;

                case 3:
                    String reversed = "";
                    for (int i = word.length() - 1; i >= 0; i--) {
                        reversed += word.charAt(i);
                    }
                    System.out.println("Reversed string: " + reversed);
                    break;

                case 4:
                    int count = 0;
                    for (int i = 0; i < word.length(); i++) {
                        if (word.charAt(i) != ' ') {
                            count++;
                        }
                    }
                    System.out.println("Number of words: " + count);
                    break;

                case 0:
                    System.out.println("Goodbye!");
                    break;

                default:
                    System.out.println("Invalid option, please try again.");
            }
        }while (choice !=0);
    }
}
