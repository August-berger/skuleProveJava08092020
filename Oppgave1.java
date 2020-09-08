package no.hvl.dat100;
import static javax.swing.JOptionPane.*;

public class Oppgave1 {
	public static void main(String[] args) {
		
		int sum = 0;
do {
	String input = showInputDialog("Skriv tall: ");
	sum = Integer.parseInt(input);
	if (sum == 0) {
		showMessageDialog(null, "Talet ditt er 0");
	}
	else if (sum < 0) {
		showMessageDialog(null, "Talet ditt er mindre enn 0");
	}
	else if (sum > 0) {
		showMessageDialog(null, "Talet ditt er større enn 0");
	}
	
		}
	}
}
	


	
