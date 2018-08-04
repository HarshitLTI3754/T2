
public class Demo<Z> {				//Generic class

	private Z data;					//Generic Type

	public Demo(Z data) {

		this.data = data;
	}

	public Z getData() {
		return data;
	}

	public void setData(Z data) {
		this.data = data;
	}

	public static void main(String[] args) {

		Demo<String> d1 = new Demo<String>("Hello");
		System.out.println(d1.getData());

		Demo d2 = new Demo(500);
		d2.setData("Bye");
		System.out.println(d2.getData());

	}
}
