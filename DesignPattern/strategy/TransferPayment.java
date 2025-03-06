package strategy;

public class TransferPayment implements PaymentStrategy {

    @Override
    public void pay(String orderID) {
        System.out.println("Đơn hàng " + orderID + " đã được thanh toán qua chuyển khoản ngân hàng.");
    }

}
