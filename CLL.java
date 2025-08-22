public class CLL {
    

class Node {
    int data;
    Node next;
    public Node(int data){
        this.data=data;
        this.next=null;
    }
}
    Node head=null ;
    Node tail=null;

// Inserting At the starting 

public void InsertAtStart(int value){
    Node newNode = new Node(value);
    if(head==null){
        head=newNode;
        tail = newNode;
        newNode.next=head;
    }

    else{
        newNode.next=head;
        head=newNode;
        tail.next=head;
    }
}


// Insert At the ending

    public void InsertAtEnd(int value){
        Node newNode = new Node(value);

        if(head==null){
            head=newNode;
            tail =newNode;
            newNode.next = head;
        }

        else{
            tail.next = newNode;
            tail=newNode;
            tail.next=head;

        }
    }

// Inserting at the Kth position 

public void insertAtPosition(int val,int pos){
    Node newNode = new Node(val);
    if(pos==1){
        InsertAtStart(val);
    }

    int count =1;
    Node curr = head;
    while(count<pos-1&&curr.next!=null){
        count++;
        curr=curr.next;
    }

    newNode.next=curr.next;
    curr.next=newNode;

     
    
}

// Deletion From start
public void Dletionfromstart(){
    if(head==null){
        System.out.println("List is empty");
        return ;
    }

    if(head==tail){
        head=tail=null;
    }

  else{
    head=head.next;
    tail.next=head;
  }  
}


// Deletion from the end

public void DeletionFromEnd(){
    if(head==null){
        System.out.println("List is empty");
        return;

    }

    if(head==tail){
        head=tail=null;
    }

    else{
        Node curr = head;

        while(curr.next!=null){
            curr=curr.next;
        }

        tail=curr;
        tail.next = head;
    }
}

// Deletion of node by value

public void DeleteByValue(int value) {
    if (head == null) {
        System.out.println("List is empty");
        return;
    }

    if (head == tail && head.data == value) {
        head = tail = null;
        return;
    }

    if (head.data == value) {
        head = head.next;
        tail.next = head;
        return;
    }

    Node curr = head;
    while (curr.next != head && curr.next.data != value) {
        curr = curr.next;
    }

    if (curr.next.data == value) {
        if (curr.next == tail) {
            tail = curr;
        }
        curr.next = curr.next.next;
    } else {
        System.out.println("Value not found");
    }
}


// Printing the data of the list

    public void PrintList(){
        if(head == null){
            System.out.println("The list is empty");
            return;
        }

        Node curr = head;

        do{
            System.out.println(curr.data);
            curr=curr.next;
        }
        while(curr!=head);

            System.out.println();
        
    }

    public static void main(String[] args) {
        CLL li = new CLL();


        li.InsertAtEnd(12);
        li.InsertAtEnd(24);
        li.InsertAtEnd(36);
        li.InsertAtEnd(48);


        li.InsertAtStart(60);
        li.insertAtPosition(13, 3);

        System.out.print("List :");
        li.PrintList();

    }
}

    

