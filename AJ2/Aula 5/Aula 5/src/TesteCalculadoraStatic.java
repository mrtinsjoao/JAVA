public class TesteCalculadoraStatic {
	public static void main(String[] args) {
		System.out.println("1 + 9 = " + CalculadoraStatic.soma(1,9));
		System.out.println("1 + 9f = " + CalculadoraStatic.soma(1,9.0f));
		int num[] = {1,3,6};
		System.out.println("1 + 3 + 6 = " + CalculadoraStatic.soma(num));
	}
}
