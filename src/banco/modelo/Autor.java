package banco.modelo;

public class Autor implements Imprimivel {
	private int id;
	private String nome;
	private long cpf;

	public Autor() {
	}

	public Autor(int id, String nome, long cpf) {
		this.id = id;
		this.nome = nome;
		this.cpf = cpf;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public long getCpf() {
		return cpf;
	}

	public void setCpf(long cpf) {
		this.cpf = cpf;
	}

	@Override
	public String toString() {
		return "id: " + getId() + "\tnome: " + getNome() + "\tCPF: "
				+ String.valueOf(getCpf()).replaceFirst("(\\d{3})(\\d{3})(\\d{3})(\\d{2})", "$1.$2.$3-$4");
	}

	@Override
	public String imprimeEmLista() {
		return "id: " + getId() + "\tnome: " + getNome() + "\tCPF: "
				+ String.valueOf(getCpf()).replaceFirst("(\\d{3})(\\d{3})(\\d{3})(\\d{2})", "$1.$2.$3-$4");
	}

	@Override
	public String[] getColunas() {
		String[] colunas = { "Id", "Nome", "CPF" };
		return colunas;
	}

}
