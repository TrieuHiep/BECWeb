package state;

import model.orderpkg.Order;

public class OrderState {
    private State orderState;
    private Order order;

    public State getOrderState() {
        return orderState;
    }

    public void setOrderState(State orderState) {
        this.orderState = orderState;
        orderState.handle();
    }
}
