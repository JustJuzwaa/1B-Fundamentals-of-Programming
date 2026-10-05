import java.util.Scanner;

public class ScannerAssignment {
    public static void main (String[] args) {
            Scanner input = new Scanner(System.in);

            System.out.print("Enter hourly pay rate: ");
            double rate = input.nextDouble();

            System.out.print("Enter hours worked: ");
            double hours = input.nextDouble();

            double grossPay = rate * hours;
            double taxRate;

            if (grossPay <= 2000) {
                taxRate = 0.10;
            } else if (grossPay <= 4000) {
                taxRate = 0.12;
            } else if (grossPay <= 10000) {
                taxRate = 0.15;
            } else {
                taxRate = 0.20;
            }

            double withholding = grossPay * taxRate;
            double netPay = grossPay - withholding;

            System.out.println("Gross Pay: Php " + grossPay);
            System.out.println("Withholding Tax: Php " + withholding);
            System.out.println("Net Pay: Php " + netPay);

            input.close();
        }
    }