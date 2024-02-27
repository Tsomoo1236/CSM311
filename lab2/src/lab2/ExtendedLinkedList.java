package lab2;

public class ExtendedLinkedList<T> {
	
//Эдгээр мөрүүд нь ExtendedLinkedList классын private хувьсагчидыг тодорхойлдог. 
    private Node<T> head;
    private int size;
//Энэ код нь ExtendedLinkedList классын дотор байрлаж буй Node нэртэй классыг тодорхойлдог.  
    // Энэ класс нь линк листийн элементийг илэрхийлэх обьект юм.
    private static class Node<T> {
        T data;
        Node<T> next;

        public Node(T data) {
            this.data = data;
            this.next = null;
        }
    }

    //Энэ код нь ExtendedLinkedList классын объект үүсгэх үед дуудагддаг функц юм.
    public ExtendedLinkedList() {
        this.head = null;
        this.size = 0;
    }

    //Энэ код нь линк лист руу элемент нэмэх функц юм.
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

    // Энэ код нь линк листээс элемент устгах функц юм
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

    // Энэ код нь линк листийн хэмжээг авах функц юм. 
    public int size() {
        return size;
    }

    //Энэ код нь линк листээс тодорхой индекстэй элементийг авах функц юм
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

    // Энэ код нь линк листээс элемент байгаа эсэхийг шалгах функц юм
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

    // Энэ код нь линк листийг хоосон болгож, хэмжээг 0 болгож тодорхойлдог.
    public void clear() {
        head = null;
        size = 0;
    }

    // Энэ код нь линк лист хоосон байгаа эсэхийг шалгах функц юм. 
    public boolean isEmpty() {
        return size == 0;
    }

    // main функц нь програмын эх код болон жагсаалтын функцүүдийг туршиж дуудаж байгаа. 
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
