import java.util.Random;

import javax.swing.JOptionPane;


public class SkillPractice {
	
		public static void main(String[] args) {

		SkillPractice skills = new SkillPractice();
		          	skills.skill1();
		          	skills.skill2();
		          	skills.skill3();
		          	skills.skill4();
		          	skills.skill5();
		}

		void skill1() {
		// Use pop-ups for the following.
		// Ask the user how many dimes they have
String dimes=JOptionPane.showInputDialog("How many dimes do you have(enter as a number)");
int bleh=Integer.parseInt(dimes);
JOptionPane.showMessageDialog(null, "You have "+(bleh*10)+" cents worth of dimes.");


		// Tell them how many cents they have (hint multiply by 10)
String skillllllz=JOptionPane.showInputDialog("How tall are you in inches(enter as a number)");
int bleeh=Integer.parseInt(skillllllz);
if(bleh>36) {
	JOptionPane.showMessageDialog(null, "I am Gandalf, you must embark on my quest to kill smaug!");
}




		// Ask the user how tall they are (inches)




		// If they are shorter than 36 inches, tell them to eat their Wheaties




		}

		void skill2() { // Write a loop to print every third number between 1 and 30 to the console 

for (int i = 1; i < 31; i++) {
	if(i%3==0) {
		System.out.println(i);
	}
}





		}

		void skill3() { // Get a random number that is less than 20 and print it to the console 

Random gen=new Random();
int x=gen.nextInt(20);
int y=gen.nextInt(10);
System.out.println(x);
System.out.println(y);
		// Get another random number that is less than 10 and print it to the console 
JOptionPane.showMessageDialog(null, "the difference is "+(x-y));


		// Using a pop-up, tell the user the difference between the numbers // Hint: use subtraction 



		}

		void skill4() { // In a pop-up, ask the user for the city they live in 


String city=JOptionPane.showInputDialog("what city do you live in? No caps please.");
		// If they answered "San Diego", tell them they live in America's Finest City 
if(city.equals("san diego")) {
	JOptionPane.showMessageDialog(null, "You live in the finest city in America.");
}else {
	JOptionPane.showMessageDialog(null, "Move from "+city+" to San Diego");

}


		// Otherwise, tell them to move to San Diego 



		// Create a variable - cars - and initialize it to the number of cars your family has. // If there are 0 cars, use a pop-up to display, "I bet you use public transportation." 



		// If there is 1 car, use a pop-up to display the make/model of the car 



		// If there is more than 1 car, use a pop-up to display how many wheels the // cars have between them. 



		}

		void skill5() { // In a pop-up, ask the user for the name of their school 
			String scol=JOptionPane.showInputDialog("what school do you go to?");
JOptionPane.showMessageDialog(null, "Good choice, "+scol+" is a great school.");

		// In another pop-up, tell the user, that their school is a fantastic school. // You must include the name of the school in the message. 



		}
		}

