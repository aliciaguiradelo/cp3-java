package CP3;

import java.util.ArrayList;

public class Professor extends Usuario {
	private ArrayList<String> disciplinas;

	public ArrayList<String> getDisciplinas() {
		return disciplinas;
	}

	public void setDisciplinas(ArrayList<String> disciplinas) {
		this.disciplinas = disciplinas;
	}
	Professor(){
		
	}
	Professor(String nome, String ra, ArrayList<String> disciplinas){
		super(nome,ra);
		this.disciplinas=disciplinas;
	}
}
