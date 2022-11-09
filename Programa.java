package CP3;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Programa {

	public static void main(String[] args) throws IOException {
		Scanner ler = new Scanner(System.in);
		
		ArrayList <Usuario> listausuario = new ArrayList <>();
		
		int opcao;
		
		do {
			System.out.printf("===> CADASTRO DE USUÁRIOS DO SISTEMA ESCOLAR <===\n\n");
			System.out.printf("Escolha um tipo de usuário para cadastrar:\n");          
	        System.out.printf("1 - Aluno \n" +
	                          "2 - Professor \n" +
	                          "3 - Coordenador \n" +
	                          "4 - Exibir usuários cadastrados \\n"+
	                          "5 - Sair\n\n");
	        System.out.printf("Digite a opção desejada: ");
	        opcao = ler.nextInt();
	        
	        if (opcao == 1) {
	        	Aluno a = new Aluno();
	        	System.out.println("Digite o nome do aluno: ");
	        	a.setNome(ler.next());
	        	System.out.println("Digite o ra do aluno: ");
	        	a.setRa(ler.next());
	        	System.out.println("Digite o curso em que está matriculado: ");
	        	a.setCursomatric(ler.next());
	        	
	        	listausuario.add(a);
	        	
	        	System.out.println("Aluno cadastrado com sucesso");
	        	
	        	System.in.read();
	        }
	        else if(opcao==2) {
	        	Professor p = new Professor();
	        	System.out.println("Digite o nome do professor: ");
	        	p.setNome(ler.next());
	        	System.out.println("Digite o ra do professor: ");
	        	p.setRa(ler.next());
	        	
	        	ArrayList <String> disciplinas = new ArrayList<>();
	        	for(int i = 0; i<6 ; i++ ) {
	        		System.out.println("Digite a sigla da" + (i+1) + " disciplina que ele leciona: ");
	        		disciplinas.add(ler.next());
	        	}
	        	p.setDisciplinas(disciplinas);
	        	listausuario.add(p);
	        	System.out.println("Professor cadastrado com sucesso");
	        	System.in.read();
	        }
	        else if(opcao==3) {
	        	Coordenador c = new Coordenador();
	        	System.out.println("Digite o nome do coordenador: ");
	        	c.setNome(ler.next());
	        	System.out.println("Digite o ra do coordenador: ");
	        	c.setRa(ler.next());
	        	
	        	ArrayList<String> cursoscoord = new ArrayList<>();
	        	for(int i = 0; i<6 ; i++ ) {
	        		System.out.println("Digite a sigla do " + (i+1) + " curso que ele coordena");
	        		c.setCursoscoord(cursoscoord);
	        	}
	        	listausuario.add(c);
	        	System.out.println("Coordenador cadastrado com sucesso");
	        	System.in.read();
	        }
	        else if (opcao==4) {
	        	 for (Usuario u: listausuario) {
	                    if (u instanceof Aluno)
	                        System.out.println("Aluno:");
	                    else if (u instanceof Professor)
	                        System.out.println("Professor:");
	                    else {
	                    	System.out.println("Coordenador:");
	                    }
	                   
	                    System.out.println("    RA: " + u.getRa());
	                    System.out.println("    Nome: " + u.getNome());
	                   
	                    if (u instanceof Aluno) {
	                        Aluno a = (Aluno) u;
	                        System.out.println("   Curso: " + a.getCursomatric());
	                    }
	                    else if (u instanceof Professor) {
	                    	Professor p = (Professor) u;
	                    	System.out.println("   Disciplinas : " + p.getDisciplinas());
	                    }
	                    else {
	                    	 Coordenador c = (Coordenador) u;
		                     System.out.println("   Curso coordenados: " + c.getCursoscoord());
	                    }
	                }

	        }
	        else {
	        	break;
	        }

		}while(opcao<6);
		ler.close();

	}

}
