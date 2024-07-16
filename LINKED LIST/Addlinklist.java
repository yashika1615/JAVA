
/*   TIME COMPLEXITIES OF BOTH OPERATIONS WILL TAKE - O(1) LINEAR TIME COMPLEXITIES SINCE THERE ARE
     NO LOOPS INVOLVED OR ANY RECURSION 
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
 * 
 * PRINT THE LINKED LIST - O(N) since every node of the linked list is traversed and printed
 *   (1) base case if head==null print nothing and return
 *  (2) if not tell , then make a new Node named temp and store head in it
 *     Node temp=head; , now linkedlist will be traversed using this temporary node
 * (3) run a while loop till temp gets null while(temp!= null)
 * (4) till then temp isn't null keep printing temps's data and increasing temp or updating the temp
 *     sopln(temp.data+"");
 *    temp= temp.next
 */
import java.util.*;

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
    public static int size;

    // addfirst
    public static void addFirst(int data) {
        Node newNode = new Node(data);
        size++;
        // check if linkedlist is empty or not
        if (head == null) {
            head = tail = newNode;
            return;
        }
        // step2 - newNode next's will point to head
        newNode.next = head;
        // step-3 newNode=head
        head = newNode;
    }

    // add last
    public static void addLast(int data) {
        // create a new Node
        Node newNode = new Node(data);
        size++;
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

    // ADD IN THE MIDDLE
    public static void addMiddle(int idx, int data) {
        // to add at head, directly call addfirst
        if (idx == 0) {
            addFirst(data);
            return;
        }
        Node newNode = new Node(data);
        size++;
        Node temp = head;
        int i = 0;
        while (i < idx - 1) {
            temp = temp.next;
            i++;
        }
        newNode.next = temp.next;
        temp.next = newNode;
    }

    // REMOVE FIRST - REMOVE FIRST NODE MEANS TO REMOVE THE HEAD NODE
    public static int removeFirst() {
        if (size == 0) {
            System.out.println("Linked list is empty");
            return Integer.MIN_VALUE;
        } else if (size == 1) {
            // head and tail are pointing to the same node
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }
        int val = head.data;
        head = head.next;
        size--;
        return val;
    }

    // REMOVE LAST NODE i.e DELETE TAIL NODE
    public static int removeLast() {
        if (size == 0) {
            System.out.println("Linked list is empty");
            return Integer.MIN_VALUE;
        } else if (size == 1) {
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }
        // traverse the linked list till you get the previous of tail node
        // to get the last ndoe index i=size-1
        // so to get the prev of last node i.e second last node index i=size-2;
        Node prev = head;
        for (int i = 0; i < size - 2; i++) {
            prev = prev.next;
        }
        int val = prev.next.data;
        prev.next = null;
        tail = prev;
        size--;
        return val;
    }

    // SEARCH A LINKED LIST ITERATIVELY USING LOOPS
    public static int searchLoop(int key) {
        Node temp = head;
        int i = 0;
        while (temp != null) {
            if (temp.data == key) {
                return i;
            }
            temp = temp.next;
            i++;
        }
        // key not found
        return -1;
    }

    // SEARCH A LINKED LIST RECURSIVELY
    public static int helper(Node head, int key) {
        if (head == null) {
            return -1;
        }
        if (head.data == key) {
            return 0;
        }
        int idx = helper(head.next, key);
        if (idx == -1) {
            return -1;
        }
        return idx + 1;
    }

    public static int searchRecursively(int key) {
        return helper(head, key);
    }

    public static void insertAtanyindex(int idx, int val) {
        // create a new Node
        Node t = new Node(val);
        // initialise temp with head
        Node temp = head;
        // traverse the linked list'
        if (idx == size) {
            addLast(5);
            return;
        } else if (idx == 0) {
            addFirst(1);
            return;
        } else if (idx > size || idx < 0) {
            System.out.println("wrong index");
            return;
        }
        for (int i = 0; i < idx - 1; i++) {
            temp = temp.next;
        }
        t.next = temp.next;
        temp.next = t;
    }

    public static void print() {
        if (head == null) {
            System.out.println("Linked list is empty");
            return;
        }
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        Addlinklist ll = new Addlinklist();

        ll.addFirst(2);
        ll.addFirst(1);
        ll.addLast(3);
        ll.addLast(4);
        ll.addMiddle(2, 9);
        ll.addFirst(7);
        ll.addFirst(8);
        ll.addFirst(5);
        ll.print();
        // System.out.println(ll.size);
        // System.out.println(ll.searchLoop(1));
        // System.out.println(ll.searchLoop(10));
        System.out.println(ll.searchRecursively(3));
        System.out.println(ll.searchRecursively(10));
        ll.insertAtanyindex(6, 6);
        ll.print();
    }
}
