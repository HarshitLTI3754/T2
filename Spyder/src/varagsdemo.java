
public class varagsdemo {

	public void num(String c, int ... a) {
		System.out.println("length "+a.length);
		for(int i:a)
			System.out.println("elements "+i);
		System.out.println(c);
	}
	public static void main(String[] args) {
		varagsdemo obj=new varagsdemo();
		 obj.num("hello",2,3,4);
	}
}
