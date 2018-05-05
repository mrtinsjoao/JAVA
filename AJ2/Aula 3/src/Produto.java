class Produto {
	String descricao, marca;
	double preco;
	
	void valoresIniciais(double umpreco, String umaDescricao, String umaMarca) {
		alterarPreco(umpreco);
		setDescricao(umaDescricao);
		setMarca(umaMarca);
	}
	
	String getDescricao() {
		return descricao;
	}
	
	void setDescricao(String novaDescricao) {
		descricao = novaDescricao;
	}
	
	String getMarca() {
		return marca;
	}
	
	void setMarca(String novaMarca) {
		marca = novaMarca;
	}
	
	double getPreco() {
		return preco;
	}
	
	void alterarPreco(double novoPreco) {
		if(novoPreco>0) {
			preco = novoPreco;
		}
	}
	
	void aumentarPreco(double porcentagem) {
		if(porcentagem >0) {
			System.out.println("Aumentando o preço em: " + porcentagem + "%");
			porcentagem = 1 + (porcentagem/100);
			preco *= porcentagem;
			System.out.println("Novo Preco = " + preco);
		} else {
			System.out.println("Aumento deve ser maior do que zero");
		}
	}
	
	void imprime() {
		System.out.println("-------------------------------");
		System.out.println("Produto : " + descricao);
		System.out.println("Marca : " + marca);
		System.out.println("Preco : " + preco);
		System.out.println("-------------------------------");
	}
}