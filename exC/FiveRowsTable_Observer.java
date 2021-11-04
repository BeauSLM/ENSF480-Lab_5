import java.util.ArrayList;

public class FiveRowsTable_Observer implements Observer {
    private Subject subject;
    public FiveRowsTable_Observer(Subject subject) {
        this.subject = subject; 
        subject.registerObserver(this);
    }

    @Override
    public void update(ArrayList<Double> arr) {
        this.subject.data = arr;
        System.out.println("Notification to Five-Rows Table Observer: Data Changed:");
        display();
    }

    public void display() {
        if(subject.data.isEmpty()) {
            System.out.println("Empty List ...")
        }
        else {
            int colNum = subject.data.size() / 5; //first we find the number of columns needed
            if(subject.data.size() % 5 != 0)
                colNum++; //adds an extra column for overflow if needed
            for(int i = 0; i < 5; i++) { //row
                for(int j = 0; j < colNum; j++) { //col
                    int n = j*5;
                    if(n < subject.data.size())
                        System.out.print(subject.data.at(n) + "\t");
                }
                System.out.println();
            }

            System.out.println();
        }
    }
}