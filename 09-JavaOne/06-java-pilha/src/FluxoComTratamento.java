
public class FluxoComTratamento {

	public static void main(String[] args) {
		System.out.println("Inicio do main");
		try {
			metodo1();
		}catch(ArithmeticException | NullPointerException |MinhaExcecao ex) {
			String msg = ex.getMessage();
			System.out.println("Exception " + msg);
			ex.printStackTrace();
		}
		
		System.out.println("Fim do main");
	}
	private static void metodo1() {
		System.out.println("Ini do metodo1");
			metodo2();
		System.out.println("Fim do medoto1");
	}
	private static void metodo2() {
		System.out.println("Ini do metodo2");
		
		//criando objeto 
		throw new MinhaExcecao("Deu errado");
		
		
		//System.out.println("Fim do medoto2");
	}
	
}
