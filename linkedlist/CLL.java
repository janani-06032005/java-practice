package CircularLL;


public class CLL {
    private int value;
    private Node head = null;
    private Node tail = null;
    private int size=0;


//inserting node at the beginning
public void insertFront(int val){
    Node node = new Node(val);
    if(head == null){
        head = node;
        tail = node;
        return;
    }
    tail.next = node;
    node.next = head;
    head=node;
    size++;
}

//displaying the linkedlist
public void display(){
    Node temp=head;
    if(head != null){
        do{
            System.out.print(temp.value + "->");
            temp = temp.next;
        }while(temp != head);
        System.out.println();
    }
}


//inserting at the end of circularlinkedlist
public void insertEnd(int value){
    Node node = new Node(value);
    if(head ==null){
        insertFront(value);
        return;
    }
    tail.next = node;
    node.next=head;
    tail=node;
    size++;
    return;
}


//delete the front element
public int deleteFront(){
    int value = head.value;
    head=head.next;
    tail.next=head;
    size--;
    return value;
}


//    to get the node at particular index
public Node get(int index){
    Node node = head;
    for(int i=0;i<index;i++){
        node = node.next;
    }
    return node;
}


//deleetion at end
public int deleteEnd(){
    Node secondlast = get(size-2);
    int val = tail.value;
    tail = secondlast;
    tail.next=head;
    return val;
}


//find whether the value is present in the circularlinkedlist
public int find(int val) {
    Node node = head; // Start from the head of the list
    int index = 0; // Initialize the index counter

    while (node != null) {
        if (node.value == val) {
            return index; // Return the index when the value is found
        }
        node = node.next; // Move to the next node
        index++; // Increment the index
    }

    return -1; // Return -1 if the value is not found in the list
}


//delete a particular value in circular linked list
public void deleteval(int value){
    if(find(value)==-1){
        System.out.println("the element is not found");
    }
    Node temp=head;
    Node prevtemp = null;

    while(temp.value != value){
        prevtemp = temp;
        temp=temp.next;
    }
    prevtemp.next =temp.next;
    return;

}

//defining the class node
public class Node{
    int value;
    Node next;

    private Node(int value){
        this.value=value;
    }
    private Node(int value,Node next){
        this.value = value;
        this.next = next;
    }
}
}
