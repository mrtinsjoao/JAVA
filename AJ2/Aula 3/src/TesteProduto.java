public class TesteProduto {
	public static void main(String[] args) {
		Produto p = new Produto();
		p.valoresIniciais(25,"camisa Polo" , "Dudalina");
		p.imprime();
		p.aumentarPreco(10);
		p.setDescricao("Casual Polo");
		p.setMarca("Vitruviano");
		p.imprime();
	}
}
