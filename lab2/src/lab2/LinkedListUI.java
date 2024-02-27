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
                    System.out.print("Enter an element to add: ");
                    int elementToAdd = scanner.nextInt();
                    list.add(elementToAdd);
                    break;
                case 2:
                    System.out.print("Enter an element to remove: ");
                    int elementToRemove = scanner.nextInt();
                    list.remove(elementToRemove);
                    break;
                case 3:
                    System.out.println("Size of the list: " + list.size());
                    break;
                case 4:
                    System.out.print("Enter an index to get the element: ");
                    int indexToGet = scanner.nextInt();
                    try {
                        System.out.println("Element at index " + indexToGet + ": " + list.get(indexToGet));
                    } catch (IndexOutOfBoundsException e) {
                        System.out.println("Index out of bounds.");
                    }
                    break;
                case 5:
                    System.out.print("Enter an element to check for containment: ");
                    int elementToCheck = scanner.nextInt();
                    System.out.println("Contains " + elementToCheck + ": " + list.contains(elementToCheck));
                    break;
                case 6:
                    list.display();
                    break;
                case 7:
                    list.clear();
                    System.out.println("List cleared.");
                    break;
                case 8:
                    System.out.println("Is the list empty? " + list.isEmpty());
                    break;
                case 9:
                    System.out.println("Exiting program. Goodbye!");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please choose again.");
                    break;
            }
        }
    }

    private static void printMenu() {
        System.out.println("\n----- Linked List Menu -----");
        System.out.println("1. Add an element");
        System.out.println("2. Remove an element");
        System.out.println("3. Get the size of the list");
        System.out.println("4. Get an element by index");
        System.out.println("5. Check if the list contains an element");
        System.out.println("6. Display the elements in the list");
        System.out.println("7. Clear the list");
        System.out.println("8. Check if the list is empty");
        System.out.println("9. Exit");
        System.out.print("Enter your choice: ");
    }
    //2024.2.27 17:35
}
