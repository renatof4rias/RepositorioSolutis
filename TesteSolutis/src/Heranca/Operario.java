package Heranca;

public class Operario extends Empregado {

	private Double valorProducao;
	private Double comissao;

	public Operario(String nome, String endereco, String telefone, int codigoSetor, Double salarioBase, Double imposto,
			Double valorProducao, Double comissao) {
		super(nome, endereco, telefone, codigoSetor, salarioBase, imposto);
		this.valorProducao = valorProducao;
		this.comissao = comissao;
	}

	public Double getValorProducao() {
		return valorProducao;
	}

	public void setValorProducao(Double valorProducao) {
		this.valorProducao = valorProducao;
	}

	public Double getComissao() {
		return comissao;
	}

	public void setComissao(Double comissao) {
		this.comissao = comissao;
	}

	@Override
	public double calcularSalario() {
		double salarioLiquido = getSalarioBase() - (getSalarioBase() * getImposto() / 100)
				+ (valorProducao * comissao / 100);
		return salarioLiquido;
	}

}
