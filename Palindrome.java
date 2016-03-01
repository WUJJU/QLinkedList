import java.util.*;

public class Palindrome{

    public Boolean checkPalidrome(String s1,String s2){
      if(s1.equals(s2)){
  return true;
        }
       else{
       	return false;
       }
    }

	public static void main(String args[]){
		  Object r="hello";
     String t="hello";
     if(t==(String)r) System.out.print("hello true!!!");
     else System.out.print("hello false");
		LinkedList <Object> list=new LinkedList<Object>();
		list.add(1);
		list.add(0);
		list.add(0);
		list.add(1);

        // ListIterator<Object> listI=list.listIterator(0);
        // while(listI.hasNext()){
        // 	Object ob=listI.next();
        // 	System.out.println(ob);
        // }
        String normal="";
        Object [] obarray=list.toArray();
        for(int i=0;i<obarray.length;i++){
          normal=normal+obarray[i];
        }

        System.out.println(normal);
        String reverse="";

        for(int i=obarray.length-1;i>=0;i--){
           reverse=reverse+obarray[i];
        }
        System.out.println(reverse);
       
     Palindrome p=new Palindrome();
    System.out.println( p.checkPalidrome(normal,reverse));

	}
}