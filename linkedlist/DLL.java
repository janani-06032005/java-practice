package DoublyLL;

//in doubly linked list need to concentrate only on insertion part ... deletion is almost same as the singly linked list
public class DLL {
    private Node head;
    private int size;

//insert at the beginning
    public void insertFirst(int val){
        Node node = new Node(val);

        node.next = head;
        node.prev = null;
        if(head != null){
            head.prev = node;
        }
        head = node;
    }

// displaying the elements
    public void display(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.value +" ->");
            temp = temp.next;
        }
        System.out.print("END");
        System.out.println();

    }

//insert at the end
    public void insertEnd(int val){
        Node node = new Node(val);
        Node last= head;
        node.next =null;
        if(head == null){
            node.prev = null;
            head = node;
            return;
        }

        while(last.next != null){
            last=last.next;
        }
        last.next=node;
        node.prev=last;
        return;

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

//    finding a particular value is present in the linked list
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


//inserting after a particular value in the linkedlist
    public void insertafval(int val,int element){
        Node node = new Node(element);
        Node temp =head;
        if (head == null) {
            System.out.println("The list is empty.");
            return;
        }
        if(find(val)==-1){
            System.out.println("the value doesnot exists ");
        }
        while(temp.value != val){
            temp = temp.next;
        }
        temp.next.prev=node;
        node.next =temp.next;
        temp.next=node;
        node.prev=temp;
        return;
    }



//defining the class node
    public class Node{
        private int value;
        private Node next;
        private Node prev;

        public Node(int value){
            this.value = value;
        }
        public Node(int value,Node next,Node prev){
            this.value = value;
            this.next = next;
            this.prev = prev;
        }

    }
}
