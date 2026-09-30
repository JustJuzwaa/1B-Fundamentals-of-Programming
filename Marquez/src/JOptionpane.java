import javax.swing.JOptionPane;

public class JOptionpane {
    public static void main (String[] args) {
        String inputA = JOptionPane.showInputDialog("What is your salary?");
        int salary = Integer.parseInt(inputA);
        ;
        double salaryB = salary * 0.1775 + salary;
        JOptionPane.showMessageDialog(null, "Your total salary after increase is " + salaryB);

        double salaryC = salaryB * 2;
        JOptionPane.showMessageDialog(null, "and your total salary after 2 months is " + salaryC);
    }
}