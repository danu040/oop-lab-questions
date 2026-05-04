public class DeliveryChargeTest {
    public static void main(String[] args) {

        DeliveryChargeCalculator calculator = new DeliveryChargeCalculator();

        double result1 = calculator.calculateCharge(1000.0);
        double result2 = calculator.calculateCharge(1000.0, 5.0);
        double result3 = calculator.calculateCharge(1000.0, 5.0, 2.0);
        double result4 = calculator.calculateCharge(1000.0, true);

        System.out.println("Base Charge Only: " + result1);
        System.out.println("Base + Distance: " + result2);
        System.out.println("Base + Distance + Weight: " + result3);
        System.out.println("Base + Express Delivery: " + result4);
    }
}
