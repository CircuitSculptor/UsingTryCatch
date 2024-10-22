package ie.atu.week6;
import java.util.Scanner;

public class UsingTryCatch {
    public static void main(String[] args) {
        System.out.println("Please enter a number between 0 - 9: ");
        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine();
        int Num = Integer.parseInt(input);

        if (Num >= 0 && Num <= 9) {
            System.out.println("You entered " + Num);
        }
        else {
            System.out.println("Not a valid number");
        }
    }
}
