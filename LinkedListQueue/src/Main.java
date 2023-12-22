import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        Queue queue = new Queue();
        for (int i = 0; i < 10; i++) {
            queue.enqueue(i);
        }
        System.out.println(queue.displayQueue());
    }
}