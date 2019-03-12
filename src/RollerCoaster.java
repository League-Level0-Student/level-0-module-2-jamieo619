import javax.swing.JOptionPane;

public class RollerCoaster {
public static void main(String[] args) {
	String tall = JOptionPane.showInputDialog("How tall are you in inches?");
	int height = Integer.parseInt(tall);
	
	if (height >= 48) {
		JOptionPane.showMessageDialog(null,"Have fun on the coaster");
	}else {
		JOptionPane.showMessageDialog(null, "Maybe grow a bit more and then try again");
	}
}
}
