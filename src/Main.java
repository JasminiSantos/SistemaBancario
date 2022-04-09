public class Main {
    public static void main(String[] args) {
    	Pessoa pessoa1 = new Pessoa(1, "1234567", "Jasmini", 1500.00);
    	Conta conta1 = new Conta(1, "1814", "1234", pessoa1);
    	
    	Pessoa pessoa2 = new Pessoa(2, "1324924", "Arlinda", 1100.00);
    	Conta conta2 = new Conta(2, "8439", "1234", pessoa2);
    	
    	Pessoa pessoa3 = new Pessoa(3, "1342533", "Wellington", 2000.00);
    	Conta conta3 = new Conta(3, "2493", "1234", pessoa3);
    	
    	Banco banco = new Banco(1, "Rua PUCPR");
    	
    	banco.adicionarContas(conta1);
    	banco.adicionarContas(conta2);
    	banco.adicionarContas(conta3);

    	banco.mostrarTodosOsDados();
    }
}	