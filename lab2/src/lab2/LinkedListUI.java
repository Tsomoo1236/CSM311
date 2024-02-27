package lab2;

import java.util.Scanner;

public class LinkedListUI {

    public static void main(String[] args) {
        ExtendedLinkedList<Integer> list = new ExtendedLinkedList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            printMenu();
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Элемент нэмэх: ");
                    int elementToAdd = scanner.nextInt();
                    list.add(elementToAdd);
                    break;
                case 2:
                    System.out.print("Элемент устгах: ");
                    int elementToRemove = scanner.nextInt();
                    list.remove(elementToRemove);
                    break;
                case 3:
                    System.out.println("Жагсаалтын хэмжээг авах: " + list.size());
                    break;
                case 4:
                    System.out.print("Элементийг индекстэй авах: ");
                    int indexToGet = scanner.nextInt();
                    try {
                        System.out.println("Element at index " + indexToGet + ": " + list.get(indexToGet));
                    } catch (IndexOutOfBoundsException e) {
                        System.out.println("Index out of bounds.");
                    }
                    break;
                case 5:
                    System.out.print("Жагсаалтад элемент байгаа эсэхийг шалгах: ");
                    int elementToCheck = scanner.nextInt();
                    System.out.println("Contains " + elementToCheck + ": " + list.contains(elementToCheck));
                    break;
                case 6:
                    list.display();
                    break;
                case 7:
                    list.clear();
                    System.out.println("Жагсаалтыг цэвэрлэх.");
                    break;
                case 8:
                    System.out.println("Жагсаалт хоосон эсэхийг шалгах " + list.isEmpty());
                    break;
                case 9:
                    System.out.println("Гарах. Goodbye!");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please choose again.");
                    break;
            }
        }
    }

    private static void printMenu() {
        System.out.println("\n----- Linked List Menu -----");
        System.out.println("1. Элемент нэмэх");
        System.out.println("2. Элемент устгах");
        System.out.println("3. Жагсаалтын хэмжээг авах");
        System.out.println("4. Элементийг индекстэй авах");
        System.out.println("5. Жагсаалтад элемент байгаа эсэхийг шалгах");
        System.out.println("6. Жагсаалтын элементүүдийг харуулах");
        System.out.println("7. Жагсаалтыг цэвэрлэх");
        System.out.println("8. Жагсаалт хоосон эсэхийг шалгах");
        System.out.println("9. Гарах");
        System.out.print("Enter your choice: ");
    }
    //2024.2.27 18:01
}
