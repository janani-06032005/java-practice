package LinkedList;

public class SLL {
    private  Node head;
    private  Node tail;
    private int size;

    public SLL(){
        this.size = 0;
    }
//    inserting a node in existing linkedlist
    public void insertFirst(int val){
        Node node = new Node(val);
        node.next = head;
        head = node;
//inserting a firstnode
        if(tail == null){
            tail = head;
        }
        size += 1;
    }


// displaying a elements in linked list
    public void display(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.value +" ->");
            temp = temp.next;
        }
        System.out.print("END");

    }

//    inserting the node at the end
    public void insertEnd(int val){
        if(tail == null){
            insertFirst(val);
            return ;
        }
        Node node = new Node(val);
        tail.next = node;
        tail =node;
        System.out.println();
        size +=1;
    }


//    inserting a node at the middle of an existing linked list
    public void insert(int val,int index){
        if(index==0){
            insertFirst(val);
            return;
        }else if(index == size){
            insertEnd(val);
            return ;
        }else{
            Node node = new Node(val);
            Node temp = head;
            for(int i =1;i<index;i++){
                temp = temp.next;
            }
            node.next = temp.next;
            temp.next = node;
            System.out.println();
        }
    }


//    delete the first node
    public int deleteFirst(){
        int val = head.value;
        head = head.next;
        if (head == null){
            tail=null;
        }
        size--;
        System.out.println();
        return val;
    }


//    delete the last node
    public int deleteLast(){
        if(size <1){
            return deleteFirst();
        }
        Node SecondLast = get(size-2);
        int val = tail.value;
        System.out.println();
        tail = SecondLast;
        tail.next = null;
        size--;
        return val;
    }

//    to get the node at particular index
    public Node get(int index){
        Node node = head;
        for(int i=0;i<index;i++){
            node = node.next;
        }
        return node;
    }

//    to delete the node at the middle
    public int delete(int index){
        if(size<1){
            return deleteFirst();
        }else if(index==size){
            return deleteLast();
        }else{
            Node prev = get(index-1);
            int val = prev.next.value;
            prev.next = prev.next.next;
            size--;
            return val;
        }
    }

//    to find the index of the value given in the existing linked list
    public int find(int val) {
        Node node = head; // Start from the head of the list
        int index = 0; // Initialize the index counter

        while (node != null) {
            if (node.value == val) {
                System.out.println();
                return index; // Return the index when the value is found
            }
            node = node.next; // Move to the next node
            index++; // Increment the index
        }
        System.out.println();
        return -1;
    }

//    this class could be the user defined datatype for node

    private class Node{
        int value;
        Node next;

        public Node(int value){
            this.value = value;
        }

        public Node(int value,Node next){
            this.value = value;
            this.next = next;
        }
    }
}
