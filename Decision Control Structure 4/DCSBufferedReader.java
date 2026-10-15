import java.io.*;

public class DCSBufferedReader {
    public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Welcome to the Jedi Knight Military Academy");

        System.out.print("What is your Height?: ");
        int height = Integer.parseInt(br.readLine());

        System.out.print("What is your Age?: ");
        int age = Integer.parseInt(br.readLine());

        System.out.print("Are you a citizen of Planet Endor? (Y/N): ");
        char citizenship = br.readLine().trim().toUpperCase().charAt(0);

        System.out.print("Are you a recommendee of Master Obi-Wan-Kenobi? (Y/N): ");
        char recommendee = br.readLine().trim().toUpperCase().charAt(0);

        String cValue;

        if (citizenship == 'Y') {
            cValue = "C (Citizen of Endor)";
        } else {
            cValue = "N (Non-Citizen of Endor)";
        }

        if (recommendee == 'Y' || (height >= 200 && age >= 21 && age <= 24 && citizenship == 'Y')) {

            System.out.println("Congratulations! You are accepted");
            System.out.println("Your height is " + height + "cm");
            System.out.println("You are " + age + " years old");
            System.out.println("You are " + cValue);

            if (recommendee == 'Y') {
                System.out.println("You are a recommendee of Master Obi-Wan-Kenobi");
            } else {
                System.out.println("You are not a recommendee of Master Obi-Wan-Kenobi");
            }

        } else {
            System.out.println("Unfortunately, you are rejected");
            System.out.println("Your height is " + height + "cm");
            System.out.println("You are " + age + " years old");
            System.out.println("You are " + cValue);
            System.out.println("You are not a recommendee of Master Obi-Wan-Kenobi");
        }
    }
}