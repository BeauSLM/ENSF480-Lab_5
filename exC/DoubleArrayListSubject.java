import java.util.ArrayList;

public class DoubleArrayListSubject implements Subject {
    public ArrayList<Double> data; // how to make visible to observer?
    private ArrayList<Observer> observers;

    public DoubleArrayListSubject() {
        data = new ArrayList<>();
        observers = new ArrayList<>();
    }

    public DoubleArrayListSubject(ArrayList<Double> data) { this.data = data; }

    public void addData(double d) {
        this.data.add(d);
    }

    public void setData(int index, double d) {
        data.set(index, d);
    }

    public void populate(double [] arr) {
        data = new ArrayList<>(arr);
    }

    public void registerObserver(Observer o) {
        observers.add(o);
    }

    public void removeObserver(Observer o) {
        observers.remove(o);
    }

    public void notifyAllObservers() {
        for (Observer o : observers) {
            o.update();
        }
    }

    public void display() {
        if (observers.isEmpty()) {
            System.err.println("Empty List ...");
        } else {
            for (Observer o : observers) {
                o.display();
            }
        }
    }
}
