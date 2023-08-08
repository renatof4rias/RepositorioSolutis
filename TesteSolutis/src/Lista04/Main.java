package Lista04;

public class Main {

	public static void linhas() {

		System.out.println("\n---------- \n ");
	}

	public static void main(String[] args) {

		Cachorro Max = new Cachorro("Max", 1);
		Peixe Nemo = new Peixe("Nemo", 1, 4, 2.3);
		Leao Simba = new Leao("Simba", 5);
		Pombo Pru = new Pombo("Pru", 1, 2, 0.3, 0.5);
		Elefante Dumbo = new Elefante("Dumbo", 1);
		Gato Cat = new Gato("Miauzin", 1);

		linhas();
		Simba.dormir(5);
		Simba.comer(30);
		Simba.moverse(10);

		linhas();
		Max.comer(5);
		Max.moverse();
		Max.dormir();
		Max.comer();

		linhas();
		Nemo.nadar();
		Nemo.comer();
		Nemo.moverse();

		linhas();
		Pru.voar();
		Pru.dormir();
		Pru.moverse();

		linhas();
		Dumbo.comer();
		Dumbo.dormir();
		Dumbo.moverse();
		
		linhas();
		Cat.comer();
		Cat.moverse();
		Cat.dormir();
	}

}
