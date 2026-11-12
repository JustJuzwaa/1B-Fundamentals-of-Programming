
import java.util.Arrays;

public class CinemaSeatChart {
    public static void main(String[] args) {

        // 1. Declare and initialize the 2D array
        String[][] seats = {
                {"Alice", "Bob", "Charlie"},
                {"David", "Emma", "Frank"}
        };

        // 2. Access the second row, third column
        System.out.println("Second row, third column: " + seats[1][2]);

        // 3. Replace Bob with Vacant
        seats[0][1] = "Vacant";

        // 4. Display the entire seating arrangement
        System.out.println("Updated Seating Arrangement: ");
        System.out.println(Arrays.deepToString(seats));

    }
}
