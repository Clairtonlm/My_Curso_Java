
public class ControleBonificacao {
	
	private double soma;
	
	public void registra(Funcionario g1) {
		double boni = g1.getBonificacao();
		this.soma = this.soma + boni;
	}
	public double getSoma() {
		return soma;
	}
}
