package Enumedaros;

import java.util.Scanner;

public class Enumedaros {
	
	public static void main (String[] args) {
		
		Scanner sn = new Scanner (System.in);
		System.out.println("Escribir un dia de la semana");
		String dia = sn.next();
		
		Dias_De_La_Semana diaS = Dias_De_La_Semana.valueOf(dia.toUpperCase());
		
		
	
		System.out.println(diaS.toString());
	
}
}