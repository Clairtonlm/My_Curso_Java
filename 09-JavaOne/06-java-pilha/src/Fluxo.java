
public class Fluxo {

	public static void main(String[] args) {
		System.out.println("Inicio do main");
		metodo1();
		System.out.println("Fim do main");
	}
	private static void metodo1() {
		System.out.println("Ini do metodo1");
		try {
			metodo2();
		}catch(ArithmeticException ex) {
			System.out.println("ArithmeticException");
		}
		
		System.out.println("Fim do medoto1");
	}
	private static void metodo2() {
		System.out.println("Ini do metodo2");
		for(int i = 1; i <= 5; i++) {
			System.out.println(i);
			int a = i / 0;
			
		}
		System.out.println("Fim do medoto2");
	}
	
}