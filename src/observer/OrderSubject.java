package observer;

import java.util.ArrayList;
import java.util.List;

public class OrderSubject implements Subject {
    private List<Observer> observerList = new ArrayList<>();

    @Override
    public void attachObserver(Observer observer) {
        observerList.add(observer);
    }

    @Override
    public void detachObserver(Observer observer) {
        observerList.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer o : observerList) {
            o.update();
        }
    }
}
