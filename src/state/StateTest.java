package state;

public class StateTest {
    public static void main(String[] args) {
        OrderState orderContext = new OrderState();
        State orderState = new OrderDelivered();
        System.out.println("order da chuyen trang thai");
        orderContext.setOrderState(orderState);
    }
}
