package banco.modelo;

public class Livro implements Imprimivel {
	private int id;
	private String titulo;
	private int anoPublicado;
	private String editora;
	private Autor autor;

	public Livro() {
	}

	public Livro(int id, String titulo, int anoPublicado, String editora, Autor autor) {
		this.id = id;
		this.titulo = titulo;
		this.anoPublicado = anoPublicado;
		this.editora = editora;
		this.autor = autor;

	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public int getAnoPublicado() {
		return anoPublicado;
	}

	public void setAnoPublicado(int anoPublicado) {
		this.anoPublicado = anoPublicado;
	}

	public String getEditora() {
		return editora;
	}

	public void setEditora(String editora) {
		this.editora = editora;
	}

	public Autor getAutor() {
		return autor;
	}

	public void setAutor(Autor autor) {
		this.autor = autor;
	}

	@Override
	public String toString() {
		return "id: " + getId() + "\tTitulo: " + getTitulo() + "\tAnopublicado: " + getAnoPublicado() + "\tEditora: "
				+ getEditora() + "\tAutor: " + getAutor();
	}

	@Override
	public String imprimeEmLista() {
		return "id: " + getId() + "\tTitulo: " + getTitulo() + "\tAnopublicado: " + getAnoPublicado() + "\tEditora: "
				+ getEditora() + "\tAutor: " + getAutor();
	}

	@Override
	public String[] getColunas() {
		String[] colunas = { "id", "Titulo", "Aanopublicado ", "Editora", "Autor" };
		return colunas;
	}

}
