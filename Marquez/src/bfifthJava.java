import java.util.Scanner;
import java.util.InputMismatchException;

public class bfifthJava {
    public static void main (String[] args) {
        String name;
        int age;
        Scanner scan = new Scanner(System.in);

        try {
            System.out.print("Please enter your name: ");
            name = scan.nextLine();

            System.out.print("Please enter your age: ");
            age = scan.nextInt();

            System.out.print("Your name is " + name + " and you are " + age + " years old");

        } catch (InputMismatchException e) {
            System.out.println("Error: Age must be a whole number.");
        } finally {
            scan.close();
        }
    }}