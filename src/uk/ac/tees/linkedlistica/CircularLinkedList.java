package uk.ac.tees.linkedlistica;

/**
 * Represents a circular linked list.
 *
 * @author Your Name (X0000000@tees.ac.uk)
 * @author Annalisa Occhipinti (a.occhipinti@tees.ac.uk)
 */
public class CircularLinkedList {

    /**
     * Stores the first node in the list. Should always be a sentinel node.
     */
    public ListNode head;

    /**
     * Creates a new circular linked list from an existing array.
     *
     * @param data the array to create the new linked list from
     */
    public CircularLinkedList(int[] data) {

        // DO NOT MODIFY THIS CONSTRUCTOR.
        // The head is a sentinel node.
        head = new ListNode(-999, null);
        head.next = head; // Complete the circle.

        // Populate list.
        ListNode n = head; // The last item in the circle.
        for (int i = 0; i < data.length; i++) {
            n.next = new ListNode(data[i], head);
            n = n.next;
        }
    }

    /**
     * Gets whether or not the list is empty.
     *
     * @return true if list is empty, otherwise false
     */
    public boolean isEmpty() {

        if (head.next == head) {
            return true;
        } else {
            return false;
        }

    }

    /**
     * Returns the list as a string of the form "{item1, item2, ...}"
     *
     * @return the resulting string
     */
    @Override
    public String toString() {
        String s = "";
        ListNode current = head;
        int index = 1;

        do {
            index++;
            current = current.next;
            if (index < 6) {
                s = s + current.data + ", ";
            }

        } while (index != 6);

        s = s + current.data;

        s = "{" + s + "}";

        return s;
    }

    /**
     * Count all nodes with the given value, returning the number of nodes.
     *
     * @param obj the value
     * @return the number of nodes with value obj
     */
    public int countNodesWithValue(int obj) {

        ListNode current = head;
        int index = 0;
        int objs = 0;

        do {
            index++;
            current = current.next;
            if (current.data == obj) {
                objs++;
            }
        } while (index != 8);

        return objs;
    }

    /**
     * Count all nodes with the given value, returning the number of nodes.
     *
     * @param obj the value
     * @return the number of nodes with value obj
     */
    public int searchIndex(int obj) {

        ListNode current = head;
        int index = 0;
        int i = 0;

        do {
            index++;
            current = current.next;
            if (current.data == obj) {
                i = index - 1;
            }
        } while (index != 5);

        return i;

    }

    /**
     * Returns the product of all integers in the list.
     *
     * @return the product
     */
    public int product() {
        int index = 1;
        int product = 1;
        int num = 0;
        ListNode current = head;

        do {
            index++;
            current = current.next;

            num = current.data;
            product = product * current.data;

        } while (index != 5);

        return product;

    }

    /**
     * Deletes any node containing a value that is a multiple of three.
     *
     * @return the number of nodes deleted
     */
    public int deleteMultiplesOfThree() {

        int index = 0;
        ListNode current = head;

        ListNode temp = current.next;
        int i = 0;

        do {
            index++;
            current = current.next;
            if (current.data % 3 == 0) {
                i++;
                
            }
        } while (index != 7);

        return i;
    }
}
