import java.util.*;

public class Node{

  Node next=null;
  int data;
  public Node(int d){
   data =d;

  }


  public Node next(Node node ){
      if(node.next==null){
      	return null;
      } else{
      	return next;
      }     
  }

  public void addTail(int d){
  	Node end=new Node(d);
  	Node n=this;
     while(n.next!=null){
     	n=n.next;
     }
     n.next=end;
  }
  public static void printall(){
   Node t=this;
  	while(this.next!=null){
  		System.out.println(this.data);
       t=t.next;
  	}
  }


  public static void main(String args[]){
  	 Node list=new Node(1);
  	 list.addTail(2);
  	 list.addTail(3);
     //System.out.println(list.next.data);
    printall();

  }



}