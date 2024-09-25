//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
class Node {
    int data; // The value in the node
    Node next; // Reference to the next node in the list

    public Node(int data) {
        this.data = data;
        this.next = null; // The next node is null when a node is first created
    }
}

class LinkedList {
    Node head; // Head of the list (points to the first node)

    // Add a new node at the end of the list
    public void append(int data) {
        // Create a new node
        Node newNode = new Node(data);

        // If the list is empty, make the new node the head
        if (head == null) {
            head = newNode;
            return;
        }

        // Otherwise, find the last node
        Node last = head;
        while (last.next != null) {
            last = last.next;
        }

        // Point the last node to the new node
        last.next = newNode;
    }

    // Display the linked list
    public void printList() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }
}

public class Main {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        // Adding elements to the list
        list.append(10);
        list.append(20);
        list.append(30);

        // Printing the list
        list.printList(); // Output: 10 -> 20 -> 30 -> null
    }
}

