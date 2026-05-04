class DeliveryChargeCalculator {


    public double calculateCharge(double baseCharge) {
        return baseCharge;
    }

    public double calculateCharge(double baseCharge, double distanceKm) {
        double distanceCharge = 100.0 * distanceKm;
        return baseCharge + distanceCharge;
    }

  
    public double calculateCharge(double baseCharge, double distanceKm, double weightKg) {
        double distanceCharge = 100.0 * distanceKm;
        double weightCharge = 50.0 * weightKg;
        return baseCharge + distanceCharge + weightCharge;
    }

  
    public double calculateCharge(double baseCharge, boolean expressDelivery) {
        if (expressDelivery) {
            return baseCharge + 500.0;
        }
        return baseCharge;
    }
}
