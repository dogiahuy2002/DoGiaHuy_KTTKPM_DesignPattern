
package order;

import strategy.PaymentStrategy;

public class Order {
    private String orderID;
    private PaymentStrategy paymentStrategy;

    public Order(String orderID) {
        this.orderID = orderID;
    }

    // Thiết lập phương thức thanh toán
    public void setPaymentStrategy(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }

    // Xử lý thanh toán
    public void processPayment() {
        if (paymentStrategy == null) {
            System.out.println("Vui lòng chọn phương thức thanh toán cho đơn hàng " + orderID);
        } else {
            paymentStrategy.pay(orderID);
        }
    }
}
