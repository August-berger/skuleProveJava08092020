package no.hvl.dat100;

import static javax.swing.JOPtionPane.*;
import static java.lang.Integer.*;

public class Oppgave5 {
	 
	public static void main(String[] args) {
		String radius = showInputDialog("Radius:");
		double radius = parseInt(radiusStr);
		
		double a = areal(radius,radius,Math.PI);
	}
	
	private static double areal(double radius, double PI) {
		
		int sirkelAreal = radius * radius * Math.PI;
		
		return sirkelAreal;
	}
	private double lesInnTall(String message) {
		String tallStr = showInputDialog("Areal:");
		double tall = parseInt(tallStr);
	}

			
	}


