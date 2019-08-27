import java.util.*;
public class Hash_Map {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap<Integer,String> hm=new HashMap<Integer,String>();
	hm.put(1,"hello");
	hm.put(33, "hellosdf");
	hm.put(3,null);
	System.out.println(hm);
	System.out.println(hm.keySet());
	System.out.println(hm.values());
	System.out.println(hm.get(1));
	Boolean res=hm.replace(1, "hello", "cone");
	System.out.println(res);
	String str=hm.toString();
	System.out.println(str   );
	
	

	}
}
