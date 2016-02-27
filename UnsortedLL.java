import java.util.*;

public class UnsortedLL{
  public static void main (String args[]){
  LinkedList <Object>list=new LinkedList<Object>();
  HashMap hash=new HashMap();

  list.add("b");
  list.add("a");
  list.add("c");
  list.add("b");
  list.add("d");
  list.add("c");

  System.out.println("Linkedlist content: "+list);

   for(int i=0;i<list.size();i++){
   	Boolean tof=hash.containsKey(list.get(i));
   	if (tof) {
       list.remove(i);
   	}else{	hash.put(list.get(i),"unique");} 
   
   }
   System.out.println("Linkedlist content: "+list);
  }



}