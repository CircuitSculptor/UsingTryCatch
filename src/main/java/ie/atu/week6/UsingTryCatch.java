package ie.atu.week6;
import java.util.Scanner;

public class UsingTryCatch {
    public static void main(String[] args) {

        boolean repeat = true;

        try (Scanner sc = new Scanner(System.in)) {
            while (repeat) {
                try  {
                    System.out.print("Please enter a number between 0 - 9: ");
                    String input = sc.nextLine();
                    int Num = Integer.parseInt(input);

                    if (Num >= 0 && Num <= 9) {
                        System.out.println("You entered " + Num);
                        repeat = false;
                    }
                }
                catch (NumberFormatException nfe){
                    System.out.println("Not a valid number " + nfe.getMessage());
                }
            }
        }
    }
}
