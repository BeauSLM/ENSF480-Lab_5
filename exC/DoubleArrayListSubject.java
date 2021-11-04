import java.util.ArrayList;

public class DoubleArrayListSubject implements Subject {
    public ArrayList<Double> data; // how to make visible to observer?

    public DoubleArrayListSubject() {
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
