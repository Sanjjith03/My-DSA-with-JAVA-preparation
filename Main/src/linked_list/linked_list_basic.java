package linked_list;
import java.util.*;
class node{
  int value;
  node next;

};

public class linked_list_basic {
    public static void main(String[] args) {
        node head = new node();
        node curr = new node();
        head.value= 10;
        node temp=head;
        while(temp.next!=null){
            temp = temp.next;
        }
        System.out.println(temp.value);
        temp.next = curr;
        while (head.next!=null){
            System.out.println(head.value);
            head = head.next;
        }
    }
}
