package lab2;

public class ExtendedLinkedList<T> {

    private Node<T> head;
    private int size;

    // Node class representing elements in the linked list
    private static class Node<T> {
        T data;
        Node<T> next;

        public Node(T data) {
            this.data = data;
            this.next = null;
        }
    }

    // Constructor to initialize an empty linked list
    public ExtendedLinkedList() {
        this.head = null;
        this.size = 0;
    }

    // Method to add a new element to the end of the linked list
    public void add(T data) {
        Node<T> newNode = new Node<>(data);
        if (head == null) {
            head = newNode;
        } else {
            Node<T> current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
        size++;
    }

    // Method to remove an element from the linked list
    public void remove(T data) {
        if (head == null) {
            return;
        }

        if (head.data.equals(data)) {
            head = head.next;
            size--;
            return;
        }

        Node<T> current = head;
        while (current.next != null && !current.next.data.equals(data)) {
            current = current.next;
        }

        if (current.next != null) {
            current.next = current.next.next;
            size--;
        }
    }

    // Method to get the size of the linked list
    public int size() {
        return size;
    }

    // Method to get an element at a specific index
    public T get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index out of bounds");
        }

        Node<T> current = head;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }

        return current.data;
    }

    // Method to check if the linked list contains a specific element
    public boolean contains(T data) {
        Node<T> current = head;
        while (current != null) {
            if (current.data.equals(data)) {
                return true;
            }
            current = current.next;
        }
        return false;
    }

    // Method to clear all elements from the linked list
    public void clear() {
        head = null;
        size = 0;
    }

    // Method to check if the linked list is empty
    public boolean isEmpty() {
        return size == 0;
    }

    // Method to display the elements in the linked list
    public void display() {
        Node<T> current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        ExtendedLinkedList<Integer> list = new ExtendedLinkedList<>();
        list.add(10);
        list.add(20);
        list.add(30);

        System.out.print("Linked List: ");
        list.display();

        System.out.println("Size: " + list.size());

        System.out.println("Contains 20: " + list.contains(20));

        System.out.println("Element at index 1: " + list.get(1));

        list.remove(20);
        System.out.print("Linked List after removing 20: ");
        list.display();

        list.clear();
        System.out.println("Is the list empty? " + list.isEmpty());
    }
}
