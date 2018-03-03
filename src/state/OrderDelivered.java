package state;

import observer.CustomerObserver;
import observer.Observer;
import observer.OrderSubject;
import observer.Subject;

public class OrderDelivered implements State {
    @Override
    public void handle() {
        Subject orderSubject = new OrderSubject();
        Observer customerObserver = new CustomerObserver();
        orderSubject.attachObserver(customerObserver);
        orderSubject.notifyObservers();
    }
}
