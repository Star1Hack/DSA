
import java.util.*; 
  
/* 
   LinkedList test Output

 // Java Native LinkedList 
List: [D, B, A, C]
List: [A, C]
 // SinglyLinkedList 
List: D B A C  
List: A C  

*/
public class TestLinkedList { 
  
    public static void main(String args[]) 
    { 
        System.out.println(" // Java Native LinkedList ");

        LinkedList<String> ll = new LinkedList<String>(); 
        ll.addFirst("A"); 
        ll.addFirst("B"); 
        ll.addLast("C"); 
        ll.addFirst("D"); 
  
        System.out.println("List: "+ll); 
  
        ll.removeFirst(); 
        ll.removeFirst(); 
  
        System.out.println("List: "+ll); 
        
        System.out.println(" // SinglyLinkedList ");

        SinglyLinkedList<String> singlyLL = new SinglyLinkedList<>();
        singlyLL.addFirst("A");
        singlyLL.addFirst("B");
        singlyLL.addLast("C");
        singlyLL.addFirst("D");

        System.out.print("List: ");
        singlyLL.printList();       
        System.out.println(" ");

        singlyLL.removeFirst();
        singlyLL.removeFirst();

        System.out.print("List: ");
        singlyLL.printList();   
        System.out.println(" ");    

    } 
} 
