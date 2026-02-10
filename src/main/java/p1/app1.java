package p1;

public class app1 {
	public static String display(int n)
	{
		if (n<0 || n>100) {
			return "invalid";
		}
		else if (n<40) {
			return "fail";
		}
		else {
			return "pass";
		}
	}
	public static void main(String[] args) {
		System.out.println(display(55)); 
	}
}
