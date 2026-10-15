import javax.swing.JOptionPane;

public class DCSJOptionPane {
    public static void main(String[] args) {

        JOptionPane.showMessageDialog(null, "Welcome to the Jedi Knight Military Academy");

        int height = Integer.parseInt(JOptionPane.showInputDialog("What is your Height?: "));

        int age = Integer.parseInt(JOptionPane.showInputDialog("What is your Age?: "));

        char citizenship = JOptionPane.showInputDialog("Are you a citizen of Planet Endor? (Y/N): ").trim().toUpperCase().charAt(0);

        char recommendee = JOptionPane.showInputDialog("Are you a recommendee of Master Obi-Wan-Kenobi? (Y/N): ").trim().toUpperCase().charAt(0);

        String cValue;
        if (citizenship == 'Y') {
            cValue = "C (Citizen of Endor)";
        } else {
            cValue = "N (Non-Citizen of Endor)";
        }

        String result;
        if (recommendee == 'Y' || (height >= 200 && age >= 21 && age <= 24 && citizenship == 'Y')) {
            result = "Congratulations! You are accepted\n";

            if (recommendee == 'Y') {
                result += "You are a recommendee of Master Obi-Wan-Kenobi";
            } else {
                result += "You are not a recommendee of Master Obi-Wan-Kenobi";
            }

        } else {
            result = "Unfortunately, you are rejected\n";
            result += "You are not a recommendee of Master Obi-Wan-Kenobi";
        }
        result += "\nYour height is " + height + "cm";
        result += "\nYou are " + age + " years old";
        result += "\nYou are " + cValue;

        JOptionPane.showMessageDialog(null, result);
    }
}