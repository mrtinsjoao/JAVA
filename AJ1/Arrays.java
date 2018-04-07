import java.util.Scanner;
class Arrays {
  public static void main(String args[]) {
	String array[] = new String[5];
	Scanner teclado = new Scanner(System.in);
	int i;
	for(i=0;i<array.length;i++){
		array[i] = "Cliente" + (i + 1) + " Email: Cliente" + (i+1) +
				"@cliente.com.br";
	}
	teclado.close();
	for( String j : array){
		System.out.println(j);
	}
  }
}
