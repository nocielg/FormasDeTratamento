
public class Respeitoso implements FormatadorNome{
	private String sexo;
	
	public Respeitoso (String sexo){
		this.sexo = sexo;
	}
	private String nome;
	private String sobrenome;
	
	@Override
	public String formatarNome(String nome, String sobrenome) {
		this.nome = nome;
		this.sobrenome = sobrenome;
		if (this.sexo == "masculino"){
			return "Sr."+this.nome+this.sobrenome;
		}
		else{
			return "Sra." + this.nome+this.sobrenome;
		}
	}

}
