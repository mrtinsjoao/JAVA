/*
 * Globalcode - "The Developers Company"
 * 
 * Academia do Java
 * 
 * 
 * 1) Crie um objeto da classe Agencia
 * 2) Inicialize todos os atributos deste objeto
 * 3) Imprima os valores dos atributos da classe Agencia de forma a obter o
 * seguinte resultado:
 * 
 * -----------------------------
 * AGENCIA: 1    BANCO  : 234
 * -----------------------------
 * 
 * Sugestoes: 
 * Utilizando '\t' para tab
 * Ex: System.out.println("Texto\tTexto");
 * 
 * voce produzira a seguinte saida: 
 * Texto  Texto
 */
class TestaAgencia {

    public static void main(String[] args) {
    	Agencia ag = new Agencia();
    	
    	ag.banco = 123;
    	ag.numero = "12345";
    	
    	System.out.println("................................................");
    	System.out.println("AGENCIA: " + ag.numero + "\t" + "Banco: " + ag.banco);
    	System.out.println("................................................");
    	
    }
}
