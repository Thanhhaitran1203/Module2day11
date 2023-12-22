public class Queue {
    private Node front;
    private Node rear;

    public Queue() {
        this.front = null;
        this.rear = null;
    }

    public void enqueue(int key) {
        Node temp = new Node(key);
        if (this.rear == null) {
            this.front = this.rear = temp;
            temp.next = temp;
            return;
        }
        this.rear.next = temp;
        this.rear = temp;
        this.rear.next = this.front;
    }

    public Node dequeue() {
        if (this.front == null) {
            return null;
        }
        Node temp = this.front;
        if (this.front == this.rear) {
            this.front = null;
            this.rear = null;
            return temp;
        }
        this.front = this.front. next;
        this.rear.next = this.front;
        return temp;
    }

        public String displayQueue() {
        String display = "{";
        Node temp = this.front;
        do {
            if (temp == this.rear) {
                display += temp.data;
                break;
            }
            display += temp.data + ", ";
            temp = temp.next;
        }while (temp!=this.front);
        display += "}";
        return display;
    }
}