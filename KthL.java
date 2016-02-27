import java.util.*;


public class KthL{

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

   }
  


}