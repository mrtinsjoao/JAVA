// arrumar ! 
class ParametrosMain {
  public static void main(String[] args) {
	String nome = args[0];
	String dataNascimento = args[1];
	String rg = args[2];
	String salario = args[3];
	String sexo = args[4];
	String textNome = "O(a) Senhor(a) " + nome;
	String textNasc = ", nascido(a) em " + dataNascimento;
	String textRg = " portador(a)do rg de numero " + rg + ", \n";
	String textSexo = " do sexo " + sexo;
	String textTrabalho = ", está registrado(a) com o salário de R$ " + salario
	    + ".";
	String recebe[] = {nome, dataNascimento, rg, salario, sexo };
	
	for(String i : recebe){
		if(i != null){
			System.out.println(textNome + textRg + textNasc + textSexo + textTrabalho);
		}
		else
			break;
	}
	
  }
}
