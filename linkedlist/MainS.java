package LinkedList;

public class MainS {
    public static void main(String [] args){
        SLL list = new SLL();
        list. insertFirst(3);
        list. insertFirst(4);
        list. insertFirst(5);
        list. insertFirst(6);

//        list.display();
//        list.insertEnd(7);
//        list.display();
//        list.insert(4,3);
//        list.display();
//        System.out.println(list.deleteFirst());
//        list.display();
//        System.out.println(list.deleteLast());
//        list.display();
//        System.out.println(list.delete(2));
        list.display();
        System.out.println(list.find(4));

    }
}
