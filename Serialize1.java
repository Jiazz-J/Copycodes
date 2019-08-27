import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Serialize1  {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		// TODO Auto-generated method stub
		A obj=new A(22,45);
		FileOutputStream fs=new FileOutputStream("F:\\abc.txt");
		ObjectOutputStream os=new ObjectOutputStream(fs);
		os.writeObject(obj);
		os.close();
		FileInputStream fi=new FileInputStream("F:\\abc.txt");
		ObjectInputStream oi=new ObjectInputStream(fi);
		
		A a=(A)oi.readObject();
		System.out.println();
		System.lineSeparator();
		System.lineSeparator();
		a.show();
		System.lineSeparator();
	}

}
class A implements Serializable{
	int a,b;
	
	public A(int a,int b) {
		this.a=a;
		this.b=b;
	}
	public void show(){
		System.out.println(this.a);
		System.out.println(this.b);
	}
}