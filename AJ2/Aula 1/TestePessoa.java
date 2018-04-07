public class TestePessoa {
	public static void main(String[] args) {
		// Cria-se uma instancia da classe Pessoa
		Pessoa p1 = new Pessoa();
		
		// Acessando os atributos da classe Pessoa
		p1.nome = "Joao";
		p1.sobrenome = "Martins";
		p1.rg = "47.xxx.xxx-x";
		p1.dataNascimento = "08/03/96";
		String[] p1telefones = {"981335073","000000000"}; 
		p1.telefones = p1telefones;
		System.out.print("Olá" + p1.nome + " " + p1.sobrenome + " do RG" + p1.rg + " nascido em" +
		p1.dataNascimento + " dos telefones:");
		for (String i : p1telefones){
			System.out.print(i + " ");
		}
	}
}
