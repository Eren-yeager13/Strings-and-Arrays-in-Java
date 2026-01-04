import java.util.Arrays;
import java.util.Scanner;
public class StudentsGrades {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("How many grades do you want to add: ");
        int numStudents = input.nextInt();
        double[] Grades = new double[numStudents];
        for (int i = 0; i < numStudents; i++) {
            System.out.print("Enter grade " + (i + 1) + ": ");
            Grades[i] = input.nextDouble();
        }
        Arrays.sort(Grades);
        for (int i = 0; i < numStudents; i++) {
            System.out.print(Grades[i] + " ");
        }
        double sum = 0;
        for (int i = 0; i < numStudents; i++) {
            sum += Grades[i];
        }
        System.out.println();
        System.out.println("The average grade is " + sum / numStudents);
        System.out.println("Minimum grade is " + Grades[0]);
        System.out.println("Maximum grade is " + Grades[numStudents - 1]);

        System.out.print("Entre the number you are looking for :" );
        int targetGrade = input.nextInt();
        int nbOfStudents = 0;
        for (int i = 0; i < numStudents; i++) {
            if (Grades[i] == targetGrade) {
                nbOfStudents ++;
            }
        }
        System.out.println("the number of students that has " + targetGrade + " is " + nbOfStudents);
    }
}