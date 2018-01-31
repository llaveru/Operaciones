package com.hector.operaciones;

import java.util.Date;

public class Meses {

	
	public void numeroDiasMesActual() {
		
		Date date = new Date();
		int numeroMes= date.getMonth();
		
		System.out.println(numeroMes);
		
		if(numeroMes==1 
				|| numeroMes==3 || numeroMes==5|| numeroMes==7 || numeroMes==9
				|| numeroMes==11 
				)
		{
			System.out.println("este mes tiene 31 dias");
	
		}else if(numeroMes!=2)
		{
			System.out.println("este mes tiene 30 dias");
	
		}else System.out.println("es febrero, tiene 29");
	}
	}
