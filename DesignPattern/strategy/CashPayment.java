package strategy;

public class CashPayment implements PaymentStrategy {

    @Override
    public void pay(String orderID) {
        System.out.println("Đơn hàng " + orderID + " đã được thanh toán bằng tiền mặt.");
    }

}
