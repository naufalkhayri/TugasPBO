package edu.ecommerce;

public class Order {
    public String orderId, customerName;
    public double total;

    public Order(String orderId, String customerName) {
        this.orderId = orderId;
        this.customerName = customerName;
    }

    public class OrderItem {
        public String productName;
        public double price;
        public int quantity;

        public OrderItem(String productName, double price, int quantity) {
            this.productName = productName;
            this.price = price;
            this.quantity = quantity;
        }

        public double getSubtotal() {
            return price * quantity;
        }
    }

    public double hitungTotal(OrderItem[] items) {
        total = 0;
        for (OrderItem item : items) {
            total += item.getSubtotal();
        }
        return total;
    }

    public void tampilkanRincian(OrderItem[] items) {
        System.out.println("Pesanan:");
        System.out.println("Order ID     : " + orderId);
        System.out.println("Customer     : " + customerName);

        for (OrderItem item : items) {
            System.out.printf("%-15s x%d  Rp%.0f  => Rp%.0f%n",
                    item.productName, item.quantity, item.price, item.getSubtotal());
        }

        System.out.println("Total        : Rp" + hitungTotal(items));
    }
}