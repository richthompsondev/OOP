

public class Teste {

	public static void main(String[] args) {

		// Usa um Veiculo do tipo Jegue e do tipo Jipe
		Veiculo jipe = new Jipe();
		Veiculo jegue = new Jegue();

		Manobrista manobrista = new Manobrista();

		// manobra o jegue e o jipe
		manobrista.estaciona(jipe);
		manobrista.estaciona(jegue);
	}

}
