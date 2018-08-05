
import org.jointheleague.graphical.robot.Robot;

public class forloop {
	public static void main(String[] args) {
		nested3();
	}

	public static void zeroonehundred() {
		for (int a = 0; a < 101; a++) {
			System.out.println(a);
		}
	}

	public static void onehundredzero() {
		for (int b = 100; b > -1; b--) {
			System.out.println(b);
		}
	}

	public static void evenonehundred() {
		for (int c = 2; c < 101; c++) {
			if (c % 2 == 0) {
				System.out.println(c);
			}
		}
	}

	public static void oddonehundred() {
		for (int d = 2; d < 101; d++) {
			if (d % 2 == 1) {
				System.out.println(d);
			}
		}
	}

	public static void fivehundred() {
		for (int d = 0; d < 501; d++) {
			if (d % 2 == 0) {
				System.out.println(d + " is even");
			} else {
				System.out.println(d + " is odd");
			}

		}
	}

	public static void sevens() {
		for (int e = 7; e < 778; e++) {
			if (e % 7 == 0) {
				System.out.println(e);
			}
		}
	}

	public static void yalive() {
		for (int f = 0; f < 13; f++) {
			System.out.println("In " + (f + 2006) + " I was " + f + " years old.");
		}
	}

	public static void nestedfour() {
		Robot jeff = new Robot();
		jeff.turn(90);
		jeff.miniaturize();
		jeff.setSpeed(10);
		for (int g = 1; g < 7; g++) {
			for (int h = 0; h < g; h++) {
				jeff.move(20);
				jeff.penDown();
				for (int i = 0; i < 6; i++) {
					jeff.move(6);
					jeff.turn(180);
					jeff.move(6);
					jeff.turn(60);
				}
				jeff.penUp();
			}
			jeff.turn(90);
			jeff.move(20);
			jeff.turn(90);
			jeff.move(g*20);
			jeff.turn(180);
		}
	}
	
	public static void epiclooop(){
		for (String line=""; line.length()<7;line+="*") {
			System.out.println((line));
		}
		
	}
	
	public static void nestedone() {
		int num= 00;
		for (int i = 0; i < 3; i++) {
			System.out.println(num);
			for (int j = 0; j <2; j++) {
				num++;
				System.out.println(num);
			}
			num+=8;
		}
	}
	
	public static void nested2() {
		int num=123;
	for (int i = 0; i < 3; i++) {
		System.out.println((num+""));
	num+=333;
	}
	}
	
	public static void nested3() {
		int a=1;
		int b=2;
		int c=3;
		int d=4;
		int e=5;
		int f=6;
		int g=7;
		int h=8;
		int i=9;
		int j=10;
	for (int k = 0; k < 10; k++) {
		System.out.println((a+"")+""+(b+"")+""+(c+"")+""+(d+"")+""+(e+"")+""+(f+"")+""+(g+"")+""+(h+"")+(i+"")+""+(j+""));
a+=10;
b+=10;
c+=10;
d+=10;
e+=10;
f+=10;
g+=10;
h+=10;
i+=10;
j+=10;
	}
	}
}