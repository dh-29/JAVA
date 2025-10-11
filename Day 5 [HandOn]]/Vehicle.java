class Vehicle {
    String brand;
    double price;
    void display() {
        System.out.println("Brand: " + brand);
        System.out.println("Price: " + price);
    }
    public static void main(String[] args) {
        Vehicle car = new Vehicle();
        car.brand = "Toyota";
        car.price = 25000.50;
        car.display();
    }
}
