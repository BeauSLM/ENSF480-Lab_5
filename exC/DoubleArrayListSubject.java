import java.util.ArrayList;
import java.util.Observer;

public class DoubleArrayListSubject implements Subject {
    public ArrayList<Double> data; // our data
    private ArrayList<Observer> observers; // observers of this subject

    // initializes data members to new ArrayLists<>
    public DoubleArrayListSubject() {
        data = new ArrayList<>();
        observers = new ArrayList<>();
    }

    // adds a data point, notifies observers
    public void addData(double d) {
        this.data.add(d);
        notifyAllObservers();
    }

    // adds a data point, notifies observers
    public void setData(int index, double d) {
        data.set(index, d);
        notifyAllObservers();
    }

    // populates data with an array, notifies all observers
    public void populate(double [] arr) {
        data = new ArrayList<>(arr);
        notifyAllObservers();
    }

    // adds an observer to the array
    public void registerObserver(Observer o) {
        observers.add(o);
    }

    // removes an observer from the array
    public void removeObserver(Observer o) {
        observers.remove(o);
    }

    // notifies all observers
    public void notifyAllObservers() {
        for (Observer o : observers) {
            o.update();
        }
    }

    // observes all display methods
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
