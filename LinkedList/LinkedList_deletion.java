package LinkedList;

public class LinkedList_deletion {
    Node head;
    public static class Node {
        int data;
        Node next;

        Node(int d){
            this.data = d;
            this.next = null;
        }
    }

    public void insert(LinkedList_deletion lld, int d){
        Node new_node = new Node(d);
        new_node.next = null;

        if(lld.head == null){
            lld.head = new_node;
        }else{
            Node last = lld.head;
            while(last.next != null){
                last = last.next;
            }
            last.next = new_node;
        }
    }

    public void printlist(LinkedList_deletion lld){
        Node n = lld.head;
        while(n != null){
            System.out.println(n.data);
            n = n.next;
        }
    }


    /* Tricky points -
    *   a. prev initialized with head
    *   b. Processing of elements
    * */
    public void deleteByKey(LinkedList_deletion lld, int key){
        Node currNode = lld.head,prev = null;

        // Case 1: When key is in head
        if(currNode != null && currNode.data == key){
            lld.head = currNode.next;
            System.out.println("Found and deleted");
        }

        //Case 2: Traverse and find the key
        while(currNode != null && currNode.data != key){
            prev = currNode;
            currNode = currNode.next;
        }

        if(currNode != null){
            prev.next = currNode.next;
            System.out.println("Deleted while traversing");
        }

        // Case 3 : When key not found.
        if(currNode == null){
            System.out.println("Key not found");
        }
    }

    public static void main(String[] args) {
        LinkedList_deletion lld = new LinkedList_deletion();

        lld.insert(lld, 1);
        lld.insert(lld, 10);
        lld.insert(lld, 100);
        lld.insert(lld, 1000);

        lld.printlist(lld);

        lld.deleteByKey(lld, 10);

        lld.printlist(lld);
    }
}
