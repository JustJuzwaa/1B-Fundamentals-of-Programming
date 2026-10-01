import javax.swing.JOptionPane;

public class JOptionpane {
    static public void main (String[] args) {
        int age = Integer.parseInt(
                JOptionPane.showInputDialog("What is your age?")
        );

        String name = JOptionPane.showInputDialog("What is your name");

        JOptionPane.showConfirmDialog(null, "You are " + name + " and you are " + age + " year old correct?");

        String[] choices = {"Sitting", "Standing"};

        int choice = JOptionPane.showOptionDialog(
                null,
                "What are you currently doing?",
                "Select one",
                JOptionPane.DEFAULT_OPTION,
                JOptionPane.QUESTION_MESSAGE,
                null,
                choices,
                choices[0]
        );

        JOptionPane.showMessageDialog(null, "So you are " + choices[choice]);
    }
}