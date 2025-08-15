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

    public static Node InsertAtTheStart(Node head, int val) {
    Node newNode = new Node(val);

    if (head == null) {
        return newNode;
    }

    newNode.next = head;
    head.prev = newNode;

    return newNode; // New node becomes head
}

public static Node InsertAtTheKthPos(Node head,int val,int pos){
    Node newNode = new Node(val);
    if(head==null||pos<1){
       return InsertAtTheStart(head, val);
    }
    Node curr=head;
    int i=1;
    while(curr!=null&&i<pos-1){
        curr=curr.next;
        i+=1;
    }

    if(curr==null||curr.next==null){
        return InsertAtTheEnd(head, val);
    }

    Node nextNode = curr.next;
    curr.next = newNode;
    newNode.prev = curr;

    newNode.next = nextNode;
    nextNode.prev = newNode;

    return head;

}


public static Node DeleteAtTheKthPosition(Node head,int pos){
        if (head == null || pos < 1) return head;
    Node curr =head;
    for(int i=1;i<pos;i++){
        curr=curr.next;
    }

    if(head==curr){
        head=head.next;

        if(head!=null) head.prev=null;
    }
                 else{
            curr.prev.next = curr.next;
            if(curr.next!=null) curr.next.prev=curr.prev;
        

    }
    return head;
}

public static Node ReverseList(Node head){
     if (head == null || head.next == null) return head;

     Node curr=head;
     Node Newhead=head;
     Node temp =null;
     while(curr!=null){
        temp = curr.prev;
        curr.prev = curr.next;
        curr.next=temp;
        Newhead = curr;
        curr = curr.prev;

     }

     return Newhead;

}
}


// end of Node class
public class Doubly_Linked_List {
    public static void main(String[] args) {
        
   
    Node N = new Node(21);
    N = Node.InsertAtTheEnd(N, 30);
    N = Node.InsertAtTheStart(N, 60);
    N= Node.InsertAtTheKthPos(N, 45, 1);
    Node.PrintList(N);
 }
    
}
