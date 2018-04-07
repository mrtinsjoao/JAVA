public class Testecalculadora {
	public static void main(String[] args) {
		Calculadora calc = new Calculadora();
		
		calc.print("FUNCIONA");
		
		int r1 = calc.soma(10, 20);
		System.out.println(r1);
		
		double r2 = calc.multiplicacao(3, 57);
		System.out.println(r2);
		
		boolean r3 = calc.maior(5, 3);
		System.out.println(r3);
	}
}
