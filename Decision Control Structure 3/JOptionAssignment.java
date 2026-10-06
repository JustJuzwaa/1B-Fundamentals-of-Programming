import javax.swing.JOptionPane;

public class JOptionAssignment {
    public static void main(String[] args) {

        double nsat = Double.parseDouble(
                JOptionPane.showInputDialog("Enter NSAT score:")
        );

        double salary = Double.parseDouble(
                JOptionPane.showInputDialog("Enter parents' monthly salary:")
        );

        double entrance = Double.parseDouble(
                JOptionPane.showInputDialog("Enter entrance exam score:")
        );

        double average = (nsat + entrance) / 2;

        String result;

        if (salary > 10000 || nsat < 90 || entrance < 85) {
            result = "Rejected";
        }
        else if (salary <= 3500 && average >= 91) {
            result = "Accepted";
        }
        else {
            result = "Further Study";
        }

        JOptionPane.showMessageDialog(
                null,
                "Average Score: " + average + "\nResult: " + result
        );
    }
}