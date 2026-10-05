import javax.swing.JOptionPane;

public class JOptionPaneAssignment {
    public static void main (String[] args) {
        String rateInput = JOptionPane.showInputDialog(
                "Enter hourly pay rate:"
        );
        double rate = Double.parseDouble(rateInput);

        String hoursInput = JOptionPane.showInputDialog(
                "Enter hours worked:"
        );
        double hours = Double.parseDouble(hoursInput);

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

        JOptionPane.showMessageDialog(
                null,
                "Gross Pay: Php " + grossPay +
                        "\nWithholding Tax: Php " + withholding +
                        "\nNet Pay: Php " + netPay
        );
    }
}