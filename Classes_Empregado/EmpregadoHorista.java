

/**
 * EmpregadoHorista herda de Empregado.
 */
public class EmpregadoHorista extends Empregado {
	private int horas; // quantidade de horas trabalhadas

	public EmpregadoHorista(String primeiro_nome, String ultimo_nome, double salario) {
		super(primeiro_nome, ultimo_nome, salario); // chama o construtor original para inicializar corretamente
	}

	public double calcularPagamento() {
		return getSalario() * horas;
	}

	public void adicionarHoras(int horas) {
		this.horas = this.horas + horas;
	}

	public void inicializarHoras() {
		horas = 0;
	}
}
