package escolanova;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Estudante {

	private String nome;
	private int idade;

	// dentro da classe Aluno vamos criar um Objeto Disciplina
	// Vamos criar o List

	private List<Materias> materias = new ArrayList<Materias>();

	public void setMaterias(List<Materias> materias) {
		this.materias = materias;
	}

	public List<Materias> getMaterias() {
		return materias;
	}

	/* cria os dados na memoria - sendo padrão java */
	public Estudante() {

	}

	public Estudante(String nomePadrao) {
		nome = nomePadrao;
	}

	public Estudante(String nomePadrao, int idadePadrao) {
		nome = nomePadrao;
		idade = idadePadrao;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	@Override
	public int hashCode() {
		return Objects.hash(idade, nome);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Estudante other = (Estudante) obj;
		return idade == other.idade && Objects.equals(nome, other.nome);
	}

	// Metodo que retona a média do Aluno
	public double getMediaNota() {
		double somaNotas = 0;
		for (Materias materias : materias) {
			somaNotas += materias.getNota1();
		}
				
		return somaNotas / materias.size();
	}

	/* Metodo usando String */
	public String getAlunoAprovado() {
		double media = this.getMediaNota();
		if(media >= 50) {
			if(media >= 70) {
				return " Aluno Aprovado, PARABÉNS!!!!";
			}else {
				return "Aluno em recuperação tem que estudar mais";
			}
		}else {
			 return " Aluno REPROVADO";
		}
		
	}
	

	@Override
	public String toString() {
		return "Estudante [nome= " + nome + ", idade= " + idade + "]";
	}

}
