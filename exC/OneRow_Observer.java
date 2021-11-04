import java.util.ArrayList;

public class OneRowTable_Observer implements Observer {
    private Subject subject;
    public OneRowTable_Observer(Subject subject) {
        this.subject = subject; 
        subject.registerObserver(this);
    }

    @Override
    public void update(ArrayList<Double> arr) {
        this.subject.data = arr;
        System.out.println("Notification to One-Row Table Observer: Data Changed:");
        display();
    }

    public void display() {
        if(subject.data.isEmpty()) {
            System.out.println("Empty List ...")
        }
        else {
            for(Double d : subject.data) {
                System.out.print(d + "\t");
            }
            System.out.println();
        }
    }
}