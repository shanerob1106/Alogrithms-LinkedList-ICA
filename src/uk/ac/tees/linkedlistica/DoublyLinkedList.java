package uk.ac.tees.linkedlistica;

/**
 * Represents a singly linked list.
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
     * @param data  the array to create the new linked list from
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
     * @return  the length
     */
    //public int getSize() {
    //}
    
    /**
     * Gets the last item in the doubly linked list, or -999 if not found.
     * @return  the last item, or -999 if empty
     */
    //public int getLast() {
    
    //}
    
    /**
     * Deletes all nodes with the given value, returning the number of nodes
     * deleted.
     * @param obj   the value
     * @return      the number of nodes deleted
     */
    //public int deleteAllNodesWithValue(int obj) {
       
    //}
    
    /**
     * Deletes the node in the list at the specified index.
     * @param index the index
     * @return      true if successful, otherwise false
     */
    //public boolean deleteAtPos(int index) {
    //}
    
     /**
     * Count the number of even nodes in the list.
     * @return number of even nodes
     */
    //public int evenNodes(){  
    //}
    
      /**
     * Delete second node in the list
     * @return true if successful, false if there is no second node in the list
     */
    //public boolean deleteSecond(){              
   // }
    
    
    
    /**
     * Adds an item to the end of the list.
     * @param obj   the item
     */
    //public boolean addSecondLast(int obj) {   
    //}
    
}
