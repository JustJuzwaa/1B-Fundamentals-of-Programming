public class CoffeeShopAnalyzer {
    public static void main(String[] args) {
        int[] weeklySales = {125, 145, 130, 155, 180, 210, 195};
        String[] daysOfWeek = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};

        System.out.println("Weekly Sales Analysis:");
        for (int i = 0; i < weeklySales.length; i++) {
            System.out.println(daysOfWeek[i] + " sales: " + weeklySales[i]);
        }

        int totalSales = 0;

        for (int i = 0; i < weeklySales.length; i++) {
            totalSales += weeklySales[i];
        }
        System.out.println("Total weekly sales: " + totalSales);

        double averageSales = totalSales / weeklySales.length;
        System.out.println("Average daily sales: " + averageSales);
    }
}