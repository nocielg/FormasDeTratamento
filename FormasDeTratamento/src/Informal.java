
public class Informal implements FormatadorNome {

	private String nome;
	private String sobrenome;
	
	@Override
	public String formatarNome(String nome, String sobrenome) {
			this.nome = nome;
			this.sobrenome = sobrenome;
			return this.nome;
	}
	
	

}
