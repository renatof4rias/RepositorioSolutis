package ContaCorrente;

public class Cliente {

	private String cpfg;
	private String nome;
	private String endereco;
	private String anoNascimento;

	public Cliente(String cpfg, String nome, String endereco, String anoNascimento) {
		super();
		this.cpfg = cpfg;
		this.nome = nome;
		this.endereco = endereco;
		this.anoNascimento = anoNascimento;
	}

	public String getCpfg() {
		return cpfg;
	}

	public void setCpfg(String cpfg) {
		this.cpfg = cpfg;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getAnoNascimento() {
		return anoNascimento;
	}

	public void setAnoNascimento(String anoNascimento) {
		this.anoNascimento = anoNascimento;
	}

}
