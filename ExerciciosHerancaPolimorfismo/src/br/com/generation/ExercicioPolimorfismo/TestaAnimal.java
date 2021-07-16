package br.com.generation.ExercicioPolimorfismo;

public class TestaAnimal {
	
	public static void main(String[] args) {
		
	
	Cachorro cachorro = new Cachorro();
	Cavalo cavalo = new Cavalo();
	Preguica preguica = new Preguica();
	

	cachorro.Nome();
	cachorro.Idade();
	cachorro.Correr();
	cachorro.Som();
	
	cavalo.Nome();
	cavalo.Idade();
	cavalo.Correr();
	cavalo.Som();
	
	preguica.Nome();
	preguica.Idade();
	preguica.subirArvore();
	preguica.Som();
	
	}

}