package br.com.generation.exerciciosextras;

import java.util.Scanner;

public class Exercicio2 {
	
			
	public static void main(String[] args) {
				
    int IdadeDias, IdadeAnos, IdadeMeses, IdadeRestante;
				
	Scanner ler = new Scanner(System.in); 
				
	System.out.println("Digite o n�mero de dias da sua idade: ");
	IdadeDias = ler.nextInt();
						
    IdadeAnos = (IdadeDias/365);
    IdadeMeses = (IdadeDias%365)/30;
    IdadeRestante = (IdadeDias%365)%30;
				
	System.out.println("A idade � de " +  IdadeAnos + " anos, " + IdadeMeses + " meses e " + IdadeRestante + " dias." );
				
			}
      }



