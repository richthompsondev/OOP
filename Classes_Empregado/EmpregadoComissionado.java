

/**
 * Empregado Comissionado demonstra heran�a de atributos e m�todos de Empregado.
 */
public class EmpregadoComissionado extends Empregado {
	private double comissao; // o valor de comiss�o de cada unidade vendida
	private int unidades; // a quantidade de unidades vendidas

	public EmpregadoComissionado(String primeiro_nome, String ultimo_nome, double salario, double comissao) {
		super(primeiro_nome, ultimo_nome, salario); // chama o m�todo construtor original
		this.comissao = comissao;
	}

	public double calcularPagamento() {
		return getSalario() + (comissao * unidades);
	}

	public void adicionarVendas(int unidades) {
		this.unidades = this.unidades + unidades;
	}

	public void iniciarVendas() {
		unidades = 0;
	}

}
