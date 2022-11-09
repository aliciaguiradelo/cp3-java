package CP3;

public class Usuario {
	/*Atributos*/
	private String nome;
	private String ra;
	/*Getters e Setters*/
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getRa() {
		return ra;
	}
	public void setRa(String ra) {
		this.ra = ra;
	}
	/*Construtor Padrão*/
	Usuario(){
		
	}
	/*Construtor Não Padrão*/
	Usuario(String nome, String ra){
		this.nome=nome;
		this.ra=ra;
	}
}