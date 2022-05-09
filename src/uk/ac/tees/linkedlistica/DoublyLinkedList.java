package uk.ac.tees.linkedlistica;

/**
 * Represents a singly linked list.
 *
 * @author Your Name (X0000000@tees.ac.uk)
 * @author Annalisa Occhipinti (a.occhipinti@tees.ac.uk)
 */
public class DoublyLinkedList {

    /**
     * Stores the first node in the list.
     */
    public DoublyLinkedListNode head;

    /**
     * Creates a new doubly linked list from an existing array.
     *
     * @param data the array to create the new linked list from
     */
    public DoublyLinkedList(int[] data) {

        // DO NOT MODIFY THIS CONSTRUCTOR.
        for (int i = data.length - 1; i >= 0; i--) {
            DoublyLinkedListNode n = new DoublyLinkedListNode(data[i], head,
                    null);
            if (head != null) {
                head.prev = n;
            }
            head = n;
        }
    }

    /**
     * Gets the length of the doubly linked list.
     *
     * @return the length
     */
    public int getSize() {
        DoublyLinkedListNode current = head;
        int size = 0;

        while (current != null) {
            current = current.next;
            size++;
        }

        return size;
    }

    /**
     * Gets the last item in the doubly linked list, or -999 if not found.
     *
     * @return the last item, or -999 if empty
     */
    public int getLast() {

        if (head == null) {
            return 999;
        }

        DoublyLinkedListNode current = head;

        while (current.next != null) {
            current = current.next;
        }
        return current.data;
    }

    /**
     * Deletes all nodes with the given value, returning the number of nodes
     * deleted.
     *
     * @param obj the value
     * @return the number of nodes deleted
     */
    public int deleteAllNodesWithValue(int obj) {
//        head.next = toDel.next;
//        if (head.next != null) {
//            head.next.prev = head;
//        }
//        toDel.next = null;
//        toDel.prev = null;
        int rlt = 0;

        if (head == null) {
            return 0;
        }

        DoublyLinkedListNode current = head;
        DoublyLinkedListNode toDel = current.next;
        
        while (current.next != null) {
            if (current.next.data == obj) {
                
                
                rlt++;
            }
        }

        return rlt;
    }

    /**
     * Deletes the node in the list at the specified index.
     *
     * @param index the index
     * @return true if successful, otherwise false
     */
    public boolean deleteAtPos(int index) {

        DoublyLinkedListNode current = head;
        int count = 0;

        while (current.next != null) {
            count++;
            if (count == index) {
                current.next = current.next.next;
                current = current.next;
                current.prev = current.prev.prev;
                return true;
            } else {
                return false;
            }
        }
        return false;
    }

    /**
     * Count the number of even nodes in the list.
     *
     * @return number of even nodes
     */
    public int evenNodes() {

        DoublyLinkedListNode current = head;
        int even = 0;

        while (current != null) {
            if (current.data % 2 == 0) {
                even++;
            }
            current = current.next;
        }
        return even;
    }

    /**
     * Delete second node in the list
     *
     * @return true if successful, false if there is no second node in the list
     */
    public boolean deleteSecond() {

        if (head == null) {
            return false;
        }

        DoublyLinkedListNode toDel = head.next;
        if (toDel == null) {
            return false;
        }

        head.next = toDel.next;
        if (head.next != null) {
            head.next.prev = head;
        }
        toDel.next = null;
        toDel.prev = null;
        return true;
    }

    /**
     * Adds an item to the end of the list.
     *
     * @param obj the item
     * @return true if successful, false if there is no
     */
    public boolean addSecondLast(int obj) {

        DoublyLinkedListNode current = head;
        DoublyLinkedListNode newNode = new DoublyLinkedListNode();
        DoublyLinkedListNode newDataNode = new DoublyLinkedListNode(obj);

        while (current.next != null) {
            current = current.next;
            if (current.next == null) {
                current.next = newNode;
                newNode.data = current.data;
                current.data = newDataNode.data;

                return true;
            }
        }

        return false;
    }

    @Override
    public String toString() {
        String rlt = "";
        DoublyLinkedListNode curr = head;
        while (curr != null) {
            rlt += curr.data + ", ";
            curr = curr.next;
        }
        return rlt;
    }
}
