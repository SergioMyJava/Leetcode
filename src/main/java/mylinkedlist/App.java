package mylinkedlist;

public class App {
    public static void main(String[] args){
        MyLinkedList test = new MyLinkedList() ;
        test.addAtHead(4);
        test.addAtHead(5);
        test.addAtHead(6);
        test.addAtTail(3);
        test.addAtTail(2);
        test.addAtTail(1);
        System.out.println(test.get(1));
        System.out.println(test.get(2));
        System.out.println(test.get(3));
        System.out.println(test.get(4));
        System.out.println(test.get(5));
        System.out.println(test.get(6));
        System.out.println("111111111111");
        test.addAtIndex(4,45);
        System.out.println(test.get(1));
        System.out.println(test.get(2));
        System.out.println(test.get(3));
        System.out.println(test.get(4));
        System.out.println(test.get(5));
        System.out.println(test.get(6));
        System.out.println(test.get(7));
        System.out.println(test.get(8));

        test.deleteAtIndex(4);
        System.out.println(test.get(1));
        System.out.println(test.get(2));
        System.out.println(test.get(3));
        System.out.println(test.get(4));
        System.out.println(test.get(5));
        System.out.println(test.get(6));
        System.out.println(test.get(7));
    }
}
