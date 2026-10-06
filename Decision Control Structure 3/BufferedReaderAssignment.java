import java.io.*;

public class BufferedReaderAssignment {
    public static void main (String[] args) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter NSAT score: ");
        double nsat = Double.parseDouble(input.readLine());

        System.out.print("Enter parents' monthly salary: ");
        double salary = Double.parseDouble(input.readLine());

        System.out.print("Enter entrance exam score: ");
        double entrance = Double.parseDouble(input.readLine());

        double average = (nsat + entrance) / 2;

        if (salary > 10000 || nsat < 90 || entrance < 85) {
            System.out.println("Result: Rejected");
        }
        else if (salary <= 3500 && average >= 91) {
            System.out.println("Result: Accepted");
        }
        else {
            System.out.println("Result: Further Study");
    }
}}