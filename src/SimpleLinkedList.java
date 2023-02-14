public class SimpleLinkedList<T> {
    class Node {
        T data;
        Node next;

    }
    private Node top = null;
    private Node bot = null;
    private int n = 0;

    public void add(T data) {
        Node node = new Node();
        node.data = data;
        if (top == null) {
            top = node;
            bot = node;
        } else {
            node.next = top;
            top = node;
        }
        n++;
    }

    public void addBot(T data) {
        Node node = new Node();
        node.data = data;
        if (top == null) {
            top = node;
            bot = node;
        } else {
            bot.next = node;
            bot = node;
        }
        n++;
    }

    public T get(int index) {
        if (index < 0 || index >= n) {
            throw new IndexOutOfBoundsException();
        }
        Node node = top;
        for (int i = 0; i < index; i++) {
            node = node.next;
        }
        return node.data;
    }
    public void set(int i, T data){
        if (i < 0 || i >= n) {
            throw new IndexOutOfBoundsException();
        }
        Node node = top;
        for (int j = 0; j < i; j++) {
            node = node.next;
        }
        node.data = data;
    }

    public boolean isContain(T data) {
        Node node = top;
        for (int i = 0; i < n; i++) {
            if (node.data.equals(data)) {
                return true;
            }
            node = node.next;
        }
        return false;
    }

    public int size() {
        return n;
    }

    public boolean isEmpty() {
        return n == 0;
    }

    public T removeTop() {
        if (top == null) {
            throw new IndexOutOfBoundsException();
        }
        T data = top.data;
        top = top.next;
        n--;
        return data;
    }


    public T removeBot() {
        if (top == null) {
            throw new IndexOutOfBoundsException();
        }
        T data = bot.data;
        Node node = top;
        for (int i = 0; i < n - 2; i++) {
            node = node.next;
        }
        node.next = null;
        bot = node;
        n--;
        return data;
    }

    public void remove(T data) {
        Node node = top;
        for (int i = 0; i < n; i++) {
            if (node.data.equals(data)) {
                if (i == 0) {
                    top = top.next;
                } else if (i == n - 1) {
                    Node node1 = top;
                    for (int j = 0; j < n - 2; j++) {
                        node1 = node1.next;
                    }
                    node1.next = null;
                    bot = node1;
                } else {
                    Node node1 = top;
                    for (int j = 0; j < i - 1; j++) {
                        node1 = node1.next;
                    }
                    node1.next = node.next;
                }
                n--;
            }
            node = node.next;
        }
    }

    public String toString() {
        String s = "";
        Node node = top;
        while (node != null) {
            s += node.data + " ";
            node = node.next;
        }
        return s;
    }

    public static void main(String[] args) {
        SimpleLinkedList<Integer> list = new SimpleLinkedList<Integer>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        System.out.println(list);
        list.remove(3);
        System.out.println(list);
        list.remove(1);
        System.out.println(list);
        list.remove(5);
        System.out.println(list);
        list.remove(2);
        System.out.println(list);
        list.remove(4);
        System.out.println(list);
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        System.out.println(list);
        list.removeTop();
    }
}
