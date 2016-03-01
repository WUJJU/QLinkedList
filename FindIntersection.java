import java.util.*;

public class FindIntersection{


  public int check(Node n,Node m){

     for(int i=n.size-1;i>=0;i--){
     	if(n.find(i)!=m.find(i)){
     		return i+1;
     	} 
         

     }

     return 0;
  }

   public static void main(String args[]){

   	    Node n1=new Node(3);
   	    n1.addTail(1);
   	    n1.addTail(5);
   	    n1.addTail(9);
   	    Node  n2=new Node(4);
   	    n2.addTail(6);
   	   
   	     Node n3=new Node (7);
   	     Node n4=new Node (2);
   	     Node n5=new Node (1);

   	     n1.addTail(n3);
   	     n1.addTail(n4);
   	    n1.addTail(n5);

   	       n2.addTail(n3);
   	       //this will cause infinite loop LOL!
   	     //n2.addTail(n4);
   	     //n2.addTail(n5);

   	     n1.printall();
   	     n1.print();
   	      n2.printall();
   	      FindIntersection findi=new FindIntersection();
          int np;
        if(n1.size>=n2.size){
          np=findi.check(n2,n1);
         }else{
         	np=findi.check(n1,n2);
         }
       	  
       	 System.out.println("np:"+np);
       
      

   	       
   }



}