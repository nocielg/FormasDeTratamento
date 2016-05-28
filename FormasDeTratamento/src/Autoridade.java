
public class Autoridade {

	private String nome; 
	private String sobrenome;
	private String tratamento;
	private String sexo;
	private String titulacao;
	FormatadorNome formato; 
	
	
	
	public Autoridade(String tratamento, String titulacao, String sexo, String nome, String sobrenome){
		this.tratamento = tratamento;
		this.titulacao = titulacao;
		this.sexo = sexo;
		this.nome = nome;
		this.sobrenome = sobrenome;
	}
						
	public String getTratamento(){
		if (this.tratamento == "informal"){
			formato = new Informal();
			return formato.formatarNome(nome, sobrenome);
			
		}
		else if(this.tratamento == "respeitoso"){
			formato = new Respeitoso(this.sexo);
			return formato.formatarNome(this.nome, this.sobrenome);
		}
		else{
			formato = new ComTitulo(this.titulacao);
			return formato.formatarNome(nome, sobrenome);
		}
				
	}
		
}
