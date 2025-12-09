import java.util.List;

public class Banco {

	private String nome;
	private List<Conta> contas;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public List<Conta> getContas() {
		return contas;
	}
	//Metodo para ver todos os clientes de um banco
	public List<Cliente> getCliente(){return  contas.stream().map(Conta::getCliente).toList();}
	public void setContas(List<Conta> contas) {
		this.contas = contas;
	}

}
