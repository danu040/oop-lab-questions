class Vehicle {
    private String vehicleNumber;
    protected String brand;

    // Constructor
    public Vehicle(String vehicleNumber, String brand) {
        this.vehicleNumber = vehicleNumber;
        this.brand = brand;
    }

    // Display vehicle info
    public void displayVehicleInfo() {
        System.out.println("Vehicle Number: " + vehicleNumber);
        System.out.println("Brand: " + brand);
    }

    // Method to be overridden
    public double calculateRentalCost() {
        System.out.println("General vehicle rental cost calculation");
        return 0.0;
    }
}
