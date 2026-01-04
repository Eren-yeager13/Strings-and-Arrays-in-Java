import java.util.Scanner;

public class conjugator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Entrez un verbe du premier groupe : ");
        String verbe = input.nextLine();

        if (verbe.endsWith("er")) {
            verbe = verbe.substring(0, verbe.length() - 2);
            System.out.println("je "+verbe+"e");
            System.out.println("tu "+verbe+"es");
            System.out.println("il/elle "+verbe+"e");
            System.out.println("nous "+verbe+"ons");
            System.out.println("vous "+verbe+"ez");
            System.out.println("ils/elles "+verbe+"ent");
        }
        else {
            System.out.println("le verbe doit être un premier groupe.");
        }

    }
}
