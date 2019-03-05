//    Copyright (c) The League of Amazing Programmers 2013-2018
//    Level 0
package random;


import java.util.Random;

import javax.swing.JOptionPane;

public class Magic8Ball {
public static void main(String[] args) {
	
	JOptionPane.showInputDialog("Ask A Question...");
	
	Random r = new Random();
	int ran = r.nextInt(3);
	
	if (ran == 0) {
		JOptionPane.showMessageDialog(null, "YES");
	} else if (ran == 1) {
		JOptionPane.showMessageDialog(null,"NO");
	} else if (ran == 2) {
		JOptionPane.showMessageDialog(null,"MAYBE YOU SHOULD ASK GOOGLE?");
	}else {
		JOptionPane.showMessageDialog(null,"HOW SHOULD I KNOW???");
	}
}


}

	// 1. Make a main method that includes all the steps below….

	// 2. Make a variable that will hold a random number and put a random number into this variable using "new Random().nextInt(4)"
		
	// 3. Print out this variable

	// 4. Get the user to enter a question for the 8 ball

	// 5. If the random number is 0

	// -- tell the user "Yes"

	// 6. If the random number is 1

	// -- tell the user "No"

	// 7. If the random number is 2

	// -- tell the user "Maybe you should ask Google?"

	// 8. If the random number is 3

	// -- write your own answer


