package uk.ac.tees.linkedlistica;

/**
 * The project main class (intentionally empty).
 *
 * @author Shane Robertson (B1106857@tees.ac.uk)
 * @author Saul Johnson (saul.johnson@tees.ac.uk)
 * @author Annalisa Occhipinti (a.occhipinti@tees.ac.uk)
 * @since 23/01/2020
 */
public class LinkedListICA {

    /**
     * The entry point for your program.
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /* This main method is intentionally left blank. You should test your
         * code using the unit tests provided, and/or write your own if you're
         * feeling up to it. You may also write code here to test your ADTs.
         */
        DoublyLinkedList instance = new DoublyLinkedList(new int[] {3,5,6,7,8,9,11});
        
        System.out.println(instance.toString());
        
        System.out.println(instance.deleteAtPos(1));
        
        System.out.println(instance.toString());
        
    }
}
