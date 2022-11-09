package CP3;

public class Aluno extends Usuario {
	/*Atributos específicos da classe Aluno*/
	private String cursomatric;

	/*Getters e Setters*/
	public String getCursomatric() {
		return cursomatric;
	}

	public void setCursomatric(String cursomatric) {
		this.cursomatric = cursomatric;
	}
	
	/*Construtor Padrão*/
	Aluno(){
		
	}
	
	/*Construtor Não Padrão*/
	Aluno(String nome, String ra, String cursomatric){
		/*Herança de atributos da superclasse*/
		super(nome,ra);
		
		this.cursomatric=cursomatric;
	}
}
