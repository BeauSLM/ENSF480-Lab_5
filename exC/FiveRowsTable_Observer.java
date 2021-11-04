import java.util.ArrayList;

public class FiveRowsTable_Observer implements Observer {
    private DoubleArrayListSubject subject;
    public FiveRowsTable_Observer(DoubleArrayListSubject subject) {
        this.subject = subject; 
        subject.registerObserver(this);
    }

    @Override
    public void update(ArrayList<Double> arr) {
        this.subject.data = arr;
        System.out.println("\nNotification to Five-Rows Table Observer: Data Changed:");
        display();
    }

    public void display() {
        if(subject.data.isEmpty()) {
            System.out.println("Empty List ...");
        }
        else {
            int colNum = subject.data.size() / 5; //first we find the number of columns needed
            if(subject.data.size() % 5 != 0)
                colNum++; //adds an extra column for overflow if needed
            for(int i = 0; i < 5; i++) { //row
                for(int j = 0; j < colNum; j++) { //col
                    int index = j * 5 + i;
                    if(index < subject.data.size())
                        System.out.print(subject.data.get(index) + "\t");
                }
                System.out.println();
            }

            System.out.println();
        }
    }
}
