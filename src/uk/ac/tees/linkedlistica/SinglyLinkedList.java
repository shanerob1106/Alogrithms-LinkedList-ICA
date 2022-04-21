package uk.ac.tees.linkedlistica;

/**
 * Represents a singly linked list.
 *
 * @author Your Name (X0000000@tees.ac.uk)
 * @author Annalisa Occhipinti (a.occhipinti@tees.ac.uk)
 */
public class SinglyLinkedList {

    /**
     * Stores the first node in the list.
     */
    public ListNode head;

    /**
     * Creates a new singly linked list from an existing array.
     *
     * @param data the array to create the new linked list from
     */
    public SinglyLinkedList(int[] data) {

        // DO NOT MODIFY THIS CONSTRUCTOR.
        // Populate list.
        for (int i = data.length - 1; i >= 0; i--) {
            head = new ListNode(data[i], head);
        }
    }

    /**
     * Creates a new, empty singly linked list.
     */
    public SinglyLinkedList() {

        // DO NOT MODIFY THIS CONSTRUCTOR.
        this(new int[]{});
    }

    /**
     * Adds an item at the front of the list.
     *
     * @param value the item to add
     */
    public void addFirst(int value) {

        ListNode node = new ListNode(value, head);
        head = node;

    }
    //}

    /**
     * Gets the item at the specified index in the list.
     *
     * @param index the index
     * @return the item, or -999 if not found
     */
    public int getAtPos(int index) {

        ListNode temp = head;
        int count = 0;
        while (temp != null) {
            if (count == index) {
                return temp.data;
            }
            count++;
            temp = temp.next;
        }
        if (count != index) {
            return 999;
        }

        return 0;

    }

    /**
     * Count all nodes with the given value, returning the number of nodes.
     *
     * @param obj the value
     * @return the number of nodes with value obj
     */
    public int countNodesWithValue(int obj) {
        while (head.data != obj) {
            head = head.next;
            if (head.data == obj) {
                return head.data;
            }
            if (head.data != obj) {
                return 0;
            }
        }
        return 0;

    }

    /**
     * Gets the last item in the circular linked list, or -999 if not found.
     *
     * @return the last item, or -999 if empty
     */
    public int getLast() {
        if (head == null) {
            return 999;
        }
        ListNode idx = head;
        while (idx.next != null) {
            idx = idx.next;
        }
        return idx.data;

    }

    /**
     * Adds a piece of data at the specified index.
     *
     * @param obj the data
     * @param index the index
     * @return true on successful insert, otherwise false
     */
    public boolean addAtPos(int obj, int index) {
        
        ListNode node = new ListNode();
        node.data = obj;
        node.next = null;
        
        if(this.head == null){
            if (index != 0){
                return false;
            }else{
                this.head = null;
            }
        }
        
        if(head != null && index == 0){
            node.next = this.head;
            this.head = node;
            return false;
        }
        
        ListNode current = this.head;
        ListNode previous = null;
        
        int i = 0;
        
        while(i< index){
            previous = current;
            current = current.next;
            
            if(current == null){
                return false;
            }
            i++;
        }
        node.next = current;
        previous.next = node;
        return true;
    }
    /**
     * Appends a singly linked list to this circular linked list.
     *
     * @param list the singly linked list to append
     * 
     * NEEDS COMPLETING 
     * 
     */
    public void appendSinglyLinkedList(SinglyLinkedList list) {
        
        ListNode newNode = new ListNode();
        
        int[] value = new int[] {1,3,5};
        
        ListNode last = head;
        
        while (last != null){
            last = last.next;
            if(last == null){
                last.next = newNode;
            }
            
            
        }
    }
    
    
    /**
     * Returns the sum of all integers in the list.
     *
     * @return the sum
     */
    public int sum() {
        int total = head.data;
        
        ListNode last = head;
        
        while(last.next != null){
            last = last.next;
            total += last.data;
        }
        
        return total;
    }
}
