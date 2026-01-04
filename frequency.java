import java.util.Scanner;

public class frequency {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        System.out.print("Enter a line of text : ");
        String ch=input.nextLine();

        int[] nb_occurrences=new int[26];

        for (int i = 0; i < ch.length(); i++) {
            char alphabet = ch.charAt(i);

            if (Character.isLetter(alphabet)) {
                alphabet = Character.toUpperCase(alphabet);
                int index = alphabet - 'A';
                nb_occurrences[index]++;
            }
        }
        System.out.println("The string \"" + ch + "\" contains:");
        for (int i = 0; i < nb_occurrences.length; i++) {
            if (nb_occurrences[i] > 0) {

                char letter = (char) (i + 'A');

                String word = (nb_occurrences[i] > 1) ? "occurrences" : "occurrence";

                System.out.println(nb_occurrences[i] + " " + word + " of the letter '" + letter + "'");
            }
        }

    }
}
