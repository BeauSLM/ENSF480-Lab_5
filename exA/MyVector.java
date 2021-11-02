import java.util.ArrayList;

// IS STORAGEM THE LIBRARY ARRAYLIST??????
public class MyVector<E extends Number & Comparable<E>> {
    private ArrayList<Item<E>> storageM;
    private Sorter sorter;

    public MyVector(final int n) {
        storageM = new ArrayList<Item<E>>(n);
    }

    public MyVector(final ArrayList<Item<E>> arr) {
        // TODO: make storageM an exact copy of arr
    }

    public void add(final Item<E> value) {
        // TODO: adds value to storageM
    }

    public void setSortStrategy(final Sorter <E> s) {
        sorter = s;
    }

    public void performSort() {
        // FIXME: is this right???
        sorter.sort();
    }

    public void display() {
        // display all content in the storageM
    }
}
