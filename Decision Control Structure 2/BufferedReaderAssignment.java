import java.io.*;

public class BufferedReaderAssignment {
    public static void main (String[] args) throws IOException {
        BufferedReader input = new BufferedReader(
                new InputStreamReader(System.in)
        );

        System.out.print("Enter hourly pay rate: ");
        double rate = Double.parseDouble(input.readLine());

        System.out.print("Enter hours worked: ");
        double hours = Double.parseDouble(input.readLine());

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
    }
}