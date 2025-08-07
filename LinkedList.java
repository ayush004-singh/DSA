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
}
public class LinkedList {
    public static void main(String[] args) {
        

    Node N = new Node(50);
    N.next = new Node(60);
        N.next.next= new Node(70);

        
        N=Node.InsertAtStart(N,20);
        Node.printList(N);
    }
    
}
