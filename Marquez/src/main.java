import javax.swing.JOptionPane;

public class main {
    static public void main (String[] args) {
        double num1 = Double.parseDouble(
                JOptionPane.showInputDialog("What is your first number")
        );

        double num2 = Double.parseDouble(
                JOptionPane.showInputDialog("What is your second number")
        );

        String[] choices = {"Add", "Subtract", "Multiply", "Divide"};

        int choice = JOptionPane.showOptionDialog(
                null,
                "Choose an operator",
                "Calculator",
                JOptionPane.DEFAULT_OPTION,
                JOptionPane.QUESTION_MESSAGE,
                null,
                choices,
                choices[0]
        );

        double result = 0;

        if (choice == 0) {
            result = num1 + num2;
        }
        else if (choice == 1) {
            result = num1 - num2;
        }
        else if (choice == 2) {
            result = num1 * num2;
        }
        else if (choice == 3) {
            result = num1 / num2;
        }

        JOptionPane.showMessageDialog(
                null, "Result: " + result
        );
        }
}