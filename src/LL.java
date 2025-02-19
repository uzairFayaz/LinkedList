public class LL {
    private Node head;
    private Node tail;
    private int size;

    public LL() {
        this.size = size;
    }

    public void inserFirst(int val){
        Node node = new Node(val);
        node.next = head;
        head=node;
        if(tail == null){
            tail = head;
        }
        size +=1;

    }
    public void display(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.value +"--->");
            temp = temp.next;
        }
        System.out.println("End");
    }
    public int deleteFirst(){
        int val = head.value;
        head = head.next;
        if(head == null){
            head = tail;
        }
        size--;
        return val;
    }
    public int deleteLast(){
        if (size <= 1) {
            return deleteFirst();
        }
        Node secondlast = get(size - 2);
        int val = secondlast.value;
        tail = secondlast;
        tail.next = null;
        return val;
    }
    public Node get(int index){
        Node node = head;
        for (int i = 1; i <index ; i++) {
            node = node.next;

        }
        return node;
    }
    public int delete(int index){
        if(index == 0){
            return deleteFirst();
        }
        if(index == size -1){
            return deleteLast();
        }
        Node prev = get(index -1);
        int val = prev.next.value;
        prev.next= prev.next.next;
        return val;
    }

    public class Node{
        private int value;
        private Node next;

        public Node(int value) {
            this.value = value;
        }
        public Node(int value, Node next){
            this.value = value;
            this.next = next;
        }
    }
}
