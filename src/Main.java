//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        LL list = new LL();
        list.inserFirst(1);
        list.inserFirst(3);
        list.inserFirst(5);
        list.inserFirst(7);
        list.display();
        System.out.println(list.deleteFirst());
        list.display();
        System.out.println(list.deleteLast());
        list.display();
        list.inserFirst(2);
        list.inserFirst(5);
        list.inserFirst(3);
        list.inserFirst(9);
        list.display();
        System.out.println(list.delete(4));
        list.display();


    }
    }