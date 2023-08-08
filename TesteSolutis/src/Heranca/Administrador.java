package Heranca;

public class Administrador extends Empregado{

	private Double ajudaDeCusto;

	public Administrador(String nome, String endereco, String telefone, int codigoSetor, Double salarioBase,
			Double imposto, Double ajudaDeCusto) {
		super(nome, endereco, telefone, codigoSetor, salarioBase, imposto);
		this.ajudaDeCusto = ajudaDeCusto;
	}

	public Double getAjudaDeCusto() {
		return ajudaDeCusto;
	}

	public void setAjudaDeCusto(Double ajudaDeCusto) {
		this.ajudaDeCusto = ajudaDeCusto;
	}
	
	@Override
	public double calcularSalario() {
		double salarioLiquido = getSalarioBase() - (getSalarioBase() * getImposto() / 100) + ajudaDeCusto;
		return salarioLiquido;
	}
	
}
