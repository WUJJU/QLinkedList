import java.util.*;

public class Node{

  Node next=null;
  Object data;
  int size=1;
  public Node(Object d){
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
  public Node find(int t){
    Node n=this;
    if(t==0) return this;
    else{

     for(int i=1;i<=t;i++){
      n=n.next;
     }
     return n;
    }
  
  }
  public void deleteM(int t){
     
   Node pren=find(t-1);
   Node n=find(t);
   
   pren.next=n.next;
   n.next=null;
   size=size-1;

  }
//n.next 并未取得任何赋值

 // public void addTail(int d){
 //    Node end=new Node(d);
 //    Node n=this;
 //     while(n!=null){
 //      n=n.next;
 //     }
 //     n=end;
 // }


  public void addTail(Object d){
  	Node end=new Node(d);
  	Node n=this;
     while(n.next!=null){
     	n=n.next;
     }
     n.next=end;
     size=size+1;
  }
  public void addTail(Node d){

      Node n=this;
     while(n.next!=null){
      n=n.next;
     }
     n.next=d;
     size=size+1;
  }
  
  public  void printall(){
   Node t=this;
  	while(t!=null){
  		System.out.println(t.data);
       t=t.next;
  	}
  }
 public int getN(){
  StringBuilder sb=new StringBuilder();
  Node node=this;
      while(node!=null){
           sb=sb.append(node.data);
           node=node.next;
      }
      sb=sb.reverse();
      return Integer.parseInt(sb.toString());
 }

  public static void main(String args[]){
  

       Node n1=new Node(7);
       n1.addTail(1);
       n1.addTail(6);
      
       Node n2=new Node(5);
       n2.addTail(9);
       n2.addTail(2);
      int m1=n1.getN();
        System.out.println(m1);
      int m2=n2.getN();
     int sum=m1+m2;
     System.out.println(sum);







     String suml=sum+"";

      Node sumn=new Node(Integer.parseInt(suml.substring(suml.length()-1,suml.length())));
  
     if(suml.length()>1){

     for(int j=suml.length()-2;j>=0;j--){
         sumn.addTail(Integer.parseInt(suml.substring(j,j+1)));

       }

     }
   
       sumn.printall();
 print();

   

  }

 public static void print(){
  System.out.println("----------->");

 }

}