package br.com.generation.exerciciosextras;

import java.util.Scanner;

public class Exercicio7 {

	public static void main(String[] args) {
		
		double a, b, c, d, ee, f;
		double x,y;
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Digite o valor de a: ");
		a = ler.nextDouble();
		
		System.out.println("Digite o valor de b: ");
		b = ler.nextDouble();
				
		System.out.println("Digite o valor de c: ");
		c = ler.nextDouble();
				
		System.out.println("Digite o valor de d: ");
		d = ler.nextDouble();
				
		System.out.println("Digite o valor de ee: ");
		ee = ler.nextDouble();
		
		System.out.println("Digite o valor de f: ");
		f = ler.nextDouble();
		
		
		x = (c*ee) - (b*f) / (a*ee) - (b*d);
		
		y = (a*f) - (c*d) / (a*ee) - (b*d);
		
		System.out.println("Os valores de x= " + x + " e y= " + y + "respectivamente.");
	
		ler.close();
		
	}

}

