
import order.Order;
import strategy.CashPayment;
import strategy.MomoPayment;
import strategy.TransferPayment;

public class Main {

    public static void main(String[] args) {

        // Tạo đơn hàng với ID cụ thể
        Order order1 = new Order("ORD123");

        // Chọn phương thức thanh toán và thanh toán đơn hàng
        System.out.println("1. Thanh toán bằng tiền mặt:");
        order1.setPaymentStrategy(new CashPayment());
        order1.processPayment();

        System.out.println("\n2. Thanh toán chuyển khoản:");
        order1.setPaymentStrategy(new TransferPayment());
        order1.processPayment();

        System.out.println("\n3. Thanh toán qua Momo:");
        order1.setPaymentStrategy(new MomoPayment());
        order1.processPayment();
    }
}