import java.util.*;

public class CircularLinkedList{
    HashMap hp=new HashMap();
    public Node check(Node n){

      for(int i=0;i<n.size;i++){
      	if(hp.containsKey(n.find(i))) return n.find(i);
      	else  hp.put(n.find(i),"unique");

      }


      Set<Node> s=hp.keySet();
      Iterator<Node> it=s.iterator();
      while(it.hasNext()){
      	 System.out.println(it.next().data);
      }

       return null;

    }





	public static void main(String args[]){

     Node n1=new Node("A");
     Node n2=new Node("B");
     Node n3=new Node("C");
     Node n4=new Node("D");
     Node n5=new Node("E");

     n1.addTail(n2);
     n1.addTail(n3);
     n1.addTail(n4);
     n1.addTail(n5);
     n1.addTail(n3);
     System.out.print("size"+n1.size);
     CircularLinkedList cc=new CircularLinkedList();
     Node c=cc.check(n1);
     //if(c==null) System.out.println("hello null");
     System.out.println((String)c.data);

	}
}