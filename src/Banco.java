import java.util.ArrayList;

public class Banco {
	private int id;
	private ArrayList <Conta> listaContas;
	private String endereco;
	
	public void adicionarContas(Conta c) {
		this.listaContas.add(c);
	}
	public void mostrarTodosOsDados() {
        System.out.println("***********Banco************");
        System.out.println("Id: " + id);
        System.out.println("Endereço: " + endereco);
        
        System.out.println("***********Contas***********");
        for(int i = 0; i < listaContas.size(); i++) {
        	System.out.println("Id: " + listaContas.get(i).getId());
        	System.out.println("Numero Conta: " + listaContas.get(i).getNumeroConta());
        	System.out.println("Agencia: " + listaContas.get(i).getAgencia());
        	System.out.println("----------------------------");
        }
    	System.out.println("***********Titulares********");
        for(int i = 0; i < listaContas.size(); i++) {
        	System.out.println("Nome: " + listaContas.get(i).getTitular().getNome());
        	System.out.println("Cpf: " + listaContas.get(i).getTitular().getCpf());
        	System.out.println("Id: " + listaContas.get(i).getTitular().getId());
        	System.out.println("Salário: " + listaContas.get(i).getTitular().getSalario());
            System.out.println("----------------------------");        	
        }
        
	}
	
	public Banco(int id, String endereco) {
		super();
		this.id = id;
		this.listaContas= new ArrayList<Conta>();
		this.endereco = endereco;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public ArrayList<Conta> getListaContas() {
		return listaContas;
	}

	public void setListaContas(ArrayList<Conta> listaContas) {
		this.listaContas = listaContas;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	
	
}
