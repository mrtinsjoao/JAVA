
public class Calculadora {
	int soma(int x, int y){
		return x + y;
	}
	
	double multiplicacao(double d1, double d2){
		return d1 * d2;
	}
	
	boolean maior(int num1, int num2){
		if(num1>num2)
			return true;
		else 
			return false;
	}
	
	void print(String texto){
		System.out.println("TEXTO: " + texto);
	}
	
}
