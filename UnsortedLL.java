import java.util.*;

public class UnsortedLL{
/**
** without buffer, it will take o(n2) complexity
*/
  public void rm_d_nobuffer(LinkedList list){

    for(int i=list.size()-1;i>=1;i--){
      for(int j=i-1;j>=0;j--){
        if(list.get(i)==list.get(j)) {
          list.remove(i);
          break;
        }
      }
    }
       System.out.println("Linkedlist content: "+list);
  }

  /**
  * with buffer, take o(n)
  */

  public void rm_d(LinkedList list,HashMap hash){

     for(int i=0;i<list.size();i++){
    Boolean tof=hash.containsKey(list.get(i));
    if (tof) {
       list.remove(i);
    }else{  hash.put(list.get(i),"unique");}
   
   }
   System.out.println("Linkedlist content: "+list);
  }
  

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
  UnsortedLL u =new UnsortedLL();
    u.rm_d_nobuffer(list);
   }

  }