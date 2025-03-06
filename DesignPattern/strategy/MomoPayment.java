package strategy;

public class MomoPayment implements PaymentStrategy {

    @Override
    public void pay(String orderID) {
        System.out.println("Đơn hàng " + orderID + " đã được thanh toán qua Momo.");
    }

}
