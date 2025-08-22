public class DCLL {
     class Node{
        int data;
        Node next;
        Node prev;

        public Node(int data){
            this.data=data;
            this.next=null;
            this.prev=null;
        }


     }

     Node head=null;
     Node tail=null;


     // Isertion at the end

     public void InsertAtEnd(int value){
        Node newNode = new Node(value);
        if(head==null){
            head=newNode;
            tail=newNode;
            head.next=head;
            head.prev = head;
        }

        else{
            tail.next=newNode;
            newNode.prev=tail;
            newNode.next=head;
            head.prev = newNode;
            tail=newNode;
        }
 }


 public void InsertAtStart(int value){
    Node newNode = new Node(value);

    if(head==null){
        head=newNode;
        tail=newNode;
        head.next =head;
        head.prev= head;


    }
    else{
        newNode.next = head;
        newNode.prev=tail;
        head.prev=newNode;
        tail.next=newNode;
        head=newNode;
    }
 }

public void insertAtPosition(int value,int pos){
    Node newNode = new Node(value);
    if(head==null&&pos==1){
        head=newNode;
        tail=newNode;
        head.next=head;
        head.prev=head;
    }

    if(pos==1){
        InsertAtStart(value);
        return;
    }

    Node curr=head;
    int count=1;
    while(count<pos-1&&curr.next!=head){
        curr =curr.next;
        count++;
    }

    if(curr.next==head){
        InsertAtEnd(value);
        return;
    }

    else{
        Node nextNode=curr.next;
        curr.next=newNode;
        newNode.prev=curr;
        newNode.next=nextNode;
        nextNode.prev=newNode;
    }
}


public void DeletionFromEnd(){
    if(head==null){
        System.out.println("List is empty");
        return;
    }
    if(head==tail){
        head=tail=null;
        return;
    }

    Node curr = head;
    while(curr.next!=head){
        curr=curr.next;
    }

    Node prevNode = curr.prev;
    head.prev=prevNode;
    prevNode.next=head;
    tail=prevNode;
}

public void DeleteFromstart(){
    if(head==null){
        System.out.println("List is empty");
        return;
    }

    if(head==tail){
        head=tail=null;
    }

    else{
        head=head.next ;
        head.prev=tail;
        tail.next=head;
    }
}

public void DeleteFromkthposint(int pos){
if(head==null){
    System.out.println("list is empty");
    return;
}
if(pos==1){
DeleteFromstart();
    return;
}

Node curr=head;
int count =1;

while(count!=pos-1&&curr.next!=head){
    curr=curr.next;
    count++;

}
 if(count != pos - 1 || curr.next == head){
        System.out.println("Invalid position");
        return;
    }

if(curr.next==head){
    DeletionFromEnd();
    return;
}

else{
Node NodetoDelete = curr.next;
Node NodeTochange =NodetoDelete.next;

curr.next=NodeTochange;
NodeTochange.prev=curr;
}
}
 public void PrintList(){
          
            if(head==null){
                System.out.println("List is empty");
                return;
            }
      
    Node curr = head;
    do {
        System.out.println(curr.data + " ");
        curr = curr.next;
    } while (curr != head);

    System.out.println(); // for clean output
}
        

     public static void main(String[] args) {
        DCLL li = new DCLL();
        li.InsertAtStart(5);
        li.InsertAtEnd(10);
        li.InsertAtEnd(20);
        li.InsertAtEnd(30);
        li.insertAtPosition(23, 2);

        li.PrintList();
     }
}
