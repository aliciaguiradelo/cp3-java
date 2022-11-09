package CP3;

import java.util.ArrayList;

public class Coordenador extends Usuario{
	private ArrayList<String> cursoscoord;

	public ArrayList<String> getCursoscoord() {
		return cursoscoord;
	}

	public void setCursoscoord(ArrayList<String> cursoscoord) {
		this.cursoscoord = cursoscoord;
	}
	
	Coordenador(){
		
	}
	
	Coordenador(String nome, String ra, ArrayList<String> cursoscoord){
		super(nome, ra);
		this.cursoscoord=cursoscoord;
	}
}
