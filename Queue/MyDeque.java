public class MyDeque {

    static class Deque {

        int arr[];
        int size;
        int front;
        int rear;

        Deque(int n) {
            arr = new int[n];
            size = 0;
            front = 0;
            rear = -1;
        }

        public boolean isEmpty() {
            return size == 0;
        }

        public boolean isFull() {
            return size == arr.length;
        }

        public void addFirst(int data) {

            if (isFull()) {
                System.out.println("Deque is full");
                return;
            }

            front = (front - 1 + arr.length) % arr.length;
            arr[front] = data;
            size++;

            if (size == 1) {
                rear = front;
            }
        }

        public void addLast(int data) {

            if (isFull()) {
                System.out.println("Deque is full");
                return;
            }

            rear = (rear + 1) % arr.length;
            arr[rear] = data;
            size++;

            if (size == 1) {
                front = rear;
            }
        }

        public int removeFirst() {

            if (isEmpty()) {
                return -1;
            }

            int value = arr[front];

            front = (front + 1) % arr.length;
            size--;

            return value;
        }

        public int removeLast() {

            if (isEmpty()) {
                return -1;
            }

            int value = arr[rear];

            rear = (rear - 1 + arr.length) % arr.length;
            size--;

            return value;
        }

        public int getFirst() {

            if (isEmpty()) {
                return -1;
            }

            return arr[front];
        }

        public int getLast() {

            if (isEmpty()) {
                return -1;
            }

            return arr[rear];
        }
    }

    public static void main(String[] args) {

        Deque dq = new Deque(5);

        dq.addLast(10);
        dq.addLast(20);
        dq.addFirst(5);

        System.out.println(dq.getFirst());
        System.out.println(dq.getLast());

        dq.removeFirst();
        dq.removeLast();
    }
}