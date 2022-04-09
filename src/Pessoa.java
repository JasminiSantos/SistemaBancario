
public class Pessoa {
	private int id;
	private String cpf;
	private String nome;
	private Double salario;
	
	
	public Pessoa(int id, String cpf, String nome, Double salario) {
		super();
		this.id = id;
		this.cpf = cpf;
		this.nome = nome;
		this.salario = salario;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Double getSalario() {
		return salario;
	}
	public void setSalario(Double salario) {
		this.salario = salario;
	}
	
	
}
