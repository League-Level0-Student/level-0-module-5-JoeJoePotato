import javax.swing.JOptionPane;

public class isItPrime {
	public static void main(String[] args) {
		String numbro = JOptionPane.showInputDialog("choose a number from 1 to 150");
		int prime = Integer.parseInt(numbro);
		if (prime < 151 && prime > 0) {
			if (prime % 2 == 0) {
				composite();
			} else {
				if (prime % 3 == 0) {
					composite();
				} else {
if(prime%5==0) {
	composite();
}else {
	if(prime%7==0) {
		composite();
	}else {
		if(prime%11==0) {
			composite();
		}else {
			JOptionPane.showMessageDialog(null, "Your number is prime");
		}
	}
}
				}
			}
		} else {
			JOptionPane.showMessageDialog(null, "The number you \nentered does not meet \nthe requirements");
		}
	}

	public static void composite() {
		JOptionPane.showMessageDialog(null, "Your number is composite");
	}
}
