
public class Gerente extends Funcionario {
	
	private int senha= 1345;
	
	public void setSenha(int senha) {
		this.senha = senha;
	}
	public boolean autentica(int senha) {
		if(this.senha == senha) {
			return true;
		}else {
			return false;
		}
	}
	//reescrita de metodo
	public double getBonificacao() {
		System.out.println("Gerente");
		return  super.getSalario();
	}
	
	
	
	
	
}//fim da classe
