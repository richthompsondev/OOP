

/**
 * Empregado Comissionado demonstra herança de atributos e métodos de Empregado.
 */
public class EmpregadoComissionado extends Empregado {
	private double comissao; // o valor de comissão de cada unidade vendida
	private int unidades; // a quantidade de unidades vendidas

	public EmpregadoComissionado(String primeiro_nome, String ultimo_nome, double salario, double comissao) {
		super(primeiro_nome, ultimo_nome, salario); // chama o método construtor original
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
