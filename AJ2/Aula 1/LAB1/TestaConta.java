/*
 * Globalcode - "The Developers Company"
 * 
 * Academia do Java
 * 
 * 
 * 1) Crie um objeto da classe Conta 
 * 2) Inicialize todos os atributos deste objeto 
 * 3) Imprima os valores dos atributos da classe Conta de forma a obter o seguinte resultado:
 * 
 * ----------------------------- 
 * AGENCIA: 1 BANCO : 234 
 * NUMERO : 01945 
 * TITULAR: Globalcode 
 * SALDO : R$10000.0
 * -----------------------------
 * 
 * Sugestoes: 
 * Utilizando '\t' para tab
 * Ex: System.out.println("Texto\tTexto");
 * 
 * voce produzira a seguinte saida: 
 * Texto  Texto
 */
class TestaConta {

    public static void main(String[] args) {
    	Conta ct = new Conta();
    	
    	ct.agencia = 1;
    	ct.banco = 123;
    	ct.numero = "36xxx8";
    	ct.titular = "Joao";
    	ct.saldo = 200000000;
    	
    	System.out.println("...........................");
    	System.out.println("AGENCIA: " + ct.agencia + "\t" + "Banco: " + ct.banco);
    	System.out.println("NUMERO: " + ct.numero);
    	System.out.println("TITULAR: " + ct.titular);
    	System.out.println("SALDO: " + ct.saldo);
    	System.out.println("...........................");
    }
}
