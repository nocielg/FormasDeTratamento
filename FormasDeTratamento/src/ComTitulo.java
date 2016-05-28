
public class ComTitulo implements FormatadorNome{

private String nome;
private String sobrenome;
private String titulo;

	public ComTitulo(String titulo){
		this.titulo = titulo;
	}
		
	@Override
	public String formatarNome(String nome, String sobrenome) {
		this.nome = nome;
		this.sobrenome = sobrenome;
		return this.titulo+this.nome + this.sobrenome;
	}

}
