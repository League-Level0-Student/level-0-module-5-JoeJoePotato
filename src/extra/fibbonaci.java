package extra;

public class fibbonaci {
	public static void main(String[] args) {
		int a = 0;
		int b = 0;
		int c = 1;
		for (int i = 0; i < 50; i++) {
			System.out.println(c);
			a = b;
			b = c;
			c = a + b;
		}
	}
}
