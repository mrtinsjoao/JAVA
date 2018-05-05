public class TesteData {
	public static void main(String[] args) {
		Data d = new Data();
		d.setDia(12);
		d.setMes(01);
		d.setAno(2018);
		d.imprime();
		//teste modificando direto não passando pelos getters e setters
		//d.ano=2016;
		String s = d.isAnoBissexto() ? " " : " nao ";
		System.out.println("O ano" + s + "e bissexto ");
	}
}
