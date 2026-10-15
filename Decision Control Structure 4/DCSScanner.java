import java.util.Scanner;

public class DCSScanner {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Welcome to the Jedi Knight Military Academy");
        System.out.print("What is your Height?: ");
        int height = scan.nextInt();

        System.out.print("What is your Age?: ");
        int age = scan.nextInt();
        System.out.print("Are you a citizen of the planet Endor? (Y/N)?: ");
        char citizenship = scan.next().charAt(0);

        System.out.print("Are you a recommendee of Master Obi-Wan-Kenobi? (Y/N)?: ");
        char recommendee = scan.next().charAt(0);

        String cValue;
        if (citizenship == 'Y' ) {
            citizenship = 'C';
            cValue = citizenship + (" (Citizen of Endor)");
        } else {
            citizenship = 'N';
            cValue = citizenship + (" (Non-Citizen of Endor)");
        }

        if (recommendee == 'Y' || height >= 200 && age >= 21 && age <= 24) {
            System.out.println("Congratulations!  You are accepted");
            System.out.println("Your height is " + height + "cm");
            System.out.println("You are " + age + " years old");
            System.out.println("You are " + cValue);
            if (recommendee == 'Y') {
                System.out.println("You are R (Recommendee of Obi-Wan-Kenobi");
            } else {
                System.out.println("You are N (Not a Recommendee of Obi-Wan-Kenobi");
            }
        } else {
            System.out.println("Unfortunately, You are rejected");
            System.out.println("Your height is " + height + "cm");
            System.out.println("You are " + age + " years old");
            System.out.println("You are " + cValue);
            System.out.println("You are not a recommendee of Master Obi-Wan-Kenobi");
        }
    }
}
