public class Waste3 {

    static double calculateTotalWaste(double point1Waste, double point2Waste) {
        return point1Waste + point2Waste;
    }

    public static void main(String[] args) {

        double point1Waste = 45.5;
        double point2Waste = 60.5;

        double totalWaste = calculateTotalWaste(point1Waste, point2Waste);

        System.out.println("Total Waste Collected: " + totalWaste + " kg");
    }
}