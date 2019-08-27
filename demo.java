import java.util.*;
class demo{
	public static void main(String[] args) {

		
		ArrayList<Integer> al=new ArrayList<Integer>();
		al.add(20);
		al.add(45);
		al.add(55);
		al.add(2,50);
		al.set(3, 999);
		System.out.println(al);
		ArrayList<Integer> l=new ArrayList<Integer>(al);
		Collections.reverse(l);
		System.out.println(l);
	l.addAll(2,al);
	System.out.println(l);
	LinkedList<Integer> ll=new LinkedList<Integer>(l);
	ll.addFirst(555);
	ll.offerFirst(444);
	System.out.println(ll);
	System.out.println(ll.peek());
	ll.push(11);
	 
		
		
		
	}
}