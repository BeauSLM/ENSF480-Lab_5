import java.util.ArrayList;

public class DoublArrayListSubject implements Subject {
    public ArrayList<Double> data; // how to make visible to observer?

    public DoublArrayListSubject() {
        data = new ArrayList<>();
    }

    public void registerObserver(Observer o) {

    }

    public void removeObserver(Observer o) {

    }

    public void notifyAllObservers(Double d) {
        data.add(d);
    }
}
