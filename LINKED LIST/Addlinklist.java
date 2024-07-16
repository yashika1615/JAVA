
/*   TIME COMPLEXITIES OF BOTH OPERATIONS WILL TAKE - O(1) LINEAR TIME COMPLEXITIES SINCE THERE ARE
     NO LOOPS INVOLVED
    
 * ADDFIRST
 *   (1)- create a newNode
 *     Node newNode= new Node(data);
 *   (2)base case check
 *      check if the linkedlist is empty if yes, then both
 *     head and tail will point to newNode
 *   if(head==null) head=tail=newNode return;
 *   (3) head's next will now point to the newNode  head.next=newNode
 *   (4) now newNode will be head  head=newNode
 * 
 *   ADD LAST
 * (1) create a new Node  Node newNode= newNode(data);
 * (2) check if the linkedlist is empty if yes, then both
 *     head and tail will point to newNode 
 *    if(head==null) head=tail=newNode return;
 * (3) now tail's next will now point to new node    tail.next=newNode
 * (4) now that newNode will be tail      tail=newNode
 */
import java.util.LinkedList;

public class Addlinklist {
    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;

    // addfirst
    public static void addFirst(int data) {
        Node newNode = new Node(data);
        // check if linkedlist is empty or not
        if (head == null) {
            head = tail = newNode;
            return;
        }
        // step2 - newNode next's will point to head
        newNode.next = head;
        // step-3 newNode=head
        newNode = head;
    }

    // add last
    public static void addLast(int data) {
        // create a new Node
        Node newNode = new Node(data);
        // check if ll is empty and bydefault we only check by head , so if it is null
        // then both head and tail will point to newNode
        if (head == null) {
            head = tail = newNode;
            return;
        }
        // now point tails'next to new Node
        tail.next = newNode;
        // make the newNode as tail and by deafult this newNode will point to null.
        tail = newNode;
    }

    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.addFirst(1);
        ll.addFirst(2);
        ll.addLast(3);
        ll.addLast(4);
    }
}
