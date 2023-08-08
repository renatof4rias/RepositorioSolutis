package Lista04;

public class Gato extends AnimalAB {

	private int horasDormidas = 0, comidasIngeridas = 0, distanciaPercorrida = 0;

	public Gato(String nome, String tipoAnimal, int idade, String habitat) {
		super(nome, tipoAnimal, idade, habitat);
	}

	public Gato(String nome, int idade) {
		super(nome, "Gato", idade, "Terrestre");
	}

	public void comer(int quantidade) {
		this.comidasIngeridas += quantidade;
		System.out.println(
				getTipo() + " " + this.getNome() + " quantidade de racao ingerida: " + comidasIngeridas + "\nMiauu!");
	}

	public void comer() {
		comer(1);
	}

	public void moverse(int distancia) {
		this.distanciaPercorrida += distancia;
		System.out.println(getTipo() + " " + this.getNome() + " Distancia percorrida: " + distanciaPercorrida);
	}

	public void moverse() {
		moverse(1);
	}

	@Override
	public void dormir(int horas) {
		this.horasDormidas += horas;
		System.out.println(getTipo() + " " + this.getNome() + " Horas dormidas: " + horasDormidas);
	}

	public void dormir() {
		dormir(1);
	}

	public int getHorasDormidas() {
		return horasDormidas;
	}

	public void setHorasDormidas(int horasDormidas) {
		this.horasDormidas = horasDormidas;
	}

	public int getComidasIngeridas() {
		return comidasIngeridas;
	}

	public void setComidasIngeridas(int comidasIngeridas) {
		this.comidasIngeridas = comidasIngeridas;
	}

	public int getDistanciaPercorrida() {
		return distanciaPercorrida;
	}

	public void setDistanciaPercorrida(int distanciaPercorrida) {
		this.distanciaPercorrida = distanciaPercorrida;
	}
}
