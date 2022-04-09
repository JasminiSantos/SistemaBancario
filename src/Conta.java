
public class Conta {
	private int id;
	private String numeroConta;
	private String agencia;
	private Pessoa titular;
	
	public Conta(int id, String numeroConta, String agencia, Pessoa titular) {
		super();
		this.id = id;
		this.numeroConta = numeroConta;
		this.agencia = agencia;
		this.titular = titular;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNumeroConta() {
		return numeroConta;
	}

	public void setNumeroConta(String numeroConta) {
		this.numeroConta = numeroConta;
	}

	public String getAgencia() {
		return agencia;
	}

	public void setAgencia(String agencia) {
		this.agencia = agencia;
	}

	public Pessoa getTitular() {
		return titular;
	}

	public void setTitular(Pessoa titular) {
		this.titular = titular;
	}
	
	
	
	
}
