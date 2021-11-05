/* ENSF 480 - Lab 5 - Exercise A and B
	File: Sorter.java
	For: Lab 5 Exercise A
    Written By: Quentin J, Beau M
 */
import java.util.ArrayList;

public interface Sorter <E extends Number & Comparable<E>> {
    public void sort(ArrayList<Item<E>> arr); // diff return type?
}
