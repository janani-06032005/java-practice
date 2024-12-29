package DoublyLL;

public class MainD {
    public static void main(String [] args){
        DLL list = new DLL();

        list.insertFirst(1);
        list.insertFirst(2);
        list.insertFirst(3);
        list.insertFirst(4);
        list.insertFirst(5);
        list.display();
        list.insertEnd(6);
        list.display();
        list.insert(3,3);
        list.display();
        list.insertafval(4,2);
        list.display();



    }
}
