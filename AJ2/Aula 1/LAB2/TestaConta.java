/*
 * Globalcode - "The Developers Company"
 * 
 * Academia do Java
 */
class TestaConta {

    public static void main(String[] args) {
        // Criacao da conta
        // Inicializacao da conta
        // Impressao dos dados da conta
        // Saque da conta
        // Impressao dos dados da conta
        // Deposito em conta
        // Impressao dos dados da conta
    	
    	Conta c = new Conta();
    	
    	c.inicializaConta(1000, "36xxx-x","joao" , 1, 100);
    	c.imprimeDados();
    	c.imprimeSaldo();
    	c.deposito(500);
    	c.imprimeSaldo();
    	c.saque(700);
    	c.imprimeDados();
    	
    	
    }
}
