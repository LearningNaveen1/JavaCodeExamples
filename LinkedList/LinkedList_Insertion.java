package LinkedList;

public class LinkedList_Insertion {
    Node head;

    public static class Node{
        int data;
        Node next;

        Node(int d){
            this.data = d;
            this.next = null;
        }
    }

    public void insert(LinkedList_Insertion lli, int d){
        Node new_node = new Node(d);
        new_node.next = null;

        if (lli.head == null) {
            lli.head = new_node;
        }else{
            Node last = lli.head;
            while(last.next != null){
                last = last.next;
            }
            last.next = new_node;
        }
    }

    public void printlist(LinkedList_Insertion lli){
        Node n = lli.head;
        while (n != null){
            System.out.println(n.data);
            n = n.next;
        }
    }

    public static void main(String[] args) {
        LinkedList_Insertion lli = new LinkedList_Insertion();
        lli.insert(lli, 1);
        lli.insert(lli, 10);
        lli.insert(lli, 100);
        lli.insert(lli, 1000);

        lli.printlist(lli);
    }

}
