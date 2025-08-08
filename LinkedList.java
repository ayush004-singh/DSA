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

}// End of LL class
public class LinkedList {
    public static void main(String[] args) {
        

    Node N = new Node(50);
    N.next = new Node(60);
        N.next.next= new Node(70);

        
        N = Node.InsertAtEnd(N, 90);
       N = Node.insertAtPosition(N, 25, 3);
       N=Node.DeleteAtFirst(N);
       N=Node.InsertAtStart(N,20);
        Node.printList(N);

    }
    
}
