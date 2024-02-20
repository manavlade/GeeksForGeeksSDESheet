import java.util.Stack;

class Node {
    int data;
    Node next;

    Node(int value) {
        this.value = value;
    }
}

public class ReverseLinkedList {
    /*
     * Question
     * Given a linked list of N nodes. The task is to reverse this list.
     */
    Node reverseList(Node head) {
        Node prev = null;
        Node current = head;
        Node nextNode;
        
        while (current != null) {
            nextNode = current.next;
            current.next = prev;
            prev = current;
            current = nextNode;
        }
        head = prev;
        return head;
    }
}
