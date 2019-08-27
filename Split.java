
public class Split {

	public static void main(String[] args) {
		String s=" hello ocme sa aasf ";
		String sub=s.substring(2,4);
		System.out.println(sub);
		String[] arr=s.split("\\ ");
		String[] arr1=s.split("\\ ",-1);
		String[] arr2=s.split("\\ ",2);
		
		for(String s1: arr) {
			System.out.print(s1+" ");
		}
		System.out.println();

		for(String s1: arr1) {
			System.out.print(s1+" ");
		}
System.out.println();
		for(String s1: arr2) {
			System.out.print(s1+" ");
		}
		String str=String.join("67",arr1);
		System.out.println(str);
		System.out.println(arr.length);
		
		StringBuilder sb=new StringBuilder();
		sb.append("heloes");
		sb.append("sadas");
		String z=sb.toString();
		System.out.println(sb);
		System.out.println(z);
	}

}
