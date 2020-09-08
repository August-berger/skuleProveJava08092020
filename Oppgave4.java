package no.hvl.dat100;

public class Oppgave4 {

	public static void main(String[] args) {
		String tallStreng = javax.swing.JOptionPane.showInputDialog("Tall?");
		int a = Integer.parseInt(tallStreng);
		int minst = a;
		
		tallStreng = javax.swing.JOptionPane.showInputDialog("Tall?");
		a = Integer.parseInt(tallStreng);
		minst = Math.min(minst, a);
		
		tallStreng = javax.swing.JOptionPane.showInputDialog("Tall?");
		a = Integer.parseInt(tallStreng);
		minst = Math.min(minst, a);
		
		String svar = "Minste verdi: " + minst;
		javax.swing.JOptionPane.showMessageDialog(null, svar);
	}

}