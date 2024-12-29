package CircularLL;

public class Main {
    public static void main(String [] args){
        CLL list = new CLL();
        list.insertFront(7);
        list.insertFront(8);
        list.insertFront(6);
        list.insertFront(4);
        list.insertFront(3);
        list.display();
        list.insertEnd(2);
        list.display();
        System.out.println(list.deleteFront());
        list.display();
        System.out.println(list.deleteEnd());
        list.display();
        list.deleteval(6);
        list.display();




    }
}
