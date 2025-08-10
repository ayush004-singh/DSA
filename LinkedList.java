package DSA;
class Node{
    int data;
    Node next;
    public Node(int data){
        this.data=data;
        this.next=null;
    }
// Print List Items
    public static void printList(Node head){
        Node curr = head;
        while(curr!=null){
            System.out.println(curr.data);
            curr=curr.next;
        }

    }

    // Insert in start

    public static Node InsertAtStart(Node head,int val){
        Node curr = new Node(val);
        curr.next=head;
        head=curr;

        return head;
    }

    // Inter at last

    public static Node InsertAtEnd(Node head,int val){
        Node curr = new Node(val);
        Node currNode =head;
        while(currNode.next!=null){
            currNode=currNode.next;
        }
        currNode.next = curr;
        return head;
        
    }

    // Insert At Kth Position k

    public static Node insertAtPosition(Node head, int data, int pos) {
    Node newNode = new Node(data); // Naya node banaya

   
    if (pos == 0) {
        newNode.next = head;
        return newNode;
    }

    Node curr = head;
    int i = 0;

    
    while (curr != null && i < pos - 2) {
        curr = curr.next;
        i++;
    }

    if (curr == null) {
        System.out.println("Invalid position: List is too short.");
        return head; 
    }

    
    newNode.next = curr.next;
    curr.next = newNode;

    return head;
}

// Deletion At Start

public static Node DeleteAtFirst(Node head){
    if(head==null){
        System.out.println("List is empty");
        return head;
    }
    head = head.next;
    return head;
}

// To Delete The Last Node In LinkedList

public static Node DeleteAtLast(Node head){
    if(head ==null ){
        System.out.println("list is empty");
        return head;
    }
    Node curr = head;
    while(curr.next.next!=null){
        curr= curr.next;
    }

    curr.next=null;
    return head;
}

// Delete The Kth Node In LinkedList    

public static Node DeleteAtKthPosition(Node head,int pos){
     if (head == null) {
        System.out.println("List is empty");
        return null;
    }

    if (pos <= 0) {
        System.out.println("Invalid position: " + pos);
        return head;
    }
    Node curr = head;
    int i=0;
    while(curr.next.next!=null||i<pos-2) // pos-2 to get the indexing from 1
    {
        curr = curr.next;
        i++;
    }


    if (curr == null || curr.next == null) {
        System.out.println("Invalid position: " + pos);
        return head;
    }

    curr.next=curr.next.next;
    return head;
}
        //Add Array in Linked List


public static Node addArrya(Node head,int [] arr){
    if(arr.length<1){
        return null;
    }
    Node curr = head;
    arr[0]=curr;
    for(int i=1;i<arr.length;i++){
        curr.next = arr[i];
        curr = curr.next;
    }

    return head;
}


// Check if LinkedList has loop

public boolean hasLoop(Node head) {
    Node slow = head;
    Node fast = head;

    while (fast != null && fast.next != null) {
        slow = slow.next;
        fast = fast.next.next;

        if (slow == fast) return true; // Loop detected
    }

    return false;
}

    // TO Find the Middle of the Linked List

public Node findMiddle(Node head) {
    Node slow = head;
    Node fast = head;

    while (fast != null && fast.next != null) {
        slow = slow.next;       // 1 step
        fast = fast.next.next;  // 2 steps
    }

    return slow;
}

       // Reverse the LinkedList

       public static Node ReverseLinkedList(Node head){
        Node prev =null;
        Node curr = head;
        Node next=null;

        while(curr.next!=null){
            next=curr.next;
            curr.next=prev;
            prev = curr;
            curr = next;
        }

        return prev;
       }
}

// End of LL class
public class LinkedList {

    public static void main(String[] args) {
        

    Node N = new Node(50);

    N.next = new Node(60);

    
        N.next.next= new Node(70);

        
        N = Node.InsertAtEnd(N, 90);

       N = Node.insertAtPosition(N, 25, 3);

       N=Node.DeleteAtFirst(N);

       N=Node.InsertAtStart(N,20);

       N=Node.DeleteAtLast(N);

       N=Node.DeleteAtKthPosition(N, 3);

       N = Node.ReverseLinkedList(N);

        Node.printList(N);

    }
    
}

// End Of Main Class