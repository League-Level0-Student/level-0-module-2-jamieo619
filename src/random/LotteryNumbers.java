package random;

import java.util.Random;

import javax.swing.JOptionPane;

public class LotteryNumbers {
public static void main(String[] args) {
	Random a = new Random ();
	int r = a.nextInt(10);
	
	
	Random b = new Random ();
	int ra =b.nextInt(10);
	
	
	Random c = new Random ();
	int ran =c.nextInt(10);
	
	
	Random d = new Random ();
	int rand =d.nextInt(10);
	
	
	Random e = new Random ();
	int rando =e.nextInt(10);
	
	
	JOptionPane.showMessageDialog(null,"Your lottery numbers are: "+ r +"-"+ ra + "-"+ran +"-"+ rand +"-" + rando);
	
}
}
