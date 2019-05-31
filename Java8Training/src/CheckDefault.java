interface I{
	static void show() {
		System.out.println("This is default function");
	}
	default void p() {}
}

interface J{
	void show();
}
class Ch implements I{
	/*public void show(String str) {
		System.out.println(str);
	}*/
}

public class CheckDefault{
	
	public static void main(String[] args) {
		I.show();
	}

}
