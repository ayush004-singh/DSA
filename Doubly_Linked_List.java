class Node {
    int data;
    Node next;
    Node prev;

    public Node(int data){
        this.data= data;
        this.next=null;
        this.prev = null;
    }

    public static void PrintList(Node head){
        if(head==null){
            System.out.println("The List is empty");
            return;
        }

        Node curr = head;
        while(curr!=null){
            System.out.println(curr.data);
            curr=curr.next;
        }
        System.out.println();
    }

    public static Node InsertAtTheEnd(Node head,int val){
        Node NewNode = new Node(val);
        if(head==null){
            return NewNode;
        }

        Node curr=head;
        while(curr.next!=null){
            curr=curr.next;

        }

        curr.next=NewNode;
        NewNode.prev = curr;



        return head;
    }
}
// end of Node class
public class Doubly_Linked_List {
    public static void main(String[] args) {
        
   
    Node N = new Node(21);
    N = Node.InsertAtTheEnd(N, 30);
    Node.PrintList(N);
 }
    
}
