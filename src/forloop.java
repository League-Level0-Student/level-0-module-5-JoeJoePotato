

import org.jointheleague.graphical.robot.Robot;

public class forloop {
public static void main(String[] args) {
	yalive();
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
		if(c%2==0) {
			System.out.println(c);
		}
	}
}

public static void oddonehundred() {
	for (int d = 2; d < 101; d++) {
		if(d%2==1) {
			System.out.println(d);
		}
	}
}

public static void fivehundred() {
	for (int d = 0; d < 501; d++) {
		if(d%2==0) {
			System.out.println(d+" is even");
		}else {
			System.out.println(d+" is odd");
		}
		
	}
}

public static void sevens() {
	for (int e = 7; e < 778; e++) {
		if(e%7==0) {
			System.out.println(e);
		}
	}
}

public static void yalive(){
	for (int f = 0; f < 13; f++) {
		System.out.println("In "+(f+2006)+" I was "+f+" years old.");
	}
}

public static void nestedfour() {
	Robot jeff=new Robot();
	for (int g = 1; g < 7; g++) {
	for (int h = 0; h < g; h++) {
		jeff.turn
	}	
	}
}
}