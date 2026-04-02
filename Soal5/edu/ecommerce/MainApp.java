package edu.ecommerce;

public class MainApp {
    public static void main(String[] args) {
        Order order = new Order("ORD-001", "Pall");

        Order.OrderItem[] items = {
                order.new OrderItem("Laptop", 8000000, 1),
                order.new OrderItem("Mouse", 150000, 2),
                order.new OrderItem("Keyboard", 300000, 1)
        };

        order.tampilkanRincian(items);
    }
}
