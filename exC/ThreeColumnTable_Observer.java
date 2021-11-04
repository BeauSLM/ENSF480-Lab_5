import java.util.ArrayList;

public class ThreeColumnTable_Observer implements Observer {
    private Subject subject;
    public ThreeColumnTable_Observer(Subject subject) {
        this.subject = subject; 
        subject.registerObserver(this);
    }

    @Override
    public void update(ArrayList<Double> arr) {
        this.subject.data = arr;
        System.out.println("Notification to Three-Column Table Observer: Data Changed:");
        display();
    }

    public void display() {
        if(subject.data.isEmpty()) {
            System.out.println("Empty List ...")
        }
        else {
            int counter = 0;
            for(Double d : subject.data) {
                System.out.print(d + "\t");
                counter++;
                if(counter == 3) {
                    System.out.println();
                    counter = 0;
                }
            }
            System.out.println();
        }
    }
}