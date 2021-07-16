package br.com.generation.ExercicioPolimorfismo;

public class Cachorro implements Animal  {

	public void Correr() {
		System.out.println("Cachorro correndo...");
	}
	
	@Override
	public void Som() {
		System.out.println("Cachorro emitindo som...\n");
		
	}

	@Override
	public void Nome() {
		System.out.println("Nome do cachorro é Banananinha....");
		
	}

	@Override
	public void Idade() {
		System.out.println("Idade do cachorro: 3 anos");
		
	}
	
	
	
	
}
