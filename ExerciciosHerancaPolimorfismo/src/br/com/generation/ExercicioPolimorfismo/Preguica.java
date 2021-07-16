package br.com.generation.ExercicioPolimorfismo;

public class Preguica implements Animal {
	
	public void subirArvore () {
		System.out.println("Preguiça subindo em árvore....");
	}

	@Override
	public void Som() {
		System.out.println("Preguiça emitindo som...\n");
		
	}

	@Override
	public void Nome() {
		System.out.println("Nome da preguiça é bejinho");
		
		
	}

	@Override
	public void Idade() {
		System.out.println("Idade é 5 anos");
		
		
	}
	
	

}
