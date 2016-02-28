import java.util.*;

public class KthL{
  
  public Object k_l_nksize( Node list, int k){
     Node p1=list.Head();
     Node p2=list.Head();

     for(int i=0;i<k;i++){
        p1=p1.next();
        
     }
     if(p1==null){
        System.out.println("out of bound");
        return null;
      }
 
     while(p1!=null){
      p1=p1.next();
      p2=p2.next();
     }
     return p2;

  }
	public static void k_l(LinkedList list,int t){
		for(int k=t;k<list.size();k++){
			System.out.println(list.get(k));
		}
	}
  
   public  static void main (String args[]){

   LinkedList <Object> list=new LinkedList<Object>();

  list.add("b");
  list.add("a");
  list.add("c");
  list.add("bc");
  list.add("da");
  list.add("cd");
   int t;

    t=Integer.parseInt(args[0]);
  
      k_l(list, t);

       Node selflist=new Node(1);
       selflist.addTail(2);
       selflist.addTail(3);
      KthL kk=new KthL(); 
      Node k=(Node)kk.k_l_nksize(selflist,t);
      k.printall();

   }
  


}