package com.hector.operaciones;

import javax.swing.JOptionPane;

public class Lanzador {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		
		JOptionPane panelInf = new JOptionPane();
		panelInf.setMessage("este mes tienes.");
		panelInf.showMessageDialog(null,"aasdfasdfasdf");
		Meses meses= new Meses();
		meses.numeroDiasMesActual();
	}

}
