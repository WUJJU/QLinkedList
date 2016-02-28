import java.util.*;

public class Node{

  Node next=null;
  int data;
  public Node(int d){
   data =d;

  }
 public Node Head(){
    return this;
 }

  public Node next(){
      if(this.next==null){
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
  public  void printall(){
   Node t=this;
  	while(t!=null){
  		System.out.println(t.data);
       t=t.next;
  	}
  }


  public static void main(String args[]){
  

  }



}