package Lista04;

public abstract class AnimalVoadorAB extends AnimalAB {
	private int quantidadeAssa;
	private double envergaduraAssa, peso;

	public AnimalVoadorAB(String nome, String tipoAnimal, int idade, String habitat, int quantidadeAssas,
			double envergaduraAssa, double peso) {
		super(nome, tipoAnimal, idade, habitat);
		this.quantidadeAssa = quantidadeAssas;
		this.peso = peso;
		this.envergaduraAssa = envergaduraAssa;
	}

	public abstract void voar();

	@Override
	public void comer() {

	}

	@Override
	public void moverse() {

	}

	public int getQuantidadeAssa() {
		return quantidadeAssa;
	}

	public void setQuantidadeAssa(int quantidadeAssa) {
		this.quantidadeAssa = quantidadeAssa;
	}

	public double getEnvergaduraAssa() {
		return envergaduraAssa;
	}

	public void setEnvergaduraAssa(double envergaduraAssa) {
		this.envergaduraAssa = envergaduraAssa;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	@Override
	public void dormir() {

	}
}
